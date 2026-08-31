package dao;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Plato;

public class PlatoDao {
	private static Session session;
	private Transaction tx;
	
	private static PlatoDao instancia = null;
	
	protected PlatoDao() {}
	
	public static PlatoDao getInstance() {
		if(instancia == null)
			instancia = new PlatoDao();
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
	
	public int agregar(Plato objeto) {
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
	
	public Plato traer(long idPlato) {
		Plato objeto = null;
		try {
			iniciaOperacion();
			objeto = (Plato) session.createQuery("from Plato where Plato.idPlato=:idPlato")
					.setParameter("idEmpleado", idPlato).uniqueResult();
		}finally {
			session.close();
		}
		return objeto;
	}
	
	public Plato traerPorNombre(String nombre) {
		Plato objeto = null;
		try {
			iniciaOperacion();
			objeto =(Plato) session.createQuery("from Plato where Plato.nombre = :nombre")
					.setParameter("nombre", nombre).uniqueResult();
		}finally {
			session.close();
		}
		
		return objeto;
	}
}
