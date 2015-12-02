package pantallas;

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

public class InicioSesionPanel extends JPanel {
	private JLabel icono;
	private JLabel nameLabel;
	private JTextArea nameArea;
	private JLabel contrasenhaLabel;
	private JTextArea contrasenhaArea;
	private JButton inicio;
	private JButton registrarse;
	private JButton olvidar;
	private JButton salir;
	private InicioSesionFrame ventana;

	public InicioSesionPanel(InicioSesionFrame ventana) {
		setBackground(Color.WHITE);
		nameLabel = new JLabel(new ImageIcon("nombre_icono.png"));
		contrasenhaLabel = new JLabel(new ImageIcon("contrasenha_icono.png"));
		icono = new JLabel(new ImageIcon("icono_inicio.png"));
		nameArea = new JTextArea();
		nameArea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(188, 188, 188)));
		contrasenhaArea = new JTextArea();
		contrasenhaArea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(188, 188, 188)));
		inicio = new JButton(new ImageIcon("InicioDeSesion.png"));
		inicio.setBorder(null);
		inicio.setContentAreaFilled(false);
		registrarse = new JButton(new ImageIcon("Registrarse.png"));
		registrarse.setBorder(null);
		registrarse.setContentAreaFilled(false);
		olvidar = new JButton(new ImageIcon("Olvidar.png"));
		olvidar.setBorder(null);
		olvidar.setContentAreaFilled(false);
		salir = new JButton(new ImageIcon("Salir.png"));
		salir.setBorder(null);
		salir.setContentAreaFilled(false);
		setLayoutInicio();
		
		this.ventana = ventana;
		setActionListenersButtons();
		
	}
	
	public void setActionListenersButtons() {
		inicio.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				if (nameArea.getText().length()!=0 && contrasenhaArea.getText().length()!=0) {
					JOptionPane.showMessageDialog(null, "Good");
				}
				else {
					JOptionPane.showMessageDialog(null, "El usuario y/o contraseña están vacios");
				}
			}
			
		});
	}

	public void setLayoutInicio() {
		setLayout(new GridBagLayout());

		GridBagConstraints gc = new GridBagConstraints();
		gc.weightx = 5;
		gc.weighty = 5;
		
		//////////// First row ////////////////
		
		gc.gridy = 0;
		gc.gridx = 0;
		gc.weightx = 5;
		gc.weighty = 2;
		gc.fill = GridBagConstraints.HORIZONTAL;
		gc.anchor = GridBagConstraints.WEST;
		gc.gridwidth = 2;
		add(icono, gc);

		/////////// Next row /////////////////
		gc.weightx = 2.5;
		gc.gridy++;
		gc.gridx = 0;
		gc.gridwidth = 1;
		add(nameLabel, gc);
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.CENTER;
		gc.insets = new Insets(0, 0, 0, 30);
		add(nameArea, gc);

		/////////// Next row /////////////////
		gc.gridy++;
		gc.gridx = 0;
		gc.insets = new Insets(0,0,0,0);
		add(contrasenhaLabel, gc);

		gc.gridx = 1;
		gc.insets = new Insets(0, 0, 0, 30);
		add(contrasenhaArea, gc);

		////////// Next row ////////////////
		gc.gridy++;
		gc.gridx = 0;
		gc.fill = GridBagConstraints.CENTER;
		gc.gridwidth = 1;
		gc.insets = new Insets(0, 0, 0, 0);
		add(inicio, gc);
		
		////////// Next row ///////////////
		
		gc.gridx=1;
		add(registrarse,gc);
		///////// Next row ////////////////
		gc.gridy++;
		gc.gridx=0;
		gc.fill = GridBagConstraints.CENTER;
		gc.gridwidth = 2;
		add(olvidar,gc);
	}
}
