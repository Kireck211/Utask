package pantallas;

import java.awt.Font;
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

import baseDeDatos.beans.Usuario;
import baseDeDatos.beans.UsuarioControl;

public class RegistroPanel extends JPanel {
	private JLabel nombre;
	private JButton cancel;
	private final JFrame inicioFrame;
	private final RegistroFrame registroFrame;
	private JTextArea nombreArea;
	private JLabel contrasenha;
	private JTextArea contraArea;
	private JButton ok;

	public RegistroPanel(final JFrame inicioFrame, final RegistroFrame registroFrame) {
		Font verdana = new Font("Verdana", Font.PLAIN, 12);
		nombre = new JLabel(new ImageIcon("nombre.png"));
		nombre.setFont(verdana);
		nombreArea = new JTextArea();
		nombreArea.setFont(verdana);
		nombreArea.setBorder(BorderFactory.createEtchedBorder());
		contrasenha = new JLabel(new ImageIcon("contra.png"));
		contraArea = new JTextArea();
		contrasenha.setFont(verdana);
		contraArea.setFont(verdana);
		contraArea.setBorder(BorderFactory.createEtchedBorder());
		ok = new JButton(new ImageIcon("ok.png"));
		ok.setFont(verdana);
		ok.setBorder(null);
		ok.setContentAreaFilled(false);
		cancel = new JButton(new ImageIcon("cancel.png"));
		cancel.setFont(verdana);
		cancel.setBorder(null);
		cancel.setContentAreaFilled(false);
		this.inicioFrame = inicioFrame;
		this.registroFrame = registroFrame;

		final UsuarioControl uc = new UsuarioControl(App.conn);

		setLayoutRegistro();

		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inicioFrame.setEnabled(true);
				registroFrame.setVisible(false);
			}
		});

		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nombre = nombreArea.getText();
				String contra = contraArea.getText();
				if (nombre.length() != 0 && contra.length() != 0) {
					Usuario usuario = new Usuario();
					usuario.setNickName(nombreArea.getText());
					usuario.setContrasenha(contraArea.getText());
					if (!uc.insertUsuario(usuario)) {
						JOptionPane.showMessageDialog(null, "Ya se encuentra registrado", "REGISTRADO",
								JOptionPane.WARNING_MESSAGE);
					}
					else {
						inicioFrame.setEnabled(true);
						registroFrame.setVisible(false);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Escriba el usuario y contraseña por favor");
				}
			}

		});
	}

	public void setLayoutRegistro() {
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		gc.weightx = 5;
		gc.weighty = 5;
		gc.gridx = 0;
		gc.gridy = 0;
		// gc.anchor= GridBagConstraints.LINE_;
		add(nombre, gc);

		gc.gridx = 1;
		gc.weightx = 5;
		gc.ipadx = 170;
		gc.anchor = GridBagConstraints.CENTER;
		gc.insets = new Insets(0, 0, 0, 20);
		add(nombreArea, gc);

		///////// Next row ///////
		gc.gridy++;
		gc.gridx = 0;
		gc.ipadx = 0;
		gc.insets = new Insets(0, 0, 0, 0);
		add(contrasenha, gc);

		gc.gridx = 1;
		gc.ipadx = 180;
		gc.insets = new Insets(0, 0, 0, 20);
		add(contraArea, gc);

		///////// Next row ///////
		gc.gridy++;
		gc.gridx = 0;
		gc.ipadx = 0;
		gc.insets = new Insets(0, 0, 0, 0);
		add(ok, gc);

		gc.gridx = 1;
		add(cancel, gc);

	}
}
