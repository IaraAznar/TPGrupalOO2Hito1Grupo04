package sistema;

public class Plato {
	private int id;
	private String nombre;
	private float precioVenta;
	private float precioCosto;
	
	//--CONSTRUCTOR--
	
	public Plato(int id, String nombre, float precioVenta, float precioCosto) {
		super();
		this.setId(id);
		this.setNombre(nombre);;
		this.setPrecioVenta(precioVenta);
		this.setPrecioCosto(precioCosto);
	}
	
	//--GETTERS Y SETTERS--
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
