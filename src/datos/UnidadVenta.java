package datos;

import java.util.HashSet;
import java.util.Set;

public abstract class UnidadVenta {

	protected long idUnidadVenta;
	protected String nombre;
	protected Empleado responsable;
	protected float superficie; //Superficie por metro cuadrado
	protected String codigo;
	protected Set<Festival> festivales = new HashSet<>();
	protected Set<Plato> menu;
	protected Set<Empleado> personal;
	
	//--CONSTRUCTOR--
	public UnidadVenta() {}

	public UnidadVenta(String nombre, Empleado responsable, float superficie, String codigo) {
		super();
		this.setNombre(nombre);
		this.setResponsable(responsable);
		this.setSuperficie(superficie);
		this.setCodigo(codigo);
		this.menu = new HashSet<Plato>();
		this.personal = new HashSet<Empleado>();
	}
	
	public boolean agregarPlatoAlMenu(Plato plato) {
		return menu.add(plato);
	}
	
	public boolean agregarEmpleado(Empleado empleado) {
		return personal.add(empleado);
	}

	public boolean agregarFestival(Festival f) {
		boolean agregar = false;
		if( !(festivales.contains(f)) ) {
			agregar = festivales.add(f);
		}
		return agregar;
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
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Set<Plato> getMenu() {
	    return menu;
	}

	public void setMenu(Set<Plato> menu) {
	    this.menu = menu;
	}
	public Set<Empleado> getPersonal() {
	    return personal;
	}

	public void setPersonal(Set<Empleado> personal) {
	    this.personal = personal;
	}

	public Set<Festival> getFestivales() {
		return festivales;
	}

	public void setFestivales(Set<Festival> festivales) {
		this.festivales = festivales;
	}

	@Override
	public String toString() {
		return "UnidadVenta{" +
				"idUnidadVenta=" + idUnidadVenta +
				", nombre='" + nombre + '\'' +
				", superficie=" + superficie +
				", codigo='" + codigo + '\'' +
				'}';
	}
}
