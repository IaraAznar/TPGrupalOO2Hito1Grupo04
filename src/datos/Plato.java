package datos;

public class Plato {
	private long idPlato;
	private String nombre;
	private float precioVenta;
	private float precioCosto;
	
	//--CONSTRUCTOR--
	
	public Plato(long idPlato, String nombre, float precioVenta, float precioCosto) {
		super();
		this.setIdPlato(idPlato);
		this.setNombre(nombre);;
		this.setPrecioVenta(precioVenta);
		this.setPrecioCosto(precioCosto);
	}
	
	//--GETTERS Y SETTERS--
	
	public long getIdPlato() {
		return idPlato;
	}
	public void setIdPlato(long idPlato) {
		this.idPlato = idPlato;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}
	public float getPrecioCosto() {
		return precioCosto;
	}
	public void setPrecioCosto(float precioCosto) {
		this.precioCosto = precioCosto;
	}
}
