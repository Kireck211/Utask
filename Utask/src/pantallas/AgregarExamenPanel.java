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

public class AgregarExamenPanel extends JPanel{
	private JLabel titulo;
	private JLabel inicio;
	private JLabel nombre;
	private JLabel fin;
	private JLabel ubicacion;
	private JLabel profesor;
	private JTextArea inicioLinea;
	private JTextArea nombreLinea;
	private JTextArea finLinea;
	private JTextArea ubicacionLinea;
	private JTextArea profesorLinea;
	private JButton ok;
	private JButton cancel;


public AgregarExamenPanel() {
	setBackground(new Color(255, 255, 255));
	setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
	setLayout(new BorderLayout());
	titulo = new JLabel(new ImageIcon("AgregarExamenes.png"));
	inicio = new JLabel(new ImageIcon("Inicio.png"));
	nombre = new JLabel(new ImageIcon("nombree.png"));
	fin = new JLabel(new ImageIcon("Fin.png"));
	ubicacion = new JLabel(new ImageIcon("Ubicacion.png"));
	profesor = new JLabel(new ImageIcon("profesores.png"));
	profesorLinea = new JTextArea();
	profesorLinea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
	inicioLinea = new JTextArea();
	inicioLinea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
	nombreLinea = new JTextArea();
	nombreLinea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
	finLinea = new JTextArea();
	finLinea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
	ubicacionLinea = new JTextArea();
	ubicacionLinea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
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
	gc.gridwidth = 2;
	gc.gridx = 0;
	gc.gridy = 0;
	gc.anchor = GridBagConstraints.CENTER;
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
	add(inicio, gc);

	gc.gridx = 1;
	gc.ipadx = 200;
	gc.insets = new Insets(0, 0, 0, 40);
	add(inicioLinea, gc);

	gc.gridy++;
	gc.gridx = 0;
	gc.ipadx = 0;
	gc.insets = new Insets(0, 0, 0, 0);
	add(fin, gc);

	gc.gridx = 1;
	gc.ipadx = 200;
	gc.insets = new Insets(0, 0, 0, 40);
	add(finLinea, gc);

	gc.gridy++;
	gc.gridx = 0;
	gc.ipadx = 0;
	gc.insets = new Insets(0, 0, 0, 0);
	add(ubicacion, gc);

	gc.gridx = 1;
	gc.ipadx = 200;
	gc.insets = new Insets(0, 0, 0, 40);
	add(ubicacionLinea, gc);

	gc.gridy++;
	gc.gridx = 0;
	gc.ipadx = 0;
	gc.insets = new Insets(0, 0, 0, 0);
	add(profesor, gc);

	gc.gridx = 1;
	gc.ipadx = 200;
	gc.insets = new Insets(0, 0, 0, 40);
	add(profesorLinea, gc);
	
	gc.gridy++;
	gc.ipadx = 0;
	gc.gridx = 0;
	gc.anchor = GridBagConstraints.CENTER;
	add(ok,gc);
	
	gc.gridx = 1;
	add(cancel,gc);

}

}
