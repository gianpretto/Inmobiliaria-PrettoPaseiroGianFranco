package ar.edu.unlam.pb2;

public class Permuta extends Operacion {
	
	private Casa casa2;	
	private Departamento depto2;
	private PH ph2;	
	private Terreno terreno2;	
	private Campo campo2;
	private Propietario propietario1;
	private Propietario propietario2;
	
	
	
	public Permuta(Casa casa, Casa casa2, Departamento depto, Departamento depto2, PH ph, PH ph2, Terreno terreno,
			Terreno terreno2, Campo campo, Campo campo2, Propietario propietario1, Propietario propietario2) {
		
		super(casa, depto, ph, terreno, campo);
		this.casa2 = casa2;		
		this.depto2 = depto2;		
		this.ph2 = ph2;		
		this.terreno2 = terreno2;		
		this.campo2 = campo2;
		this.propietario1 = propietario1;
		this.propietario2 = propietario2;
	}
	public Casa getCasa2() {
		return casa2;
	}
	public void setCasa2(Casa casa2) {
		this.casa2 = casa2;
	}
	public Departamento getDepto2() {
		return depto2;
	}
	public void setDepto2(Departamento depto2) {
		this.depto2 = depto2;
	}
	public PH getPh2() {
		return ph2;
	}
	public void setPh2(PH ph2) {
		this.ph2 = ph2;
	}
	public Terreno getTerreno2() {
		return terreno2;
	}
	public void setTerreno2(Terreno terreno2) {
		this.terreno2 = terreno2;
	}
	public Campo getCampo2() {
		return campo2;
	}
	public void setCampo2(Campo campo2) {
		this.campo2 = campo2;
	}
	public Propietario getPropietario1() {
		return propietario1;
	}
	public void setPropietario1(Propietario propietario1) {
		this.propietario1 = propietario1;
	}
	public Propietario getPropietario2() {
		return propietario2;
	}
	public void setPropietario2(Propietario propietario2) {
		this.propietario2 = propietario2;
	}

}
