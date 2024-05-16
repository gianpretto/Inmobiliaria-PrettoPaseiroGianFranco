package ar.edu.unlam.pb2;

abstract public class Propiedad {
	private String codigo;
	protected String calle;
	protected Integer numero;
	private Integer metros;
	private Integer cantAmbientes;
	protected String ciudad;
	protected Double precio;
	private Boolean estaDisponible;
	private String propietario;
	private String inquilino;
	private Boolean esVenta = false;
	private Boolean esAlquiler = false;
	private Boolean esPermuta = false;
	
	
	
	
	public Propiedad(String codigo,String calle, Integer numero, Integer metros, Integer cantAmbientes, String ciudad, Double precio, Boolean estaDisponible
			  , String propietario, String inquilino, Boolean esVenta, Boolean esAlquiler, Boolean esPermuta
			  
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
	
	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String nuevoPropietario) {
		this.propietario = nuevoPropietario;
	}

	public String getInquilino() {
		return inquilino;
	}

	public void setInquilino(String nuevoInquilino) {
		this.inquilino = nuevoInquilino;
	}

	public Boolean getEsVenta() {
		return esVenta;
	}

	public void setEsVenta(Boolean esVenta) {
		this.esVenta = esVenta;
	}

	public Boolean getEsAlquiler() {
		return esAlquiler;
	}

	public void setEsAlquiler(Boolean esAlquiler) {
		this.esAlquiler = esAlquiler;
	}

	public Boolean getEsPermuta() {
		return esPermuta;
	}

	public void setEsPermuta(Boolean esPermuta) {
		this.esPermuta = esPermuta;
	}

}
