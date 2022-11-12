package vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class FPrincipal extends JFrame{
	
	private PIngresoDatos pIngresoDatos;
	
	public FPrincipal() {
		
		this.setTitle("Fútbol de Fantasía");
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setSize(500,500);
		this.setLayout(new BorderLayout());
		
		this.pIngresoDatos = new PIngresoDatos();
		this.add(this.pIngresoDatos, BorderLayout.CENTER);
		
	}
	
	public static void main(String[] args) {
		FPrincipal fPrincipal = new FPrincipal();
		fPrincipal.setVisible(true);
	}


	
}