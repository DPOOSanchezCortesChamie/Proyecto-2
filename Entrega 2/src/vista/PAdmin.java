package vista;

import modelo.Admin;
import controlador.ControladorAdmin;

import javax.swing.JPanel;

public class PAdmin extends JPanel{
	ControladorAdmin controlador;
	public PAdmin(Admin a) {
		this.controlador = new ControladorAdmin(a);
	}
}
