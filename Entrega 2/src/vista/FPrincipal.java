package vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class FPrincipal extends JFrame{
	
	public FPrincipal() {
		
		
		this.setLayout(new BorderLayout());
		this.setTitle("LightsOut");
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setSize(500,500);
	    
	}
	
	public static void main(String[] args) {
		FPrincipal fPrincipal = new FPrincipal();
	}


	
}