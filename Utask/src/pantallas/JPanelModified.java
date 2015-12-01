package pantallas;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelModified extends JPanel {
	private JLabel text;
	
	
	public JPanelModified(String text) {
		setBackground(new Color(255,255,255));
		setBorder(BorderFactory.createEtchedBorder());
		this.text = new JLabel(text);
		//this.text.setForeground(Color.WHITE);
		add(this.text);
	}
}
