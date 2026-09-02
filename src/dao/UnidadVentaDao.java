package dao;

import datos.*;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import org.hibernate.query.Query;

public class UnidadVentaDao {
	
	private static Session session;
	private Transaction tx;
	
	
	private static UnidadVentaDao instancia = null;
	
	protected UnidadVentaDao() {}
	
	public static UnidadVentaDao getInstance() {
		if(instancia == null)
			instancia = new UnidadVentaDao();
			return instancia;
	}
	
	protected void iniciaOperacion()throws HibernateException{
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}
	
	protected void manejaExcepcion(HibernateException he) throws HibernateException{
		tx.rollback();
		throw new HibernateException("ERROR en la capa de acceso a datos");
	}
	
	public int agregar(UnidadVenta objeto) {
		int id = 0;
		try {
			iniciaOperacion();
			id = Integer.parseInt(session.save(objeto).toString());
			tx.commit();
		}catch(HibernateException he) {
			manejaExcepcion(he);
		}finally {
			session.close();
		}
		return id;
	}

	public UnidadVenta traer(long idUnidadVenta) {
		UnidadVenta objeto = null;
		try {
			iniciaOperacion();
			objeto = (UnidadVenta) session.get(UnidadVenta.class, idUnidadVenta);
			Hibernate.initialize(objeto.getFestivales());
			Hibernate.initialize(objeto.getMenu());
			Hibernate.initialize(objeto.getPersonal());
			Hibernate.initialize(objeto.getResponsable());
		} finally {
			session.close();
		}
		return objeto;
	}

	public void actualizar(UnidadVenta objeto) {
		try {
			iniciaOperacion();
			session.update(objeto);
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session.close();
		}
	}
	
	public List<UnidadVenta> traerPorFestival(long idFestival){
		List<UnidadVenta> lista = null;
	    try {
	    	iniciaOperacion();
	    	Query<UnidadVenta> query = session.createQuery(
	    	        "SELECT u FROM UnidadVenta u JOIN u.festivales f WHERE f.id = :idFestival",
	    	        UnidadVenta.class
	    	    );
	    	query.setParameter("idFestival", idFestival);
	    	lista = query.list();
	    } finally {
	        session.close();
	    }
	    return lista;
	}

}
