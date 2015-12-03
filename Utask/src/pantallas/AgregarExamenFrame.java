package pantallas;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AgregarExamenFrame extends JFrame{
	private JPanel examenes;
	
	public AgregarExamenFrame() {

		examenes = new AgregarExamenPanel();

		setSize(700, 600);
		setResizable(false);
		setLocationRelativeTo(null);
//		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setUndecorated(true);
		
		setLayout(new BorderLayout());
		add(examenes);
		
		
		setVisible(true);
		


	}
}
