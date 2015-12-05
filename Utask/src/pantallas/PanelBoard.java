package pantallas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelBoard extends JPanel {
	private JLabel background;
	
	public PanelBoard(int idUsuario) {
		setBackground(new Color(255,255,255));
		background = new JLabel(new ImageIcon("UTask.png"));
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		
		gc.gridx=0;
		gc.gridy=0;
		
		gc.ipady = 100;
		 
		add(background, gc);
		
	}
}
