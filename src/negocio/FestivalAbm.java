package negocio;

import dao.FestivalDao;
import datos.Festival;
import datos.UnidadVenta;

import java.time.LocalDate;
import java.util.Set;

public class FestivalAbm {

    private static FestivalAbm instancia = null;

    protected FestivalAbm() {}

    public static FestivalAbm getInstance() {
        if(instancia == null)
            instancia = new FestivalAbm();
        return instancia;
    }

    public Festival traerFestival(long idFestival) {
        return FestivalDao.getInstance().traer(idFestival);
    }

    public int agregarFestival(String nombre, String temporada, LocalDate fechaInicio, LocalDate fechaFin,
                               float costoSuperficie, float costoMontaje, float costoElectricidad, float costoBase) throws Exception {

        return FestivalDao.getInstance().agregar(new Festival(nombre, temporada, fechaInicio, fechaFin,
         costoSuperficie, costoMontaje, costoElectricidad, costoBase));
    }

    public void modificar(Festival festival) { FestivalDao.getInstance().actualizar(festival); }

    public Set<UnidadVenta> traerUnidadesDeVentaPorSuperficieMayorA(long idFestival, float superficieMinima) {
        return FestivalDao.getInstance().traerUnidadesDeVentaPorSuperficieMayorA(idFestival, superficieMinima);
    }
}
