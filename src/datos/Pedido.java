package datos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private long idPedido;
	private LocalDate fecha;
	private UnidadVenta unidadDeVenta;
	private List<DetallePedido> detalle;
	private float total;
	
	//--CONSTRUCTOR--
	
	public Pedido(long idPedido, LocalDate fecha, UnidadVenta unidadDeVenta) {
		super();
		this.setIdPedido(idPedido);
		this.setFecha(fecha);
		this.setUnidadDeVenta(unidadDeVenta);
		this.detalle = new ArrayList<DetallePedido>();
		this.total = 0;
	}
	
	//--GETTERS Y SETTERS--
	
	public long getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(long idPedido) {
		this.idPedido = idPedido;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}

	public UnidadVenta getUnidadDeVenta() {
		return unidadDeVenta;
	}

	public void setUnidadDeVenta(UnidadVenta unidadDeVenta) {
		this.unidadDeVenta = unidadDeVenta;
	}
	
	
}
