package sistema;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private int id;
	private LocalDate fecha;
	private UnidadVenta unidadDeVenta;
	private List<DetallePedido> detalle;
	private float total;
	
	//--CONSTRUCTOR--
	
	public Pedido(int id, LocalDate fecha, UnidadVenta unidadDeVenta) {
		super();
		this.setId(id);
		this.setFecha(fecha);
		this.setUnidadDeVenta(unidadDeVenta);
		this.detalle = new ArrayList<DetallePedido>();
		this.total = 0;
	}
	
	//--GETTERS Y SETTERS--
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
