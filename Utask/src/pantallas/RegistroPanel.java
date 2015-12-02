package pantallas;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

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
		nombre = new JLabel("Nombre *");
		nombre.setFont(verdana);
		nombreArea = new JTextArea();
		nombreArea.setFont(verdana);
		nombreArea.setBorder(BorderFactory.createEtchedBorder());
		contrasenha = new JLabel("Contraseña *");
		contraArea = new JTextArea();
		contrasenha.setFont(verdana);
		contraArea.setFont(verdana);
		contraArea.setBorder(BorderFactory.createEtchedBorder());
		ok = new JButton("OK");
		ok.setFont(verdana);
		cancel = new JButton("Cancel");
		cancel.setFont(verdana);
		this.inicioFrame = inicioFrame;
		this.registroFrame = registroFrame;

		setLayoutRegistro();

		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inicioFrame.setEnabled(true);
				registroFrame.setVisible(false);
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
		add(nombre, gc);

		gc.gridx = 1;
		gc.weightx = 5;
		add(nombreArea, gc);

		///////// Next row ///////
		gc.gridy++;
		gc.gridx = 0;
		add(contrasenha,gc);
		
		gc.gridx = 1;
		add(contraArea, gc);

		///////// Next row ///////
		gc.gridy++;
		gc.gridx = 0;
		add(ok, gc);
		
		gc.gridx = 1;
		add(cancel, gc);

	}
}
