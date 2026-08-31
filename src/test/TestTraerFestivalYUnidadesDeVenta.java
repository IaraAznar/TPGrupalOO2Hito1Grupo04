package test;

import datos.Festival;
import datos.UnidadVenta;
import negocio.FestivalAbm;

import java.util.Set;

public class TestTraerFestivalYUnidadesDeVenta {

    public static void main(String[] args) {

        FestivalAbm fAbm = FestivalAbm.getInstance();

        long idFestival = 1;

        Festival f = fAbm.traerFestival(idFestival);

        System.out.println("\n==============================================");
        System.out.println(" TRAER FESTIVAL CON SUS UNIDADES DE VENTA");
        System.out.println("==============================================");
        System.out.println(f);

        System.out.println("\nUnidades de venta de el festival con ID: " + idFestival);
        for(UnidadVenta uv : f.getUnidadesDeVenta()) {
            System.out.println(uv);
        }


        float superficieMinima = 2.5f;
        System.out.println("\n==============================================");
        System.out.printf(" TRAER DEL FESTIVAL %d, LAS UNIDADES DE VENTA QUE SUPEREN LA SUPERFICIE %.2f\n", idFestival, superficieMinima);
        System.out.println("==============================================");
        Set<UnidadVenta> unidades = FestivalAbm.getInstance()
                .traerUnidadesDeVentaPorSuperficieMayorA(idFestival, superficieMinima);

        for (UnidadVenta uv : unidades) {
            System.out.println(uv);
        }

    }


}
