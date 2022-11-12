package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;
import persistencia.CompararEquipos;

public class TemporadaFantasia {
	private double presupuesto;
	private TemporadaReal temporada;
	private Fecha fechaSiguiente;
	private Fecha fechaActual;
	private ArrayList<EquipoFantasia> equipos;
	
	public TemporadaFantasia(int presupuesto) {
		this.presupuesto=presupuesto;
		this.equipos = new ArrayList<EquipoFantasia>();
	}
	
	public void asociarEquipo(EquipoFantasia e) {
		equipos.add(e);
	}
	
	public double getPresupuesto() {
		return this.presupuesto;
	}
	public void crearTemporadaReal(String nominas, String partidos) {
		this.temporada = new TemporadaReal();
		this.temporada.crearEquipos(nominas);
		this.fechaSiguiente = temporada.crearFechas(partidos);
	}
	public boolean hacerReportePartido(String resultado) {
		if (fechaActual==null)
			return false;
		else
			return fechaActual.hacerReportePartido(resultado);
	}
	public HashMap<String, Equipo> getEquiposReales() {
		return temporada.getEquipos();
	}
	
	public Fecha getFechaSiguiente(){
		return this.fechaSiguiente;
	}
	
	public void concluirFecha() {
		this.fechaActual = this.fechaSiguiente;
		this.fechaSiguiente = this.temporada.concluirFecha(this.fechaActual);
		for(EquipoFantasia e: equipos) {
			e.concluirFecha();
		}
	}
	public List<EquipoFantasia> mejoresTresEquipos(){
		ArrayList<EquipoFantasia> equipos = this.equipos;
		if(equipos.size()>=3) {
			Collections.sort(equipos, new CompararEquipos());
			List<EquipoFantasia> mejores3 = equipos.subList(0,3);
			return mejores3;
		} else {
			return equipos;
		}
	}
	public void actualizarDatos() {
		for(EquipoFantasia e: equipos) {
			e.actualizarPuntos();
		}
	}
}
