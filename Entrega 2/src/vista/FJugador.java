package vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class FJugador extends JFrame{
	private POpcionesAdmin pOpcionesAdmin;
	
	public FJugador() {
		
		this.setSize(800,600);
		this.setTitle("Usuario");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.pOpcionesAdmin = new POpcionesAdmin();
		this.add(this.pOpcionesAdmin, BorderLayout.NORTH);
		
	}
	
	public static void main(String[] args) {
		FJugador fJugador = new FJugador();
		fJugador.setVisible(true);
	}
		
}

