package ar.edu.unlam.pb2;

import java.util.*;


public class Inmobiliaria {
	private String nombre;
	private String direccion;
	private String email;
	private String telefono;
	private ArrayList<Propiedad> propiedades;
	private HashSet<Cliente> clientes;

	
	public Inmobiliaria(String nombre, String direccion, String email, String telefono) {
		
		this.nombre = nombre;
		this.direccion = direccion;
		this.email = email;
		this.telefono = telefono;		
		this.propiedades = new ArrayList<Propiedad>();
		this.clientes = new HashSet<Cliente>();
		
		
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

	public Boolean addPropiedad(Propiedad nueva) {
		return propiedades.add(nueva);
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

	

	public double obtenerValorPromedioCasas() {
		if (propiedades.size() == 0) {
			return 0.0;
		}
		
		double sumaTotal = 0.0;
		int contadorCasas = 0;
		for (Propiedad actual : propiedades) {
			if(actual instanceof Casa) {
				Casa casa = (Casa) actual;
				sumaTotal += casa.getPrecio();
				contadorCasas++;
			}
			 
		}
		
		return sumaTotal/contadorCasas;
	}


	public ArrayList<Casa> buscarCasasPorRangoDePrecio(double precioMinimo, double precioMaximo) {
	    ArrayList<Casa> resultados = new ArrayList<Casa>();
	    for (Propiedad actual : propiedades) {
	    	if(actual instanceof Casa) {
	    		Casa casa = (Casa) actual;
	    		if (casa.getPrecio() >= precioMinimo && casa.getPrecio() <= precioMaximo) {
	        	resultados.add(casa);
	            
	    		}
	    	}	
	    }
	        return resultados ;
	    }
	

	public double obtenerValorPromedioDepartamentos() {
		if (propiedades.size() == 0) {
			return 0.0;
		}
		
		double sumaTotal = 0.0;
		int contadorDeptos = 0;
		for (Propiedad actual : propiedades) {
			if(actual instanceof Departamento) {
				Departamento depto = (Departamento) actual;
				sumaTotal += depto.getPrecio();
				contadorDeptos++;
			}
			 
		}
		
		return sumaTotal/contadorDeptos;
	}
	


	public ArrayList<Propiedad> buscarPropiedadesPorRangoDePrecio(double precioMinimo, double precioMaximo) {
	    ArrayList<Propiedad> resultados = new ArrayList<Propiedad>();
	    for (Propiedad actual : propiedades) {
	        if (actual.getPrecio() >= precioMinimo && actual.getPrecio() <= precioMaximo) {
	        	resultados.add(actual);
	            
	        }
	    }
	        return resultados ;
	    }
	
	public ArrayList<Propiedad> buscarPropiedadesPorUbicacion(String ciudad) {
	    ArrayList<Propiedad> resultados = new ArrayList<Propiedad>();
	    for (Propiedad actual : propiedades) {
	        if (actual.getCiudad().equals(ciudad)) {
	        	resultados.add(actual);
	            
	        }
	    }
	        return resultados ;
	    }
	
	public ArrayList<Propiedad> buscarPropiedadesPorOperacion(String operacion) {
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
	    }
	        return resultados ;
	}
	
	public ArrayList <Propiedad>  obtenerPropiedadesOrdenadasPorPrecio() {
	      //Creamos una copia del ArrayList original para no modificarlo directamente
		ArrayList<Propiedad> copiaPropiedades = new ArrayList<>(propiedades);
		
		//ordenamos con el metodo de burbujeo adaptado a ArrayList
		int n = copiaPropiedades.size();
		
		for (int i=0; i<n-1;i++) {
			for(int j=0; j < n-1-i; j++) {
				if(copiaPropiedades.get(j).getPrecio() > copiaPropiedades.get(j+1).getPrecio()) {
					Propiedad temp = copiaPropiedades.get(j);
					copiaPropiedades.set(j, copiaPropiedades.get(j+1));
					copiaPropiedades.set(j+1, temp);
				}
			}
		}	
		
		return copiaPropiedades;
	}
	
	public ArrayList<Propiedad> buscarPropiedadesPorVenta() {
	    ArrayList<Propiedad> propiedadesPorVenta = new ArrayList<>();
	    for (Propiedad propiedad : getPropiedades()) {
	        if (propiedad.getEsVenta().equals(true)) {
	            propiedadesPorVenta.add(propiedad);
	        }
	    }
	    return propiedadesPorVenta;
	}




		public ArrayList<Propiedad> obtenerPropiedadesOrdenadasPorCiudad() {
			//Creamos una copia del ArrayList original para no modificarlo directamente
			ArrayList<Propiedad> copiaPropiedades = new ArrayList<>(propiedades);
			
			//ordenamos con el metodo de burbujeo adaptado a ArrayList
			int n = copiaPropiedades.size();
			
			for (int i=0; i<n-1;i++) {
				for(int j=0; j < n-1-i; j++) {
					if(copiaPropiedades.get(j).getCiudad().compareTo(copiaPropiedades.get(j+1).getCiudad()) > 0 ) {
						Propiedad temp = copiaPropiedades.get(j);
						copiaPropiedades.set(j, copiaPropiedades.get(j+1));
						copiaPropiedades.set(j+1, temp);
					}
				}
			}	
			
			return copiaPropiedades;
       }




		public void alquilarPropiedad(Propiedad propiedad, String inquilino) {
			 // Verificar si la propiedad existe en la lista
	        if (propiedades.contains(propiedad)) {
	            // Establecer el nuevo inquilino y marcar la propiedad como en alquiler	            
	            propiedad.setEsVenta(false);
	            propiedad.setEsAlquiler(true);
	            propiedad.setInquilino(inquilino);
	            System.out.println("El alquiler de la propiedad se ha realizado exitosamente.");
	        } else {
	            System.out.println("La propiedad no existe en la lista.");
	        }
			
		}




		public void venderPropiedad(Propiedad propiedad, String propietarioNuevo) {
			  // Verificar si la propiedad existe en la lista
	        if (propiedades.contains(propiedad)) {
	            // Establecer el nuevo propietario y marcar la propiedad como en venta
	            propiedad.setPropietario(propietarioNuevo);
	            propiedad.setEsVenta(true);
	            propiedad.setEsAlquiler(false);
	            propiedad.setInquilino("");
	            System.out.println("La venta de la propiedad se ha realizado exitosamente.");
	        } else {
	            System.out.println("La propiedad no existe en la lista.");
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
















		        
		        
		  	  
	
	

	    
		
	
	

