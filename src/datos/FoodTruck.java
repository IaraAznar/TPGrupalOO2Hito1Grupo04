package datos;

public class FoodTruck extends UnidadVenta {
	
	private String patente;
	private boolean usaElectricidad;
	
	//--CONSTRUCTOR--
	
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
	
}
