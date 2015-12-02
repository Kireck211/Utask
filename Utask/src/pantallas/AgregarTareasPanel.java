package pantallas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AgregarTareasPanel extends JPanel{
	private JLabel titulo;
	private JLabel asignatura;
	private JLabel nombre;
	private JLabel descripcion;
	private JLabel realizada;
	private String[] opciones = {"Realizada", "No realizada"};
	private JComboBox lista;



public AgregarTareasPanel() {
	setBackground(new Color(255, 255, 255));
	setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
	setLayout(new BorderLayout());
	titulo = new JLabel(new ImageIcon("AgregarTareas.png"));
	asignatura = new JLabel(new ImageIcon("Asignaturaa.png"));
	nombre = new JLabel(new ImageIcon("nombree.png"));
	descripcion = new JLabel(new ImageIcon("Descripcion.png"));
	realizada = new JLabel(new ImageIcon("Realizada.png"));
	lista = new JComboBox(opciones);
	lista.setSelectedIndex(0); 	
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
	add(asignatura,gc);
	
	gc.gridy++;
	add(descripcion,gc);
	
	gc.gridy++;
	add(realizada,gc);
	
	gc.gridx = 1;
	gc.ipadx = 180;
	gc.insets = new Insets(0, 0, 0, 20);
	add(lista,gc);

	


}
}
