package test;

import negocio.UnidadVentaAbm;

public class TestAgregarUnidadesDeVenta {
	
	public static void main(String[] args) {
		
		//1. agregar foodtrucks
		try {
			UnidadVentaAbm.getInstance().agregarFoodTruck("El Camión del Wok", 1, 3, 4526554, "AAA 125", false);
			UnidadVentaAbm.getInstance().agregarFoodTruck("Pizzas Rodantes", 2, 2, 4526555, "DC4 1U5", true);
		}catch(Exception e) {
			System.out.println("Error al cargar los FoodTruck: " + e.getMessage());
		}
		
		//1. agregar puestos desarmables
		try {
			UnidadVentaAbm.getInstance().agregarPuestoDesarmable("El Puestito Criollo", 3, 5, 4859856, 3, 15);
			UnidadVentaAbm.getInstance().agregarPuestoDesarmable("Sabores del Barrio", 4, 6, 4859652, 2, 10);
		}catch(Exception e) {
			System.out.println("Error al cargar los puestos desarmables: " + e.getMessage());
		}
	}

}
