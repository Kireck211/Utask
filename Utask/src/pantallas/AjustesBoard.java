package pantallas;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class AjustesBoard extends JPanel {
	private JButton examenes;
	private JButton tareas;
	private JButton horario;
	private JButton preestablecido;

	public AjustesBoard() {
		setBackground(new Color(255,255,255));
		examenes = new JButton("Exámenes");
		tareas = new JButton("Tareas");
		horario = new JButton("Horario");
		preestablecido = new JButton("Preestablecido");
		
		setLayoutPanel();
		

	}

	public void setLayoutPanel() {
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		/////// First row //////
		gc.weightx = 10;
		gc.gridx = 0;
		gc.gridy = 0;
		gc.fill = GridBagConstraints.HORIZONTAL;
//		gc.ipady = 110;
		add(examenes, gc);

		////// Next row //////
		gc.gridy++;
		add(horario, gc);
		
		////// Next row //////
		gc.gridy++;
		add(tareas, gc);

		////// Next row //////
		gc.gridy++;
		add(preestablecido, gc);
	}
}
