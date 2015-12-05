package pantallas;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AgregarProfesorFrame extends JFrame{
private JPanel profesor;
	
	public AgregarProfesorFrame(JFrame agregarClase,int id) {

		agregarClase.setEnabled(false);
		profesor = new AgregarProfesorPanel(agregarClase, this, id);

		setSize(700, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setUndecorated(true);
		
		setLayout(new BorderLayout());
		add(profesor);
		
		
		setVisible(true);
		


	}
	
	public AgregarProfesorFrame(JFrame main) {

		main.setEnabled(false);
		profesor = new AgregarProfesorPanel(main, this);

		setSize(700, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setUndecorated(true);
		
		setLayout(new BorderLayout());
		add(profesor);
		
		
		setVisible(true);
		


	}
	

}
