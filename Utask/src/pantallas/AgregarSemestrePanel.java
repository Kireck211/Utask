package pantallas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import baseDeDatos.beans.Semestre;
import baseDeDatos.beans.SemestreControl;
import calendar.ManejoFechas;
import calendar.MyDate;

public class AgregarSemestrePanel extends JPanel {
	private JLabel titulo;
	private JLabel nombre;
	private JLabel inicio;
	private JLabel fin;
	private JLabel materias;
	private JLabel activo;
	private JTextArea nombreLinea;
	private JComboBox<String> inicioDia;
	private JComboBox<String> inicioMes;
	private JComboBox<String> inicioAnho;
	private JComboBox<String> finDia;
	private JComboBox<String> finMes;
	private JComboBox<String> finAnho;
	private JTextArea materiasLinea;
	private JCheckBox semestreActivo;
	private JButton ok;
	private JButton cancel;
	
	

	public AgregarSemestrePanel(final MainFrame main, final JFrame agregarSemestre, final int idUsuario) {
		setBackground(new Color(255, 255, 255));
		setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY));
		setLayout(new BorderLayout());
		titulo = new JLabel(new ImageIcon("AgregarSemestre.png"));
		nombre = new JLabel(new ImageIcon("nombree.png"));
		inicio = new JLabel(new ImageIcon("Inicio.png"));
		fin = new JLabel(new ImageIcon("Fin.png"));
		materias = new JLabel(new ImageIcon("Materias.png"));
		activo = new JLabel(new ImageIcon("activo.png"));
		nombreLinea = new JTextArea();
		nombreLinea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
		materiasLinea = new JTextArea();
		materiasLinea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
		semestreActivo = new JCheckBox("");
		semestreActivo.setBackground(Color.WHITE);
		valoresFechas();
		semestreActivo.setSelected(true);
		
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
				if (semestreActivo.isSelected())
					semestre.setActivo(1);
				else
					semestre.setActivo(0);
				int iniAnho = Calendar.getInstance().get(Calendar.YEAR) - inicioAnho.getSelectedIndex() + 1;
				int fiAnho = Calendar.getInstance().get(Calendar.YEAR) - finAnho.getSelectedIndex() + 1;
				semestre.setInicio(new MyDate(inicioDia.getSelectedIndex(), inicioMes.getSelectedIndex(), iniAnho));
				semestre.setFin(new MyDate(finDia.getSelectedIndex(),finMes.getSelectedIndex(),fiAnho));
				System.out.println(inicioAnho.getSelectedItem());
				System.out.println(finAnho.getSelectedItem());
				SemestreControl sc = new SemestreControl(App.conn);
				sc.insertSemestre(semestre);
				sc.insterUsuarioSemestre(idUsuario, semestre);
				cancel.doClick();
			}
			
		});
		
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.setEnabled(true);
				agregarSemestre.setVisible(false);
				
			}
			
		});
		
		setLayoutPanel();

	}

	public void valoresFechas(){
		String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Octubre","Noviembre","Diciembre"};
		Vector<String> anhos = new Vector();
		Vector<String> dias = new Vector();
		for(int i = Calendar.getInstance().get(Calendar.YEAR)+1;i>=1950;i--){
			anhos.addElement(((Integer) i).toString());
		}
		
		inicioDia = new JComboBox<String>();
		inicioMes = new JComboBox<String>(meses);
		inicioAnho = new JComboBox<String>(anhos);
		finDia = new JComboBox<String>();
		finMes = new JComboBox<String>(meses);
		finAnho = new JComboBox<String>(anhos);
		inicioMes.setSelectedIndex((Calendar.getInstance().get(Calendar.MONTH))-1);
		finMes.setSelectedIndex((Calendar.getInstance().get(Calendar.MONTH))-1);
		
		

		ManejoFechas.getMes(Calendar.getInstance().get(Calendar.MONTH), new GregorianCalendar().isLeapYear(Calendar.getInstance().get(Calendar.YEAR)), dias);
		while(!dias.isEmpty()){
			String dia = dias.elementAt(0);
			inicioDia.addItem(dia);
			finDia.addItem(dia);
			dias.remove(0);
		}
		
		inicioDia.setSelectedIndex((Calendar.getInstance().get(Calendar.DAY_OF_MONTH))-1);
		finDia.setSelectedIndex((Calendar.getInstance().get(Calendar.DAY_OF_MONTH)));
		inicioAnho.setSelectedIndex(0);
		finAnho.setSelectedIndex(0);
	}

	public void setLayoutPanel() {
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		gc.weightx = 5;
		gc.weighty = 5;
		gc.gridx = 0;
		gc.gridy = 0;
		gc.gridwidth = 4;
		gc.anchor = GridBagConstraints.CENTER;
		add(titulo, gc);

		gc.gridy++;
		gc.gridwidth = 2;
		gc.weightx = 2.5;
		gc.gridx = 0;
		gc.ipadx = 0;
		gc.anchor = GridBagConstraints.WEST;
		gc.insets = new Insets(0, 0, 0, 0);
		add(nombre, gc);

		gc.gridx = 1;
		gc.ipadx = 200;
		gc.gridwidth = 2;
		// gc.ipadx = 180;
		add(nombreLinea, gc);

		///////// Next row ///////
		gc.gridy++;
		gc.gridx = 0;
		gc.ipadx = 0;
		gc.gridwidth = 2;
		gc.insets = new Insets(0, 0, 0, 0);
		add(activo, gc);

		gc.gridx = 1;
		add(semestreActivo, gc);

		gc.gridx = 0;
		gc.gridy++;
		gc.gridwidth = 1;
		gc.ipadx = 0;
		gc.insets = new Insets(0, 0, 0, 40);
		add(inicio, gc);
		
		gc.gridx = 1;
		gc.gridwidth = 1;
		add(inicioDia,gc);
		
		gc.gridx++;
		add(inicioMes,gc);
		
		gc.gridx++;
		add(inicioAnho,gc);
		
		gc.gridy++;
		gc.gridx = 0;
		gc.ipadx = 0;
		gc.gridwidth = 2;
		gc.insets = new Insets(0, 0, 0, 0);
		add(fin, gc);

		gc.gridx = 1;
		gc.gridwidth = 1;
		add(finDia,gc);
		
		gc.gridx++;
		add(finMes, gc);
		
		gc.gridx++;
		add(finAnho,gc);
		
		gc.gridy++;
		gc.gridx = 0;
		gc.ipadx = 0;
		gc.gridwidth = 2;
		gc.insets = new Insets(0, 0, 0, 0);
		add(materias, gc);

		gc.gridx = 1;
		gc.ipadx = 200;
		gc.gridwidth = 2;
		gc.insets = new Insets(0, 0, 0, 40);
		add(materiasLinea, gc);

		gc.gridy++;
		gc.ipadx = 0;
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.CENTER;
		add(ok, gc);

		gc.gridx = 2;
		add(cancel, gc);
	}
	

}
