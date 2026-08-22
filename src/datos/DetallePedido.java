package datos;

public class DetallePedido {
	
	private long idDetallePedido;
	private Plato plato;
	private int cantidad;
	private float subtotal;
	
	//--CONSTRUCTOR--
	
	public DetallePedido(long idDetallePedido, Plato plato, int cantidad) {
		super();
		this.setIdDetallePedido(idDetallePedido);
		this.setPlato(plato);
		this.setCantidad(cantidad);
		this.subtotal = plato.getPrecioVenta() * cantidad;
	}
	
	//--GETTERS Y SETTERS--
	
	public long getIdDetallePedido() {
		return idDetallePedido;
	}
	public void setIdDetallePedido (long idDetallePedido) {
		this.idDetallePedido = idDetallePedido;
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
