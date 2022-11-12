package vista;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import controlador.ControladorUsuario;
import modelo.Participante;

public class PJugador extends JPanel{
	
	private ControladorUsuario controlador;
	private POpcionesAdmin pOpcionesAdmin;
	
	public PJugador(Participante p) {
		this.controlador = new ControladorUsuario(p);
		this.setLayout(new BorderLayout());
		this.pOpcionesAdmin = new POpcionesAdmin();
		this.add(this.pOpcionesAdmin, BorderLayout.NORTH);
		
	}	
}

