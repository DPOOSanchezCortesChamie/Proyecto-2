package vista;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class POpcionesUsuario extends JPanel {
	
	
	public POpcionesUsuario() {
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		JButton btnCrearEquipo = new JButton("Crear Equipo");
		this.add(btnCrearEquipo);
		JPanel pCompraVenta = new JPanel();
		this.add(pCompraVenta);
		
		pCompraVenta.add(new JButton("Comprar"));
		JTextField txtcompraJugador = new JTextField("           ");
		pCompraVenta.add(txtcompraJugador);
		pCompraVenta.add(new JButton("Vender"));
		JTextField txtventaJugador = new JTextField("            ");
		pCompraVenta.add(txtventaJugador);
	}
}
