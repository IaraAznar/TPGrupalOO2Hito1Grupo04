package sistema;

import java.time.LocalDate;

public abstract class Empleado {
	protected int id;
	protected int dni;
	protected String nombre;
	protected String apellido;
	protected LocalDate fechaIngreso;
	protected LocalDate fechaNacimiento;
	
	//--CONSTRUCTOR--
	
	public Empleado(int id, int dni, String nombre, String apellido, LocalDate fechaIngreso,
			LocalDate fechaNacimiento) {
		super();
		this.setId(id);
		this.setDni(dni);
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setFechaIngreso(fechaIngreso);
		this.setFechaNacimiento(fechaNacimiento);
	}
	
	//--GETTERS Y SETTERS--
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

}
