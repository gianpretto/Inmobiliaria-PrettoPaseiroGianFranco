package ar.edu.unlam.pb2;

abstract class Propiedad {
	private String codigo;
	protected String calle;
	protected Integer numero;
	private Integer metros;
	private Integer cantAmbientes;
	protected String ciudad;
	protected Double precio;
	private Boolean estaDisponible;
	private Propietario propietario;
	
	
	
	public Propiedad(String codigo,String calle, Integer numero, Integer metros, Integer cantAmbientes, String ciudad, Double precio, Boolean estaDisponible
			  , Propietario propietario
			  
			  ) 
	{
		
		this.codigo = codigo;
		this.calle = calle;
		this.numero = numero;
		this.metros = metros;
		this.ciudad = ciudad;
		this.precio = precio;
		this.estaDisponible = estaDisponible;
		this.propietario = propietario;
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
	
	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}


}
