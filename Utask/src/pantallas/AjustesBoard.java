package pantallas;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class AjustesBoard extends JPanel {
	private JButton examenes;
	private JButton tareas;
	private JButton horario;
	private JButton preestablecido;
	private JButton botones[];
	private JPanel panelAjustesExamenes;
	private JPanel panelAjustesHorario;
	private JPanel panelAjustesTareas;
	private JPanel panelAjustesPreestablecido;

	public AjustesBoard() {
		setBackground(new Color(255,255,255));
		examenes = new JButton(new ImageIcon("ExamenesAjustes.png"));
		tareas = new JButton(new ImageIcon("TareasAjustes.png"));
		horario = new JButton(new ImageIcon("HorarioAjustes.png"));
		preestablecido = new JButton(new ImageIcon("Preestablecido.png"));
		examenes.setBorder(null);
		examenes.setContentAreaFilled(false);
		tareas.setBorder(null);
		tareas.setContentAreaFilled(false);
		horario.setBorder(null);
		horario.setContentAreaFilled(false);
		preestablecido.setBorder(null);
		preestablecido.setContentAreaFilled(false);
		setLayoutPanel();
		
		botones = new JButton[4];
		botones[0] = examenes;
		botones[1] = tareas;
		botones[2] = horario;
		botones[3] = preestablecido;
		
		examenes.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if (botones[3].isVisible())
					mostrarUno(0);
				else
					mostrarUno(4); // Se muestran todos
				
			}
		});
		
		tareas.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if (botones[2].isVisible())
					mostrarUno(1);
				else
					mostrarUno(4); // Se muestran todos
			}
		});
		
		horario.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if (botones[0].isVisible())
					mostrarUno(2);
				else
					mostrarUno(4); // Se muestran todos
			}
		});
		
		preestablecido.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if (botones[2].isVisible())
					mostrarUno(3);
				else
					mostrarUno(4); // Se muestran todos
			}
		});
	}

	public void mostrarUno(int lugar){
		switch(lugar){
		case 0:
			botones[0].setVisible(true);
			for(int i =0;i<4;i++){
				if (i==0)
					continue;
				botones[i].setVisible(false);
			}
			break;
		case 1:
			botones[1].setVisible(true);
			for(int i =0;i<4;i++){
				if (i==1)
					continue;
				botones[i].setVisible(false);
			}
			break;
		case 2:
			botones[2].setVisible(true);
			for(int i =0;i<4;i++){
				if (i==2)
					continue;
				botones[i].setVisible(false);
			}
			break;
		case 3:
			botones[3].setVisible(true);
			for(int i =0;i<4;i++){
				if (i==3)
					continue;
				botones[i].setVisible(false);
			}
			break;
		default:
			for(int i =0;i<4;i++){
				botones[i].setVisible(true);
			}
		};
	}
	
	
	public void setLayoutPanel() {
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		/////// First row //////
		gc.weightx = 10;
		gc.gridx = 0;
		gc.gridy = 0;
		gc.fill = GridBagConstraints.HORIZONTAL;
		gc.ipady = 28;
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
