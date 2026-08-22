package datos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Festival {
	
	public enum Temporada{
		INVIERNO,
		OTONO,
		PRIMAVERA,
		VERANO
	}
	
	private long idFestival;
	private String nombre;
	private Temporada temporada;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private float costoSuperficie;
	private float costoMontaje;
	private float costoElectricidad;
	private float costoBase;
	private List<UnidadVenta> unidadesDeVenta;
	
	//--CONSTRUCTOR--
	
	public Festival(long idFestival, String nombre, Temporada temporada, LocalDate fechaInicio, LocalDate fechaFin,
			float costoSuperficie, float costoMontaje, float costoElectricidad, float costoBase) {
		super();
		this.setIdFestival(idFestival);
		this.setNombre(nombre);
		this.setTemporada(temporada);
		this.setFechaInicio(fechaInicio);
		this.setFechaFin(fechaFin);
		this.setCostoSuperficie(costoSuperficie);
		this.setCostoMontaje(costoMontaje);
		this.setCostoElectricidad(costoElectricidad);
		this.setCostoBase(costoBase);
		this.unidadesDeVenta = new ArrayList<UnidadVenta>();
	}
	
	public boolean agregarUnidadDeVenta(UnidadVenta unidadDeVenta) {
		return unidadesDeVenta.add(unidadDeVenta);
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
	public Temporada getTemporada() {
		return temporada;
	}
	public void setTemporada(Temporada temporada) {
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
	
	
}
