package test;

import negocio.PlatoAbm;

public class TestAgregarPlato {
	
	public static void main(String[] args) {
		
		//1. caso de prueba agregamos platos
		try{
			PlatoAbm.getInstance().agregarPlato("Milanesa de carne", 5000, 2800);
			PlatoAbm.getInstance().agregarPlato("Papas fritas", 4000, 2200);
			PlatoAbm.getInstance().agregarPlato("Nuggets", 8000, 4500);
			PlatoAbm.getInstance().agregarPlato("Hamburguesa simple", 4500, 1900);
			PlatoAbm.getInstance().agregarPlato("Hamburguesa completa", 6200, 2900);
			System.out.println("Se cargaron correctamente los platos!");
		}catch(Exception e){
			System.out.println("Error al cargar los platos: " + e.getMessage());
		}
	}

}
