package datos;

import net.bytebuddy.implementation.bind.annotation.Super;

public class FoodTruck extends UnidadVenta {

	private String patente;
	private boolean usaElectricidad;

	//--CONSTRUCTOR--
	public FoodTruck() {
	}

	public FoodTruck(String nombre, Empleado responsable, float superficie, String codigo, String patente,
	                 boolean usaElectricidad) {
		super(nombre, responsable, superficie, codigo);
		this.setPatente(patente);
		this.setUsaElectricidad(usaElectricidad);
	}

	//--GETTERS Y SETTERS--

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public boolean isUsaElectricidad() {
		return usaElectricidad;
	}

	public void setUsaElectricidad(boolean usaElectricidad) {
		this.usaElectricidad = usaElectricidad;
	}

	@Override
	public String toString() {
	    return String.format(
	        "[%s] %s | Superficie: %.1f m² | Patente: %s | Electricidad: %s",
	        getCodigo(), getNombre(), getSuperficie(), patente, usaElectricidad ? "Sí" : "No"
	    );
	}
}
