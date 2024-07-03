package ar.edu.unlam.pb2;

public class Permuta implements Operacion, Comparable<Operacion> {
	public Propiedad propiedadAPermutarA;
	public Propiedad propiedadAPermutarB;
	
	public Permuta (Propiedad propiedadAPermutarA, Propiedad propiedadAPermutarB ) {
		this.propiedadAPermutarA = propiedadAPermutarA;
		this.propiedadAPermutarB = propiedadAPermutarB;
	}
	
	public Double getPrecio(){
		return propiedadAPermutarA.getPrecio();
	}
	
	
	@Override
	public void ejecutar() {
			if(!propiedadAPermutarA.getEsPermuta()) {
				propiedadAPermutarA.setEsPermuta(true);
				propiedadAPermutarA.setEsAlquiler(false);
				propiedadAPermutarA.setEsVenta(false);			
				propiedadAPermutarA.setEstaDisponible(false);	
				Cliente propietarioTemp = propiedadAPermutarA.getPropietario();
				propiedadAPermutarA.setPropietario(propiedadAPermutarB.getPropietario());
				propiedadAPermutarB.setPropietario(propietarioTemp);
			}
	}

	@Override
	public int compareTo(Operacion o) {
		
		return Double.compare(o.getPrecio(),this.getPrecio());
	}
	   

}
