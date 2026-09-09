package negocio;

import java.time.LocalDate;
import java.util.List;

import dao.EmpleadoDao;
import datos.Cajero;
import datos.Cajero.Turno;
import datos.Cocinero;
import datos.Cocinero.Categoria;
import datos.Empleado;
import datos.UnidadVenta;

public class EmpleadoAbm {
	
	private static EmpleadoAbm instancia = null; // Patrón Singleton
	
	protected EmpleadoAbm() {}
	
	
	
	public static EmpleadoAbm getInstance() {
		if(instancia == null)
			instancia = new EmpleadoAbm();
		return instancia;
	}
	
	//1. TRAER POR ID
	public Empleado traer(long idEmpleado) {
		return EmpleadoDao.getInstance().traer(idEmpleado);
	}
		
	//2. TRAER POR DNI
	public Empleado traerEmpleadoDni(long dni) {
		return EmpleadoDao.getInstance().traerEmpleadoDni(dni);
	}
		
	//3. TRAER POR LISTA DE EMPLEADOS
	public List<Empleado> traer(){
		return EmpleadoDao.getInstance().traer();
	}
		
	//4. AGREGAR CAJERO
	public int agregarCajero(int dni, String nombre, String apellido, LocalDate fechaNacimiento, LocalDate fechaIngreso, float sueldoBase, Turno turno, long idUnidadVenta) throws Exception{
		
		if (traer(dni) != null) {
            throw new Exception("Error: Ya existe un empleado con el DNI " + dni);
        }
        if (fechaIngreso.isBefore(fechaNacimiento.plusYears(18))) {
            throw new Exception("Error: El empleado no puede haber ingresado siendo menor de 18 años.");
        }
        if (sueldoBase <= 0) {
            throw new Exception("Error: El sueldo base debe ser mayor a 0.");
        }
        
        UnidadVenta unidadVenta = UnidadVentaAbm.getInstance().traer(idUnidadVenta);
        if (unidadVenta == null) {
        	throw new Exception("Error: no existe unidad de venta con id " + idUnidadVenta);
        }
		
		return EmpleadoDao.getInstance().agregar(new Cajero(dni,nombre,apellido,fechaNacimiento,fechaIngreso,sueldoBase, turno, unidadVenta));
	}
	
	//5. AGREGAR COCINERO
	public int agregarCocinero(int dni, String nombre, String apellido, LocalDate fechaNacimiento, LocalDate fechaIngreso, float sueldoBase,  Categoria categoria, float plusCategoria, long idUnidadVenta)throws Exception {
		
		if (traer(dni) != null) {
            throw new Exception("Error: Ya existe un empleado con el DNI " + dni);
        }
        if (fechaIngreso.isBefore(fechaNacimiento.plusYears(18))) {
            throw new Exception("Error: El empleado no puede haber ingresado siendo menor de 18 años.");
        }
        if (sueldoBase <= 0) {
            throw new Exception("Error: El sueldo base debe ser mayor a 0.");
        }
        
        UnidadVenta unidadVenta = UnidadVentaAbm.getInstance().traer(idUnidadVenta);
        if (unidadVenta == null) {
        	throw new Exception("Error: no existe unidad de venta con id " + idUnidadVenta);
        }
		
		return EmpleadoDao.getInstance().agregar(new Cocinero(dni,nombre,apellido,fechaNacimiento,fechaIngreso,sueldoBase,categoria,plusCategoria, unidadVenta));
	}
	
	//6. TRAER LISTA DE COCINEROS POR CATEGORIA Y MAYOR O IGUAL A SUELDO MINIMO
	public List<Cocinero> traerCocineroPorCategoriaYSueldo(Categoria categoria, float sueldoMinimo){
		return EmpleadoDao.getInstance().traerCocineroPorCategoriaYSueldo(categoria, sueldoMinimo);
	}
	
	//7. TRAER UNA LISTA DE CAJERO POR TURNO
	public List<Cajero> traerCajerosPorTurno(Turno turno){
		return EmpleadoDao.getInstance().traerCajerosPorTurno(turno);
	}
	
	//8. TRAER EMPLEADOS CON FECHA DE INGRESO ENTRE CIERTAS FECHAS
	public List<Empleado> traerEmpleadosPorFechaIngreso(LocalDate desde, LocalDate hasta) throws Exception{
		if(desde != null && hasta != null && desde.isAfter(hasta)) {
			throw new Exception("ERROR: Parametros vacios o la fecha 'desde no puede ser posterior a la fecha 'hasta'.");
		}
		return EmpleadoDao.getInstance().traerEmpleadosPorFechaIngreso(desde, hasta);
	}
	
	
	
	
}
