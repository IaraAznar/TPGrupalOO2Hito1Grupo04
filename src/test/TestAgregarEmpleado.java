package test;

import java.time.LocalDate;

import datos.Cajero.Turno;
import datos.Cocinero.Categoria;
import negocio.EmpleadoAbm;

public class TestAgregarEmpleado {

	public static void main(String[] args) {
		
		
		
		//1. Caso de prueba agregamos cajeros
		try {
			EmpleadoAbm.getInstance().agregarCajero(40207614, "Juan", "Torres", LocalDate.of(2000, 4, 11), LocalDate.of(2022, 9, 22), 15700.f, Turno.TURNO_MANANA, 1);
			EmpleadoAbm.getInstance().agregarCajero(4117400, "Tomas", "Lopez", LocalDate.of(2002, 7, 9), LocalDate.of(2025, 10, 5), 15700.f, Turno.TURNO_TARDE, 1);
			EmpleadoAbm.getInstance().agregarCajero(39207634, "Rocio", "Garcia", LocalDate.of(1999, 5, 12), LocalDate.of(2017, 8, 14), 15700.f, Turno.TURNO_MANANA, 2);
			EmpleadoAbm.getInstance().agregarCajero(45477854, "Agustin", "Hernandez", LocalDate.of(2004, 10, 5), LocalDate.of(2024, 7, 21), 15700.f, Turno.TURNO_NOCHE, 2);
			EmpleadoAbm.getInstance().agregarCajero(31207664, "Camila", "Perez", LocalDate.of(1996, 7, 8), LocalDate.of(2025, 9, 9), 15700.f, Turno.TURNO_NOCHE, 3);
			System.out.println("Cajeros agregados exitosamente!!!");
		}catch(Exception e){
			e.getMessage();
		}
		
		//2. Caso de prueba agregamos cocineros
		try {
			EmpleadoAbm.getInstance().agregarCocinero(34654123, "Lucia", "Jimenez", LocalDate.of(2001, 2, 5), LocalDate.of(2023, 6, 2), 20500.f, Categoria.COCINERO, 5000.f, 1);
			EmpleadoAbm.getInstance().agregarCocinero(45780444, "Laura", "Tenorio", LocalDate.of(2004, 6, 20), LocalDate.of(2025, 7, 11), 20500.f, Categoria.AYUDANTE, 1000.f, 2);
			EmpleadoAbm.getInstance().agregarCocinero(39856432, "Ignacio", "Balam", LocalDate.of(1993, 7, 21), LocalDate.of(2024, 6, 8), 20500.f, Categoria.COCINERO_PRINCIPAL, 7000.f, 3);
			EmpleadoAbm.getInstance().agregarCocinero(40400233, "Nicolas", "Cross", LocalDate.of(1995, 4, 17), LocalDate.of(2018, 6, 19), 20500.f, Categoria.COCINERO, 5000.f, 3);
			EmpleadoAbm.getInstance().agregarCocinero(37678900, "Roberto", "Serrano", LocalDate.of(1989, 11, 13), LocalDate.of(2017, 6, 13), 20500.f, Categoria.JEFE_DE_COCINA, 9000.f, 4);
			System.out.println("Cocineros agregados exitosamente!!!");
		}catch(Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}

}
