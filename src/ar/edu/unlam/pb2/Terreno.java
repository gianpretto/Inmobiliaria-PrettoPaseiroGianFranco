package ar.edu.unlam.pb2;

public class Terreno extends Propiedad{

	   public Terreno(String codigo, String calle, Integer numero, Integer metros, Integer cantAmbientes, String ciudad,
			Double precio, Boolean estaDisponible, String propietario,String inquilino,Boolean esVenta, Boolean esAlquiler, Boolean esPermuta ) {
		super(codigo, calle, numero, metros, 0, ciudad, precio, estaDisponible, propietario,"", esVenta,  esAlquiler,  esPermuta);
	}

	@Override
	    public String toString() {
	        return "Terreno: " + calle + " " + numero +    ",Ciudad:"+ ciudad+", Precio: $" + precio;
	    }
}



