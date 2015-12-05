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
import javax.swing.JPanel;
import javax.swing.JTextArea;

import baseDeDatos.beans.Materia;
import baseDeDatos.beans.MateriaControl;

public class AgregarMateriaPanel extends JPanel{
	private JLabel titulo;
	private JLabel nombre;
	private JLabel horario;
	private JTextArea nombreLinea;
	private JButton ok;
	private JButton cancel;
	private JButton mas;
	private Materia materia;
	
public AgregarMateriaPanel(final JFrame agregarMateria, final JFrame agregarSemestre, final int idUsuario) {
	setBackground(new Color(255, 255, 255));
	setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY));
	setLayout(new BorderLayout());
	titulo = new JLabel(new ImageIcon("materia.png"));
	nombre = new JLabel(new ImageIcon("nombree.png"));
	horario = new JLabel(new ImageIcon("horario.png"));
	nombreLinea = new JTextArea();
	nombreLinea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
	materia = new Materia();
	mas = new JButton(new ImageIcon("mas.png"));
	ok = new JButton(new ImageIcon("ok.png"));
	cancel = new JButton(new ImageIcon("cancel.png"));
	
	mas.setContentAreaFilled(false);
	ok.setContentAreaFilled(false);
	cancel.setContentAreaFilled(false);
	mas.setBorderPainted(false);
	ok.setBorderPainted(false);
	cancel.setBorderPainted(false);
	
	setLayoutPanel();
	
	mas.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			new AgregarClaseFrame(agregarMateria,idUsuario);
		}
	});
	
	ok.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			materia.setNombre(nombreLinea.getText());
			MateriaControl mc = new MateriaControl(App.conn);
			mc.insertMateria(materia);
			mc.insertUsuarioMateria(idUsuario, materia);
			cancel.doClick();
		}
	});
	
	cancel.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			agregarSemestre.setEnabled(true);
			agregarMateria.setVisible(false);
		}
	});

}
public void setLayoutPanel(){
	setLayout(new GridBagLayout());
	GridBagConstraints gc = new GridBagConstraints();

	gc.weightx = 5;
	gc.weighty = 5;
	gc.gridx = 0;
	gc.gridy = 0;
	gc.anchor= GridBagConstraints.CENTER;
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
	add(horario, gc);

	gc.gridx = 1;
	add(mas, gc);
	
	gc.gridy++;
	gc.ipadx = 0;
	gc.gridx = 0;
	gc.anchor = GridBagConstraints.CENTER;
	add(ok,gc);
	
	gc.gridx = 1;
	add(cancel,gc);
	
}
}
