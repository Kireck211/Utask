package pantallas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AgregarSemestrePanel extends JPanel {
	private JLabel titulo;
	private JLabel nombre;
	private JLabel inicio;
	private JLabel fin;
	private JLabel duracion;
	private JLabel materias;
	private JLabel activo;

public AgregarSemestrePanel() {
	setBackground(new Color(255, 255, 255));
	setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
	setLayout(new BorderLayout());
	titulo = new JLabel(new ImageIcon("AgregarSemestre.png"));
	inicio = new JLabel(new ImageIcon("Inicio.png"));
	nombre = new JLabel(new ImageIcon("nombree.png"));
	fin = new JLabel(new ImageIcon("Fin.png"));
	duracion = new JLabel(new ImageIcon("duracion.png"));
	materias = new JLabel(new ImageIcon("Materias.png"));
	activo = new JLabel(new ImageIcon("activo.png"));
	
	setLayoutPanel();

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

	///////// Next row ///////
	gc.gridy++;
	gc.gridx = 0;
	gc.ipadx = 0;
	gc.anchor= GridBagConstraints.WEST;
	gc.insets = new Insets(0, 0, 0, 0);
	add(nombre,gc);


	///////// Next row ///////
	gc.gridy++;
	add(activo,gc);
	
	gc.gridy++;
	add(inicio,gc);
	
	gc.gridy++;
	add(fin,gc);
	
	gc.gridy++;
	add(materias,gc);
	
	gc.gridy++;
	gc.insets = new Insets(0, 0, 0, 20);
	add(duracion,gc);
	
}
}
