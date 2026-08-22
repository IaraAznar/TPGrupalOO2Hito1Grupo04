package datos;

public class PuestoDesarmable extends UnidadVenta {
	
	private int cantidadCarpas;
	private int minsMontaje; // cantidad de minutos para montar las carpas
	
	//--CONSTRUCTOR--
	
	public PuestoDesarmable(long idUnidadVenta, String nombre, Empleado responsable, float superficie, long codigo,
			int cantidadCarpas, int minsMontaje) {
		super(idUnidadVenta, nombre, responsable, superficie, codigo);
		this.setCantidadCarpas(cantidadCarpas);
		this.setMinsMontaje(minsMontaje);
	}
	
	//--GETTERS Y SETTERS--
	
	public int getCantidadCarpas() {
		return cantidadCarpas;
	}
	public void setCantidadCarpas(int cantidadCarpas) {
		this.cantidadCarpas = cantidadCarpas;
	}
	public int getMinsMontaje() {
		return minsMontaje;
	}
	public void setMinsMontaje(int minsMontaje) {
		this.minsMontaje = minsMontaje;
	}
	
	
}
