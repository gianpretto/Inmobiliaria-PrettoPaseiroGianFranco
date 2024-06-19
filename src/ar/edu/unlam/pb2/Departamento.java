package ar.edu.unlam.pb2;

public class Departamento extends Propiedad implements Alquilable, Vendible, Permutable{
	
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

	
	@Override
	public void vender(Cliente propietarioNuevo) {
		if(!getEsVenta()) {
			setEsAlquiler(false);
			setEsVenta(true);
			setPropietario(propietarioNuevo);
			setInquilino(null);
			setEstaDisponible(false);
			System.out.println("El depto en"+ calle +" "+ numero + "ha sido vendida exitosamente!");
		}else {
			System.out.println("El depto en "+ calle +" "+ numero + " ya fue vendida.");
		}
		
	}


	@Override
	public void alquilar(Cliente inquilino) {
		if(!getEsAlquiler()) {
			setEsAlquiler(true);
			setEsVenta(false);
			setInquilino(inquilino);
			setEstaDisponible(false);
			System.out.println("El depto en"+ calle +" "+ numero + "ha sido alquilada exitosamente!");
		}else {
			System.out.println("El depto en "+ calle +" "+ numero + " ya fue alquilada.");
		}
		
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
				System.out.println("El depto en"+ calle +" "+ numero + "ha sido permutada exitosamente!");								
			}else {
				System.out.println("El depto en "+ calle +" "+ numero + " ya fue permutado.");
			}
	}
}





