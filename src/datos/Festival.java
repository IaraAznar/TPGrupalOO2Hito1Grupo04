package datos;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Festival {
	
//	public enum Temporada{
//		INVIERNO,
//		OTONO,
//		PRIMAVERA,
//		VERANO
//	}
	
	private long idFestival;
	private String nombre;
	private String temporada;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private float costoSuperficie;
	private float costoMontaje;
	private float costoElectricidad;
	private float costoBase;
	private Set<UnidadVenta> unidadesDeVenta = new HashSet<>();
	
	//--CONSTRUCTOR--
	public Festival() { }
	
	public Festival(String nombre, String temporada, LocalDate fechaInicio, LocalDate fechaFin,
			float costoSuperficie, float costoMontaje, float costoElectricidad, float costoBase) {
		super();
		this.setNombre(nombre);
		this.setTemporada(temporada);
		this.setFechaInicio(fechaInicio);
		this.setFechaFin(fechaFin);
		this.setCostoSuperficie(costoSuperficie);
		this.setCostoMontaje(costoMontaje);
		this.setCostoElectricidad(costoElectricidad);
		this.setCostoBase(costoBase);
	}
	
	public boolean agregarUnidadDeVenta(UnidadVenta unidadDeVenta) {
		boolean agregar = false;
		if( !(unidadesDeVenta.contains(unidadDeVenta)) ) {
			agregar = unidadesDeVenta.add(unidadDeVenta);
		}
		return agregar;
	}

	@Override
	public String toString() {
		return "Festival{" +
				"idFestival=" + idFestival +
				", nombre='" + nombre + '\'' +
				", temporada='" + temporada + '\'' +
				", fechaInicio=" + fechaInicio +
				", fechaFin=" + fechaFin +
				", costoSuperficie=" + costoSuperficie +
				", costoMontaje=" + costoMontaje +
				", costoElectricidad=" + costoElectricidad +
				", costoBase=" + costoBase +
				'}';
	}

	//--GETTERS Y SETERS--
	
	public long getIdFestival() {
		return idFestival;
	}
	public void setIdFestival(long idFestival) {
		this.idFestival = idFestival;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTemporada() {
		return temporada;
	}
	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public LocalDate getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
	public float getCostoSuperficie() {
		return costoSuperficie;
	}
	public void setCostoSuperficie(float costoSuperficie) {
		this.costoSuperficie = costoSuperficie;
	}
	public float getCostoMontaje() {
		return costoMontaje;
	}
	public void setCostoMontaje(float costoMontaje) {
		this.costoMontaje = costoMontaje;
	}
	public float getCostoElectricidad() {
		return costoElectricidad;
	}
	public void setCostoElectricidad(float costoElectricidad) {
		this.costoElectricidad = costoElectricidad;
	}
	public float getCostoBase() {
		return costoBase;
	}
	public void setCostoBase(float costoBase) {
		this.costoBase = costoBase;
	}

	public Set<UnidadVenta> getUnidadesDeVenta() {
		return unidadesDeVenta;
	}

	public void setUnidadesDeVenta(Set<UnidadVenta> unidadesDeVenta) {
		this.unidadesDeVenta = unidadesDeVenta;
	}

}
