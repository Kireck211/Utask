package pantallas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AgregarProfesorPanel extends JPanel {
	private JLabel titulo;
	private JLabel nombre;
	private JLabel email;
	private JLabel telefono;
	private JLabel departamento;
	

public AgregarProfesorPanel() {
	setBackground(new Color(255, 255, 255));
	setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
	setLayout(new BorderLayout());
	titulo = new JLabel(new ImageIcon("AgregarProfesor.png"));
	email = new JLabel(new ImageIcon("email.png"));
	nombre = new JLabel(new ImageIcon("nombree.png"));
	telefono = new JLabel(new ImageIcon("telefono.png"));
	departamento = new JLabel(new ImageIcon("departamento.png"));
	
	
	setLayoutPanel();

}
public void setLayoutPanel(){
	setLayout(new GridBagLayout());
	GridBagConstraints gc = new GridBagConstraints();

	gc.weightx = 5;
	gc.weighty = 5;
	gc.gridx = 0;
	gc.gridy = 0;
	gc.anchor= GridBagConstraints.CENTER;
	add(titulo, gc);

	///////// Next row ///////
	gc.gridy++;
	gc.gridx = 0;
	gc.ipadx = 0;
	gc.anchor= GridBagConstraints.WEST;
	gc.insets = new Insets(0, 0, 0, 0);
	add(nombre,gc);


	///////// Next row ///////
	gc.gridy++;
	add(email,gc);
	
	gc.gridy++;
	add(telefono,gc);
	
	gc.gridy++;
	gc.insets = new Insets(0, 0, 0, 20);
	add(departamento,gc);

	
}	
}
