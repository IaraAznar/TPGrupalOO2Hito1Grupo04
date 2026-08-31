package negocio;

import dao.EmpleadoDao;
import dao.UnidadVentaDao;
import datos.Empleado;
import datos.FoodTruck;
import datos.PuestoDesarmable;
import datos.UnidadVenta;

public class UnidadVentaAbm {
	
	private static UnidadVentaAbm instancia = null; // Patrón Singleton
	
	protected UnidadVentaAbm() {}
	
	
	public static UnidadVentaAbm getInstance() {
		if(instancia == null)
			instancia = new UnidadVentaAbm();
		return instancia;
	}
	
	//1. TRAER POR ID
	public UnidadVenta traer(long idUnidadVenta) {
		return UnidadVentaDao.getInstance().traer(idUnidadVenta);
	}
	
	//2. AGREGAR FOODTRUCK
	public int agregarFoodTruck(String nombre, long idResponsable, float superficie, int numeroCodigo, String patente,
			boolean usaElectricidad) throws Exception {
		Empleado responsable = EmpleadoDao.getInstance().traer(idResponsable);
		if(responsable == null) {
			throw new Exception("Error: no existe empleado con id " + idResponsable);
		}
		//FALTA AGREGAR VALIDACION: REPONSABLE TRABAJA EN ESTE PUESTO?
		String codigo = generarCodigo("FT", numeroCodigo);
		return UnidadVentaDao.getInstance().agregar(new FoodTruck(nombre, responsable, superficie, codigo, patente, usaElectricidad));
	}
	
	//3. AGREGAR PUESTO DESARMABLE
	public int agregarPuestoDesarmable(String nombre, long idResponsable, float superficie, int numeroCodigo,
			int cantidadCarpas, int minsMontaje) throws Exception {
		Empleado responsable = EmpleadoDao.getInstance().traer(idResponsable);
		if(responsable == null) {
			throw new Exception("Error: no existe empleado con id " + idResponsable);
		}
		if(cantidadCarpas < 0 || minsMontaje < 0) {
			throw new Exception("Error: cantidadCarpas y minsMontaje deben ser mayores a cero");
		}
		//FALTA AGREGAR VALIDACION: REPONSABLE TRABAJA EN ESTE PUESTO?
		String codigo = generarCodigo("PD", numeroCodigo);
		return UnidadVentaDao.getInstance().agregar(new PuestoDesarmable(nombre, responsable, superficie, codigo, cantidadCarpas, minsMontaje));
	}
	
	//GENERAR CODIGO
	public String generarCodigo(String tipo, int numero) {
		String nuevoCodigo =  tipo + String.format("%07d", numero).substring(0,7);;
		
		int suma = 0;
		
		for(int i = 2; i < 9; i++) {
			suma += Character.getNumericValue(nuevoCodigo.charAt(i));
		}
		
		int digitoVerificador = suma % 10;
		return nuevoCodigo + digitoVerificador;
	}
	
}
