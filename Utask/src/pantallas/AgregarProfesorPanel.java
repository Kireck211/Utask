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

public class AgregarProfesorPanel extends JPanel {
	private JLabel titulo;
	private JLabel nombre;
	private JLabel email;
	private JLabel telefono;
	private JLabel departamento;
	private JTextArea nombreLinea;
	private JTextArea emailLinea;
	private JTextArea telefonoLinea;
	private JTextArea departamentoLinea;
	private JButton ok;
	private JButton cancel;

public AgregarProfesorPanel() {
	setBackground(new Color(255, 255, 255));
	setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
	setLayout(new BorderLayout());
	titulo = new JLabel(new ImageIcon("AgregarProfesor.png"));
	email = new JLabel(new ImageIcon("email.png"));
	nombre = new JLabel(new ImageIcon("nombree.png"));
	telefono = new JLabel(new ImageIcon("telefono.png"));
	departamento = new JLabel(new ImageIcon("departamento.png"));
	emailLinea = new JTextArea();
	emailLinea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
	telefonoLinea = new JTextArea();
	telefonoLinea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
	nombreLinea = new JTextArea();
	nombreLinea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
	departamentoLinea = new JTextArea();
	departamentoLinea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
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
	add(email, gc);

	gc.gridx = 1;
	gc.ipadx = 200;
	gc.insets = new Insets(0, 0, 0, 40);
	add(emailLinea, gc);

	gc.gridy++;
	gc.gridx = 0;
	gc.ipadx = 0;
	gc.insets = new Insets(0, 0, 0, 0);
	add(telefono, gc);

	gc.gridx = 1;
	gc.ipadx = 200;
	gc.insets = new Insets(0, 0, 0, 40);
	add(telefonoLinea, gc);

	gc.gridy++;
	gc.gridx = 0;
	gc.ipadx = 0;
	gc.insets = new Insets(0, 0, 0, 0);
	add(departamento, gc);

	gc.gridx = 1;
	gc.ipadx = 200;
	gc.insets = new Insets(0, 0, 0, 40);
	add(departamentoLinea, gc);



	gc.gridy++;
	gc.ipadx = 0;
	gc.gridx = 0;
	gc.anchor = GridBagConstraints.CENTER;
	add(ok,gc);
	
	gc.gridx = 1;
	add(cancel,gc);
	
}	
}
