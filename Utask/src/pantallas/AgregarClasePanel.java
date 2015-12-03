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
	private Vector<Clase> clases;

public AgregarClasePanel() {
	setBackground(new Color(255, 255, 255));
	setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
	setLayout(new BorderLayout());
	titulo = new JLabel(new ImageIcon("AgregarClase.png"));
	inicio = new JLabel(new ImageIcon("Inicio.png"));
	nombre = new JLabel(new ImageIcon("nombree.png"));
	fin = new JLabel(new ImageIcon("Fin.png"));
	ubicacion = new JLabel(new ImageIcon("Ubicacion.png"));
	profesor = new JLabel(new ImageIcon("profesores.png"));
	dSemana = new JLabel(new ImageIcon("dSemana.png"));
	examenes = new JLabel(new ImageIcon("examen.png"));
	
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
	add(inicio,gc);
	
	gc.gridy++;
	add(fin,gc);
	
	gc.gridy++;
	add(ubicacion,gc);
	
	gc.gridy++;
	add(profesor,gc);
	
	gc.gridy++;
	add(examenes,gc);
	
	gc.gridy++;
	gc.insets = new Insets(0, 0, 0, 20);
	add(dSemana,gc);

	


}
}
