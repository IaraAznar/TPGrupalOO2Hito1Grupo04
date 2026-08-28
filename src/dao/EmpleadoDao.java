package dao;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Cajero;
import datos.Cajero.Turno;
import datos.Cocinero;
import datos.Cocinero.Categoria;
import datos.Empleado;

public class EmpleadoDao {
	private static Session session;
	private Transaction tx;
	
	
	private static EmpleadoDao instancia = null;
	
	protected EmpleadoDao() {}
	
	public static EmpleadoDao getInstance() {
		if(instancia == null)
			instancia = new EmpleadoDao();
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
	
	public int agregar(Empleado objeto) {
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
	
	public Empleado traer(long idEmpleado) {
		Empleado objeto = null;
		try {
			iniciaOperacion();
			objeto = (Empleado) session.createQuery("from Empleado e where e.idEmpleado=:idEmpleado")
					.setParameter("idEmpleado", idEmpleado).uniqueResult();
		}finally {
			session.close();
		}
		return objeto;
	}
	
	public Empleado traerEmpleadoDni(long dni) {
		Empleado objeto = null;
		try {
			iniciaOperacion();
			objeto = (Empleado) session.createQuery("from Empleado e where e.dni=:dni")
					.setParameter("dni", dni).uniqueResult();
		}finally {
			session.close();
		}
		return objeto;
	}
	
	public List<Empleado> traer()throws HibernateException{
		List<Empleado> lista = null;
		try {
			iniciaOperacion();
			lista = session.createQuery("from Empleado", Empleado.class).list();
			
		}finally {
			session.close();
		}
		return lista;
	}
	
	public List<Cocinero> traerCocineroPorCategoriaYSueldo(Categoria categoria, float sueldoMinimo)throws HibernateException{
		List<Cocinero> lista = null;
		try {
			iniciaOperacion();
			String hql = "from Cocinero c where c.categoria = :cat and (c.sueldoBase + c.plusCategoria) >= : sueldo";
			lista = session.createQuery(hql, Cocinero.class)
					.setParameter("cat", categoria)
					.setParameter("sueldo", sueldoMinimo)
					.list();
		}finally {
			session.close();
		}
		return lista;
	}
	
	public List<Cajero> traerCajerosPorTurno(Turno turno) throws HibernateException{
		List<Cajero> lista = null;
		try {
			iniciaOperacion();
			String hql = "from Cajero c where c.turno = :turno";
			lista = session.createQuery(hql, Cajero.class)
					.setParameter("turno", turno)
					.list();
		}finally {
			session.close();
		}
		return lista;
	}
	
	public List<Empleado> traerEmpleadosPorFechaIngreso(LocalDate fechaDesde, LocalDate fechaHasta) throws HibernateException{
		List<Empleado> lista = null;
		try {
			iniciaOperacion();
			String hql = "from Empleado e where e.fechaIngreso between :desde and :hasta order by e.fechaIngreso asc";
			lista = session.createQuery(hql, Empleado.class)
					.setParameter("desde", fechaDesde)
					.setParameter("hasta", fechaHasta)
					.list();
		}finally {
			session.close();
		}
		return lista;
	}
	
	
	
}
