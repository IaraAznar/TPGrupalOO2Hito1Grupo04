package sistema;

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
	
	public Cocinero(int id, int dni, String nombre, String apellido, LocalDate fechaIngreso, LocalDate fechaNacimiento,
			Categoria categoria, float plusCategoria) {
		super(id, dni, nombre, apellido, fechaIngreso, fechaNacimiento);
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
	
}
