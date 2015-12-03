package pantallas;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AgregarClaseFrame extends JFrame{
private JPanel clase;
	
	public AgregarClaseFrame() {

		clase = new AgregarClasePanel();

		setSize(700, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setUndecorated(true);
		
		setLayout(new BorderLayout());
		add(clase);
		
		
		setVisible(true);
		


	}
}
