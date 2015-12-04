package pantallas;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class EditarPersona extends JFrame {
	private JButton cancel;
	
	public EditarPersona() {
		cancel = new JButton(new ImageIcon("cancel.png"));
		cancel.setContentAreaFilled(false);
		add(cancel);
		
		setLocationRelativeTo(null);
		setSize(50, 50);
		setIconImage(new ImageIcon("UtaskLogoo.png").getImage());
		
	}
}
