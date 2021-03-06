package pantallas;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import baseDeDatos.beans.Tarea;

public class TareasBoard extends JPanel{
	private JButton actuales;
	private JButton completadas;
	private JButton fecha;
	private JButton asignatura;
	private JButton mas;
	private JPanel panelTareas;
	private Vector<Tarea> tareas;
	
	public TareasBoard(Vector<Tarea> tareas,final JFrame main, final int idUsuario) {
	this.tareas = tareas;
	setBackground(new Color(255,255,255));
	actuales = new JButton(new ImageIcon("actuales.png"));
	completadas = new JButton(new ImageIcon("completadas.png"));
	fecha = new JButton(new ImageIcon("fecha.png"));
	asignatura = new JButton(new ImageIcon("asignatura.png"));
	mas = new JButton(new ImageIcon("mas.png"));
	actuales.setBorder(null);
	actuales.setContentAreaFilled(false);
	completadas.setBorder(null);
	completadas.setContentAreaFilled(false);
	fecha.setBorder(null);
	fecha.setContentAreaFilled(false);
	asignatura.setBorder(null);
	asignatura.setContentAreaFilled(false);
	mas.setBorder(null);
	mas.setContentAreaFilled(false);
	
	panelTareas = new JPanel();
	panelTareas.setLayout(new GridBagLayout());
	
	
	impresion();
	mas.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			new AgregarTareasFrame(main,idUsuario);
			impresion();
		}
		
	});
	
	setLayoutPanel();
		
	}
	
	public void impresion() {
		int i = 0;
		while(i<this.tareas.size()) {
			Tarea tarea = this.tareas.get(i);
			String nombre = tarea.getNombre();
			String asignatura = tarea.getAsignatura();
			String descripcion = tarea.getDescripcion();
			boolean realizada;
			if (tarea.getRealizada()==1){
				realizada = true;
			}
			else {
				realizada = false;
			}
			JLabel tarea_a= new JLabel("Nombre: "+ nombre.substring(0, 1).toUpperCase() + nombre.substring(1,nombre.length()) + "\tAsignatura: " + asignatura.substring(0, 1).toUpperCase() + asignatura.substring(1,asignatura.length()) + "\tDescripcion: " + descripcion.substring(0, 1).toUpperCase() + descripcion.substring(1,descripcion.length()) + "\tRealizada: " + realizada);
			GridBagConstraints gc = new GridBagConstraints();
			gc.fill = GridBagConstraints.HORIZONTAL;
			gc.gridx = 0;
			gc.gridy = i;
			
			
			panelTareas.add(tarea_a,gc);
			i++;
		}
	}
	
	public void setLayoutPanel() {
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		////////// First row ///////////////
		gc.gridy++;
		gc.gridx = 0;
		gc.fill = GridBagConstraints.CENTER;
		gc.gridwidth = 1;
		gc.anchor = GridBagConstraints.EAST;
		gc.insets = new Insets(0, 0, 0, 0);
		add(actuales, gc);
		
		////////// Next row ///////////////
		
		gc.gridx=1;
		gc.anchor = GridBagConstraints.WEST;
		add(completadas,gc);
		
		gc.weightx = 1;
		gc.anchor = GridBagConstraints.EAST;
		gc.insets = new Insets(0, 0, 0, 30);
		add(mas,gc);
		//////////////////////////////////
		gc.gridy++;
		gc.gridx=0;
		gc.fill = GridBagConstraints.HORIZONTAL;
		add(fecha, gc);
		/////////////////////////////////
		gc.gridx=1;
		gc.fill = GridBagConstraints.HORIZONTAL;
		add(asignatura,gc);
		
		gc.gridx=0;
		gc.gridy++;
		gc.fill = GridBagConstraints.HORIZONTAL;
		gc.gridwidth = 2;
		gc.insets = new Insets(0, 0, 0, 30);
		add(panelTareas,gc);
		
	}
}
