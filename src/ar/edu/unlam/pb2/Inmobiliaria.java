package ar.edu.unlam.pb2;

import java.util.*;


public class Inmobiliaria {
	private String nombre;
	private String direccion;
	private String email;
	private String telefono;
	private ArrayList<Propiedad> propiedades;
	private HashSet<Cliente> clientes;
	private TreeSet<Operacion> operaciones;

	
	public Inmobiliaria(String nombre, String direccion, String email, String telefono) {
		
		this.nombre = nombre;
		this.direccion = direccion;
		this.email = email;
		this.telefono = telefono;		
		this.propiedades = new ArrayList<Propiedad>();
		this.clientes = new HashSet<Cliente>();
		this.operaciones = new TreeSet<Operacion>();
		
		
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

	
	
    public ArrayList<Propiedad> getPropiedades() {
		
		return this.propiedades;
	}
    
    public void setPropiedades(ArrayList<Propiedad> propiedades) {
		this.propiedades = propiedades;
	}
	

	public Boolean addCliente(Cliente nuevo) {
		
	    return clientes.add(nuevo);
	}


	public HashSet<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(HashSet<Cliente> clientes) {
		this.clientes = clientes;
	}

	 public TreeSet<Operacion> getOperaciones() {
			
			return this.operaciones;
		}
	    
	    public void setOperaciones(TreeSet<Operacion> operaciones) {
			this.operaciones = operaciones;
		}
	
	public Boolean addPropiedad(Propiedad nueva) throws UmbralMinimoNoAlcanzadoException {
		if (nueva.getPrecio() < 10000) {
            throw new UmbralMinimoNoAlcanzadoException("El precio de la propiedad es inferior al umbral mínimo de 10000.");
        }
		return propiedades.add(nueva);
	}
	
	public double obtenerValorPromedioPropiedades() {
		if (propiedades.size() == 0) {
			return 0.0;
		}
		
		double sumaTotal = 0.0;
		int contadorPropiedades = 0;
		for (Propiedad actual : propiedades) {
				sumaTotal += actual.getPrecio();
				contadorPropiedades++;						 
		}
		
		return sumaTotal/contadorPropiedades;
	}



	public ArrayList<Propiedad> buscarPropiedadesPorRangoDePrecio(double precioMinimo, double precioMaximo) throws SinResultadosException{
	    ArrayList<Propiedad> resultados = new ArrayList<Propiedad>();
	    for (Propiedad actual : propiedades) {
	        if (actual.getPrecio() >= precioMinimo && actual.getPrecio() <= precioMaximo) {
	        	resultados.add(actual);
	            
	        }
	    }
	    if (resultados.isEmpty()) {
            throw new SinResultadosException("No hay propiedades encontradas.");
        }
	        return resultados ;
	    }
	
	public ArrayList<Propiedad> buscarPropiedadesPorUbicacion(String ciudad) throws SinResultadosException{
	    ArrayList<Propiedad> resultados = new ArrayList<Propiedad>();
	    for (Propiedad actual : propiedades) {
	        if (actual.getCiudad().equals(ciudad)) {
	        	resultados.add(actual);
	            
	        }
	    }
	    if (propiedades.isEmpty()) {
            throw new SinResultadosException("No hay propiedades encontradas.");
        }
	        return resultados ;
	    }
	
	public ArrayList<Propiedad> buscarPropiedadesPorOperacion(String operacion) throws SinResultadosException{
		ArrayList<Propiedad> resultados = new ArrayList<Propiedad>();		
	    for (Propiedad actual : propiedades) {
	    	if(operacion.equals("VENTA")) {
	    		if (actual.getEsVenta().equals(true)) {
	    			resultados.add(actual);	            
	    		}
	    	}	
	    	else if(operacion.equals("ALQUILER")) {
	    		if (actual.getEsAlquiler().equals(true)) {
	    			resultados.add(actual);	            
	    		}
	    	}
	    	else if(operacion.equals("PERMUTA")) {
	    		if (actual.getEsPermuta().equals(true)) {
	    			resultados.add(actual);	            
	    		}
	    	}
	    }
	    if (propiedades.isEmpty()) {
            throw new SinResultadosException("No hay propiedades encontradas.");
        }
	        return resultados ;
	}
	
	public ArrayList<Propiedad>  obtenerPropiedadesOrdenadasPorPrecio(double precioMinimo, double precioMaximo) throws SinResultadosException{
		ArrayList<Propiedad> resultado = new ArrayList<>();
        for (Propiedad propiedad : propiedades) {
            if (propiedad.getPrecio() >= precioMinimo && propiedad.getPrecio() <= precioMaximo) {
                resultado.add(propiedad);
            }
        }
        if (propiedades.isEmpty()) {
            throw new SinResultadosException("No se encontraron propiedades en el rango de precios especificado.");
        }
        resultado.sort(Comparator.comparingDouble(Propiedad::getPrecio));
        return resultado;
	}
	
	public ArrayList<Propiedad> buscarPropiedadesPorVenta() throws SinResultadosException{
	    ArrayList<Propiedad> propiedadesPorVenta = new ArrayList<>();
	    for (Propiedad propiedad : getPropiedades()) {
	        if (propiedad.getEsVenta().equals(true)) {
	            propiedadesPorVenta.add(propiedad);
	        }
	    }
	    if (propiedades.isEmpty()) {
            throw new SinResultadosException("No hay propiedades encontradas.");
        }
	    return propiedadesPorVenta;
	}




		public ArrayList<Propiedad> obtenerPropiedadesOrdenadasPorUbicacion() throws SinResultadosException {
			 if (propiedades.isEmpty()) {
		            throw new SinResultadosException("No hay propiedades disponibles para ordenar.");
		        }
			
			ArrayList<Propiedad> resultado = new ArrayList<>();
	        resultado.sort(Comparator.comparing(Propiedad::getCiudad));
	        return resultado;
       }




		public void alquilarPropiedad(Propiedad propiedad, Cliente inquilino) {
	       operaciones.add(new Alquiler(propiedad,inquilino));   
	       for(Operacion operacion : operaciones) {
	    	   operacion.ejecutar();
	       }
			
		}



		public void venderPropiedad(Propiedad propiedad, Cliente propietarioNuevo) {
			operaciones.add(new Venta(propiedad,propietarioNuevo));   
		       for(Operacion operacion : operaciones) {
		    	   operacion.ejecutar();
		       }
			
		}
		
		public void permutarPropiedades(Propiedad propiedadAPermutarA, Propiedad propiedadAPermutarB) {
			operaciones.add(new Permuta(propiedadAPermutarA,propiedadAPermutarB));   
		       for(Operacion operacion : operaciones) {
		    	   operacion.ejecutar();
		       }

			
			
		}


		public Propiedad buscarPropiedadPorCodigo(String codigo) {
			for (Propiedad propiedad : propiedades) {
		        if (propiedad.getCodigo().equals(codigo)) {
		            return propiedad; 
		        }
		    }
			
		    return null;
		}


		
	
		
	}
















		        
		        
		  	  
	
	

	    
		
	
	

