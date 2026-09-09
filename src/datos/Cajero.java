package datos;
import java.time.LocalDate;

public class Cajero extends Empleado {
	
	public enum Turno{
		TURNO_MANANA,
		TURNO_TARDE,
		TURNO_NOCHE
	}
	
	private Turno turno;
	
	//--CONSTRUCTOR--
	public Cajero() {}
	
	public Cajero( int dni, String nombre, String apellido,  LocalDate fechaNacimiento, LocalDate fechaIngreso,
			float sueldoBase,Turno turno, UnidadVenta unidadVenta) {
		super( dni, nombre, apellido, fechaNacimiento, fechaIngreso, sueldoBase, unidadVenta);
		this.turno=turno;
	}
	
	//--GETTERS Y SETTERS--
	
	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return super.toString() +  " Cajero [turno=" + turno + "]";
	}
	
	
	
	
}
