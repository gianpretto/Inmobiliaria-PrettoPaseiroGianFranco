package ar.edu.unlam.pb1;



public class Inmobiliaria {
	private String nombre;
	private String direccion;
	private String email;
	private String telefono;
	private Casa casas[];
	private Departamento departamentos[];
	private PH phs[];
	private Terreno terrenos[];
	private Campo campos[];
	private Inquilino inquilinos[];
	private Propietario propietarios [];
	private Alquiler alquileres [];
	private Venta ventas [];
	private Permuta permutas [];
	private Integer cantidadCasas = 0;	
	private Integer cantidadDeptos = 0;	
	private Integer cantidadPhs = 0;	
	private Integer cantidadTerrenos = 0;	
	private Integer cantidadCampos = 0;	
	private Integer cantidadInquilinos = 0;
	private Integer cantidadPropietarios = 0;	
	private Integer cantidadAlquileres = 0;
	private Integer cantidadVentas = 0;
	private Integer cantidadPermutas = 0;
	private final Integer CANTIDAD_MAX_PROPIEDADES = 100;
	private final Integer CANTIDAD_MAX_CLIENTES = 100;
	private final Integer CANTIDAD_MAX_OPERACIONES = 100;
	
	public Inmobiliaria(String nombre, String direccion, String email, String telefono) {
		
		this.nombre = nombre;
		this.direccion = direccion;
		this.email = email;
		this.telefono = telefono;		
		this.casas = new Casa[CANTIDAD_MAX_PROPIEDADES];
		this.departamentos = new Departamento[CANTIDAD_MAX_PROPIEDADES];
		this.phs = new PH[CANTIDAD_MAX_PROPIEDADES];
		this.terrenos = new Terreno[CANTIDAD_MAX_PROPIEDADES];		
		this.campos = new Campo[CANTIDAD_MAX_PROPIEDADES];
		this.inquilinos = new Inquilino[CANTIDAD_MAX_CLIENTES];
		this.propietarios = new Propietario[CANTIDAD_MAX_CLIENTES];
		
		
	}
	
	
public Boolean addInquilino(Inquilino nueva) {
		
		for(int i=0; i<CANTIDAD_MAX_CLIENTES;i++) {
			if(inquilinos[i]==null) {
				inquilinos[i] = nueva;
				cantidadInquilinos++;
				return true;
			}
		}
		return false;
	}

public Boolean addPropietario(Propietario nueva) {
	
	for(int i=0; i<CANTIDAD_MAX_CLIENTES;i++) {
		if(propietarios[i]==null) {
			propietarios[i] = nueva;
			cantidadPropietarios++;
			return true;
		}
	}
	return false;
}

public Boolean addAlquiler(Alquiler nueva) {
	
	for(int i=0; i<CANTIDAD_MAX_OPERACIONES;i++) {
		if(alquileres[i]==null) {
			alquileres[i] = nueva;
			cantidadAlquileres++;
			return true;
		}
	}
	return false;
}

public Boolean addVenta(Venta nueva) {
	
	for(int i=0; i<CANTIDAD_MAX_OPERACIONES;i++) {
		if(ventas[i]==null) {
			ventas[i] = nueva;
			cantidadVentas++;
			return true;
		}
	}
	return false;
}

public Boolean addPermuta(Permuta nueva) {
	
	for(int i=0; i<CANTIDAD_MAX_OPERACIONES;i++) {
		if(permutas[i]==null) {
			permutas[i] = nueva;
			cantidadPermutas++;
			return true;
		}
	}
	return false;
}


public Boolean addCasa(Casa nueva) {
		
	String direccionNueva = nueva.getCalle() + " " + nueva.getNumero() + " "  + nueva.getCiudad();
	
	 for (int i = 0; i < cantidadCasas; i++) {
	        Casa existente = casas[i];
	        String direccionExistente = existente.getCalle() + " " + existente.getNumero() + " "  + existente.getCiudad();
	        if (direccionNueva.equals(direccionExistente)) {
	            System.out.println("Ya existe una casa en la misma dirección.");
	            return false;
	        }
	    }
	 
		for(int i=0; i<CANTIDAD_MAX_PROPIEDADES;i++) {
			if(casas[i]==null) {
				casas[i] = nueva;
				cantidadCasas++;
				return true;
			}
		}
		return false;
	}
public Boolean addDepartamento(Departamento nueva) {
	
	String direccionNueva = nueva.getCalle() + " " + nueva.getNumero() + " " + nueva.getPiso() + " " + nueva.getLetra() + " " + nueva.getCiudad();
	
	 for (int i = 0; i < cantidadDeptos; i++) {
	        Departamento existente = departamentos[i];
	        String direccionExistente = existente.getCalle() + " " + existente.getNumero() + " "  + existente.getPiso()  + " "  + existente.getLetra()  + " "  + existente.getCiudad();
	        if (direccionNueva.equals(direccionExistente)) {
	            System.out.println("Ya existe un departamento en la misma dirección y en el mismo piso.");
	            return false;
	        }
	    }
	 
	
	for(int i=0; i<CANTIDAD_MAX_PROPIEDADES;i++) {
		if(departamentos[i]==null) {
			departamentos[i] = nueva;
			cantidadDeptos++;
			return true;
		}
	}
	return false;
}

public double obtenerValorPromedioCasas() {
	if (cantidadCasas == 0) {
		return 0.0;
	}
	
	double sumaTotal = 0.0;
	for (int i=0; i < cantidadCasas; i++) {
		sumaTotal += casas[i].getPrecio();
	}
	
	return sumaTotal/cantidadCasas;
}


public double obtenerValorPromedioDepartamentos() {
	if (cantidadDeptos== 0) {
		return 0.0;
	}
	
	double sumaTotal = 0.0;
	for (int i=0; i < cantidadDeptos; i++) {
		sumaTotal += departamentos[i].getPrecio();
	}
	
	return sumaTotal/cantidadDeptos;
}

public Casa[] buscarCasasPorRangoDePrecio(double precioMinimo, double precioMaximo) {
    int cantidadResultados = 0;
    for (int i = 0; i < cantidadCasas; i++) {
        if (casas[i].getPrecio() >= precioMinimo && casas[i].getPrecio() <= precioMaximo) {
            cantidadResultados++;
        }
    }

    Casa[] resultados = new Casa[cantidadResultados];
    
    // Si no hay resultados, devolver un array vacío
    if (cantidadResultados == 0) {
        return resultados = null;
    }

    
    int index = 0;
    for (int i = 0; i < cantidadCasas; i++) {
        if (casas[i].getPrecio() >= precioMinimo && casas[i].getPrecio() <= precioMaximo) {
            resultados[index++] = casas[i];
        }
    }

    return resultados;
}

public Boolean addPH(PH nueva) {
	
	for(int i=0; i<CANTIDAD_MAX_PROPIEDADES;i++) {
		if(phs[i]==null) {
			phs[i] = nueva;
			cantidadPhs++;
			return true;
		}
	}
	return false;
}
public Boolean addTerreno(Terreno nueva) {
	
	for(int i=0; i<CANTIDAD_MAX_PROPIEDADES;i++) {
		if(terrenos[i]==null) {
			terrenos[i] = nueva;
			cantidadTerrenos++;
			return true;
		}
	}
	return false;
}
public Boolean addCampo(Campo nueva) {
	
	for(int i=0; i<CANTIDAD_MAX_PROPIEDADES;i++) {
		if(campos[i]==null) {
			campos[i] = nueva;
			cantidadCampos++;
			return true;
		}
	}
	return false;
}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}




	
	public Inquilino[] getInquilinos() {
		return inquilinos;
	}




	public void setInquilinos(Inquilino[] inquilinos) {
		this.inquilinos = inquilinos;
	}




	public Propietario[] getPropietarios() {
		return propietarios;
	}




	public void setPropietarios(Propietario[] propietarios) {
		this.propietarios = propietarios;
	}




	public Casa[] getCasas() {
		
		return this.casas;
	}
	public Departamento[] getDepartamentos() {
	
		return this.departamentos;
	}
	public PH[] getPHs() {
	
		return this.phs;
	}
	public Terreno[] getTerrenos() {
	
		return this.terrenos;
	}
	public Campo[] getCampos() {
	
		return this.campos;
	}


	public Casa[]  obtenerPropiedadesOrdenadasPorPrecioCasa() {
	      int n = casas.length;
	      Casa[] casasOrdenadas = casas.clone();
	        boolean swapped;	        
	        do {
	            swapped = false;
	            for (int i = 1; i < n; i++) {
	                if (casas[i - 1].getPrecio() > casas[i].getPrecio()) {	                   
	                    Casa aux = casas[i - 1];
	                    casas[i - 1] = casas[i];
	                    casas[i] = aux;
	                    swapped = true;
	                }
	            }
	            n--;
	        } while (swapped);
	        return casasOrdenadas;
	}


	public Casa[] obtenerPropiedadesOrdenadasPorUbicacionCasa() {
		int n = casas.length;
		 Casa[] casasOrdenadas = casas.clone();
        boolean swapped;	        
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (casas[i - 1].getCiudad().compareTo(casas[i].getCiudad()) > 0 ) {	                   
                    Casa aux = casas[i - 1];
                    casas[i - 1] = casas[i];
                    casas[i] = aux;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
		
		return casasOrdenadas;
	}
	
	public Departamento[] obtenerPropiedadesOrdenadasPorPrecioDepto() {
		
		int n = departamentos.length;
		Departamento[] deptosOrdenados = departamentos.clone();
        boolean swapped;	        
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (departamentos[i - 1].getPrecio() > departamentos[i].getPrecio()) {	                   
                    Departamento aux = departamentos[i - 1];
                    departamentos[i - 1] = departamentos[i];
                    departamentos[i] = aux;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
		
		return deptosOrdenados;
	}


	public Departamento[]  obtenerPropiedadesOrdenadasPorUbicacionDepto() {
		
		int n = departamentos.length;
		Departamento[] deptosOrdenados = departamentos.clone();
        boolean swapped;	        
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (departamentos[i - 1].getCiudad().compareTo(departamentos[i].getCiudad()) > 0 ) {	                   
                    Departamento aux = departamentos[i - 1];
                    departamentos[i - 1] = departamentos[i];
                    departamentos[i] = aux;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
		
        return deptosOrdenados;
	}




		        
		        
		        
}	  
	
	

	    
		
	
	
	
	

