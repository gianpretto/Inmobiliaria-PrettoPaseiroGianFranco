package ar.edu.unlam.pb2;

public class Casa extends Propiedad{
	

	   public Casa(String codigo, String calle, Integer numero, Integer metros, Integer cantAmbientes, String ciudad,
			Double precio, Boolean estaDisponible, Cliente propietario,Cliente inquilino,Boolean esVenta, Boolean esAlquiler, Boolean esPermuta) {
		super(codigo, calle, numero, metros, cantAmbientes, ciudad, precio, estaDisponible, propietario, null, esVenta,  esAlquiler,  esPermuta);
	}

	@Override
	    public String toString() {
	        return "Casa: " + calle + " " + numero +  ",Ciudad:"+ ciudad+", Precio: $" + precio;
	    }


}


