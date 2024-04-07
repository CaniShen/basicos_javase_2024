package model;

public class Ciudad {
	private String nombre;
	private long habitantes;
	private String pais;
	
	public Ciudad(String nombre, long habitantes, String pais) {
		super();
		this.nombre = nombre;
		this.habitantes = habitantes;
		this.pais = pais;
	}

	public Ciudad() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getHabitantes() {
		return habitantes;
	}

	public void setHabitantes(long habitantes) {
		this.habitantes = habitantes;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	

}
