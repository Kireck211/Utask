package pantallas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalendarioPanel extends JPanel{
	private JLabel title;
	private JButton cerrar;
	private JButton editar;

	public CalendarioPanel() {
		setBackground(new Color(255, 255, 255));
		setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
		setLayout(new BorderLayout());
		title = new JLabel(new ImageIcon("CalendarioTitle.png"));
		cerrar= new JButton(new ImageIcon("CerrarSesion.png"));
		editar = new JButton(new ImageIcon("EditarPerfil.png"));
		cerrar.setBorder(null);
		cerrar.setContentAreaFilled(false);
		editar.setBorder(null);
		editar.setContentAreaFilled(false);
		
		setLayoutPanel();
	}
	public void setLayoutPanel(){
		setLayout(new GridBagLayout());

		GridBagConstraints gc = new GridBagConstraints();
		gc.gridy++;
		gc.gridx = 0;
		gc.fill = GridBagConstraints.CENTER;
		gc.gridwidth = 1;
		gc.weightx = 4;
		gc.anchor = GridBagConstraints.EAST;
		gc.insets = new Insets(0, 0, 0, 0);
		add(title, gc);
		
		////////// Next row ///////////////
		gc.weightx = .5;
		gc.gridx=1;
		gc.anchor = GridBagConstraints.EAST;
		add(editar,gc);
		
		gc.weightx = .5;
		gc.gridx=2;
		gc.anchor = GridBagConstraints.WEST;
		gc.insets = new Insets(0, 0, 0, 30);
		add(cerrar,gc);



	}
}
