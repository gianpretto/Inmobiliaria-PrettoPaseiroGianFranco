package ar.edu.unlam.pb1;

public class Campo {

	private String codigo;
	private String calle;
	private Integer numero;
	private Integer hectareas;
	private String ciudad;
	private Double precio;
	private Boolean estaDisponible;
	private Propietario propietario;
	private Inquilino inquilino;
	
	
	
	public Campo(String codigo,String calle, Integer numero, Integer hectareas, String ciudad, Double precio, Boolean estaDisponible
			, Propietario propietario, Inquilino inquilino) {
		
		this.codigo = codigo;
		this.calle = calle;
		this.numero = numero;
		this.hectareas = hectareas;
		this.ciudad = ciudad;
		this.precio = precio;
		this.estaDisponible = estaDisponible;
		this.propietario = propietario;
		this.inquilino = inquilino;

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

	public Integer getHectareas() {
		return hectareas;
	}

	public void setHectareas(Integer hectareas) {
		this.hectareas = hectareas;
	}
	

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
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
	        return "Campo en  " + ciudad + " de " + hectareas + "ha" +  ", Precio: $" + precio;
	    }
}

