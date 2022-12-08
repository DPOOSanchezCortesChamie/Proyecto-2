package controlador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import modelo.Jugador;
import modelo.Participante;
import modelo.TemporadaFantasia;

public class ControladorUsuario {
	private Participante usuario;
	private ControladorPrincipal controlador;
	public ControladorUsuario(Participante p, ControladorPrincipal controlador) {
		this.usuario = p;
		this.controlador = controlador;
	}
	public HashMap<String, Jugador> getJugadores(String equipo) {
		return this.usuario.getEquipo(equipo).getJugadores();
	}
	public void venderComprarJugadores(String equipo, Jugador saliente, Jugador entrante) {
		this.usuario.venderComprarJugadores(equipo, saliente, entrante);
	}
	public boolean crearEquipo(String nombre, String temporada, ArrayList<String> jugadores) {
		TemporadaFantasia tempFantasia = this.controlador.encontrarTemporada(temporada);
		if (tempFantasia != null) {
			ArrayList<Jugador> players = tempFantasia.encontrarJugadores(jugadores);
			if (jugadores.size()==players.size()) {
				this.usuario.crearEquipo(nombre, tempFantasia, players);
				return true;
			}
		}
		return false;
	}
	public Set<String> getEquipos(){
		return usuario.getEquipos();
	}
}
