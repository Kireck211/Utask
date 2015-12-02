package pantallas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import baseDeDatos.database.MyConnection;

public class InicioSesionFrame extends JFrame{
	private InicioSesionPanel inicio;
	
	public InicioSesionFrame() throws Exception {
		getContentPane().setBackground(new Color(255,255,255));
		setLayout(new BorderLayout());
		inicio = new InicioSesionPanel(this);
		add(inicio);
		setSize(500, 500);
		setResizable(false);
		setLocationRelativeTo(null); // Centrar frame
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(new ImageIcon("UtaskLogo1.png").getImage());
		
		/*System.out.println("Entrando a la base");
		Connection conn = MyConnection.getInstance();
		System.out.println("Conexión establecida");*/
		
	}
	
	public boolean puedeEntrar(String nombre, String contrasenha) {
		if (nombre.equals("Erick") && contrasenha.equals("123456")){
			return true;
		}
		else
			return false;
	}
}
