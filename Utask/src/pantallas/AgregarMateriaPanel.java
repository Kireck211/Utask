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
import javax.swing.JTextArea;

public class AgregarMateriaPanel extends JPanel{
	private JLabel titulo;
	private JLabel nombre;
	private JLabel color;
	private JLabel hoursLeft;
	private JLabel AssignmentLeft;
	private JLabel horario;
	private JTextArea nombreLinea;
	private JTextArea colorLinea;
	private JTextArea hourLinea;
	private JTextArea assignLinea;
	private JTextArea horarioLinea;
	private JButton ok;
	private JButton cancel;
	
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
	colorLinea = new JTextArea();
	colorLinea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
	hourLinea = new JTextArea();
	hourLinea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
	nombreLinea = new JTextArea();
	nombreLinea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
	assignLinea = new JTextArea();
	assignLinea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
	horarioLinea = new JTextArea();
	horarioLinea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
	ok = new JButton(new ImageIcon("ok.png"));
	cancel = new JButton(new ImageIcon("cancel.png"));
	
	ok.setContentAreaFilled(false);
	cancel.setContentAreaFilled(false);
	ok.setBorderPainted(false);
	cancel.setBorderPainted(false);
	
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
	
	
	gc.gridy++;
	gc.gridwidth = 1;
	gc.weightx = 2.5;
	gc.gridx = 0;
	gc.ipadx = 0;
	gc.anchor = GridBagConstraints.WEST;
	gc.insets = new Insets(0, 0, 0, 0);
	add(nombre, gc);

	gc.gridx = 1;
	gc.ipadx = 200;
	// gc.ipadx = 180;
	add(nombreLinea, gc);

	///////// Next row ///////
	gc.gridy++;
	gc.gridx = 0;
	gc.ipadx = 0;
	gc.insets = new Insets(0, 0, 0, 0);
	add(color, gc);

	gc.gridx = 1;
	gc.ipadx = 200;
	gc.insets = new Insets(0, 0, 0, 40);
	add(colorLinea, gc);

	gc.gridy++;
	gc.gridx = 0;
	gc.ipadx = 0;
	gc.insets = new Insets(0, 0, 0, 0);
	add(hoursLeft, gc);

	gc.gridx = 1;
	gc.ipadx = 200;
	gc.insets = new Insets(0, 0, 0, 40);
	add(hourLinea, gc);

	gc.gridy++;
	gc.gridx = 0;
	gc.ipadx = 0;
	gc.insets = new Insets(0, 0, 0, 0);
	add(AssignmentLeft, gc);

	gc.gridx = 1;
	gc.ipadx = 200;
	gc.insets = new Insets(0, 0, 0, 40);
	add(assignLinea, gc);

	gc.gridy++;
	gc.gridx = 0;
	gc.ipadx = 0;
	gc.insets = new Insets(0, 0, 0, 0);
	add(horario, gc);

	gc.gridx = 1;
	gc.ipadx = 200;
	gc.insets = new Insets(0, 0, 0, 40);
	add(horarioLinea, gc);


	gc.gridy++;
	gc.ipadx = 0;
	gc.gridx = 0;
	gc.anchor = GridBagConstraints.CENTER;
	add(ok,gc);
	
	gc.gridx = 1;
	add(cancel,gc);
	
}
}
