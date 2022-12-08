package vista;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import controlador.ControladorUsuario;

public class PEquipoUsuario extends JPanel{
	ControladorUsuario controlador;
	public PEquipoUsuario(ControladorUsuario controlador) {
		this.setLayout(new GridLayout(1,2));
		JPanel sustituciones = new JPanel();
		sustituciones.setLayout(new GridLayout(5, 3));
		this.controlador = controlador;
		JPanel pDel = new JPanel(new FlowLayout());
		JPanel pSDel = new JPanel(new FlowLayout());
		JPanel pMed = new JPanel(new FlowLayout());
		JPanel pSMed = new JPanel(new FlowLayout());
		JPanel pDef = new JPanel(new FlowLayout());
		JPanel pSDef = new JPanel(new FlowLayout());
		JPanel pPor = new JPanel(new FlowLayout());
		JPanel pSPor = new JPanel(new FlowLayout());
		
		JLabel lblPosicion = new JLabel("Posición");
		JLabel lblTitulares = new JLabel("Titulares");
		JLabel lblSuplentes = new JLabel("Suplentes");
		
		sustituciones.add(lblPosicion);
		sustituciones.add(lblTitulares);
		sustituciones.add(lblSuplentes);
		
		sustituciones.add(new JLabel("DEL"));
		sustituciones.add(pDel);
		sustituciones.add(pSDel);
		
		sustituciones.add(new JLabel("MED"));	
		sustituciones.add(pMed);
		sustituciones.add(pSMed);
		
		sustituciones.add(new JLabel("DEF"));	
		sustituciones.add(pDef);
		sustituciones.add(pSDef);
		
		sustituciones.add(new JLabel("POR"));	
		sustituciones.add(pPor);
		sustituciones.add(pSPor);
			
		JButton btnDel1 = new JButton("DEL1");
		JButton btnDel2 = new JButton("DEL2");
		JButton btnSDel1 = new JButton("DEL suplente");
		
		JButton btnMed1 = new JButton("MED1");
		JButton btnMed2 = new JButton("MED2");
		JButton btnMed3 = new JButton("MED3");
		JButton btnMed4 = new JButton("MED4");
		JButton btnSMed1 = new JButton("MED suplente");
		
		JButton btnDef1 = new JButton("DEF1");
		JButton btnDef2 = new JButton("DEF2");
		JButton btnDef3 = new JButton("DEF3");
		JButton btnDef4 = new JButton("DED4");
		JButton btnSDef1 = new JButton("DEF suplente");
		
		JButton btnPor1 = new JButton("POR1");
		JButton btnSPor1 = new JButton("POR suplente");
		
		pDel.add(btnDel1);
		pDel.add(btnDel2);
		pSDel.add(btnSDel1);
		pMed.add(btnMed1);
		pMed.add(btnMed2);
		pMed.add(btnMed3);
		pMed.add(btnMed4);
		pSMed.add(btnSMed1);
		pDef.add(btnDef1);
		pDef.add(btnDef2);
		pDef.add(btnDef3);
		pDef.add(btnDef4);
		pSDef.add(btnSDef1);	
		pPor.add(btnPor1);
		pSPor.add(btnSPor1);
		
		this.add(sustituciones);
		
		JPanel compraventa = new JPanel();
		compraventa.setLayout(new GridLayout(7,1));
		compraventa.add(new JLabel("Compra/Venta"));
		JButton hacer = new JButton("Hacer transaccion");
		compraventa.add(hacer);
		compraventa.add(new JLabel("Comprar"));
		JTextField comprar = new JTextField();
		JTextField vender = new JTextField();
		compraventa.add(comprar);
		compraventa.add(new JLabel("Vender"));
		compraventa.add(vender);
		compraventa.add(new JLabel("Dinero disponible: "));
		
		this.add(compraventa);
	}

}
