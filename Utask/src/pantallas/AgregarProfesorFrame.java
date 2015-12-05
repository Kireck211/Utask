package pantallas;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AgregarProfesorFrame extends JFrame {
	private AgregarProfesorPanel profesor;
	public int idProfesor;

	public AgregarProfesorFrame(JFrame agregarClase, int id) {

		agregarClase.setEnabled(false);
		profesor = new AgregarProfesorPanel(agregarClase, this, id);
		idProfesor = profesor.profesor.getIdProfesor();
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
		idProfesor = profesor.profesor.getIdProfesor();
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
