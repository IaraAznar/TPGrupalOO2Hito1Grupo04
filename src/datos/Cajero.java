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
	
	public Cajero(long idEmpleado, int dni, String nombre, String apellido, LocalDate fechaIngreso, LocalDate fechaNacimiento,
			Turno turno) {
		super(idEmpleado, dni, nombre, apellido, fechaIngreso, fechaNacimiento);
		this.setTurno(turno);
	}
	
	//--GETTERS Y SETTERS--
	
	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}
	
}
