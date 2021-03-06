package pantallas;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import baseDeDatos.beans.Usuario;
import baseDeDatos.beans.UsuarioControl;
import baseDeDatos.database.MyConnection;

public class InicioSesionPanel extends JPanel {
	private JLabel icono;
	private JLabel nameLabel;
	private JTextArea nameArea;
	private JLabel contrasenhaLabel;
	private JTextArea contrasenhaArea;
	private JButton inicio;
	private JButton registrarse;
	private JButton olvidar;
	private InicioSesionFrame ventana;
	private Usuario usuario;

	public InicioSesionPanel(InicioSesionFrame ventana) {
		setBackground(Color.WHITE);
		nameLabel = new JLabel(new ImageIcon("nombre_icono.png"));
		contrasenhaLabel = new JLabel(new ImageIcon("contrasenha_icono.png"));
		icono = new JLabel(new ImageIcon("UtaskLogoo.png"));
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
		usuario = new Usuario();
		
		
		nameArea.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent arg0) {
				int key = arg0.getKeyCode();
				if (key == KeyEvent.VK_TAB) {
					contrasenhaLabel.transferFocus();
				}
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		contrasenhaArea.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();
				if (key == KeyEvent.VK_ENTER)
					inicio.doClick();
			}
		});
		
		setLayoutInicio();
		setActionListenersButtons();
		this.ventana = ventana;
	}
	
	public void setActionListenersButtons() {
		Connection conn = null;
		try {
			conn = MyConnection.getInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		final UsuarioControl uc = new UsuarioControl(conn);
		
		inicio.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				if (nameArea.getText().length()!=0 && contrasenhaArea.getText().length()!=0) {
					
					usuario.setNickName(nameArea.getText().replaceAll("\t", ""));
					usuario.setContrasenha(contrasenhaArea.getText().replaceAll("\n", ""));
					if(uc.buscarUsuario(usuario)){
						if (uc.verificarContrasenha(usuario)){
							desplegarPantallaMain();
						}
						else{
							JOptionPane.showMessageDialog(null, "Usuario y/o contrase�a incorrectos", "ERROR", JOptionPane.ERROR_MESSAGE);
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "No se encuentra registrado, por favor reg�strece", "No existe registro", JOptionPane.WARNING_MESSAGE);
					}
					
				}
				else {
					JOptionPane.showMessageDialog(null, "El usuario y/o contrase�a est�n vacios");
				}
			}
		});
		
		registrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
				ventana.setEnabled(false);
				RegistroFrame registro = new RegistroFrame(ventana);
			}
		});
		
		olvidar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				String correo = JOptionPane.showInputDialog(null, "Escriba el correo electr�nico por favor, para reestablecer la contrase�a.");
				while(!correo.contains("@")){
					correo = JOptionPane.showInputDialog("Escriba un correo electr�nico v�lido por favor.");
				}
			}
		});
	}
	
	public void desplegarPantallaMain() {
		ventana.setVisible(false);
		new MainFrame(usuario);
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
