package vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controlador.ControladorUsuario;
import modelo.Participante;

public class PJugador extends JPanel{
	
	private ControladorUsuario controlador;
	private POpcionesUsuario pOpcionesUsuario;
	private PEquipoUsuario pEquipoUsuario;
	private FPrincipal principal;
	
	public PJugador(Participante p, FPrincipal principal) {
		this.principal = principal;
		this.controlador = new ControladorUsuario(p);
		this.setLayout(new BorderLayout());
		this.pOpcionesUsuario= new POpcionesUsuario();
		this.add(this.pOpcionesUsuario, BorderLayout.NORTH);
		this.pEquipoUsuario = new PEquipoUsuario();
		this.add(this.pEquipoUsuario, BorderLayout.WEST);
		JButton cerrarSesion  = new JButton("Cerrar Sesion");
		this.add(cerrarSesion,BorderLayout.SOUTH);
		cerrarSesion.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				principal.cerrarSesionUsuario();
			}
		});
	}	
}

