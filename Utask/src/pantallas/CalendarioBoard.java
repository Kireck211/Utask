package pantallas;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalendarioBoard extends JPanel {
	private JLabel calendario;
	
	public CalendarioBoard(){
		setBackground(Color.WHITE);
		calendario = new JLabel(new ImageIcon("CalendarioLibro.png"));
		setLayoutPanel();
	}
	public void setLayoutPanel() {
		setLayout(new GridBagLayout());

		GridBagConstraints gc = new GridBagConstraints();
		gc.weightx = 5;
		gc.weighty = 5;
		
		//////////// First row ////////////////
		
		gc.gridy = 0;
		gc.gridx = 0;
		gc.weightx = 5;
		gc.weighty = 5;
		gc.fill = GridBagConstraints.HORIZONTAL;
		gc.anchor = GridBagConstraints.WEST;
		gc.gridwidth = 2;
		add(calendario, gc);
		
	}
}
