package test;

import datos.Festival;
import datos.UnidadVenta;
import negocio.FestivalAbm;
import negocio.UnidadVentaAbm;

public class TestAgregarUnidadVentaAFestival {

    public static void main(String[] args) {

        FestivalAbm fAbm = FestivalAbm.getInstance();
        UnidadVentaAbm uvAbm = UnidadVentaAbm.getInstance();

        //Tener creado ya el festival y las unidades de venta, sino tira error
        //TODO: hacer las validaciones y manejo de errores en negocio
        long idFestival = 1;
        long idUnidadVenta = 3;

        Festival f = fAbm.traerFestival(idFestival);
        UnidadVenta uv = uvAbm.traer(idUnidadVenta);

        f.agregarUnidadDeVenta(uv);

        fAbm.modificar(f);


    }

}
