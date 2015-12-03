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

public class AgregarMateriaPanel extends JPanel{
	private JLabel titulo;
	private JLabel nombre;
	private JLabel color;
	private JLabel hoursLeft;
	private JLabel AssignmentLeft;
	private JLabel horario;

public AgregarMateriaPanel() {
	setBackground(new Color(255, 255, 255));
	setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
	setLayout(new BorderLayout());
	titulo = new JLabel(new ImageIcon("materia.png"));
	color = new JLabel(new ImageIcon("color.png"));
	nombre = new JLabel(new ImageIcon("nombree.png"));
	hoursLeft = new JLabel(new ImageIcon("HorasRestantes.png"));
	AssignmentLeft = new JLabel(new ImageIcon("ExamesRestantes.png"));
	horario = new JLabel(new ImageIcon("horario.png"));
	
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
	add(color,gc);
	
	gc.gridy++;
	add(hoursLeft,gc);
	
	gc.gridy++;
	add(AssignmentLeft,gc);
	
	gc.gridy++;
	gc.insets = new Insets(0, 0, 0, 20);
	add(horario,gc);
	
}
}
