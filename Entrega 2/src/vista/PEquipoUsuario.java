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
		JPanel pMed = new JPanel(new FlowLayout());
		JPanel pDef = new JPanel(new FlowLayout());
		JPanel pPor = new JPanel(new FlowLayout());
		
		this.add(pDel);
		this.add(pMed);
		this.add(pDef);
		this.add(pPor);
		
		
		pDel.add(new JLabel("DEL"));
		pMed.add(new JLabel("MED"));
		pDef.add(new JLabel("DEF"));
		pPor.add(new JLabel("POR"));
		
		JButton btnDel1 = new JButton();
		JButton btnDel2 = new JButton();
		JButton btnDel3 = new JButton();
		JButton btnDel4 = new JButton();
		JButton btnDel5 = new JButton();
		
		JButton btnMed1 = new JButton();
		JButton btnMed2 = new JButton();
		JButton btnMed3 = new JButton();
		JButton btnMed4 = new JButton();
		JButton btnMed5 = new JButton();
		
		JButton btnDef1 = new JButton();
		JButton btnDef2 = new JButton();
		JButton btnDef3 = new JButton();
		JButton btnDef4 = new JButton();
		JButton btnDef5 = new JButton();
		
		JButton btnPor1 = new JButton();
		JButton btnPor2 = new JButton();
		JButton btnPor3 = new JButton();
		
		pDel.add(btnDel1);
		pDel.add(btnDel2);
		pDel.add(btnDel3);
		pDel.add(btnDel4);
		pDel.add(btnDel5);
		
		pMed.add(btnMed1);
		pMed.add(btnMed2);
		pMed.add(btnMed3);
		pMed.add(btnMed4);
		pMed.add(btnMed5);
		
		pDef.add(btnDef1);
		pDef.add(btnDef2);
		pDef.add(btnDef3);
		pDef.add(btnDef4);
		pDef.add(btnDef5);
		
		pPor.add(btnPor1);
		pPor.add(btnPor2);
		pPor.add(btnPor3);
	}

}
