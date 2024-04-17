package ar.edu.unlam.pb1;

public class Departamento {
	private String codigo;
	private String calle;
	private Integer numero;
	private Integer metros;
	private Integer piso;
	private Character letra;
	private Integer cantAmbientes;
	private String ciudad;
	private Double precio;
	private Boolean estaDisponible;
	private Propietario propietario;
//	private Inquilino inquilino;
	
	
	public Departamento(String codigo,String calle, Integer numero, Integer metros, Integer piso, Character letra, Integer cantAmbientes, String ciudad, Double precio, Boolean estaDisponible
			, Propietario propietario
//			, Inquilino inquilino
			) {
		
		this.codigo = codigo;
		this.calle = calle;
		this.numero = numero;
		this.metros = metros;
		this.piso = piso;
		this.letra = letra;
		this.cantAmbientes = cantAmbientes;
		this.ciudad = ciudad;
		this.precio = precio;
		this.estaDisponible = estaDisponible;
		this.propietario = propietario;
//		this.inquilino = inquilino;
	}
	
	public Character getLetra() {
		return letra;
	}

	public void setLetra(Character letra) {
		this.letra = letra;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

//	public Inquilino getInquilino() {
//		return inquilino;
//	}
//
//	public void setInquilino(Inquilino inquilino) {
//		this.inquilino = inquilino;
//	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public Integer getMetros() {
		return metros;
	}

	public void setMetros(Integer metros) {
		this.metros = metros;
	}
	
	public Integer getCantAmbientes() {
		return cantAmbientes;
	}

	public void setCantAmbientes(Integer cantAmbientes) {
		this.cantAmbientes = cantAmbientes;
	}
	
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public Integer getPiso() {
		return piso;
	}

	public void setPiso(Integer piso) {
		this.piso = piso;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Boolean getEstaDisponible() {
		return estaDisponible;
	}

	public void setEstaDisponible(Boolean estaDisponible) {
		this.estaDisponible = estaDisponible;
	}
	

	   @Override
	    public String toString() {
	        return "Departamento,"+"piso "+ piso + ":" + calle + " " + numero +  ", Precio: $" + precio;
	    }
}





