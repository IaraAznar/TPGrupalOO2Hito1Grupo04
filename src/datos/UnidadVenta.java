package datos;

import java.util.ArrayList;
import java.util.List;

public abstract class UnidadVenta {

	protected long idUnidadVenta;
	protected String nombre;
	protected Empleado responsable;
	protected float superficie; //Superficie por metro cuadrado
	protected long codigo;
	protected List<Plato> menu;
	protected List<Empleado> personal;
	
	//--CONSTRUCTOR--
	
	public UnidadVenta(long idUnidadVenta, String nombre, Empleado responsable, float superficie, long codigo) {
		super();
		this.setIdUnidadVenta(idUnidadVenta);
		this.setNombre(nombre);
		this.setResponsable(responsable);
		this.setSuperficie(superficie);
		this.setCodigo(codigo);
		this.menu = new ArrayList<Plato>();
		this.personal = new ArrayList<Empleado>();
	}
	
	public boolean agregarPlatoAlMenu(Plato plato) {
		return menu.add(plato);
	}
	
	public boolean agregarEmpleado(Empleado empleado) {
		return personal.add(empleado);
	}
	
	//--GETTERS Y SETTERS--
	
	public long getIdUnidadVenta() {
		return idUnidadVenta;
	}
	public void setIdUnidadVenta(long idUnidadVenta) {
		this.idUnidadVenta = idUnidadVenta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Empleado getResponsable() {
		return responsable;
	}
	public void setResponsable(Empleado responsable) {
		this.responsable = responsable;
	}
	public float getSuperficie() {
		return superficie;
	}
	public void setSuperficie(float superficie) {
		this.superficie = superficie;
	}
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

}
