package test;

import java.time.LocalDate;

import datos.Cajero.Turno;
import datos.Cocinero.Categoria;
import negocio.EmpleadoAbm;

public class TestTraerEmpleados {

	public static void main(String[] args) {
		
		System.out.println("==============================================");
		System.out.println("1. TRAER POR ID");
		System.out.println("==============================================");
		try {
			long idEmpleado=1;
			System.out.println("Traemos a empleado con id: " + idEmpleado);
			System.out.println(EmpleadoAbm.getInstance().traer(idEmpleado));
		}catch(Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
		
		System.out.println("==============================================");
		System.out.println("2. TRAER POR DNI");
		System.out.println("==============================================");
		
		try {
			int dni= 39207634;
			System.out.println("Traemos a empleado con dni: " + dni);
			System.out.println(EmpleadoAbm.getInstance().traerEmpleadoDni(dni));
			
		}catch(Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
		
		System.out.println("==============================================");
		System.out.println("3. TRAER  LISTA DE EMPLEADOS");
		System.out.println("==============================================");
		
		try {
			System.out.println("Traemos lista de empleados completa");
			System.out.println(EmpleadoAbm.getInstance().traer());
			
		}catch(Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
		
		
		System.out.println("==============================================");
		System.out.println("4. TRAER LISTA DE COCINEROS POR CATEGORIA Y SUELDO");
		System.out.println("==============================================");
		
		try {
			System.out.println("Traemos lista de empleados cocineros por categoria y sueldo");
			System.out.println(EmpleadoAbm.getInstance().traerCocineroPorCategoriaYSueldo(Categoria.COCINERO, 20500.f));
		}catch(Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
		
		System.out.println("==============================================");
		System.out.println("5. TRAER LISTA DE CAJEROS POR TURNO");
		System.out.println("==============================================");
		
		try {
			System.out.println("Traemos lista de empleados cajeros por  turno");
			System.out.println(EmpleadoAbm.getInstance().traerCajerosPorTurno(Turno.TURNO_MANANA));
		}catch(Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
		
		System.out.println("==============================================");
		System.out.println("6. TRAER LISTA DE EMPLEADOS  ENTRE FECHAS DE INGRESO");
		System.out.println("==============================================");
		
		try {
			System.out.println("Traemos lista de empleados si esta entre las fechas pasadas por parametro:");
			System.out.println(EmpleadoAbm.getInstance().traerEmpleadosPorFechaIngreso(LocalDate.of(2024, 7, 1), LocalDate.of(2025, 10, 29)));
		}catch(Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
		
		

	}

}
