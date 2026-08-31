package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Empleado;
import datos.FoodTruck;
import datos.PuestoDesarmable;
import datos.UnidadVenta;

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
			objeto = (UnidadVenta) session.createQuery("from Empleado e where e.idUnidadVenta=:idUnidadVenta")
					.setParameter("idUnidadVenta", idUnidadVenta).uniqueResult();
		}finally {
			session.close();
		}
		return objeto;
	}

}
