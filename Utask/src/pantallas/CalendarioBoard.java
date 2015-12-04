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

public class CalendarioBoard extends JPanel {
	private JLabel calendario;
	private JButton mas;
	private JTextArea texto;
	
	public CalendarioBoard(){
		setBackground(Color.WHITE);
		calendario = new JLabel(new ImageIcon("CalendarioLibro.png"));
		mas = new JButton(new ImageIcon("mas.png"));
		texto = new JTextArea();
		mas.setBorder(null);
		mas.setContentAreaFilled(false);
		setLayoutPanel();
		
		mas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AgregarTareasFrame tarea =new AgregarTareasFrame();
			}
			
		});
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
		
		gc.gridx = 0;
		gc.gridwidth = 2;
		add(texto, gc);
		
	}
}
