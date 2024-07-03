package ar.edu.unlam.pb2;

public class Alquiler implements Operacion, Comparable<Operacion>{
	public Propiedad propiedad;
	public Cliente inquilino;
	
	public Alquiler(Propiedad propiedad, Cliente inquilino) {
		this.propiedad = propiedad;
		this.inquilino = inquilino;
	}
	
	
	public Double getPrecio(){
		return propiedad.getPrecio();
	}
		
	public void ejecutar() {
		if(!propiedad.getEsAlquiler()) {
			propiedad.setEsAlquiler(true);
			propiedad.setEsVenta(false);
			propiedad.setEsPermuta(false);
			propiedad.setEstaDisponible(false);
			propiedad.setInquilino(inquilino);
		}
		
	}


	@Override
	public int compareTo(Operacion o) {
		
		return Double.compare(o.getPrecio(),this.getPrecio());
	}
	

}
