package pantallas;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class InicioSesionFrame extends JFrame{
	private InicioSesionPanel inicio;
	
	public InicioSesionFrame() {
		getContentPane().setBackground(new Color(255,255,255));
		setLayout(new BorderLayout());
		inicio = new InicioSesionPanel(this);
		add(inicio);
		setSize(500, 500);
		setResizable(false);
		setLocationRelativeTo(null); // Centrar frame
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public boolean puedeEntrar(String nombre, String contrasenha) {
		if (nombre.equals("Erick") && contrasenha.equals("123456")){
			return true;
		}
		else
			return false;
	}
}
