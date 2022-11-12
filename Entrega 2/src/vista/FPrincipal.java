package vista;

import modelo.Participante;
import modelo.Admin;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;

public class FPrincipal extends JFrame{
	
	private PIngresoDatos pIngresoDatos;
	
	public FPrincipal() {
				
		this.setTitle("Fútbol de Fantasía");
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setSize(500,500);
		this.setLayout(new BorderLayout());
		this.pIngresoDatos = new PIngresoDatos(this);
		this.add(this.pIngresoDatos, BorderLayout.CENTER);
		
		JLabel nombres = new JLabel("Por: Juan Sebastian Sanchez, Santiago Chamie y Daniel Lozano");
		this.add(nombres,BorderLayout.PAGE_END);
		
	}
	public void iniciarUsuario(Participante p) {
		PJugador pJugador = new PJugador(p);
		this.remove(this.pIngresoDatos);
		this.add(pJugador, BorderLayout.CENTER);
		SwingUtilities.updateComponentTreeUI(this);
	}
	
	public void iniciarAdmin(Admin a) {
		PAdmin pAdmin = new PAdmin(a);
		this.remove(this.pIngresoDatos);
		this.add(pAdmin, BorderLayout.CENTER);
		SwingUtilities.updateComponentTreeUI(this);
	}
	public void cerrarSesion() {
		this.add(this.pIngresoDatos, BorderLayout.CENTER);
		SwingUtilities.updateComponentTreeUI(this);
	}
	
	public static void main(String[] args) {
		FPrincipal fPrincipal = new FPrincipal();
		fPrincipal.setVisible(true);
	}


	
}