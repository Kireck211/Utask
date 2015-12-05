package pantallas;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class EditarPersona extends JFrame {
	private JButton cancel;
	private JFrame editar;
	
	public EditarPersona(final JFrame main) {
		this.editar = this;
		setSize(300,300);
		
		cancel = new JButton(new ImageIcon("cancel.png"));
		cancel.setContentAreaFilled(false);
		add(cancel);
		
		setLocationRelativeTo(null);
		setIconImage(new ImageIcon("UtaskLogoo.png").getImage());
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.setEnabled(true);
				editar.setVisible(false);
			}
		});
	}
}
