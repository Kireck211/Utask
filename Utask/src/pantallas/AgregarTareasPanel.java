package pantallas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import planeacion.Materia;
import tareas.Tarea;

public class AgregarTareasPanel extends JPanel{
	private JLabel titulo;
	private JLabel asignatura;
	private JLabel nombre;
	private JLabel descripcion;
	private JLabel realizada;
	private String[] opciones = {"Realizada", "No realizada"};
	private JTextArea tituloA;
	private JTextArea asignaturaA;
	private JTextArea nombreA;
	private JTextArea descripcionA;
	private JComboBox lista;
	private Vector<Tarea> tareas;
	private String nombre_jp;
	private String asignatura_jp;
	private String descripcion_jp;



public AgregarTareasPanel() {
	setBackground(new Color(255, 255, 255));
	setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
	setLayout(new BorderLayout());
	titulo = new JLabel(new ImageIcon("AgregarTareas.png"));
	asignatura = new JLabel(new ImageIcon("Asignaturaa.png"));
	nombre = new JLabel(new ImageIcon("nombree.png"));
	descripcion = new JLabel(new ImageIcon("Descripcion.png"));
	realizada = new JLabel(new ImageIcon("Realizada.png"));
	GridBagConstraints gc = new GridBagConstraints();
	
	setLayoutPanel(gc);
	
	lista = new JComboBox(opciones);
	lista.setSelectedIndex(0); 	
	nombre_jp = JOptionPane.showInputDialog("Nombre de la tarea");
	asignatura_jp = JOptionPane.showInputDialog("Nombre de la asignatura");
	descripcion_jp = JOptionPane.showInputDialog("Escriba la descripción");

}
public void setLayoutPanel(GridBagConstraints gc){
	setLayout(new GridBagLayout());

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
	gc.gridx = 1;
	JLabel nombre_jl = new JLabel(nombre_jp);
	add(nombre_jl,gc);

	///////// Next row ///////
	gc.gridx = 0;
	gc.gridy++;
	add(asignatura,gc);
	gc.gridx = 1;
	JLabel asignatura_jl = new JLabel(asignatura_jp);
	add(asignatura_jl, gc);
	
	gc.gridy++;
	gc.gridx = 0;
	add(descripcion,gc);
	gc.gridx = 1;
	JLabel descripcion_jl = new JLabel(descripcion_jp);
	add(descripcion_jl,gc);
	
	gc.gridx = 0;
	gc.gridy++;
	add(realizada,gc);
	
	
	/*gc.ipadx = 180;
	gc.insets = new Insets(0, 0, 0, 20);
	add(lista,gc);*/

	
	
}
}
