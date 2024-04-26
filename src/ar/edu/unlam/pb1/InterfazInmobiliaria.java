package ar.edu.unlam.pb2;

import java.util.Scanner;

public class InterfazInmobiliaria {
	private static Scanner teclado = new Scanner(System.in);
	private static  Inmobiliaria actual = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");

            public static void main(String[] args) {
                

                OpcionDeMenu opcionMenu;
                
                do {
                    
                	//Menu
                    System.out.println("=== MENÚ ===");
                    System.out.println("1. Agregar propiedad");
                    System.out.println("2. Modificar propiedad");
                    System.out.println("3. Agregar cliente");
                    System.out.println("4. Obtener listado por precio");
                    System.out.println("5. Obtener listado por ubicación");
                    System.out.println("6. Buscar por precio");
                    System.out.println("7. Buscar por ubicación");
                    System.out.println("8. Realizar venta");
                    System.out.println("9. Realizar alquiler");
                    System.out.println("10. Salir");
                    System.out.println("Ingrese el número de la opción deseada:");

                    
                    int opcionSeleccionada = teclado.nextInt();

                    
                     opcionMenu = OpcionDeMenu.values()[opcionSeleccionada - 1];

                    
                    switch (opcionMenu) {
                        case AGREGAR_PROPIEDAD:                            
                            agregarPropiedad(actual);
                            mostrarPropiedades(actual);
                            break;
                        case MODIFICAR_PROPIEDAD:                          
                            modificarPropiedad(actual);
                            mostrarPropiedades(actual);
                            break;
                        case AGREGAR_CLIENTE:                           
                            agregarCliente(actual);
                            break;
                        case OBTENER_LISTADO_POR_PRECIO:                           
                        	mostrarPropiedadesPorPrecio(actual);
                            break;
                        case OBTENER_LISTADO_POR_UBICACION:                            
                        	mostrarPropiedadesPorUbicacion(actual);
                            break;
                        case BUSCAR_POR_PRECIO:                            
//                            buscarPorPrecio(actual);
                            break;
                        case BUSCAR_POR_UBICACION:                           
//                            buscarPorUbicacion(actual);
                            break;
                        case REALIZAR_VENTA:
//                            realizarVenta(actual);
                            break;
                        case REALIZAR_ALQUILER:
//                            realizarAlquiler(actual);
                            break;
                        case SALIR:
                            System.out.println("¡Hasta luego!");                            
                            break;
                        default:
                            System.out.println("Opción no válida. Por favor, ingrese un número entre 1 y 10.");
                    }
                }while( opcionMenu != OpcionDeMenu.SALIR);
                
                teclado.close();
            }
	
	



	private static void agregarPropiedad(Inmobiliaria inmobiliaria){
		

		 
		 
		 System.out.println("Agregar nueva propiedad:");

		   
		   
		    String tipoPropiedad;
		    do {
		        System.out.print("Ingrese el tipo de propiedad (CASA, DEPTO, PH, TERRENO, CAMPO): \n");
		        tipoPropiedad = teclado.next();
		        tipoPropiedad = tipoPropiedad.toUpperCase();
		        if (tipoPropiedad == null) {
		            System.out.println("Tipo de propiedad no válido. Por favor, ingrese un tipo de propiedad válido.");
		        }
		    } while (tipoPropiedad == null);

		    		    
		   if (tipoPropiedad.equals("CASA") ) {
		    	
		    	System.out.print("Ingrese un codigo para la propiedad: ");
	    		String codigo = teclado.next(); 
		    	
		    	System.out.print("Ingrese la calle de la propiedad: ");
		    	String calle = teclado.next(); 

		    	System.out.print("Ingrese el numero de la propiedad: ");
		    	Integer numero = teclado.nextInt();
		    	
		    
		    	System.out.print("Ingrese los metros cuadrados totales de la propiedad: ");
		    	Integer metros = teclado.nextInt();
		    	
		    
		    	System.out.print("Ingrese la cantidad de Ambientes totaltes(si es un terreno debe ser cero) de la propiedad: ");
		    	Integer cantAmbientes = teclado.nextInt();
		    	 

		    	System.out.print("Ingrese la ciudad de la propiedad: ");
		    	String ciudad = teclado.nextLine(); 
		    	teclado.nextLine();

		    	System.out.print("Ingrese el precio de la propiedad: ");
		    	Double precioPropiedad = teclado.nextDouble();
		    	teclado.nextLine();
		    	
		    	

		    	System.out.print("Ingrese si esta disponible la propiedad: ");
		    	Boolean disponible = teclado.nextBoolean();
		    	teclado.nextLine();
		    	
		   
		    	System.out.print("Ingrese los datos del propietario separado por coma (DNI, NOMBRE, APELLIDO): ");
		    	String propietarioStr = teclado.nextLine();
		    	Propietario propietario = Propietario.fromString(propietarioStr);		    	
		    	
		    	
//		    	System.out.print("Ingrese los datos del inquilino separado por coma (DNI, NOMBRE, APELLIDO): ");
//		    	String inquilinoStr = teclado.next();
//		    	Inquilino inquilino = Inquilino .fromString(inquilinoStr);
//	  		    
		    	Casa nuevaCasa = new Casa(codigo, calle, numero, metros, cantAmbientes, ciudad, precioPropiedad, disponible,propietario);		   
		    	Boolean agregada = inmobiliaria.addCasa(nuevaCasa);
		    	if (agregada) {
		    		System.out.println("Propiedad agregada exitosamente.");
		    	} else {
		    		System.out.println("No se pudo agregar la propiedad. La lista de propiedades está llena.");
		    	}
	      }
		    
		   
		   if (tipoPropiedad.equals("DEPTO") ) {
		    	
		    	System.out.print("Ingrese un codigo para la propiedad: ");
	    		String codigo = teclado.next(); 
		    	
		    	System.out.print("Ingrese la calle de la propiedad: ");
		    	String calle = teclado.next(); 

		    	System.out.print("Ingrese el numero de la propiedad: ");
		    	Integer numero = teclado.nextInt();
		    	teclado.nextLine();
		    	
		    
		    	System.out.print("Ingrese los metros cuadrados totales de la propiedad: ");
		    	Integer metros = teclado.nextInt();
		    	 
		    	
		    	System.out.print("Ingrese el piso donde se ubica la propiedad: ");
		    	Integer piso = teclado.nextInt();
		    	
		    	
		    	System.out.print("Ingrese la letra del piso donde se ubica la propiedad: ");
		    	Character letra = teclado.next().charAt(0);
		    			    
		    	System.out.print("Ingrese la cantidad de Ambientes totaltes(si es un terreno debe ser cero) de la propiedad: ");
		    	Integer cantAmbientes = teclado.nextInt();
		    	

		    	System.out.print("Ingrese la ciudad de la propiedad: ");
		    	String ciudad = teclado.nextLine(); 

		    	System.out.print("Ingrese el precio de la propiedad: ");
		    	Double precioPropiedad = teclado.nextDouble();
		    	teclado.nextLine();

		    	System.out.print("Ingrese si esta disponible la propiedad: ");
		    	Boolean disponible = teclado.nextBoolean();
		    	
		   
		    	System.out.print("Ingrese los datos del propietario separado por coma (DNI, NOMBRE, APELLIDO): ");
		    	String propietarioStr = teclado.next();
		    	Propietario propietario = Propietario.fromString(propietarioStr);
		    	
		    	teclado.next(); 
		    	
//		    	System.out.print("Ingrese los datos del inquilino separado por coma (DNI, NOMBRE, APELLIDO): ");
//		    	String inquilinoStr = teclado.next();
//		    	Inquilino inquilino = Inquilino .fromString(inquilinoStr);
	  		    
		    	Departamento nuevoDepto = new Departamento(codigo, calle, numero, metros, piso, letra, cantAmbientes, ciudad, precioPropiedad, disponible,propietario);		   
		    	Boolean agregada = inmobiliaria.addDepartamento(nuevoDepto);
		    	if (agregada) {
		    		System.out.println("Propiedad agregada exitosamente.");
		    	} else {
		    		System.out.println("No se pudo agregar la propiedad. La lista de propiedades está llena.");
		    	}
	      }


		    
		}
	
	





	private static void mostrarPropiedades(Inmobiliaria inmobiliaria) {
		
		
		  
		    String tipoPropiedad;
		    do {
		        System.out.print("Ingrese el tipo de propiedad (CASA, DEPTO, PH, TERRENO, CAMPO): \n");
		        tipoPropiedad = teclado.next();
		        tipoPropiedad = tipoPropiedad.toUpperCase();
		        if (tipoPropiedad == null) {
		            System.out.println("Tipo de propiedad no válido. Por favor, ingrese un tipo de propiedad válido.");
		        }
		    } while (tipoPropiedad == null);

		    		    
		   if (tipoPropiedad.equals("CASA") ) {
	    
			   Casa[] casas = inmobiliaria.getCasas();

	    
			   System.out.println("=== LISTADO DE CASAS ===");
			   for (int i = 0; i < casas.length; i++) {
	        	System.out.println(casas[i] + "\n"); 
	    	}
	    
	     }
		   
		   if (tipoPropiedad.equals("DEPTO") ) {
			    
			   Departamento[] departamentos = inmobiliaria.getDepartamentos();

	    
			   System.out.println("=== LISTADO DE DEPARTAMENTOS ===");
			   for (int i = 0; i < departamentos.length; i++) {
	        	System.out.println(departamentos[i] + "\n"); 
	    	}
	    
	     }
		   
	}    

	private static void modificarPropiedad(Inmobiliaria inmobiliaria){
		
		  
	    String tipoPropiedad;
	    do {
	        System.out.print("Ingrese el tipo de propiedad (CASA, DEPTO, PH, TERRENO, CAMPO): \n");
	        tipoPropiedad = teclado.next();
	        tipoPropiedad =tipoPropiedad.toUpperCase();
	        if (tipoPropiedad == null) {
	            System.out.println("Tipo de propiedad no válido. Por favor, ingrese un tipo de propiedad válido.");
	        }
	    } while (tipoPropiedad == null);

	    
		   if (tipoPropiedad.equals("CASA") ) {
			    
			   System.out.print("Ingrese el código de la propiedad que desea modificar: ");
			    String codigo = teclado.next(); 
			    
			    Casa propiedadAModificar = null;
			    for (Casa casas : inmobiliaria.getCasas()) {
			        if (casas.getCodigo() == codigo) {
			            propiedadAModificar = casas;
			            break;
			        }
			    }
			    
			    if (propiedadAModificar != null) {
			        
			        System.out.println("Propiedad encontrada. Por favor ingrese los nuevos detalles:");

			        System.out.print("Ingrese la calle de la propiedad: ");
			        String calle = teclado.next();
			        propiedadAModificar.setCalle(calle);
			        
			        System.out.print("Ingrese el numero de la propiedad: ");
				    Integer numero = teclado.nextInt();
				    
				    propiedadAModificar.setNumero(numero);
				    
				    System.out.print("Ingrese los metros cuadrados totales de la propiedad: ");
				    Integer metros = teclado.nextInt();
				     
				    propiedadAModificar.setMetros(metros);
				    
				    System.out.print("Ingrese la cantidad de Ambientes totaltes(si es un terreno debe ser cero) de la propiedad: ");
				    Integer cantAmbientes = teclado.nextInt();
				     
				    propiedadAModificar.setCantAmbientes(cantAmbientes);

				    System.out.print("Ingrese la ciudad de la propiedad: ");
				    String ciudad = teclado.next(); 
				    propiedadAModificar.setCiudad(ciudad);

				    System.out.print("Ingrese el precio de la propiedad: ");
				    Double precioPropiedad = teclado.nextDouble();
				     
				    propiedadAModificar.setPrecio(precioPropiedad);

				    System.out.print("Ingrese si esta disponible la propiedad: ");
				    Boolean disponible = teclado.nextBoolean();
				    
				    propiedadAModificar.setEstaDisponible(disponible);
				    
				    System.out.print("Ingrese los datos del propietario separado por coma (DNI, NOMBRE, APELLIDO): ");
			    	String propietarioStr = teclado.next();
			    	Propietario propietario = Propietario.fromString(propietarioStr);
			    	propiedadAModificar.setPropietario(propietario);

			        System.out.println("Propiedad modificada exitosamente.");
			    } else {
			        System.out.println("No se encontró ninguna propiedad con el código ingresado.");
			    }

	    	}
		   
		   if (tipoPropiedad.equals("DEPTO") ) {
			    
			   System.out.print("Ingrese el código de la propiedad que desea modificar: ");
			    String codigo = teclado.next(); 
			    
			    Departamento propiedadAModificar = null;
			    for (Departamento departamentos : inmobiliaria.getDepartamentos()) {
			        if (departamentos.getCodigo() == codigo) {
			            propiedadAModificar = departamentos;
			            break;
			        }
			    }
			    
			    if (propiedadAModificar != null) {
			        
			        System.out.println("Propiedad encontrada. Por favor ingrese los nuevos detalles:");

			        System.out.print("Ingrese la calle de la propiedad: ");
			        String calle = teclado.next();
			        propiedadAModificar.setCalle(calle);
			        
			        System.out.print("Ingrese el numero de la propiedad: ");
				    Integer numero = teclado.nextInt();
				    
				    propiedadAModificar.setNumero(numero);
				    
				    System.out.print("Ingrese los metros cuadrados totales de la propiedad: ");
				    Integer metros = teclado.nextInt();
				     
				    propiedadAModificar.setMetros(metros);
				    
				    System.out.print("Ingrese los metros cuadrados totales de la propiedad: ");
				    Integer piso = teclado.nextInt();
				    
				    propiedadAModificar.setPiso(piso);
				    
				    System.out.print("Ingrese los metros cuadrados totales de la propiedad: ");
				    Character letra = teclado.next().charAt(0);
				    
				    propiedadAModificar.setLetra(letra);
				    
				    System.out.print("Ingrese la cantidad de Ambientes totaltes(si es un terreno debe ser cero) de la propiedad: ");
				    Integer cantAmbientes = teclado.nextInt();
				     
				    propiedadAModificar.setCantAmbientes(cantAmbientes);

				    System.out.print("Ingrese la ciudad de la propiedad: ");
				    String ciudad = teclado.next(); 
				    propiedadAModificar.setCiudad(ciudad);

				    System.out.print("Ingrese el precio de la propiedad: ");
				    Double precioPropiedad = teclado.nextDouble();
				    
				    propiedadAModificar.setPrecio(precioPropiedad);

				    System.out.print("Ingrese si esta disponible la propiedad: ");
				    Boolean disponible = teclado.nextBoolean();
				    
				    propiedadAModificar.setEstaDisponible(disponible);
				    
				    System.out.print("Ingrese los datos del propietario separado por coma (DNI, NOMBRE, APELLIDO): ");
			    	String propietarioStr = teclado.next();
			    	Propietario propietario = Propietario.fromString(propietarioStr);
			    	propiedadAModificar.setPropietario(propietario);

			        System.out.println("Propiedad modificada exitosamente.");
			    } else {
			        System.out.println("No se encontró ninguna propiedad con el código ingresado.");
			    }

	    	}
	    
	    
	}
	
	private static void agregarCliente(Inmobiliaria inmobiliaria) {
			
			
		    String tipoCliente;
		    do {
		    	System.out.print("Ingrese el tipo de cliente(INQUILINO o PROPIETARIO): ");
		         tipoCliente = teclado.next().toUpperCase();
		        if (tipoCliente == null) {
		            System.out.println("Tipo de Cliente no válido. Por favor, ingrese un tipo de propiedad válido.");
		        }
		    } while (tipoCliente == null);
			

			
			if (tipoCliente.equals( "INQUILINO")) {
				 System.out.print("Ingrese el DNI del INQUILINO: ");
			        Integer dniCliente = teclado.nextInt();
			        teclado.next();
				
				System.out.print("Ingrese el nombre del INQUILINO: ");
		        String nombreCliente = teclado.next();
		        
		        System.out.print("Ingrese el apellido del INQUILINO: ");
		        String apellidoCliente = teclado.next();
		        Inquilino nuevoCliente = new Inquilino(dniCliente, nombreCliente, apellidoCliente);
		        Boolean agregado = inmobiliaria.addInquilino(nuevoCliente);	  
			
		        if (agregado) {
		        	System.out.println("Cliente agregado exitosamente.");
	            
		        } else {
		        	System.out.println("No se pudo agregar el cliente. La lista de clientes está llena.");
	            
		        }
			}    
			
			
			
			if (tipoCliente.equals( "PROPIETARIO")) {
				 System.out.print("Ingrese el DNI del INQUILINO: ");
			        Integer dniCliente = teclado.nextInt();
			        teclado.next();
				
				System.out.print("Ingrese el nombre del INQUILINO: ");
		        String nombreCliente = teclado.next();
		        
		        System.out.print("Ingrese el apellido del INQUILINO: ");
		        String apellidoCliente = teclado.next();
		        Inquilino nuevoCliente = new Inquilino(dniCliente, nombreCliente, apellidoCliente);
		        Boolean agregado = inmobiliaria.addInquilino(nuevoCliente);	  
			
		        if (agregado) {
		        	System.out.println("Cliente agregado exitosamente.");
	            
		        } else {
		        	System.out.println("No se pudo agregar el cliente. La lista de clientes está llena.");
	            
		        }
			}    
						
	        
	    }
		
	
	private static void mostrarPropiedadesPorPrecio(Inmobiliaria inmobiliaria) {
        
		
		  
	    String tipoPropiedad;
	    do {
	        System.out.print("Ingrese el tipo de propiedad (CASA, DEPTO, PH, TERRENO, CAMPO): \n");
	        tipoPropiedad = teclado.next().toUpperCase();
	        if (tipoPropiedad == null) {
	            System.out.println("Tipo de propiedad no válido. Por favor, ingrese un tipo de propiedad válido.");
	        }
	    } while (tipoPropiedad == null);

	    
		   if (tipoPropiedad.equals("CASA") ) {
		
			   Casa[] casas = inmobiliaria.obtenerPropiedadesOrdenadasPorPrecioCasa();

        
			   System.out.println("Listado de propiedades ordenadas por precio:");
			   for (Casa casa : casas) {
				   System.out.println(casa); 
			   }
		   }
		   
		   if (tipoPropiedad.equals("DEPTO") ) {
				
			   Departamento[] deptos = inmobiliaria.obtenerPropiedadesOrdenadasPorPrecioDepto();

        
			   System.out.println("Listado de propiedades ordenadas por precio:");
			   for (Departamento departamento : deptos) {
				   System.out.println(departamento); 
			   }
		   }
		   
	}
	
	private static void mostrarPropiedadesPorUbicacion(Inmobiliaria inmobiliaria) {
		 
		
		  
	    String tipoPropiedad;
	    do {
	        System.out.print("Ingrese el tipo de propiedad (CASA, DEPTO, PH, TERRENO, CAMPO): \n");
	        tipoPropiedad = teclado.next().toUpperCase();
	        if (tipoPropiedad == null) {
	            System.out.println("Tipo de propiedad no válido. Por favor, ingrese un tipo de propiedad válido.");
	        }
	    } while (tipoPropiedad == null);

	    
		   if (tipoPropiedad.equals("CASA") ) {
		
		   Casa[] casas = inmobiliaria.obtenerPropiedadesOrdenadasPorUbicacionCasa();

	        
	        System.out.println("Listado de propiedades ordenadas por ubicacion:");
	        for (Casa casa : casas) {
	            System.out.println(casa); 
	        }
	   }   
		   
		   if (tipoPropiedad.equals("DEPTO") ) {
				
			   Departamento[] deptos = inmobiliaria.obtenerPropiedadesOrdenadasPorPrecioDepto();

		        
		        System.out.println("Listado de propiedades ordenadas por ubicacion:");
		        for (Departamento depto : deptos) {
		            System.out.println(depto); 
		        }
		   } 
		
	}
			
	
}


