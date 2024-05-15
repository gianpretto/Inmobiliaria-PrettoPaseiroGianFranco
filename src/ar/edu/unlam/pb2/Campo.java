package ar.edu.unlam.pb2;

public class Campo extends Propiedad {

		private Double hectareas;

	   public Campo(String codigo, String calle, Integer numero, Integer metros, Integer cantAmbientes, String ciudad,
			Double precio, Boolean estaDisponible, Propietario propietario) {
		super(codigo, calle, numero, metros, 0, ciudad, precio, estaDisponible, propietario);
		
	}

		public Double getHectareas() {
		return hectareas;
	}



	public void setHectareas(Double hectareas) {
		this.hectareas = hectareas;
	}
	   
	   
	@Override
	    public String toString() {
	        
			return "Campo en  " + ciudad + " de " + hectareas + "ha" +  ", Precio: $" + precio;
	    }
}

