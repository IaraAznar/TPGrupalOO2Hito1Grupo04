package datos;

import java.time.LocalDate;
import java.time.Period;

public abstract class Empleado {
	protected long idEmpleado;
	protected int dni;
	protected String nombre;
	protected String apellido;
	protected LocalDate fechaNacimiento;
	protected LocalDate fechaIngreso;
	protected float sueldoBase;
	
	//--CONSTRUCTOR--
	public Empleado() {}
	

	public Empleado( int dni, String nombre, String apellido, LocalDate fechaNacimiento,
			LocalDate fechaIngreso, float sueldoBase) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaIngreso = fechaIngreso;
		this.sueldoBase=sueldoBase;
		
	}


	//--GETTERS Y SETTERS--
	
	public long getIdEmpleado() {
		return idEmpleado;
	}
	protected void setIdEmpleado(long idEmpleado) {
		this.idEmpleado = idEmpleado;
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
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}


	public float getSueldoBase() {
		return sueldoBase;
	}


	public void setSueldoBase(float sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	// Tenemos la antiguedad en anios
	public int getAntiguedad() {
		if(fechaIngreso == null) return 0;
		return Period.between(fechaIngreso, LocalDate.now()).getYears();
	}


	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fechaNacimiento=" + fechaNacimiento + ", fechaIngreso=" + fechaIngreso + ", sueldoBase="
				+ sueldoBase + "antiguedad="+ getAntiguedad()+" anios" +"]";
	}


	
	
	
	

}
