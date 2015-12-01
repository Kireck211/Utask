package pantallas;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HeaderPanel extends JPanel {
	private JLabel title;
	
	public HeaderPanel(){
		setBackground(new Color(255,255,255));
		setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
		setLayout(new BorderLayout());
		title = new JLabel(new ImageIcon("tituloUtask.png"));
		add(title);
		
	}
	
	
}
