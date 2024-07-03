package ar.edu.unlam.pb2;

public class Campo extends Propiedad{

		private Double hectareas;

	   public Campo(String codigo, String calle, Integer numero, Integer metros, Integer cantAmbientes, String ciudad, Double hectareas,
			Double precio, Boolean estaDisponible, Cliente propietario, Cliente inquilino,Boolean esVenta, Boolean esAlquiler, Boolean esPermuta) {
		super(codigo, calle, numero, metros, 0, ciudad, precio, estaDisponible, propietario, null, esVenta,  esAlquiler,  esPermuta);
		
		this.hectareas = hectareas;
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

