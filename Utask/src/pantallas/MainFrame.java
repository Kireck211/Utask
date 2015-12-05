package pantallas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.omg.IOP.TAG_ALTERNATE_IIOP_ADDRESS;

import baseDeDatos.beans.Clase;
import baseDeDatos.beans.ClaseControl;
import baseDeDatos.beans.Semestre;
import baseDeDatos.beans.SemestreControl;
import baseDeDatos.beans.Tarea;
import baseDeDatos.beans.TareaControl;
import baseDeDatos.beans.Usuario;

public class MainFrame extends JFrame {
	private JPanel head[] = new JPanel[5];
	private PanelBarraDeOpciones options;
	private JPanel board[] = new JPanel[5];
	private JPanel board_relative;
	private JPanel header;
	private Usuario usuario;
	private Vector<Semestre> semestre;
	private Vector<Tarea> tareas;
	private Vector<Clase> clases;
	

	public MainFrame(Usuario usuario) {
		this.usuario = usuario;
		getContentPane().setBackground(new Color(255, 255, 255));
		cargarTodo();
		setAll();


		setIconImage(new ImageIcon("UtaskLogo1.png").getImage());

		setPanels();

		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setMinimumSize(new Dimension(1100, 700));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	
	public void cargarTodo(){
		Vector<Semestre> semestres_temp = new Vector<>();
		semestre = new Vector<>();
		Vector<Clase> clases_temp = new Vector<>();
		clases = new Vector<>();
		Vector<Tarea> tareas_temp = new Vector<>();
		tareas = new Vector<>();
		Vector<Integer> idSemestres = new Vector<>();
		Vector<Integer> idClases = new Vector<>();
		Vector<Integer> idTareas = new Vector<>();
		SemestreControl sc = new SemestreControl(App.conn);
		ClaseControl cc = new ClaseControl(App.conn);
		TareaControl tc = new TareaControl(App.conn);
		idSemestres = sc.getIdSemestres(usuario.getIdUsuario());
		idClases = cc.getIdClase(usuario.getIdUsuario());
		idTareas = tc.getIdTareas(usuario.getIdUsuario());
		
		while(!idSemestres.isEmpty()){
			Integer semester = idSemestres.remove(0);
			semestres_temp = sc.getSemestres(semester);
			while(!semestres_temp.isEmpty()){
				semestre.addElement(semestres_temp.remove(0));
			}
		}
		
		while(!idClases.isEmpty()){
			Integer clase = idClases.remove(0);
			clases_temp = cc.getClases(clase);
			while(!clases_temp.isEmpty()){
				clases.addElement(clases_temp.remove(0));
			}
		}
		
		while(!idTareas.isEmpty()){
			Integer tarea = idTareas.remove(0);
			tareas_temp = tc.getTareas(tarea);
			while(!tareas_temp.isEmpty()){
				tareas.addElement(tareas_temp.remove(0));
			}
			
		}
	}
	
	public void setAll() {
		board[0] = new PanelBoard(usuario.getIdUsuario());
		board[1] = new CalendarioBoard(this,usuario.getIdUsuario());
		board[2] = new TareasBoard(tareas,this,usuario.getIdUsuario());
		board[3] = new PlaneacionBoard(this, usuario.getIdUsuario());
		board[4] = new AjustesBoard();

		head[0] = new HeaderPanel(this);
		head[1] = new CalendarioPanel(this);
		head[2] = new TareasPanel(this);
		head[3] = new PlaneacionPanel(this);
		head[4] = new AjustesPanel(this);
		
		options = new PanelBarraDeOpciones(this);
	}
	
	public void mostrarUno(int lugar){
		mostrarUnoBoard(lugar);
		mostrarUnoHead(lugar);
	}

	public void mostrarUnoBoard(int lugar) {
		switch (lugar) {
		case 0:
			for (int i = 0; i < 5; i++) {
				board[i].setVisible(false);
			}
			board[0].setVisible(true);
			break;
		case 1:
			for (int i = 0; i < 5; i++) {
				if (i == 1)
					continue;
				board[i].setVisible(false);
			}
			board[1].setVisible(true);
			break;
		case 2:
			for (int i = 0; i < 5; i++) {
				if (i == 2)
					continue;
				board[i].setVisible(false);
			}
			board[2].setVisible(true);
			break;
		case 3:
			for (int i = 0; i < 5; i++) {
				if (i == 3)
					continue;
				board[i].setVisible(false);
			}
			board[3].setVisible(true);
			break;
		default:
			for (int i = 0; i < 5; i++) {
				if (i == 4)
					continue;
				board[i].setVisible(false);
			}
			board[4].setVisible(true);
			break;
		}
		;
		setPanels();
	}
	
	public void mostrarUnoHead(int lugar) {
		switch (lugar) {
		case 0:
			head[0].setVisible(true);
			for (int i = 1; i < 5; i++) {
				head[i].setVisible(false);
			}
			break;
		case 1:
			head[1].setVisible(true);
			for (int i = 0; i < 5; i++) {
				if (i == 1)
					continue;
				head[i].setVisible(false);
			}
			break;
		case 2:
			head[2].setVisible(true);
			for (int i = 0; i < 5; i++) {
				if (i == 2)
					continue;
				head[i].setVisible(false);
			}
			break;
		case 3:
			head[3].setVisible(true);
			for (int i = 0; i < 5; i++) {
				if (i == 3)
					continue;
				head[i].setVisible(false);
			}
			break;
		default:
			head[4].setVisible(true);
			for (int i = 0; i < 5; i++) {
				if (i == 4)
					continue;
				head[i].setVisible(false);
			}
			break;
		}
		;
		setPanels();
	}

	public void setPanels() {

		
		for (int i = 0; i < 5; i++) {
			if (head[i].isVisible()) {
				header = head[i];
				break;
			}
		}
		
		for (int i =0;i<5;i++){
			if (board[i].isVisible()){
				board_relative = board[i];
				break;
			}
		}

		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		//////////// Primera Fila ////////////
		gc.gridx = 0;
		gc.gridy = 0;
		gc.weightx = 100;
		gc.weighty = 0.0;
		gc.fill = GridBagConstraints.HORIZONTAL;
		gc.gridwidth = 2;
		add(header, gc);

		//////////// Segunda Fila ////////////
		gc.gridx = 0;
		gc.gridy = 1;
		gc.weightx = 10;
		gc.weighty = 900;
		gc.gridwidth = 1;
		gc.anchor = GridBagConstraints.FIRST_LINE_END;
		add(options, gc);

		gc.gridx = 1;
		gc.gridy = 1;
		gc.weightx = 90;
		add(board_relative, gc);
	}

}
