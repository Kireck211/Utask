package pantallas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class AgregarTareasPanel extends JPanel {
	private JLabel titulo;
	private JLabel asignatura;
	private JLabel nombre;
	private JLabel descripcion;
	private JLabel realizada;
	private JTextArea asignaturaA;
	private JTextArea nombreA;
	private JTextArea descripcionA;
	private JCheckBox realizadaCheck;
	private JButton ok;
	private JButton cancel;

	public AgregarTareasPanel(final JFrame main, final JFrame agregarTareas, final int idUsuario) {
		setBackground(new Color(255, 255, 255));
		setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY));
		setLayout(new BorderLayout());
		titulo = new JLabel(new ImageIcon("AgregarTareas.png"));
		asignatura = new JLabel(new ImageIcon("Asignaturaa.png"));
		asignaturaA = new JTextArea();
		asignaturaA.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
		nombre = new JLabel(new ImageIcon("nombree.png"));
		nombreA = new JTextArea();
		nombreA.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
		descripcion = new JLabel(new ImageIcon("Descripcion.png"));
		descripcionA = new JTextArea();
		descripcionA.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
		realizada = new JLabel(new ImageIcon("Realizada.png"));
		realizadaCheck = new JCheckBox("Realizada");
		realizadaCheck.setSelected(false);
		realizada.setBackground(Color.WHITE);
		GridBagConstraints gc = new GridBagConstraints();
		ok = new JButton(new ImageIcon("ok.png"));
		cancel = new JButton(new ImageIcon("cancel.png"));

		ok.setContentAreaFilled(false);
		cancel.setContentAreaFilled(false);
		ok.setBorderPainted(false);
		cancel.setBorderPainted(false);
		setLayoutPanel(gc);
		
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.setEnabled(true);
				agregarTareas.setVisible(false);
			}
		});

	}

	public void setLayoutPanel(GridBagConstraints gc) {
		setLayout(new GridBagLayout());

		gc.weightx = 5;
		gc.weighty = 5;
		gc.gridx = 0;
		gc.gridy = 0;
		gc.gridwidth =2;
		gc.anchor = GridBagConstraints.CENTER;
		add(titulo, gc);

		///////// Next row ///////
		gc.gridy++;
		gc.gridx = 0;
		gc.ipadx = 0;
		gc.gridwidth = 1;
		gc.anchor = GridBagConstraints.CENTER;
		gc.insets = new Insets(0, 0, 0, 0);
		add(nombre, gc);

		gc.gridx = 1;
		gc.ipadx = 200;
		gc.insets = new Insets(0, 0, 0, 50);
		add(nombreA, gc);

		///////// Next row ///////
		gc.gridx = 0;
		gc.gridy++;
		add(asignatura, gc);

		gc.gridx = 1;
		gc.ipadx = 200;
		gc.insets = new Insets(0, 0, 0, 50);
		add(asignaturaA, gc);

		gc.gridy++;
		gc.gridx = 0;
		add(descripcion, gc);

		gc.gridx = 1;
		gc.ipadx = 200;
		gc.insets = new Insets(0, 0, 0, 50);
		add(descripcionA, gc);

		gc.gridx = 0;
		gc.gridy++;
		add(realizada, gc);

		gc.gridx = 1;
		gc.ipadx = 180;
		gc.insets = new Insets(0, 0, 0, 20);
		add(realizadaCheck, gc);

		gc.gridy++;
		gc.ipadx = 0;
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.CENTER;
		add(ok, gc);

		gc.gridx = 1;
		add(cancel, gc);

	}
}
