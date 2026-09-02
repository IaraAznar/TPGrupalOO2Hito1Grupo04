package test;

import java.util.List;

import datos.UnidadVenta;
import negocio.UnidadVentaAbm;

public class testTraerUnidadesDeVentaporFestival {
	public static void main(String[] args) {
		System.out.println("==============================================");
		System.out.println(" TRAER UNIDADES DE VENTA POR FESTIVAL");
		System.out.println("==============================================");
		try {
			long idFestival=1;
			System.out.println("Traemos a unidades de venta con festival con id: " + idFestival);
			List<UnidadVenta> unidades = UnidadVentaAbm.getInstance().traerUnidadesDeVentaPorFestival(idFestival);
			unidades.forEach(System.out::println);
		}catch(Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
}
