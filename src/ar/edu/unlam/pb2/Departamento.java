package ar.edu.unlam.pb2;

public class Departamento extends Propiedad{
	
	private Integer piso;
	private Character letra;
	
	public Departamento(String codigo, String calle, Integer numero, Integer metros, Integer cantAmbientes,
			Integer piso,Character letra, String ciudad, Double precio, Boolean estaDisponible, Cliente propietario,Cliente inquilino,Boolean esVenta, Boolean esAlquiler, Boolean esPermuta) {
		super(codigo, calle, numero, metros, cantAmbientes, ciudad, precio, estaDisponible, propietario,null, esVenta, esAlquiler,  esPermuta);
		this.piso = piso;
		this.letra = letra;

	}
	
	public Character getLetra() {
		return letra;
	}

	public void setLetra(Character letra) {
		this.letra = letra;
	}

	
	public Integer getPiso() {
		return piso;
	}

	public void setPiso(Integer piso) {
		this.piso = piso;
	}
	

	   @Override
	    public String toString() {
	        return "Departamento,"+"piso "+ piso + ":" + calle + " " + numero +   ",Ciudad:"+ ciudad+ ", Precio: $" + precio;
	    }

}





