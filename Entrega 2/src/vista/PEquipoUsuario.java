package vista;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PEquipoUsuario extends JPanel{
	
	public PEquipoUsuario() {
		
		this.setLayout(new GridLayout(4, 3, 10, 30));
		
		JPanel pDel = new JPanel(new FlowLayout());
		JPanel pSDel = new JPanel(new FlowLayout());
		JPanel pMed = new JPanel(new FlowLayout());
		JPanel pSMed = new JPanel(new FlowLayout());
		JPanel pDef = new JPanel(new FlowLayout());
		JPanel pSDef = new JPanel(new FlowLayout());
		JPanel pPor = new JPanel(new FlowLayout());
		JPanel pSPor = new JPanel(new FlowLayout());
		
		this.add(pDel);
		this.add(pSDel);
		this.add(pMed);
		this.add(pSMed);
		this.add(pDef);
		this.add(pSDef);
		this.add(pPor);
		this.add(pSPor);
		
		
		pDel.add(new JLabel("DEL"));
		pMed.add(new JLabel("MED"));
		pDef.add(new JLabel("DEF"));
		pPor.add(new JLabel("POR"));
		
		JButton btnDel1 = new JButton();
		JButton btnDel2 = new JButton();
		
		JButton btnSDel1 = new JButton();
		
		JButton btnMed1 = new JButton();
		JButton btnMed2 = new JButton();
		JButton btnMed3 = new JButton();
		JButton btnMed4 = new JButton();
		
		JButton btnSMed1 = new JButton();
		
		JButton btnDef1 = new JButton();
		JButton btnDef2 = new JButton();
		JButton btnDef3 = new JButton();
		JButton btnDef4 = new JButton();
		
		JButton btnSDef1 = new JButton();
		
		JButton btnPor1 = new JButton();
		
		JButton btnSPor1 = new JButton();
		
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
