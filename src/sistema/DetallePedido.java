package sistema;

public class DetallePedido {
	
	private int id;
	private Plato plato;
	private int cantidad;
	private float subtotal;
	
	//--CONSTRUCTOR--
	
	public DetallePedido(int id, Plato plato, int cantidad) {
		super();
		this.setId(id);
		this.setPlato(plato);
		this.setCantidad(cantidad);
		this.subtotal = plato.getPrecioVenta() * cantidad;
	}
	
	//--GETTERS Y SETTERS--
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Plato getPlato() {
		return plato;
	}
	public void setPlato(Plato plato) {
		this.plato = plato;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public float getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}
}
