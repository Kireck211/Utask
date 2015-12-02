package pantallas;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelBarraDeOpciones extends JPanel {
	private JButton calendario;
	private JButton planeacion;
	private JButton tarea;
	private JButton ajustes;
	private MainFrame main;

	public PanelBarraDeOpciones(final MainFrame main) {
		setBackground(new Color(255, 255, 255));
		setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.GRAY));
		calendario = new JButton(new ImageIcon("calendario.png"));
		planeacion = new JButton(new ImageIcon("canvas-prueba.png"));
		ajustes = new JButton(new ImageIcon("ajustes.png"));
		tarea = new JButton(new ImageIcon("tarea.png"));
		this.main = main;

//		quitarContornoBotones();
		quitarBorderBotones();
		setLayoutPanel();
		calendario.setBackground(new Color(255,117,38));
		planeacion.setBackground(new Color(127,51,0));
		ajustes.setBackground(new Color(119,124,36));
		tarea.setBackground(new Color(255,203,61));
		calendario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.mostrarUno(1);
			}
		});

		planeacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.mostrarUno(3);
			}
		});

		ajustes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.mostrarUno(4);
			}
		});

		tarea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.mostrarUno(2);
			}
		});

	}

	public void quitarBorderBotones() {
		calendario.setBorder(null);
		planeacion.setBorder(null);
		ajustes.setBorder(null);
		tarea.setBorder(null);
	}

	public void quitarContornoBotones() {
//		calendario.setContentAreaFilled(false);
		planeacion.setContentAreaFilled(false);
		ajustes.setContentAreaFilled(false);
		tarea.setContentAreaFilled(false);
	}

	public void setActionListeners() {

	}

	public void setLayoutPanel() {
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		gc.weightx = 0.1;
		gc.weighty = 2;

		/////////// First row ////////////////
		gc.gridx = 0;
		gc.gridy = 0;
		gc.ipady = 180;
		gc.fill = GridBagConstraints.HORIZONTAL;
		// gc.insets = new Insets(20, 0, 20, 0);
		add(calendario, gc);

		///////// Next row ////////////////
		gc.gridy++;
		add(tarea, gc);

		//////// Next row ///////////////
		gc.gridy++;
		add(planeacion, gc);

		//////// Next row //////////////
		gc.gridy++;
		add(ajustes, gc);
	}
}
