package pantallas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import planeacion.Clase;

public class AgregarClasePanel extends JPanel {
	private JLabel titulo;
	private JLabel inicio;
	private JLabel nombre;
	private JLabel fin;
	private JLabel ubicacion;
	private JLabel profesor;
	private JLabel dSemana;
	private JLabel examenes;
	private JTextArea inicioLinea;
	private JTextArea nombreLinea;
	private JTextArea finLinea;
	private JTextArea ubicacionLinea;
	private JTextArea profesorLinea;
	private JTextArea dSemanaLinea;
	private JTextArea examenesLinea;
	private JButton ok;
	private JButton cancel;
	private Vector<Clase> clases;

	public AgregarClasePanel() {
		setBackground(new Color(255, 255, 255));
		setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
		setLayout(new BorderLayout());
		titulo = new JLabel(new ImageIcon("AgregarClase.png"));
		inicio = new JLabel(new ImageIcon("Inicio.png"));
		inicioLinea = new JTextArea();
		inicioLinea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
		nombre = new JLabel(new ImageIcon("nombree.png"));
		nombreLinea = new JTextArea();
		nombreLinea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
		fin = new JLabel(new ImageIcon("Fin.png"));
		finLinea = new JTextArea();
		finLinea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
		ubicacion = new JLabel(new ImageIcon("Ubicacion.png"));
		ubicacionLinea = new JTextArea();
		ubicacionLinea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
		profesor = new JLabel(new ImageIcon("profesores.png"));
		profesorLinea = new JTextArea();
		profesorLinea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
		dSemana = new JLabel(new ImageIcon("dSemana.png"));
		dSemanaLinea = new JTextArea();
		dSemanaLinea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
		examenes = new JLabel(new ImageIcon("examen.png"));
		examenesLinea = new JTextArea();
		examenesLinea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
		ok = new JButton(new ImageIcon("ok.png"));
		cancel = new JButton(new ImageIcon("cancel.png"));
		
		ok.setContentAreaFilled(false);
		cancel.setContentAreaFilled(false);
		ok.setBorderPainted(false);
		cancel.setBorderPainted(false);
		
		setLayoutPanel();

	}

	public void setLayoutPanel() {
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		gc.weightx = 5;
		gc.weighty = 5;
		gc.gridwidth = 2;
		gc.gridx = 0;
		gc.gridy = 0;
		gc.anchor = GridBagConstraints.CENTER;
		add(titulo, gc);

		///////// Next row ///////
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
		gc.insets = new Insets(0, 0, 0, 50);
		add(inicioLinea, gc);

		gc.gridy++;
		gc.gridx = 0;
		gc.ipadx = 0;
		gc.insets = new Insets(0, 0, 0, 0);
		add(fin, gc);

		gc.gridx = 1;
		gc.ipadx = 200;
		gc.insets = new Insets(0, 0, 0, 50);
		add(finLinea, gc);

		gc.gridy++;
		gc.gridx = 0;
		gc.ipadx = 0;
		gc.insets = new Insets(0, 0, 0, 0);
		add(ubicacion, gc);

		gc.gridx = 1;
		gc.ipadx = 200;
		gc.insets = new Insets(0, 0, 0, 50);
		add(ubicacionLinea, gc);

		gc.gridy++;
		gc.gridx = 0;
		gc.ipadx = 0;
		gc.insets = new Insets(0, 0, 0, 0);
		add(profesor, gc);

		gc.gridx = 1;
		gc.ipadx = 200;
		gc.insets = new Insets(0, 0, 0, 50);
		add(profesorLinea, gc);

		gc.gridy++;
		gc.gridx = 0;
		gc.ipadx = 0;
		gc.insets = new Insets(0, 0, 0, 0);
		add(examenes, gc);

		gc.gridx = 1;
		gc.ipadx = 200;
		gc.insets = new Insets(0, 0, 0, 50);
		add(examenesLinea, gc);

		gc.gridy++;
		gc.ipadx = 0;
		gc.gridx = 0;
		// gc.insets = new Insets(0, 0, 0, 20);
		add(dSemana, gc);

		gc.gridx = 1;
		gc.ipadx = 200;
		add(dSemanaLinea, gc);
		
		gc.gridy++;
		gc.ipadx = 0;
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.CENTER;
		add(ok,gc);
		
		gc.gridx = 1;
		add(cancel,gc);
		

	}
}
