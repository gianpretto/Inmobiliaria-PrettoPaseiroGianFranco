package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.Scanner;

public class InterfazInmobiliaria {
	private static Scanner teclado = new Scanner(System.in);
	private static  Inmobiliaria actual = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");

            public static void main(String[] args) throws SinResultadosException, UmbralMinimoNoAlcanzadoException {
                

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
                    System.out.println("8. Buscar por Venta o Alquiler");
                    System.out.println("9. Realizar venta");
                    System.out.println("10. Realizar alquiler");
                    System.out.println("11. Salir");
                    System.out.println("Ingrese el número de la opción deseada:");

                    
                    int opcionSeleccionada = teclado.nextInt();

                    
                     opcionMenu = OpcionDeMenu.values()[opcionSeleccionada - 1];

                    
                    switch (opcionMenu) {
                        case AGREGAR_PROPIEDAD:                            
                            agregarPropiedad(actual);
                            break;
                        case MODIFICAR_PROPIEDAD:                          
                            modificarPropiedad(actual);
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
                            buscarPorPrecio(actual);
                            break;
                        case BUSCAR_POR_UBICACION:                           
                            buscarPorUbicacion(actual);
                            break;
                        case BUSCAR_POR_VENTAOALQUILER:                           
                            buscarPorVentaOAlquiler(actual);
                            break;    
                        case REALIZAR_VENTA:
                            realizarVenta(actual);
                            break;
                        case REALIZAR_ALQUILER:
                            realizarAlquiler(actual);
                            break;
                        case REALIZAR_PERMUTA:
                        	realizarPermuta(actual);
                        case SALIR:
                            System.out.println("¡Hasta luego!");                            
                            break;
                        default:
                            System.out.println("Opción no válida. Por favor, ingrese un número entre 1 y 11.");
                    }
                }while( opcionMenu != OpcionDeMenu.SALIR);
                
                teclado.close();
            }
	

	


	private static void agregarPropiedad(Inmobiliaria inmobiliaria) throws UmbralMinimoNoAlcanzadoException{
		Cliente propietario = new Cliente (12345678,"pepe","argento");
        Casa casa = new Casa("CASA1", "CARRASCO", 123, 50, 3, "San Justo", 15000.00, true, propietario,null,true,false,false);
        Departamento departamento = new Departamento("DEPTO1", "CARRASCO", 123, 50, 3,2, 'b',"Ramos Mejia", 10000.00, true,propietario,null,true,false,false);
        PH ph = new PH("PH1", "CARRASCO", 123, 50, 3, "Lomas del Mirador", 13000.00, true,propietario,null,true,false,false);
        Campo campo = new Campo("CAMPO1", "CARRASCO", 123, 50, 3,"Lujan",50.0, 100000.00, true,propietario,null,true,false,false);
        Terreno terreno = new Terreno("TERRENO1", "CARRASCO", 123, 50, 3, "Chivilcoy", 25000.00, true, propietario,null,true,false,false);
        

		inmobiliaria.addPropiedad(casa);
		inmobiliaria.addPropiedad(departamento);
		inmobiliaria.addPropiedad(ph);
		inmobiliaria.addPropiedad(campo);
		inmobiliaria.addPropiedad(terreno);
		
		
		mostrarPropiedades(inmobiliaria.getPropiedades());

		    
		}
	

	private static void mostrarPropiedades(ArrayList<Propiedad> propiedades) {
        for (Propiedad propiedad : propiedades) {
            System.out.println(propiedad.toString());
        }
    }   

	private static void modificarPropiedad(Inmobiliaria inmobiliaria){
		
		  			    
			   System.out.print("Ingrese el código de la propiedad que desea modificar: ");
			    String codigo = teclado.next(); 
			    
			    Propiedad propiedadAModificar = inmobiliaria.buscarPropiedadPorCodigo(codigo);
			    
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
				    
				    System.out.print("Ingrese el nombre del propietario: ");
			    	Cliente propietario = new Cliente(12345677,"pepo","argento");
			    	propiedadAModificar.setPropietario(propietario);

			        System.out.println("Propiedad modificada exitosamente.");
			    } else {
			        System.out.println("No se encontró ninguna propiedad con el código ingresado.");
			    }
			    
			    mostrarPropiedades(inmobiliaria.getPropiedades());

	   }
	
	
	private static void agregarCliente(Inmobiliaria inmobiliaria) {
		Cliente cliente1 = new Cliente(12345678,"gian","pretto");
		 
		 inmobiliaria.addCliente(cliente1);
		 
		 for (Cliente cliente : inmobiliaria.getClientes()) {
	            System.out.println(cliente.toString());
	        }
	        
	    }
		
	
	private static void mostrarPropiedadesPorPrecio(Inmobiliaria inmobiliaria) throws SinResultadosException {
		ArrayList<Propiedad> propiedadesOrdenadasPrecio = inmobiliaria.obtenerPropiedadesOrdenadasPorPrecio(10000.00, 20000.00);
		mostrarPropiedades(propiedadesOrdenadasPrecio);
    }
        
	
	
	private static void mostrarPropiedadesPorUbicacion(Inmobiliaria inmobiliaria) throws SinResultadosException {
		ArrayList<Propiedad> propiedadesOrdenadasCiudad = inmobiliaria.obtenerPropiedadesOrdenadasPorUbicacion();
		mostrarPropiedades(propiedadesOrdenadasCiudad);
		
	}
	
	
	private static void buscarPorPrecio(Inmobiliaria inmobiliaria) throws SinResultadosException {
		System.out.print("Ingrese el precio Minimo ");
	    Double precioMinimo = teclado.nextDouble();
	    
	    System.out.print("Ingrese el precio Maximo(Debe ser mayor al minimo): ");
	    Double precioMaximo = teclado.nextDouble();
		
	    ArrayList<Propiedad> propiedadesEnRangoPrecio = inmobiliaria.buscarPropiedadesPorRangoDePrecio(precioMinimo,precioMaximo);
	    mostrarPropiedades(propiedadesEnRangoPrecio);
	}
	
	private static void buscarPorUbicacion(Inmobiliaria inmobiliaria) throws SinResultadosException {
		System.out.print("Ingrese la ciudad por la que desea filtrar: ");
	    String ciudad = teclado.next();
		
	    ArrayList<Propiedad> propiedadesEnUbicacion = inmobiliaria.buscarPropiedadesPorUbicacion(ciudad);
	    mostrarPropiedades(propiedadesEnUbicacion);
		
	}


	private static void buscarPorVentaOAlquiler(Inmobiliaria inmobiliaria) throws SinResultadosException {
		System.out.print("Ingrese si desea filtrar por Propiedades en Venta o Alquiler(Escriba VENTA o ALQUILER): ");
	    String operacion = teclado.next();
	    		
	    ArrayList<Propiedad> propiedadesPorOperacion = inmobiliaria.buscarPropiedadesPorOperacion(operacion);
	    mostrarPropiedades(propiedadesPorOperacion);
		
	}


	

	private static void realizarAlquiler(Inmobiliaria inmobiliaria) {
		System.out.print("Ingrese el codigo de la propiedad ");
		String codigoPropiedad = teclado.next();
		Cliente inquilino = new Cliente(12345666,"rafael","perez");
		
		Propiedad propiedadAAlquilar = inmobiliaria.buscarPropiedadPorCodigo(codigoPropiedad);
		
		 inmobiliaria.alquilarPropiedad(propiedadAAlquilar,inquilino);

				
			}





	private static void realizarVenta(Inmobiliaria inmobiliaria) {
		System.out.print("Ingrese el codigo de la propiedad ");
		String codigoPropiedad = teclado.next();
		Cliente propietarioNuevo = new Cliente(12345676,"tadeo","barcia");
		
		Propiedad propiedadAVender = inmobiliaria.buscarPropiedadPorCodigo(codigoPropiedad);
		inmobiliaria.venderPropiedad(propiedadAVender,propietarioNuevo);

				
		}
	
	private static void realizarPermuta(Inmobiliaria inmobiliaria) {
		System.out.print("Ingrese el codigo de la propiedad A");
		String codigoPropiedadA = teclado.next();
		System.out.print("Ingrese el codigo de la propiedad A");
		String codigoPropiedadB = teclado.next();		
		
		Propiedad propiedadAPermutarA = inmobiliaria.buscarPropiedadPorCodigo(codigoPropiedadA);
		Propiedad propiedadAPermutarB = inmobiliaria.buscarPropiedadPorCodigo(codigoPropiedadB);
		inmobiliaria.permutarPropiedades(propiedadAPermutarA,propiedadAPermutarB);
		
	}

			
	
}