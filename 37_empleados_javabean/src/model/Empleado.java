package model;

public class Empleado {
	//atributo
	private int codigo;
	private String nombre;
	private String email;
	private int edad;
	//Construcdor
	public Empleado(int codigo, String nombre, String email, int edad) {
			//aqui es un objeto
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.email = email;
		this.edad = edad;
	}
	public Empleado() {
		
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}


	

	

}
