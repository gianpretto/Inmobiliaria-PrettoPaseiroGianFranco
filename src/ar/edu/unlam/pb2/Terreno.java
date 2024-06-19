package ar.edu.unlam.pb2;

public class Terreno extends Propiedad implements  Vendible, Permutable{

	   public Terreno(String codigo, String calle, Integer numero, Integer metros, Integer cantAmbientes, String ciudad,
			Double precio, Boolean estaDisponible, Cliente propietario,Cliente inquilino,Boolean esVenta, Boolean esAlquiler, Boolean esPermuta ) {
		super(codigo, calle, numero, metros, 0, ciudad, precio, estaDisponible, propietario,null, esVenta,  esAlquiler,  esPermuta);
	}

	@Override
	    public String toString() {
	        return "Terreno: " + calle + " " + numero +    ",Ciudad:"+ ciudad+", Precio: $" + precio;
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
				System.out.println("El terreno en"+ calle +" "+ numero + "ha sido permutada exitosamente!");								
			}else {
				System.out.println("El terreno en "+ calle +" "+ numero + " ya fue permutado.");
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
			System.out.println("El terreno en"+ calle +" "+ numero + "ha sido vendida exitosamente!");
		}else {
			System.out.println("El terreno en "+ calle +" "+ numero + " ya fue vendida.");
		}
		
	}


}



