package vista;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.ControladorUsuario;

public class POpcionesUsuario extends JPanel {
	
	private JButton btnCrearEquipo;
	private JTextField txtcompraJugador;
	private JTextField txtventaJugador;
	private JComboBox<String> seleccionEquipo;
	private ControladorUsuario controlador;
	private JDialog crearEquipo;
	
	public POpcionesUsuario(ControladorUsuario controlador) {
		
		ArrayList<String> jugadores = new ArrayList<String>();
		
		this.setLayout(new FlowLayout());
		this.crearEquipo = new JDialog();
		this.crearEquipo.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		this.crearEquipo.setSize(700,400);
		this.controlador = controlador;
		this.seleccionEquipo = new JComboBox<>();
		for (String e: controlador.getEquipos()) {
			this.seleccionEquipo.addItem(e);
		}
		this.add(seleccionEquipo);
		
		this.btnCrearEquipo = new JButton("Crear Equipo");
		this.add(btnCrearEquipo);
		this.btnCrearEquipo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				crearEquipo.setVisible(true);
			}
		});
		
		JButton desComp = new JButton("Desempeño comparativo de jugadores");
		JButton historial = new JButton("Historial de compra y venta de jugadores");
		JButton mostrarJugadores = new JButton("Mostrar jugadores");
		this.add(desComp);
		this.add(historial);
		this.add(mostrarJugadores);
		
		crearEquipo.setLayout(new BorderLayout());
		JPanel input = new JPanel();
		input.setLayout(new GridLayout(3,2));
		input.add(new JLabel("Nombre temporada: "));
		JTextField tempName = new JTextField();
		input.add(tempName);
		input.add(new JLabel("Nombre equipo:"));
		JTextField equName = new JTextField();
		input.add(equName);
		input.add(new JLabel("Jugador"));
		JPanel inputJ = new JPanel();
		JTextField jName  = new JTextField();
		JButton confirmar = new JButton("Confirmar");
		confirmar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jName.getText().isBlank()) {
					mensajeError("El campo de jugador no puede estar vacio");
				} else {
					jugadores.add(jName.getText());
					mensajeBasado("Se agrego el jugador " + jName.getText());
					jName.setText("");
					
				}
			}
		});
		inputJ.setLayout(new GridLayout(1,2));
		inputJ.add(jName);
		inputJ.add(confirmar);
		input.add(inputJ);
		JPanel iz = new JPanel();
		iz.setLayout(new BorderLayout());
		iz.add(input, BorderLayout.CENTER);
		JPanel fin = new JPanel();
		crearEquipo.add(iz, BorderLayout.CENTER);
		
		JButton create = new JButton("Crear equipo");		
		crearEquipo.add(create, BorderLayout.LINE_END);
		create.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (tempName.getText()!=""&&equName.getText()!=""&&jugadores.size()==15) {
					boolean xd = controlador.crearEquipo(tempName.getText(), equName.getText(), jugadores);
					if(!xd)
						mensajeError("No se pudo crear la temporada");
				} else {
					mensajeError("No pueden haber valores sin llenar");
				}
			}
		});
	}
	private void mensajeError(String mensaje) {
		JOptionPane.showMessageDialog(this,mensaje,"Error", JOptionPane.ERROR_MESSAGE); 					
	}
	private void mensajeBasado(String mensaje) {
		JOptionPane.showMessageDialog(this,mensaje, "Operacion exitosa", JOptionPane.INFORMATION_MESSAGE);
	}
}
