package pantallas;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PlaneacionBoard extends JPanel {
	private JButton semestres;
	private JButton profesores;
	private JButton actual;
	
	
	public PlaneacionBoard(){
		setBackground(new Color(255,255,255));
		semestres = new JButton(new ImageIcon("Semestres.png"));
		profesores = new JButton(new ImageIcon("profesores.png"));
		actual = new JButton(new ImageIcon("actual.png"));
		semestres.setBorder(null);
		semestres.setContentAreaFilled(false);
		profesores.setBorder(null);
		profesores.setContentAreaFilled(false);
		actual.setBorder(null);
		actual.setContentAreaFilled(false);
		setLayoutPanel();
		
	}
	public void setLayoutPanel() {
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		//////////First row ///////////////
		gc.gridy++;
		gc.gridx = 0;
		gc.fill = GridBagConstraints.CENTER;
		gc.gridwidth = 1;
		gc.anchor = GridBagConstraints.EAST;
		gc.insets = new Insets(0, 0, 0, 0);
		add(semestres, gc);
		
		////////// Next row ///////////////
		
		gc.gridx=1;
		gc.anchor = GridBagConstraints.WEST;
		add(profesores,gc);
		
		//////////////////////////////////
		gc.gridy++;
		gc.gridx=0;
		gc.anchor = GridBagConstraints.EAST;
		gc.fill = GridBagConstraints.EAST;
		gc.gridwidth = 1;
		add(actual,gc);
		/////////////////////////////////

	}
	
	
}
