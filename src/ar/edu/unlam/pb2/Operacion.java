package ar.edu.unlam.pb2;

abstract class Operacion {
	
	protected Casa casa;
	protected Departamento depto;
	protected PH ph;
	protected Terreno terreno;
	protected Campo campo;
	
	
	public Operacion(Casa casa, Departamento depto, PH ph, Terreno terreno, Campo campo) {
		
		this.casa = casa;
		this.depto = depto;
		this.ph = ph;
		this.terreno = terreno;
		this.campo = campo;
		
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



}
