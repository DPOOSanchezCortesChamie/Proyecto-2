package vista;


import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.ControladorUsuario;

public class POpcionesUsuario extends JPanel {
	
	private JButton btnCrearEquipo;
	private JPanel pCompraVenta;
	private JTextField txtcompraJugador;
	private JTextField txtventaJugador;
	private JComboBox<String> seleccionEquipo;
	private ControladorUsuario controlador;
	
	public POpcionesUsuario(ControladorUsuario controlador) {
		
		this.setLayout(new FlowLayout());
		
		this.controlador = controlador;
		this.seleccionEquipo = new JComboBox<>();
		this.seleccionEquipo.addItem("Equipo1");
		this.seleccionEquipo.addItem("Equipo2");
		this.seleccionEquipo.addItem("Equipo3");
		this.add(seleccionEquipo);
		
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
