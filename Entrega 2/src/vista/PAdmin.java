package vista;

import modelo.Admin;
import controlador.ControladorAdmin;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class PAdmin extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ControladorAdmin controlador;
	
	public PAdmin(Admin a) {
	
		this.controlador = new ControladorAdmin(a);
		this.setLayout(new BorderLayout());
		
		JPanel pantelTop = new JPanel();
		pantelTop.setLayout(new GridLayout(1,6));
		pantelTop.setBorder(new TitledBorder(new EtchedBorder()));
		
		
		String[] catalogo = {"Bazinga", "Renault Megane CC", "Citroen Xsara Picasso"};
		JComboBox<String> temporada = new JComboBox<String>(catalogo);
		pantelTop.add(new JLabel("Temporadas:"));
		pantelTop.add(temporada);
		pantelTop.add(new Button("Crear nueva temporada pa"));
		
		
		JPanel panelCenter = new JPanel();
		panelCenter.setLayout(new GridLayout(1,2));
		panelCenter.setBackground(Color.GRAY);
		
		JPanel panelC1 = new JPanel();
		panelC1.setLayout(new GridLayout(3, 1));
		panelC1.setBorder(new TitledBorder(new EtchedBorder()));
		
		JPanel panelC12 = new JPanel();
		panelC12.setLayout(new GridLayout(3,1));
		panelC12.add(new JLabel("EXPLORADOR DE TEMPORADA",getY()/2));
		panelC12.setBorder(new TitledBorder(new EtchedBorder()));
		
		String[] datos = {"fiumba", "boliviano", "paraguasho"};
		JComboBox<String> info = new JComboBox<String>(datos);
		
		JPanel fecha = new JPanel();
		fecha.setLayout(new GridLayout(1,2));
		fecha.add(new JLabel("Fecha: "));
		fecha.add(info);
		panelC12.add(fecha);
		
		String[] datos1 = {"fiumba", "boliviano", "paraguasho"};
		JComboBox<String> info1 = new JComboBox<String>(datos1);
		
		JPanel equipo = new JPanel();
		equipo.setLayout(new GridLayout(1,2));
		equipo.add(new JLabel("Equipo: "));
		equipo.add(info1);
		panelC12.add(equipo);
		
		
		JPanel panelC13 = new JPanel();
		panelC13.setBorder(new TitledBorder(new EtchedBorder(), "Información Jugador"));
		
		JPanel panelC14 = new JPanel();
		panelC14.setBorder(new TitledBorder(new EtchedBorder(), "Datos del Equipo"));
		
		panelC1.add(panelC12);
		panelC1.add(panelC13);
		panelC1.add(panelC14);
		
		
		JPanel panelC3 = new JPanel();
		panelC3.setBorder(new TitledBorder(new EtchedBorder()));
		
		panelCenter.add(panelC1);
		panelCenter.add(panelC3);

		this.add(panelCenter, BorderLayout.CENTER);
		this.add(pantelTop, BorderLayout.NORTH);
		
		
		
		
		
		
		
		
		
	}
}
