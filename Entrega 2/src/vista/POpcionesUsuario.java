package vista;


import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class POpcionesUsuario extends JPanel {
	
	private JButton btnCrearEquipo;
	private JPanel pCompraVenta;
	private JTextField txtcompraJugador;
	private JTextField txtventaJugador;
	
	public POpcionesUsuario() {
		
		this.setLayout(new FlowLayout());
		
		this.btnCrearEquipo = new JButton("Crear Equipo");
		this.add(btnCrearEquipo);
		this.pCompraVenta = new JPanel();
		this.add(pCompraVenta);
		
		this.pCompraVenta.add(new JButton("Comprar"));
		this.txtcompraJugador = new JTextField("           ");
		this.pCompraVenta.add(txtcompraJugador);
		this.pCompraVenta.add(new JButton("Vender"));
		this.txtventaJugador = new JTextField("            ");
		this.pCompraVenta.add(txtventaJugador);
	}
}
