package ar.edu.unlam.pb2;

public class Venta implements Operacion,Comparable<Operacion>{
	public Propiedad propiedad;
	public Cliente propietarioNuevo;
	
	public Venta(Propiedad propiedad, Cliente propietarioNuevo) {
		this.propiedad = propiedad;
		this.propietarioNuevo = propietarioNuevo;
	}
	
	public Double getPrecio(){
		return propiedad.getPrecio();
	}
	
	
	@Override
	public void ejecutar() {
		if(!propiedad.getEsVenta()) {
			propiedad.setEsAlquiler(false);
			propiedad.setEsVenta(true);
			propiedad.setEsPermuta(false);
			propiedad.setEstaDisponible(false);
			propiedad.setPropietario(propietarioNuevo);
			propiedad.setInquilino(null);
		}
		
	}
	
	@Override
	public int compareTo(Operacion o) {
		
		return Double.compare(o.getPrecio(),this.getPrecio());
	}



}
