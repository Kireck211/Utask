package pantallas;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PlaneacionBoard extends JPanel {
	private JButton semestres;
	private JButton profesores;
	private JButton mas;
	private int semestre_profesor;
	private JTextArea semestres_prof;
	private JPanel panelPlaneacion;
	
	
	public PlaneacionBoard(final MainFrame main, final int idUsuario){
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
					new AgregarProfesorFrame();
				}
				/*new AgregarTareasFrame();
				new AgregarExamenFrame();
				new AgregarClaseFrame();
				new AgregarMateriaFrame();*/
			}
			
		});
		
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
