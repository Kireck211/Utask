package pantallas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import planeacion.Clase;
import planeacion.Materia;
import tareas.Tarea;

public class AgregarClasePanel extends JPanel{
	private JLabel titulo;
	private JLabel inicio;
	private JLabel nombre;
	private JLabel fin;
	private JLabel ubicacion;
	private JLabel profesor;
	private JLabel dSemana;
	private JLabel examenes;
<<<<<<< HEAD
	private JTextArea inicioLinea;
	private JTextArea nombreLinea;
	private JTextArea finLinea;
	private JTextArea ubicacionLinea;
	private JTextArea profesorLinea;
	private JTextArea dSemanaLinea;
	private JTextArea examenesLinea;
=======
	private Vector<Clase> clases;
>>>>>>> 24bdcec29919ddadd8567eb8a047a60a2f5b213a

public AgregarClasePanel() {
	setBackground(new Color(255, 255, 255));
	setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
	setLayout(new BorderLayout());
	titulo = new JLabel(new ImageIcon("AgregarClase.png"));
	inicio = new JLabel(new ImageIcon("Inicio.png"));
	inicioLinea = new JTextArea();
	inicioLinea.setBorder(BorderFactory.createEtchedBorder());
	nombre = new JLabel(new ImageIcon("nombree.png"));
	nombreLinea = new JTextArea();
	nombreLinea.setBorder(BorderFactory.createEtchedBorder());
	fin = new JLabel(new ImageIcon("Fin.png"));
	finLinea = new JTextArea();
	finLinea.setBorder(BorderFactory.createEtchedBorder());
	ubicacion = new JLabel(new ImageIcon("Ubicacion.png"));
	ubicacionLinea = new JTextArea();
	ubicacionLinea.setBorder(BorderFactory.createEtchedBorder());
	profesor = new JLabel(new ImageIcon("profesores.png"));
	profesorLinea = new JTextArea();
	profesorLinea.setBorder(BorderFactory.createEtchedBorder());
	dSemana = new JLabel(new ImageIcon("dSemana.png"));
	dSemanaLinea = new JTextArea();
	dSemanaLinea.setBorder(BorderFactory.createEtchedBorder());
	examenes = new JLabel(new ImageIcon("examen.png"));
	examenesLinea = new JTextArea();
	examenesLinea.setBorder(BorderFactory.createEtchedBorder());
	
	setLayoutPanel();
	
	String nombre = JOptionPane.showInputDialog("Nombre de la tarea");
	String asignatura = JOptionPane.showInputDialog("Nombre de la asignatura");
	String descripcion = JOptionPane.showInputDialog("Escriba la descripción");
//	tareas.addElement(new Tarea(new Materia(asignatura),nombre,descripcion));

}
public void setLayoutPanel(){
	setLayout(new GridBagLayout());
	GridBagConstraints gc = new GridBagConstraints();

	gc.weightx = 5;
	gc.weighty = 5;
	gc.gridwidth=2;
	gc.gridx = 0;
	gc.gridy = 0;
	gc.anchor= GridBagConstraints.CENTER;
	add(titulo, gc);

	///////// Next row ///////
	gc.gridy++;
	gc.gridwidth=1;
	gc.weightx = 2.5;
	gc.gridx = 0;
	gc.ipadx = 0;
	gc.anchor= GridBagConstraints.WEST;
	gc.insets = new Insets(0, 0, 0, 0);
	add(nombre,gc);
	
	gc.gridx = 1;
	gc.ipadx = 10;
//	gc.ipadx = 180;
	add(nombreLinea,gc);

	///////// Next row ///////
	gc.gridy++;
	gc.gridx = 0;
	gc.ipadx = 0;
	gc.insets = new Insets(0, 0, 0, 0);
	add(inicio,gc);
	
	gc.gridx = 1;
	gc.ipadx = 10;
//	gc.insets = new Insets(0, 0, 0, 20);
	add(inicioLinea, gc);
	
	gc.gridy++;
	gc.gridx = 0;
	gc.ipadx = 0;
	gc.insets = new Insets(0, 0, 0, 0);
	add(fin,gc);

	gc.gridx = 1;
	gc.ipadx = 10;
//	gc.insets = new Insets(0, 0, 0, 20);
	add(finLinea, gc);
	
	
	gc.gridy++;
	gc.gridx = 0;
	gc.ipadx = 0;
	gc.insets = new Insets(0, 0, 0, 0);
	add(ubicacion,gc);
	
	gc.gridx = 1;
	gc.ipadx = 10;
//	gc.insets = new Insets(0, 0, 0, 20);
	add(ubicacionLinea, gc);
	
	
	gc.gridy++;
	gc.gridx = 0;
	gc.ipadx = 0;
	gc.insets = new Insets(0, 0, 0, 0);
	add(profesor,gc);
	
	gc.gridx = 1;
	gc.ipadx = 10;
//	gc.insets = new Insets(0, 0, 0, 20);
	add(profesorLinea, gc);
	
	gc.gridy++;
	gc.gridx = 0;
	gc.ipadx = 0;
	gc.insets = new Insets(0, 0, 0, 0);
	add(examenes,gc);
	
	gc.gridx = 1;
	gc.ipadx = 10;
//	gc.insets = new Insets(0, 0, 0, 20);
	add(examenesLinea, gc);
	
	
	gc.gridy++;
	gc.ipadx = 0;
	gc.gridx = 0;
//	gc.insets = new Insets(0, 0, 0, 20);
	add(dSemana,gc);
	
	gc.gridx = 1;
	gc.ipadx = 10;
	add(dSemanaLinea, gc);
	

	


}
}
