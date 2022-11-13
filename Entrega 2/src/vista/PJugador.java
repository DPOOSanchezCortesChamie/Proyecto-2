package vista;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import controlador.ControladorUsuario;
import modelo.Participante;

public class PJugador extends JPanel{
	
	private ControladorUsuario controlador;
	private POpcionesUsuario pOpcionesUsuario;
	
	public PJugador(Participante p) {
		this.controlador = new ControladorUsuario(p);
		this.setLayout(new BorderLayout());
		this.pOpcionesUsuario= new POpcionesUsuario();
		this.add(this.pOpcionesUsuario, BorderLayout.NORTH);
		
	}	
}
