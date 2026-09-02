package negocio;

import java.util.List;
import java.util.Random;

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
	public int agregarFoodTruck(String nombre, long idResponsable, float superficie, String patente,
			boolean usaElectricidad) throws Exception {
		Empleado responsable = EmpleadoDao.getInstance().traer(idResponsable);
		if(responsable == null) {
			throw new Exception("Error: no existe empleado con id " + idResponsable);
		}
		//FALTA AGREGAR VALIDACION: REPONSABLE TRABAJA EN ESTE PUESTO?
		String codigo = generarCodigo("FT");
		return UnidadVentaDao.getInstance().agregar(new FoodTruck(nombre, responsable, superficie, codigo, patente, usaElectricidad));
	}
	
	//3. AGREGAR PUESTO DESARMABLE
	public int agregarPuestoDesarmable(String nombre, long idResponsable, float superficie,
			int cantidadCarpas, int minsMontaje) throws Exception {
		Empleado responsable = EmpleadoDao.getInstance().traer(idResponsable);
		if(responsable == null) {
			throw new Exception("Error: no existe empleado con id " + idResponsable);
		}
		if(cantidadCarpas < 0 || minsMontaje < 0) {
			throw new Exception("Error: cantidadCarpas y minsMontaje deben ser mayores a cero");
		}
		//FALTA AGREGAR VALIDACION: REPONSABLE TRABAJA EN ESTE PUESTO?
		String codigo = generarCodigo("PD");
		return UnidadVentaDao.getInstance().agregar(new PuestoDesarmable(nombre, responsable, superficie, codigo, cantidadCarpas, minsMontaje));
	}
	
	//4. GENERAR CODIGO
	public String generarCodigo(String tipo) {
		Random random = new Random();
        int numero = 1_000_000 + random.nextInt(9_000_000);
		String nuevoCodigo =  tipo + String.format("%07d", numero).substring(0,7);;
		
		int suma = 0;
		
		for(int i = 2; i < 9; i++) {
			suma += Character.getNumericValue(nuevoCodigo.charAt(i));
		}
		
		int digitoVerificador = suma % 10;
		return nuevoCodigo + digitoVerificador;
	}
	
	//5. TRAER UNIDADES DE VENTA POR FESTIVAL
	public List<UnidadVenta> traerUnidadesDeVentaPorFestival(long idFestival){
		return UnidadVentaDao.getInstance().traerPorFestival(idFestival);
	}
	
}
