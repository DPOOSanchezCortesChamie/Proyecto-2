package vista;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class POpcionesAdmin extends JPanel {
	
	
	public POpcionesAdmin() {
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		JButton btnCrearEquipo = new JButton("Crear Equipo");
		this.add(btnCrearEquipo);
		JPanel pCompraVenta = new JPanel();
		this.add(pCompraVenta);
		
		pCompraVenta.add(new JButton("Comprar"));
		JTextField compraJugador = new JTextField("           ");
		pCompraVenta.add(compraJugador);
		pCompraVenta.add(new JButton("Vender"));
		JTextField ventaJugador = new JTextField("            ");
		pCompraVenta.add(ventaJugador);
	}
}
