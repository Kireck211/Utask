package pantallas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.GregorianCalendar;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import baseDeDatos.beans.Semestre;

public class AgregarSemestrePanel extends JPanel {
	private JLabel titulo;
	private JLabel nombre;
	private JLabel fin;
	private JLabel duracion;
	private JLabel materias;
	private JLabel activo;
	private JTextArea nombreLinea;
	private JTextArea inicioLinea;
	private JTextArea finLinea;
	private JTextArea duracionLinea;
	private JTextArea materiasLinea;
	private JCheckBox semestreActivo;
	private JButton ok;
	private JButton cancel;
	private GregorianCalendar inicio;

	public AgregarSemestrePanel() {
		setBackground(new Color(255, 255, 255));
		setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
		setLayout(new BorderLayout());
		titulo = new JLabel(new ImageIcon("AgregarSemestre.png"));
		nombre = new JLabel(new ImageIcon("nombree.png"));
		fin = new JLabel(new ImageIcon("Fin.png"));
		duracion = new JLabel(new ImageIcon("duracion.png"));
		materias = new JLabel(new ImageIcon("Materias.png"));
		activo = new JLabel(new ImageIcon("activo.png"));
		inicioLinea = new JTextArea();
		inicioLinea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
		finLinea = new JTextArea();
		finLinea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
		nombreLinea = new JTextArea();
		nombreLinea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
		duracionLinea = new JTextArea();
		duracionLinea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
		materiasLinea = new JTextArea();
		materiasLinea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
		semestreActivo = new JCheckBox("");
		semestreActivo.setBackground(Color.WHITE);
		inicio = new GregorianCalendar(1900, 0, 0);
		ok = new JButton(new ImageIcon("ok.png"));
		cancel = new JButton(new ImageIcon("cancel.png"));

		ok.setContentAreaFilled(false);
		cancel.setContentAreaFilled(false);
		ok.setBorderPainted(false);
		cancel.setBorderPainted(false);

		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Semestre semestre = new Semestre();
				semestre.setNombre(nombreLinea.getText());
			}
			
		});
		
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
			
		});
		
		setLayoutPanel();

	}

	public void setLayoutPanel() {
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		gc.weightx = 5;
		gc.weighty = 5;
		gc.gridx = 0;
		gc.gridy = 0;
		gc.anchor = GridBagConstraints.CENTER;
		add(titulo, gc);

		gc.gridy++;
		gc.gridwidth = 1;
		gc.weightx = 2.5;
		gc.gridx = 0;
		gc.ipadx = 0;
		gc.anchor = GridBagConstraints.WEST;
		gc.insets = new Insets(0, 0, 0, 0);
		add(nombre, gc);

		gc.gridx = 1;
		gc.ipadx = 200;
		// gc.ipadx = 180;
		add(nombreLinea, gc);

		///////// Next row ///////
		gc.gridy++;
		gc.gridx = 0;
		gc.ipadx = 0;
		gc.insets = new Insets(0, 0, 0, 0);
		add(activo, gc);

		gc.gridx = 1;
//		gc.ipadx = 200;
//		gc.insets = new Insets(0, 0, 0, 40);
		add(semestreActivo, gc);

		gc.gridx = 1;
		gc.ipadx = 200;
		gc.insets = new Insets(0, 0, 0, 40);
		add(inicioLinea, gc);

		gc.gridy++;
		gc.gridx = 0;
		gc.ipadx = 0;
		gc.insets = new Insets(0, 0, 0, 0);
		add(fin, gc);

		gc.gridx = 1;
		gc.ipadx = 200;
		gc.insets = new Insets(0, 0, 0, 40);
		add(finLinea, gc);

		gc.gridy++;
		gc.gridx = 0;
		gc.ipadx = 0;
		gc.insets = new Insets(0, 0, 0, 0);
		add(materias, gc);

		gc.gridx = 1;
		gc.ipadx = 200;
		gc.insets = new Insets(0, 0, 0, 40);
		add(materiasLinea, gc);

		gc.gridy++;
		gc.gridx = 0;
		gc.ipadx = 0;
		gc.insets = new Insets(0, 0, 0, 0);
		add(duracion, gc);

		gc.gridx = 1;
		gc.ipadx = 200;
		gc.insets = new Insets(0, 0, 0, 40);
		add(duracionLinea, gc);

		gc.gridy++;
		gc.ipadx = 0;
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.CENTER;
		add(ok, gc);

		gc.gridx = 1;
		add(cancel, gc);
	}
}
