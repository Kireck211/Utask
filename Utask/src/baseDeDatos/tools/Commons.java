package baseDeDatos.tools;

public class Commons {
	public static String USER 		= "root"; //aqu� es el nombre del usuario
	public static String PASSWORD 	= "Miperita.211"; //aqu� se pone el password
	
	private static String IP = "localhost";
	private static String PORT = "3306";
	private static String SERVER = IP+":"+PORT+"/";
																		//jdbc:mysql://localhost:3306/
	public static String URL 		= "jdbc:mysql://"+SERVER; //"jdbc:sqlserver://localhost:1433"; // 
	public static String DBNAME 	= "utask"; //aqu� es el nombre de la base de datos
	public static String DRIVER 	= "com.mysql.jdbc.Driver"; //"com.microsoft.jdbc.sqlserver.SQLServerDriver"; //

}
