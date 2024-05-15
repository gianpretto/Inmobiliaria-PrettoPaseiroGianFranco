package ar.edu.unlam.pb2;

public class Alquiler extends Operacion{

	private Inquilino inquilino;
	

	

	public Alquiler(Casa casa, Departamento depto, PH ph, Terreno terreno, Campo campo, Propietario propietario,
			Inquilino inquilino) {
		super(casa, depto, ph, terreno, campo);
	}
	
	public Inquilino getInquilino() {
		return inquilino;
	}


	public void setInquilino(Inquilino inquilino) {
		this.inquilino = inquilino;
	}

	
	
	

}
