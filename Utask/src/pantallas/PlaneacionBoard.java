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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import baseDeDatos.beans.Semestre;
import baseDeDatos.beans.SemestreControl;
import calendar.MyDate;

public class PlaneacionBoard extends JPanel {
	private JButton semestres;
	private JButton profesores;
	private JButton mas;
	private int semestre_profesor;
	private JTextArea semestres_prof;
	private JPanel panelPlaneacion;
	private Vector<Semestre> semestre;
	private int idUsuario;
	
	
	public PlaneacionBoard(final MainFrame main, final int idUsuario){
		this.idUsuario = idUsuario;
		setBackground(new Color(255,255,255));

		setAll();
		quitarBordesBotones();
		quitarFondo();
		
		panelPlaneacion = new JPanel();
		
		setLayoutPanel();
		semestres.setSelected(true);
		
		
		
		semestres.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
					semestre_profesor = 1;
			}
			
		});
		
		profesores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				semestre_profesor = 0;
			}
			
		});
		
		semestres.doClick();
		
		mas.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if (semestre_profesor == 1){
					new AgregarSemestreFrame(main, idUsuario);
					
				}
				else {
					new AgregarProfesorFrame(main);
				}
				cargarTodo();
				impresion();
			}
			
		});
		cargarTodo();
		impresion();
		
	}
	
	public void impresion() {
		int i = 0;
		while(i<this.semestre.size()) {
			Semestre semestre = this.semestre.get(i);
			String nombre = semestre.getNombre();
			MyDate inicio = semestre.getInicio();
			MyDate fin = semestre.getFin();
			boolean activo;
			if (semestre.getActivo()==1){
				activo = true;
			}
			else {
				activo = false;
			}
			JLabel semestre_a = new JLabel("Nombre: " + nombre.substring(0, 1).toUpperCase() + nombre.substring(1,nombre.length()) + " Inicio: "+ inicio.toString() + " Fin: " + fin.toString() + " Activo:"+ activo);
			GridBagConstraints gc = new GridBagConstraints();
			gc.fill = GridBagConstraints.HORIZONTAL;
			gc.gridx = 0;
			gc.gridy = i;
			
			
			panelPlaneacion.add(semestre_a,gc);
			i++;
		}
	}
	
	public void cargarTodo(){
		Vector<Semestre> semestres_temp = new Vector<>();
		semestre = new Vector<>();
		Vector<Integer> idSemestres = new Vector<>();
		SemestreControl sc = new SemestreControl(App.conn);
		idSemestres = sc.getIdSemestres(idUsuario);
		
		while(!idSemestres.isEmpty()){
			Integer semester = idSemestres.remove(0);
			semestres_temp = sc.getSemestres(semester);
			while(!semestres_temp.isEmpty()){
				semestre.addElement(semestres_temp.remove(0));
			}
		}
	}
	
	public void quitarBordesBotones() {
		semestres.setBorder(null);
		profesores.setBorder(null);
		mas.setBorder(null);
	}
	
	public void quitarFondo() {
		semestres.setContentAreaFilled(false);
		profesores.setContentAreaFilled(false);
		mas.setContentAreaFilled(false);
	}
	
	public void setAll() {
		semestres = new JButton(new ImageIcon("Semestres.png"));
		profesores = new JButton(new ImageIcon("Prof.png"));
		mas = new JButton(new ImageIcon("mas.png"));
		semestres_prof = new JTextArea();
		
	}
	
	public void setLayoutPanel() {
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		//////////First row ///////////////
		gc.gridy++;
		gc.gridx = 0;
		gc.weightx = 5; //////////////////// Muy importante para que funcionara, se necesitaba el tamaño total
		gc.fill = GridBagConstraints.CENTER;
		gc.gridwidth = 1;
		gc.anchor = GridBagConstraints.EAST;
		gc.insets = new Insets(0, 0, 0, 0);
		add(semestres, gc);
		
		////////// Next row ///////////////
		
		gc.gridx=1;
		gc.anchor = GridBagConstraints.WEST;
		add(profesores,gc);
		
		gc.weightx = 1;
		gc.anchor = GridBagConstraints.EAST;
		gc.insets = new Insets(0, 0, 0, 30);
		add(mas,gc);
		
		//////////////////////////////////
		/*gc.gridy++;
		gc.gridx=0;
		gc.weightx = 1; /////// Lo puse menor par que solo ocupara 1 de 5 de espacio
		gc.anchor = GridBagConstraints.LINE_START; ////// Se pone al principio 
		gc.insets = new Insets(0, -5, 0, 0);  ////// Se pueden poner valores negativos, y hace el efecto al reves
//		gc.fill = GridBagConstraints.EAST;

		///////////////////////////////// */
		

		
		//////////////////////////////
		
		gc.gridx=0;
		gc.gridy++;
		gc.fill = GridBagConstraints.HORIZONTAL;
		gc.gridwidth = 2;
		add(panelPlaneacion,gc);
		
	}
	
	
}
