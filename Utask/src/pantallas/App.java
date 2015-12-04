package pantallas;

import java.sql.Connection;

import javax.swing.SwingUtilities;

import baseDeDatos.beans.Usuario;
import baseDeDatos.beans.UsuarioControl;
import baseDeDatos.database.MyConnection;

public class App {
	private static InicioSesionFrame inicio;
	private static MainFrame main;
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable () {

			public void run() {
				inicio = null;
				Connection conn = null;
				try {
					inicio = new InicioSesionFrame();
					conn = MyConnection.getInstance();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Conexión lista");
				UsuarioControl uc = new UsuarioControl(conn);
				Usuario usuario = new Usuario();
				usuario.setNickName("Utask");
				usuario.setContrasenha("Utask");
				uc.insertUsuario(usuario);
			}
			
		});;
	}
}
