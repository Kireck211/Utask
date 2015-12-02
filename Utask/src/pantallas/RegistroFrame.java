package pantallas;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class RegistroFrame extends JFrame {
	private JFrame inicio;
	private JPanel registro;
	
	public RegistroFrame(JFrame inicio) {

		this.inicio = inicio;
		registro = new RegistroPanel(inicio, this);

		setSize(450, 400);
		setResizable(false);
		setLocationRelativeTo(null);
//		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setUndecorated(true);
		
		
		setLayout(new BorderLayout());
		add(registro);
		
		
		setVisible(true);
		


	}

}
