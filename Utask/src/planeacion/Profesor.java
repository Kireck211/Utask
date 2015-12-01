package planeacion;

public class Profesor {
	
	private String nombre;
	private String email;
	private int telefono;
	private String departamento;
	//private Imagen imagen;
	
	
	public Profesor(String nombre){
		this.nombre = nombre;
		this.email = "";
		this.telefono = 0;
		this.departamento = "";
		
	}
	
	public Profesor(String nombre, String email){
		this(nombre);
		this.email = email;
		this.telefono = 0;
		this.departamento = "";
	}
	
	public Profesor(String nombre, String email, int telefono){
		this(nombre, email);
		this.telefono = telefono;
		this.departamento = "";
	}
	
	public Profesor(String nombre, String email, int telefono, String departamento){
		this(nombre, email, telefono);
		this.departamento = departamento;
	}
	
	/* public Profesor(String nombre, String email, int telefono, String departamento, Imagen imagen){
		this(nombre, email, telefono, departamento);
		this.imagen = imagen;
	} */
	
	
	public void setNombre(String n){
		this.nombre = n;
	}
	
	public 	void setEmail(String email){
		this.email = email;
	}
	
	public void setTelefono(int tel){
		this.telefono = tel;
	}
	
	public void setDepartamento(String dep){
		this.departamento = dep;
	}
	
	/* public void setImagen(Imagen i){
		
	} */
	
	public String getNombre(){
		return this.nombre;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public int getTelefono(){
		return this.telefono;
	}
	
	public String getDepartamento(){
		return this.departamento;
	}
	
	/* public Imagen getImagen(){
		
	} */
	
}
