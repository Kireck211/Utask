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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import baseDeDatos.beans.Clase;
import baseDeDatos.beans.ClaseControl;

public class AgregarClasePanel extends JPanel {
	private JLabel titulo;
	private JLabel nombre;
	private JLabel ubicacion;
	private JLabel profesor;
	private JLabel dSemana;
	private JTextArea nombreLinea;
	private JTextArea ubicacionLinea;
	private JButton ok;
	private JButton lunes;
	private JButton martes;
	private JButton miercoles;
	private JButton jueves;
	private JButton viernes;
	private JButton sabado;
	private JButton domingo;
	private JButton cancel;
	private int[] presionado;
	private JButton mas;
	private Clase clase;

	public AgregarClasePanel(final JFrame agregarMateria, final JFrame agregarClase, final int idUsuario) {
		setBackground(new Color(255, 255, 255));
		setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY));
		setLayout(new BorderLayout());
		titulo = new JLabel(new ImageIcon("AgregarClase.png"));
		nombre = new JLabel(new ImageIcon("nombree.png"));
		nombreLinea = new JTextArea();
		nombreLinea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
		ubicacion = new JLabel(new ImageIcon("Ubicacion.png"));
		ubicacionLinea = new JTextArea();
		ubicacionLinea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
		profesor = new JLabel(new ImageIcon("profesores.png"));
		dSemana = new JLabel(new ImageIcon("dSemana.png"));
		lunes = new JButton(new ImageIcon("Lunes.png"));
		martes = new JButton(new ImageIcon("Martes.png"));
		miercoles = new JButton(new ImageIcon("Miercoles.png"));
		jueves = new JButton(new ImageIcon("Jueves.png"));
		viernes = new JButton(new ImageIcon("Viernes.png"));
		sabado = new JButton(new ImageIcon("Sabado.png"));
		domingo = new JButton(new ImageIcon("Domingo.png"));
		mas = new JButton(new ImageIcon("mas.png"));
		presionado = new int[7];
		for (int i = 0; i < 7; i++) {
			presionado[i] = 0;
		}
		clase = new Clase();

		ok = new JButton(new ImageIcon("ok.png"));
		cancel = new JButton(new ImageIcon("cancel.png"));

		ok.setContentAreaFilled(false);
		cancel.setContentAreaFilled(false);
		ok.setBorderPainted(false);
		cancel.setBorderPainted(false);
		mas.setContentAreaFilled(false);
		mas.setBorderPainted(false);

		lunes.setContentAreaFilled(false);
		martes.setContentAreaFilled(false);
		miercoles.setContentAreaFilled(false);
		jueves.setContentAreaFilled(false);
		viernes.setContentAreaFilled(false);
		sabado.setContentAreaFilled(false);
		domingo.setContentAreaFilled(false);

		lunes.setBorderPainted(false);
		martes.setBorderPainted(false);
		miercoles.setBorderPainted(false);
		jueves.setBorderPainted(false);
		viernes.setBorderPainted(false);
		sabado.setBorderPainted(false);
		domingo.setBorderPainted(false);

		setLayoutPanel();

		mas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AgregarProfesorFrame(agregarClase);
			}
		});

		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarMateria.setEnabled(true);
				agregarClase.setVisible(false);
			}
		});

		lunes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (presionado[0] == 0) {
					lunes.setIcon(new ImageIcon("Lunes_presionado.png"));
					presionado[0] = 1;
				} else {
					lunes.setIcon(new ImageIcon("Lunes.png"));
					presionado[0] = 0;
				}
			}
		});

		martes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (presionado[1] == 0) {
					martes.setIcon(new ImageIcon("Martes_presionado.png"));
					presionado[1] = 1;
				} else {
					martes.setIcon(new ImageIcon("Martes.png"));
					presionado[1] = 0;
				}
			}
		});

		miercoles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (presionado[2] == 0) {
					miercoles.setIcon(new ImageIcon("Miercoles_presionado.png"));
					presionado[2] = 1;
				} else {
					miercoles.setIcon(new ImageIcon("Miercoles.png"));
					presionado[2] = 0;
				}
			}
		});

		jueves.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (presionado[3] == 0) {
					jueves.setIcon(new ImageIcon("Jueves_presionado.png"));
					presionado[3] = 1;
				} else {
					jueves.setIcon(new ImageIcon("Jueves.png"));
					presionado[3] = 0;
				}
			}
		});

		viernes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (presionado[4] == 0) {
					viernes.setIcon(new ImageIcon("Viernes_presionado.png"));
					presionado[4] = 1;
				} else {
					viernes.setIcon(new ImageIcon("Viernes.png"));
					presionado[4] = 0;
				}
			}
		});

		sabado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (presionado[5] == 0) {
					sabado.setIcon(new ImageIcon("Sabado_presionado.png"));
					presionado[5] = 1;
				} else {
					sabado.setIcon(new ImageIcon("Sabado.png"));
					presionado[5] = 0;
				}
			}
		});

		domingo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (presionado[6] == 0) {
					domingo.setIcon(new ImageIcon("Domingo_presionado.png"));
					presionado[6] = 1;
				} else {
					domingo.setIcon(new ImageIcon("Domingo.png"));
					presionado[6] = 0;
				}
			}
		});

		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int contador = 0;
				for (int i = 0; i < 7; i++) {
					contador += presionado[i];
				}
				if (contador == 0) {
					JOptionPane.showMessageDialog(null, "Se debe seleccionar por lo menos un día",
							"NO DIAS SELECCIONADOS", JOptionPane.ERROR_MESSAGE);
				} else {
					clase.setNombre(nombreLinea.getText());
					clase.setUbicacion(ubicacionLinea.getText());
					clase.setLunes(presionado[0]);
					clase.setMartes(presionado[1]);
					clase.setMiercoles(presionado[2]);
					clase.setJueves(presionado[3]);
					clase.setViernes(presionado[4]);
					clase.setSabado(presionado[5]);
					clase.setDomingo(presionado[6]);
					ClaseControl cc = new ClaseControl(App.conn);
					cc.insertClase(clase);
					cc.insertUsuarioClase(idUsuario, clase);
					cancel.doClick();
				}
			}
		});

		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarMateria.setEnabled(true);
				agregarClase.setVisible(false);

			}

		});

	}

	public void setLayoutPanel() {
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		gc.weightx = 8;
		gc.weighty = 5;
		gc.gridwidth = 8;
		gc.gridx = 0;
		gc.gridy = 0;
		gc.anchor = GridBagConstraints.CENTER;
		add(titulo, gc);

		///////// Next row ///////
		gc.gridy++;
		gc.gridwidth = 4;
		gc.weightx = 4;
		gc.gridx = 0;
		gc.ipadx = 0;
		gc.anchor = GridBagConstraints.WEST;
		gc.insets = new Insets(0, 0, 0, 0);
		add(nombre, gc);

		gc.ipadx = 200;
		gc.gridx = 1;
		// gc.ipadx = 180;
		add(nombreLinea, gc);

		///////// Next row ///////

		gc.gridy++;
		gc.gridx = 0;
		gc.ipadx = 0;
		gc.insets = new Insets(0, 0, 0, 0);
		add(ubicacion, gc);

		gc.gridx = 1;
		gc.ipadx = 200;
		gc.insets = new Insets(0, 0, 0, 50);
		add(ubicacionLinea, gc);

		gc.gridy++;
		gc.gridx = 0;
		gc.ipadx = 0;
		gc.gridwidth = 4;
		gc.insets = new Insets(0, 0, 0, 0);
		add(profesor, gc);

		gc.gridx = 1;
		add(mas, gc);

		gc.gridy++;
		gc.ipadx = 0;
		gc.gridx = 0;
		gc.gridwidth = 1;
		// gc.insets = new Insets(0, 0, 0, 20);
		add(dSemana, gc);

		gc.gridx++;
		add(lunes, gc);
		gc.gridx++;
		add(martes, gc);
		gc.gridx++;
		add(miercoles, gc);
		gc.gridx++;
		add(jueves, gc);
		gc.gridx++;
		add(viernes, gc);
		gc.gridx++;
		add(sabado, gc);
		gc.gridx++;
		add(domingo, gc);

		gc.gridy++;
		gc.ipadx = 0;
		gc.gridx = 0;
		gc.gridwidth = 4;
		gc.anchor = GridBagConstraints.CENTER;
		add(ok, gc);

		gc.gridx = 1;
		gc.gridwidth = 4;
		add(cancel, gc);

	}
}
