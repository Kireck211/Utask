package pantallas;

import java.sql.Connection;

import javax.swing.SwingUtilities;

import baseDeDatos.database.MyConnection;

public class App {
	private static InicioSesionFrame inicio;
	private static MainFrame main;
	public static Connection conn;
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable () {

			public void run() {
				inicio = null;
				try {
					conn = MyConnection.getInstance();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					inicio = new InicioSesionFrame();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});;
	}
}
