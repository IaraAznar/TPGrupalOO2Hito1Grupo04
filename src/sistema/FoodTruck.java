package sistema;

public class FoodTruck extends UnidadVenta {
	
	private String patente;
	private boolean usaElectricidad;
	
	//--CONSTRUCTOR--
	
	public FoodTruck(int id, String nombre, Empleado responsable, float superficie, long codigo, String patente,
			boolean usaElectricidad) {
		super(id, nombre, responsable, superficie, codigo);
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
