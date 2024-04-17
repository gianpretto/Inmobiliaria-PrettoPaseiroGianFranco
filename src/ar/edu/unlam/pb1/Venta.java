package ar.edu.unlam.pb1;

public class Venta {
	private Casa casa;
	private Departamento depto;
	private PH ph;
	private Terreno terreno;
	private Campo campo;
	private Propietario propietarioAnterior;
	private Propietario propietarioNuevo;
	public Casa getCasa() {
		return casa;
	}
	
	
	
	public Venta(Casa casa, Departamento depto, PH ph, Terreno terreno, Campo campo, Propietario propietarioAnterior,
			Propietario propietarioNuevo) {
		
		this.casa = casa;
		this.depto = depto;
		this.ph = ph;
		this.terreno = terreno;
		this.campo = campo;
		this.propietarioAnterior = propietarioAnterior;
		this.propietarioNuevo = propietarioNuevo;
	}



	public void setCasa(Casa casa) {
		this.casa = casa;
	}
	public Departamento getDepto() {
		return depto;
	}
	public void setDepto(Departamento depto) {
		this.depto = depto;
	}
	public PH getPh() {
		return ph;
	}
	public void setPh(PH ph) {
		this.ph = ph;
	}
	public Terreno getTerreno() {
		return terreno;
	}
	public void setTerreno(Terreno terreno) {
		this.terreno = terreno;
	}
	public Campo getCampo() {
		return campo;
	}
	public void setCampo(Campo campo) {
		this.campo = campo;
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
