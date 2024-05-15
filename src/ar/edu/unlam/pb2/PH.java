package ar.edu.unlam.pb2;

public class PH extends Propiedad {

	private Integer piso;

	   public PH(String codigo, String calle, Integer numero, Integer metros, Integer cantAmbientes, String ciudad,
			Double precio, Boolean estaDisponible, Propietario propietario) {
		super(codigo, calle, numero, metros, cantAmbientes, ciudad, precio, estaDisponible, propietario);
		
	}

		public Integer getPiso() {
			return piso;
		}

		public void setPiso(Integer piso) {
			this.piso = piso;
		}   
	   
	@Override
	    public String toString() {
	        return "PH: " + calle + " " + numero +  ", Precio: $" + precio;
	    }


}



