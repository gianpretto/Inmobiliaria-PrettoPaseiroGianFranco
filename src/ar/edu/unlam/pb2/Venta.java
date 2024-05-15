package ar.edu.unlam.pb2;

public class Venta extends Operacion{
	
	private Propietario propietarioAnterior;
	private Propietario propietarioNuevo;
	
	
	public Venta(Casa casa, Departamento depto, PH ph, Terreno terreno, Campo campo, Propietario propietarioAnterior,
			Propietario propietarioNuevo) {
		
		super(casa, depto, ph, terreno, campo );
		
		this.propietarioAnterior = propietarioAnterior;
		this.propietarioNuevo = propietarioNuevo;
	}

	public Propietario getPropietarioAnterior() {
		return propietarioAnterior;
	}

	public void setPropietarioAnterior(Propietario propietarioAnterior) {
		this.propietarioAnterior = propietarioAnterior;
	}

	public Propietario getPropietarioNuevo() {
		return propietarioNuevo;
	}

	public void setPropietarioNuevo(Propietario propietarioNuevo) {
		this.propietarioNuevo = propietarioNuevo;
	}

	
}
