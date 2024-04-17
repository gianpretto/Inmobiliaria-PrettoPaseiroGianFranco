package ar.edu.unlam.pb1;

public class Alquiler {
	private Casa casa;
	private Departamento depto;
	private PH ph;
	private Terreno terreno;
	private Campo campo;
	private Propietario propietario;
	private Inquilino inquilino;
	

	public Alquiler(Casa casa, Departamento depto, PH ph, Terreno terreno, Campo campo, Propietario propietario,
			Inquilino inquilino) {
		super();
		this.casa = casa;
		this.depto = depto;
		this.ph = ph;
		this.terreno = terreno;
		this.campo = campo;
		this.propietario = propietario;
		this.inquilino = inquilino;
	}
	
	public Casa getCasa() {
		return casa;
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
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	public Inquilino getInquilino() {
		return inquilino;
	}
	public void setInquilino(Inquilino inquilino) {
		this.inquilino = inquilino;
	}
	
	
	

}
