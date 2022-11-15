package controlador;

import java.util.ArrayList;
import java.util.HashMap;

import modelo.Jugador;
import modelo.Participante;
import modelo.TemporadaFantasia;

public class ControladorUsuario {
	private Participante usuario;
	public ControladorUsuario(Participante p) {
		this.usuario = p;
	}
	public HashMap<String, Jugador> getJugadores(String equipo) {
		return this.usuario.getEquipo(equipo).getJugadores();
	}
	public void venderComprarJugadores(String equipo, Jugador saliente, Jugador entrante) {
		this.usuario.venderComprarJugadores(equipo, saliente, entrante);
	}
	public void crearEquipo(String nombre, TemporadaFantasia temporada, ArrayList<Jugador> jugadores) {
		this.usuario.crearEquipo(nombre, temporada, jugadores);
	}
}
