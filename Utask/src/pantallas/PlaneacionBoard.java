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

public class PlaneacionBoard extends JPanel {
	private JButton semestres;
	private JButton profesores;
	private JButton actual;
	private JButton mas;
	
	
	public PlaneacionBoard(){
		setBackground(new Color(255,255,255));
		setAll();
		quitarBordesBotones();
		quitarFondo();
		setLayoutPanel();
		
		mas.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
//				new AgregarTareasFrame();
//				new AgregarExamenFrame();
				new AgregarClaseFrame();
			}
			
		});
		
	}
	
	public void quitarBordesBotones() {
		semestres.setBorder(null);
		profesores.setBorder(null);
		actual.setBorder(null);
		mas.setBorder(null);
	}
	
	public void quitarFondo() {
		semestres.setContentAreaFilled(false);
		profesores.setContentAreaFilled(false);
		actual.setContentAreaFilled(false);
		mas.setContentAreaFilled(false);
	}
	
	public void setAll() {
		semestres = new JButton(new ImageIcon("Semestres.png"));
		profesores = new JButton(new ImageIcon("Prof.png"));
		actual = new JButton(new ImageIcon("actual.png"));
		mas = new JButton(new ImageIcon("mas.png"));
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
		gc.gridy++;
		gc.gridx=0;
		gc.weightx = 1; /////// Lo puse menor par que solo ocupara 1 de 5 de espacio
		gc.anchor = GridBagConstraints.LINE_START; ////// Se pone al principio 
		gc.insets = new Insets(0, -5, 0, 0);  ////// Se pueden poner valores negativos, y hace el efecto al reves
//		gc.fill = GridBagConstraints.EAST;

		add(actual,gc);
		/////////////////////////////////

	}
	
	
}
