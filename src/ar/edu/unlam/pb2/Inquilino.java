package ar.edu.unlam.pb2;


public class Inquilino extends Cliente{
	
	
	
	
	public Inquilino(Integer dni, String nombre, String apellido) {
		super(dni, nombre, apellido);
	}
	
		
	public static Inquilino fromString(String datosInquilino) {
		String[] datos = datosInquilino.split(",");
		Integer dni = Integer.parseInt(datos[0].trim());
		String nombre = datos[1].trim();
		String apellido = datos[2].trim();
		
		return new Inquilino (dni, nombre, apellido);
	}
	
	

}
