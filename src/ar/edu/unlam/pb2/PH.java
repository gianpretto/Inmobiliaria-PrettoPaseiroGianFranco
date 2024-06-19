package ar.edu.unlam.pb2;

public class PH extends Propiedad implements Vendible,Alquilable,Permutable {

	private Integer piso;

	   public PH(String codigo, String calle, Integer numero, Integer metros, Integer cantAmbientes, String ciudad,
			Double precio, Boolean estaDisponible, Cliente propietario,Cliente inquilino,Boolean esVenta, Boolean esAlquiler, Boolean esPermuta) {
		super(codigo, calle, numero, metros, cantAmbientes, ciudad, precio, estaDisponible, propietario, null,esVenta,esAlquiler,esPermuta);
		
	}

		public Integer getPiso() {
			return piso;
		}

		public void setPiso(Integer piso) {
			this.piso = piso;
		}   
	   
	@Override
	    public String toString() {
	        return "PH: " + calle + " " + numero +    ",Ciudad:"+ ciudad+", Precio: $" + precio;
	    }


	@Override
	public void permutar(Propiedad propiedadAPermutar) {
			if(!getEsPermuta()) {
				setEsPermuta(true);
				setEsAlquiler(false);
				setEsVenta(false);			
				setEstaDisponible(false);	
				Cliente propietarioTemp = this.getPropietario();
				this.setPropietario(propiedadAPermutar.getPropietario());
				propiedadAPermutar.setPropietario(propietarioTemp);
				System.out.println("El PH en"+ calle +" "+ numero + "ha sido permutada exitosamente!");								
			}else {
				System.out.println("El PH en "+ calle +" "+ numero + " ya fue permutado.");
			}
	}

	@Override
	public void alquilar(Cliente inquilino) {
		if(!getEsAlquiler()) {
			setEsAlquiler(true);
			setEsVenta(false);
			setInquilino(inquilino);
			setEstaDisponible(false);
			System.out.println("El PH en"+ calle +" "+ numero + "ha sido alquilada exitosamente!");
		}else {
			System.out.println("El PH en "+ calle +" "+ numero + " ya fue alquilada.");
		}
		
	}

	@Override
	public void vender(Cliente propietarioNuevo) {
		if(!getEsVenta()) {
			setEsAlquiler(false);
			setEsVenta(true);
			setEsPermuta(false);
			setEstaDisponible(false);
			setPropietario(propietarioNuevo);
			setInquilino(null);
			System.out.println("El PH en"+ calle +" "+ numero + "ha sido vendida exitosamente!");
		}else {
			System.out.println("El PH en "+ calle +" "+ numero + " ya fue vendida.");
		}
		
	}
}



