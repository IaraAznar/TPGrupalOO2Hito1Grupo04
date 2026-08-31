package datos;

public class PuestoDesarmable extends UnidadVenta {
	
	private int cantidadCarpas;
	private int minsMontaje; // cantidad de minutos para montar las carpas
	
	//--CONSTRUCTOR--
	public PuestoDesarmable() {}

	public PuestoDesarmable(String nombre, Empleado responsable, float superficie, String codigo,
			int cantidadCarpas, int minsMontaje) {
		super(nombre, responsable, superficie, codigo);
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

	@Override
	public String toString() {
		return "PuestoDesarmable{" + super.toString() +
				"cantidadCarpas=" + cantidadCarpas +
				", minsMontaje=" + minsMontaje +
				'}';
	}
}
