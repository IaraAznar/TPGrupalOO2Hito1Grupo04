package negocio;

import java.time.LocalDate;
import java.util.List;

import dao.PlatoDao;
import datos.Plato;

public class PlatoAbm {
	private static PlatoAbm instancia = null; // Patrón Singleton
	
	protected PlatoAbm() {}
	
	public static PlatoAbm getInstance() {
		if(instancia == null)
			instancia = new PlatoAbm();
		return instancia;
	}
	
	//1. TRAER POR ID
	public Plato traer(long idPlato) {
		return PlatoDao.getInstance().traer(idPlato);
	}
	
	//2. TRAER POR NOMBRE
	public Plato traerPorNombre(String nombre) {
		return PlatoDao.getInstance().traerPorNombre(nombre);
	}
	
	//3. AGREGAR PLATO
	public int agregarPlato(String nombre, float precioVenta, float precioCosto) throws Exception {
		/* trae error
		if (traerPorNombre(nombre) != null) {
			throw new Exception("Error: Ya existe un plato con ese nombre");
		}*/
		if (precioVenta < 0) {
			throw new Exception("Error: El precio de venta no puede ser menor a cero");
		}
		if (precioCosto < 0) {
			throw new Exception("Error: El precio de costo no puede ser menor a cero");
		}
		
		return PlatoDao.getInstance().agregar(new Plato(nombre, precioVenta, precioCosto));
	}
}
