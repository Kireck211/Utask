package pantallas;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalendarioBoard extends JPanel {
	private JLabel calendario;
	private JButton mas;
	
	public CalendarioBoard(){
		setBackground(Color.WHITE);
		calendario = new JLabel(new ImageIcon("CalendarioLibro.png"));
		mas = new JButton(new ImageIcon("mas.png"));
		mas.setBorder(null);
		mas.setContentAreaFilled(false);
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
		
		gc.weightx = 1;
		gc.fill = GridBagConstraints.EAST;
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.NORTHEAST;
		gc.insets = new Insets(20, 0, 0, 30);
		add(mas,gc);
		
	}
}
