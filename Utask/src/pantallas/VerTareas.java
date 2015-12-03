package pantallas;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class VerTareas extends JFrame {
	private VerTareasPanel panel;
	
	public VerTareas() {
		//panel = new VerTareasPanel();
		setEnabled(true);
		setLayout(new BorderLayout());
		
		add(panel);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setMinimumSize(new Dimension(1100, 700));
		
		setVisible(true);
		
		
	}
}
