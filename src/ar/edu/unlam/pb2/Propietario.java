package ar.edu.unlam.pb2;


public class Propietario extends Cliente{
	
	public Propietario(Integer dni, String nombre, String apellido) {		
			super(dni, nombre, apellido);
}
	
	public static Propietario fromString(String datosPropietario) {
		String[] datos = datosPropietario.split(",");
		Integer dni = Integer.parseInt(datos[0].trim());
		String nombre = datos[1].trim();
		String apellido = datos[2].trim();
		
		return new Propietario (dni, nombre, apellido);
	}
	
}
