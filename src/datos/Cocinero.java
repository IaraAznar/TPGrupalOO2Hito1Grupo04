package datos;

import java.time.LocalDate;

public class Cocinero extends Empleado {
	
	public enum Categoria{
		AYUDANTE,
	    COCINERO,
	    COCINERO_PRINCIPAL,
	    JEFE_DE_COCINA
	}
	
	private Categoria categoria;
	private float plusCategoria;
	
	//--CONSTRUCTOR--
	
	public Cocinero(){};
	
	public Cocinero( int dni, String nombre, String apellido,  LocalDate fechaNacimiento, LocalDate fechaIngreso,
		float sueldoBase,Categoria categoria, float plusCategoria, UnidadVenta unidadVenta) {
		super( dni, nombre, apellido,  fechaNacimiento, fechaIngreso, sueldoBase, unidadVenta);
		this.categoria = categoria;
		this.plusCategoria = plusCategoria;
	}
	
	//--GETTERS Y SETTERS--

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public float getPlusCategoria() {
		return plusCategoria;
	}

	public void setPlusCategoria(float plusCategoria) {
		this.plusCategoria = plusCategoria;
	}

	@Override
	public String toString() {
		return super.toString()+" Cocinero [categoria=" + categoria + ", plusCategoria=" + plusCategoria + "]";
	}
	
	
	
}
