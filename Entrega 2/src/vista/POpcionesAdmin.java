package vista;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class POpcionesAdmin extends JPanel{

	
	public POpcionesAdmin() {
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		JButton btnCrearTemporada = new JButton("Crear Temporada");
		this.add(btnCrearTemporada);

	}	
	
}
