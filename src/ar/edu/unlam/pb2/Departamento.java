package ar.edu.unlam.pb2;

public class Departamento extends Propiedad{
	
	private Integer piso;
	private Character letra;
	
	public Departamento(String codigo, String calle, Integer numero, Integer metros, Integer cantAmbientes,
			Integer piso,Character letra, String ciudad, Double precio, Boolean estaDisponible, Propietario propietario) {
		super(codigo, calle, numero, metros, cantAmbientes, ciudad, precio, estaDisponible, propietario);
		

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
	        return "Departamento,"+"piso "+ piso + ":" + calle + " " + numero +  ", Precio: $" + precio;
	    }

	public int compareTo(Departamento departamento) {
		// TODO Auto-generated method stub
		return 0;
	}
}





