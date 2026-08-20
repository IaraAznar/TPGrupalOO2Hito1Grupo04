package sistema;

import java.util.ArrayList;
import java.util.List;

public abstract class UnidadVenta {

	protected int id;
	protected String nombre;
	protected Empleado responsable;
	protected float superficie; //Superficie por metro cuadrado
	protected long codigo;
	protected List<Plato> menu;
	protected List<Empleado> personal;
	
	//--CONSTRUCTOR--
	
	public UnidadVenta(int id, String nombre, Empleado responsable, float superficie, long codigo) {
		super();
		this.setId(id);
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
