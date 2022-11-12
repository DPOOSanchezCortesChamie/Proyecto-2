package vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PIngresoDatos extends JPanel{
	
	private JTextField txtNombreUsuario;
	private JTextField txtContraseña;
	
	public PIngresoDatos() {
		this.setLayout(new GridLayout(4, 2, 10, 10));
		this.add(new JLabel("Nombre de usuario"));
		this.txtNombreUsuario = new JTextField();
		this.add(this.txtNombreUsuario);
		this.add(new JLabel("Contraseña"));
		this.txtContraseña = new JTextField();
		this.add(this.txtContraseña);
		
		JButton btnCrearUsuario = new JButton("Crear usuario");
		this.add(btnCrearUsuario);
		JButton btnIngresar = new JButton("Ingresar");
		this.add(btnIngresar);
		
		btnIngresar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		btnCrearUsuario.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	
	}
	
}
