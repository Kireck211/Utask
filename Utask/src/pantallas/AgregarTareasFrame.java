package pantallas;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AgregarTareasFrame extends JFrame {
	
	private JPanel tareas;
	
	public AgregarTareasFrame() {

		tareas = new AgregarTareasPanel();

		setSize(700, 600);
		setResizable(false);
		setLocationRelativeTo(null);
//		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setUndecorated(true);
		
		setLayout(new BorderLayout());
		add(tareas);
		
		
		setVisible(true);
		


	}

}