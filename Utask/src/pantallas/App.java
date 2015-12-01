package pantallas;

import javax.swing.SwingUtilities;

public class App {
	private static InicioSesionFrame inicio;
	private static MainFrame main;
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable () {

			public void run() {
//				inicio = new InicioSesionFrame();
				main = new MainFrame();
				
//				while(inicio.puedeEntrar(nombre, contrasenha))
				
				
			}
			
		});;
	}
}
