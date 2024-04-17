package ar.edu.unlam.pb1;

public class Permuta {
	private Casa casa1;
	private Casa casa2;
	private Departamento depto1;
	private Departamento depto2;
	private PH ph1;
	private PH ph2;
	private Terreno terreno1;
	private Terreno terreno2;
	private Campo campo1;
	private Campo campo2;
	private Propietario propietario1;
	private Propietario propietario2;
	
	
	
	public Permuta(Casa casa1, Casa casa2, Departamento depto1, Departamento depto2, PH ph1, PH ph2, Terreno terreno1,
			Terreno terreno2, Campo campo1, Campo campo2, Propietario propietario1, Propietario propietario2) {
		this.casa1 = casa1;
		this.casa2 = casa2;
		this.depto1 = depto1;
		this.depto2 = depto2;
		this.ph1 = ph1;
		this.ph2 = ph2;
		this.terreno1 = terreno1;
		this.terreno2 = terreno2;
		this.campo1 = campo1;
		this.campo2 = campo2;
		this.propietario1 = propietario1;
		this.propietario2 = propietario2;
	}
	public Casa getCasa1() {
		return casa1;
	}
	public void setCasa1(Casa casa1) {
		this.casa1 = casa1;
	}
	public Casa getCasa2() {
		return casa2;
	}
	public void setCasa2(Casa casa2) {
		this.casa2 = casa2;
	}
	public Departamento getDepto1() {
		return depto1;
	}
	public void setDepto1(Departamento depto1) {
		this.depto1 = depto1;
	}
	public Departamento getDepto2() {
		return depto2;
	}
	public void setDepto2(Departamento depto2) {
		this.depto2 = depto2;
	}
	public PH getPh1() {
		return ph1;
	}
	public void setPh1(PH ph1) {
		this.ph1 = ph1;
	}
	public PH getPh2() {
		return ph2;
	}
	public void setPh2(PH ph2) {
		this.ph2 = ph2;
	}
	public Terreno getTerreno1() {
		return terreno1;
	}
	public void setTerreno1(Terreno terreno1) {
		this.terreno1 = terreno1;
	}
	public Terreno getTerreno2() {
		return terreno2;
	}
	public void setTerreno2(Terreno terreno2) {
		this.terreno2 = terreno2;
	}
	public Campo getCampo1() {
		return campo1;
	}
	public void setCampo1(Campo campo1) {
		this.campo1 = campo1;
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
