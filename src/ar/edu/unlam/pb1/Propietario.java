package ar.edu.unlam.pb1;

public class Propietario {
	private Integer dni;
	private String nombre;
	private String apellido;
	
	
	
	public Propietario(Integer dni, String nombre, String apellido) {		
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public static Propietario fromString(String datosPropietario) {
		String[] datos = datosPropietario.split(",");
		Integer dni = Integer.parseInt(datos[0].trim());
		String nombre = datos[1].trim();
		String apellido = datos[2].trim();
		
		return new Propietario (dni, nombre, apellido);
	}
	
}
