package pantallas;

import java.awt.BorderLayout;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AgregarSemestreFrame extends JFrame{
private JPanel semestre;
	
	public AgregarSemestreFrame(MainFrame main, int idUsuario) {

		main.setEnabled(false);
		semestre = new AgregarSemestrePanel(main,this, idUsuario);

		setSize(700, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setUndecorated(true);
		
		setLayout(new BorderLayout());
		add(semestre);
		
		
		setVisible(true);
		


	}

}
