package ar.edu.unlam.pb2;

import java.util.*;


public class Inmobiliaria {
	private String nombre;
	private String direccion;
	private String email;
	private String telefono;
	private ArrayList<Casa> casas;
	private ArrayList<Departamento> departamentos;
	private ArrayList<PH> phs;
	private ArrayList<Terreno> terrenos;
	private ArrayList<Campo> campos;
	private HashSet<Cliente> clientes;
	private HashSet<Inquilino> inquilinos;
	private HashSet<Propietario> propietarios;
	private ArrayList<Alquiler> alquileres;
	private ArrayList<Venta> ventas;
	private ArrayList<Permuta> permutas;
	
	public Inmobiliaria(String nombre, String direccion, String email, String telefono) {
		
		this.nombre = nombre;
		this.direccion = direccion;
		this.email = email;
		this.telefono = telefono;		
		this.casas = new ArrayList<Casa>();
		this.departamentos = new ArrayList<Departamento>();
		this.phs = new ArrayList<PH>();
		this.terrenos = new ArrayList<Terreno>();		
		this.campos = new ArrayList<Campo>();
		this.clientes = new HashSet<Cliente>();
		this.inquilinos = new HashSet<Inquilino>();
		this.propietarios = new HashSet<Propietario>();
		this.alquileres = new ArrayList<Alquiler>();
		this.ventas = new ArrayList<Venta>();
		this.permutas = new ArrayList<Permuta>();
		
		
	}
	


	
public Boolean addInquilino(Inquilino nueva) {
	
	
     return inquilinos.add(nueva);
 }

 
// private void redimensionarArray() {
//     int nuevaCapacidad = inquilinos.size() * 2; 
//     Inquilino[] nuevoArray = new Inquilino[nuevaCapacidad];
//     
//     System.arraycopy(inquilinos, 0, nuevoArray, 0, cantidadInquilinos);
//     inquilinos = nuevoArray;
// }
	

public Boolean addPropietario(Propietario nueva) {
	
	return propietarios.add(nueva);
}

public Boolean addAlquiler(Alquiler nueva) {
	

	return alquileres.add(nueva);
}

public Boolean addVenta(Venta nueva) {
	
	return ventas.add(nueva);
}

public Boolean addPermuta(Permuta nueva) {
	
	return permutas.add(nueva);
}


public Boolean addCasa(Casa nueva) {
		
//	String direccionNueva = nueva.getCalle() + " " + nueva.getNumero() + " "  + nueva.getCiudad();
//	
//	 for (int i = 0; i < cantidadCasas; i++) {
//	        Casa existente = casas[i];
//	        String direccionExistente = existente.getCalle() + " " + existente.getNumero() + " "  + existente.getCiudad();
//	        if (direccionNueva.equals(direccionExistente)) {
//	            System.out.println("Ya existe una casa en la misma dirección.");
//	            return false;
//	        }
//	    }
//	 
//    
//     if (cantidadCasas == casas.length) {
//         redimensionarArray1();
//     }
//
//     
//     casas[cantidadCasas] = nueva;
//     cantidadCasas++;
//     return true;
	return casas.add(nueva);
 }

 
// private void redimensionarArray1() {
//     int nuevaCapacidad = casas.length * 2; 
//     Casa[] nuevoArray = new Casa[nuevaCapacidad];
//     
//     System.arraycopy(casas, 0, nuevoArray, 0, cantidadCasas);
//     casas = nuevoArray;
// }
	
public Boolean addDepartamento(Departamento nueva) {
	
	return departamentos.add(nueva);
}

public Boolean addCliente(Cliente nuevo) {
		
    return clientes.add(nuevo);
}


public double obtenerValorPromedioCasas() {
	if (casas.size() == 0) {
		return 0.0;
	}
	
	double sumaTotal = 0.0;
	for (Casa actual : casas) {
		 sumaTotal += actual.getPrecio();
	}
	
	return sumaTotal/casas.size();
}


public double obtenerValorPromedioDepartamentos() {
	if (departamentos.size()== 0) {
		return 0.0;
	}
	
	double sumaTotal = 0.0;
	for (Departamento actual : departamentos) {
		sumaTotal += actual.getPrecio();
	}
	
	return sumaTotal/departamentos.size();
}

public ArrayList<Casa> buscarCasasPorRangoDePrecio(double precioMinimo, double precioMaximo) {
    ArrayList<Casa> resultados = new ArrayList<Casa>();
    for (Casa actual : casas) {
        if (actual.getPrecio() >= precioMinimo && actual.getPrecio() <= precioMaximo) {
        	resultados.add(actual);
            
        }
    }
        return resultados ;
    }


public Boolean addPH(PH nueva) {
	

	return phs.add(nueva);
}
public Boolean addTerreno(Terreno nueva) {
	

	return terrenos.add(nueva);
}
public Boolean addCampo(Campo nueva) {
	

	return campos.add(nueva);
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


	public HashSet<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(HashSet<Cliente> clientes) {
		this.clientes = clientes;
	}

	public ArrayList<Casa> getCasas() {
		
		return this.casas;
	}
	
	public void setCasas(ArrayList<Casa> casas) {
		this.casas = casas;
	}

	
	public HashSet<Inquilino> getInquilinos() {
		return this.inquilinos;
	}

	
	
	public void setInquilinos(HashSet<Inquilino> inquilinos) {
		this.inquilinos = inquilinos;
	}




	public HashSet<Propietario> getPropietarios() {
		return this.propietarios;
	}




	public void setPropietarios(HashSet<Propietario> propietarios) {
		this.propietarios = propietarios;
	}





	
	public ArrayList<Departamento> getDepartamentos() {
	
		return this.departamentos;
	}
	public ArrayList<PH> getPHs() {
	
		return this.phs;
	}
	public ArrayList<Terreno> getTerrenos() {
	
		return this.terrenos;
	}
	public ArrayList<Campo> getCampos() {
	
		return this.campos;
	}


	public ArrayList <Casa>  obtenerPropiedadesOrdenadasPorPrecioCasa() {
	      //Creamos una copia del ArrayList original para no modificarlo directamente
		ArrayList<Casa> copiaCasas = new ArrayList<>(casas);
		
		//ordenamos con el metodo de burbujeo adaptado a ArrayList
		int n = copiaCasas.size();
		
		for (int i=0; i<n-1;i++) {
			for(int j=0; j < n-1-i; j++) {
				if(copiaCasas.get(j).getPrecio() > copiaCasas.get(j+1).getPrecio()) {
					Casa temp = copiaCasas.get(j);
					copiaCasas.set(j, copiaCasas.get(j+1));
					copiaCasas.set(j+1, temp);
				}
			}
		}	
		
		return copiaCasas;
	}


	public ArrayList<Casa> obtenerPropiedadesOrdenadasPorUbicacionCasa() {
		//Creamos una copia del ArrayList original para no modificarlo directamente
				ArrayList<Casa> copiaCasas = new ArrayList<>(casas);
				
				//ordenamos con el metodo de burbujeo adaptado a ArrayList
				int n = copiaCasas.size();
				
				for (int i=0; i<n-1;i++) {
					for(int j=0; j < n-1-i; j++) {
						if(copiaCasas.get(j).getCiudad().compareTo(copiaCasas.get(j+1).getCiudad()) > 0 ) {
							Casa temp = copiaCasas.get(j);
							copiaCasas.set(j, copiaCasas.get(j+1));
							copiaCasas.set(j+1, temp);
						}
					}
				}	
				
		return copiaCasas;
	}
	
	public ArrayList<Departamento> obtenerPropiedadesOrdenadasPorPrecioDepto() {
		
		//Creamos una copia del ArrayList original para no modificarlo directamente
		ArrayList<Departamento> copiaDeptos = new ArrayList<>(departamentos);
		
		//ordenamos con el metodo de burbujeo adaptado a ArrayList
		int n = copiaDeptos.size();
		
		for (int i=0; i<n-1;i++) {
			for(int j=0; j < n-1-i; j++) {
				if(copiaDeptos.get(j).getPrecio() > copiaDeptos.get(j+1).getPrecio()  ) {
					Departamento temp = copiaDeptos.get(j);
					copiaDeptos.set(j, copiaDeptos.get(j+1));
					copiaDeptos.set(j+1, temp);
				}
			}
		}	
		
		return copiaDeptos;
	}


	public ArrayList<Departamento>  obtenerPropiedadesOrdenadasPorUbicacionDepto() {
		//Creamos una copia del ArrayList original para no modificarlo directamente
				ArrayList<Departamento> copiaDeptos = new ArrayList<>(departamentos);
				
				//ordenamos con el metodo de burbujeo adaptado a ArrayList
				int n = copiaDeptos.size();
				
				for (int i=0; i<n-1;i++) {
					for(int j=0; j < n-1-i; j++) {
						if(copiaDeptos.get(j).getCiudad().compareTo(copiaDeptos.get(j+1).getCiudad()) > 0 ) {
							Departamento temp = copiaDeptos.get(j);
							copiaDeptos.set(j, copiaDeptos.get(j+1));
							copiaDeptos.set(j+1, temp);
						}
					}
				}	
				
				return copiaDeptos;
	}

}




		        
		        
		  	  
	
	

	    
		
	
	

