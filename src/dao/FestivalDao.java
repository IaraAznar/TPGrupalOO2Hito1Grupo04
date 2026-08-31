package dao;

import datos.Festival;
import datos.UnidadVenta;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FestivalDao {

    private static Session session;
    private Transaction tx;
    private static FestivalDao dao; //Patron singleton para generar una unica instancia

    protected FestivalDao() {} //Protegido para que no se instancie por fuera y vacio para que funcione Hibernate

    public static FestivalDao getInstance() {
        if(dao == null) {
            dao = new FestivalDao();
        }
        return dao;
    }

    private void iniciaOperacion() throws HibernateException {
        session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
    }

    private void manejaExcepcion(HibernateException he) throws HibernateException {
        tx.rollback();
        throw new HibernateException("ERROR en la capa de acceso a datos de Festival", he);
    }

    public int agregar(Festival objeto) {
        int id = 0;
        try {
            iniciaOperacion();
            id = Integer.parseInt(session.save(objeto).toString());
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            session.close();
        }
        return id;
    }

    public Festival traer(long idFestival) {
        Festival objeto = null;
        try {
            iniciaOperacion();
            objeto = (Festival) session.get(Festival.class, idFestival);
            Hibernate.initialize(objeto.getUnidadesDeVenta());
        } finally {
            session.close();
        }
        return objeto;
    }


    public void actualizar(Festival objeto) {
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

    public Set<UnidadVenta> traerUnidadesDeVentaPorSuperficieMayorA(long idFestival, float superficieMinima) {
        Set<UnidadVenta> unidades = new HashSet<>();
        try {
            iniciaOperacion();
            String hql = "select uv from Festival f join f.unidadesDeVenta uv " +
                    "where f.idFestival = :idFestival and uv.superficie > :superficieMinima";

            List<UnidadVenta> resultado = session.createQuery(hql, UnidadVenta.class)
                    .setParameter("idFestival", idFestival)
                    .setParameter("superficieMinima", superficieMinima)
                    .list();

            for (UnidadVenta unidad : resultado) {
                Hibernate.initialize(unidad.getResponsable());
                Hibernate.initialize(unidad.getMenu());
                Hibernate.initialize(unidad.getPersonal());
                Hibernate.initialize(unidad.getFestivales());
            }

            unidades.addAll(resultado);
        } finally {
            session.close();
        }
        return unidades;
    }
}
