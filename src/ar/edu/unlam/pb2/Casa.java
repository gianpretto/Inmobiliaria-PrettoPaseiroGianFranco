package ar.edu.unlam.pb2;

public class Casa extends Propiedad {
	

	   public Casa(String codigo, String calle, Integer numero, Integer metros, Integer cantAmbientes, String ciudad,
			Double precio, Boolean estaDisponible, Propietario propietario) {
		super(codigo, calle, numero, metros, cantAmbientes, ciudad, precio, estaDisponible, propietario);
	}

	@Override
	    public String toString() {
	        return "Casa: " + calle + " " + numero +  ", Precio: $" + precio;
	    }


}


