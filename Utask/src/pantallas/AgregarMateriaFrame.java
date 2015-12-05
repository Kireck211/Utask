package pantallas;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AgregarMateriaFrame extends JFrame{
	private JPanel materia;
	
	public AgregarMateriaFrame(JFrame agregarMateria,int idUsuario) {
		
		agregarMateria.setEnabled(false);

		materia = new AgregarMateriaPanel(this,agregarMateria,idUsuario);

		setSize(700, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setUndecorated(true);
		
		
		setLayout(new BorderLayout());
		add(materia);
		
		
		setVisible(true);
		


	}
}
