package vista;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controlador.ControladorUsuario;

public class PEquipoUsuario extends JPanel{
	ControladorUsuario controlador;
	public PEquipoUsuario(ControladorUsuario controlador) {
		
		this.setLayout(new GridLayout(5, 3, 10, 30));
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
		
		this.add(lblPosicion);
		this.add(lblTitulares);
		this.add(lblSuplentes);
		
		this.add(new JLabel("DEL"));
		this.add(pDel);
		this.add(pSDel);
		
		this.add(new JLabel("MED"));	
		this.add(pMed);
		this.add(pSMed);
		
		this.add(new JLabel("DEF"));	
		this.add(pDef);
		this.add(pSDef);
		
		this.add(new JLabel("POR"));	
		this.add(pPor);
		this.add(pSPor);
		
	
		
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
	}

}
