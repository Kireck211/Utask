package pantallas;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class AgregarHorarioPanel extends JPanel {
	
	private JLabel nombre;
	private JTextArea nombreLinea;
	

	public AgregarHorarioPanel() {
		Font verdana = new Font("Verdana", Font.PLAIN, 12);
		nombre = new JLabel(new ImageIcon("nombre.png"));
		nombre.setFont(verdana);
		nombreLinea = new JTextArea();
		nombreLinea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
		/*nombreArea = new JTextArea();
		
			}
		});*/
	}

	public void setLayoutRegistro() {
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		gc.weightx = 5;
		gc.weighty = 5;
		gc.gridx = 0;
		gc.gridy = 0;
//		gc.anchor= GridBagConstraints.LINE_;
		add(nombre, gc);

		gc.gridx = 1;
		gc.ipadx = 200;
		// gc.ipadx = 180;
		add(nombreLinea, gc);
		
		gc.gridx = 1;
		gc.weightx = 5;
		gc.ipadx = 170;
		gc.anchor = GridBagConstraints.CENTER;
		gc.insets = new Insets(0, 0, 0, 20);
//	add(nombreArea, gc);

		///////// Next row ///////
		gc.gridy++;
		gc.gridx = 0;
		gc.ipadx = 0;
		gc.insets = new Insets(0, 0, 0, 0);
//		add(contrasenha,gc);
		
		gc.gridx = 1;
		gc.ipadx = 180;
		gc.insets = new Insets(0, 0, 0, 20);
//		add(contraArea, gc);

		///////// Next row ///////
		gc.gridy++;
		gc.gridx = 0;
		gc.ipadx = 0;
		gc.insets = new Insets(0, 0, 0, 0);
//		add(ok, gc);
		
		gc.gridx = 1;
//		add(cancel, gc);

	}
}

