package ar.edu.unlam.pb2;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.Test;



public class TestInmobiliaria {

    @Test
    public void testDarDeAltaCasa() throws UmbralMinimoNoAlcanzadoException {
        //Preparacion
        Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");

        Cliente propietario = new Cliente (1,"pepe","argento");
        
        
        Casa casa = new Casa("CASA1", "CARRASCO", 123, 50, 3, "San Justo", 18000.00, true, propietario,null,false,false,false);

        //Ejecucion
        inmobiliaria.addPropiedad(casa);

        boolean casaEncontrada = false;
        for (Propiedad c : inmobiliaria.getPropiedades()) {
            if (c.equals(casa)) {
                casaEncontrada = true;
                break;
            }
        }
        //Validacion
        assertTrue(casaEncontrada);
    }


    @Test
	public void queSePuedanDarDeAltaDosCasasEnLaInmobiliaria() throws UmbralMinimoNoAlcanzadoException {
	    //Preparacion
	    Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
	
	    Cliente propietario = new Cliente (1,"pepe","argento");
	    
	    
	    Casa casa1 = new Casa("CASA1", "CARRASCO", 123, 50, 3, "San Justo", 18000.00, true, propietario, null,false,false,false);
	 
	    Casa casa2 = new Casa("CASA2", "CARRASCO", 523, 50, 3, "San Justo", 19000.00, true, propietario,null,false,false,false);
	
	    //Ejecucion
	    inmobiliaria.addPropiedad(casa1);
	    inmobiliaria.addPropiedad(casa2);
	    
	    int casasNoNulas = 0;
	    for (Propiedad casa : inmobiliaria.getPropiedades()) {
	        if (casa != null) {
	            casasNoNulas++;
	        }
	    }
	    //Validacion
	    assertEquals(2, casasNoNulas);	   
	}
    
//    @Test ***No se puede realizar con ArrayList, deberia ser un HashSet Y pasarle como HashCode la calle y el numero
//			***Ademas se contradice con la consigna del punto 1.a. donde dice que las propiedades pueden ser repetidas 
//    		***pero con distinto precio
//	public void queNoSePuedanDarDeAltaDosCasasConUnaMismaDireccion() {
//	    
//	    Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
//	
//	    Propietario propietario = Propietario.fromString("12345678,Tadeo,Garcia");
//	//    Inquilino inquilino = inquilino.fromString("12345678,Nicolas,Labriola");
//	    
//	    
//	    Casa casa1 = new Casa("CASA1", "CARRASCO", 123, 50, 3, "San Justo", 18000.00, true, propietario);
//	 
//	    Casa casa2 = new Casa("CASA2", "CARRASCO", 123, 50, 3, "San Justo", 19000.00, true, propietario);
//	
//	     inmobiliaria.addPropiedad(casa1);
//	    
//	    boolean resultado = inmobiliaria.addPropiedad(casa2);
//
//       
//        assertFalse(resultado);	   
//	}


	@Test
	public void testDarDeAltaDepto() throws UmbralMinimoNoAlcanzadoException {
	    //Preparacion
	    Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
	    Cliente propietario = new Cliente (1,"pepe","argento");
	    
	    Departamento depto = new Departamento("DEPTO1", "CARRASCO", 123, 50, 3,2, 'b', "San Justo", 18000.00, true, propietario,null,false,false,false);
	
	    //Ejecucion
	    inmobiliaria.addPropiedad(depto);
	
	    boolean deptoEncontrado = false;
	    for (Propiedad d : inmobiliaria.getPropiedades()) {
	        if (d.equals(depto)) {
	            deptoEncontrado = true;
	            break;
	        }
	    }
	    //Validacion
	    assertTrue(deptoEncontrado);
	}


	@Test
	public void queSePuedanDarDeAltaDosDeptosEnLaInmobiliaria() throws UmbralMinimoNoAlcanzadoException {
	    //Preparacion
	    Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
	
	    Cliente propietario = new Cliente (1,"pepe","argento");
	    
	    
	    Departamento depto1 = new Departamento("DEPTO1", "CARRASCO", 123, 50, 3,2, 'b',"San Justo", 18000.00, true, propietario,null,false,false,false);
	    Departamento depto2 = new Departamento("DEPTO2", "CATANIA", 123, 50, 3,2, 'b',"San Justo", 18000.00, true, propietario,null,false,false,false);
	
	    //Ejecucion
	    inmobiliaria.addPropiedad(depto1);
	    inmobiliaria.addPropiedad(depto2);
	    
	    int deptosNoNulos = 0;
	    for (Propiedad depto : inmobiliaria.getPropiedades()) {
	        if (depto != null) {
	        	deptosNoNulos++;
	        }
	    }
	    //Validacion
	    assertEquals(2, deptosNoNulos);	   
	}

//  @Test ***No se puede realizar con ArrayList, deberia ser un HashSet Y pasarle como HashCode la calle y el numero
//		  ***Ademas se contradice con la consigna del punto 1.a. donde dice que las propiedades pueden ser repetidas 
//  	  ***pero con distinto precio
//        
//	public void queNoSePuedanDarDeAltaDosDeptosConUnaMismaDireccion() {
//	    
//	    Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
//	
//	    
//	    
//	    Departamento depto1 = new Departamento("DEPTO1", "CARRASCO", 123, 50, 3,2, 'b',"San Justo", 18000.00, true, propietario);
//	    Departamento depto2 = new Departamento("DEPTO2", "CARRASCO", 123, 50, 3,2, 'b',"San Justo", 18000.00, true, propietario);
//	
//	    inmobiliaria.addPropiedad(depto1);
//	    
//	    boolean resultado = inmobiliaria.addPropiedad(depto2);
//	
//	   
//	    assertFalse(resultado);	   
//	}
	
	@Test
	public void queSePuedaObtenerElValorPromedioDeLasCasas() throws UmbralMinimoNoAlcanzadoException {
		//Preparacion
		Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
		
		Cliente propietario = new Cliente (1,"pepe","argento");
		
	    Casa casa1 = new Casa("CASA1", "CARRASCO", 123, 50, 3, "San Justo", 15000.00, true, propietario,null,false,false,false);
		 
	    Casa casa2 = new Casa("CASA2", "CARRASCO", 523, 50, 3, "San Justo", 10000.00, true, propietario,null,false,false,false);
	    
	    Casa casa3 = new Casa("CASA3", "CATANIA", 768, 50, 3, "San Justo", 20000.00, true, propietario,null,false,false,false);
	
	    //Ejecucion
	    inmobiliaria.addPropiedad(casa1);
	    inmobiliaria.addPropiedad(casa2);
	    inmobiliaria.addPropiedad(casa3);
	    
	    double valorPromedio = inmobiliaria.obtenerValorPromedioPropiedades();
	    
	    //Validacion
	    double valorEsperado = (casa1.getPrecio() + casa2.getPrecio() + casa3.getPrecio()) / 3.0;
        assertEquals(valorEsperado, valorPromedio, 0.001); 
		
	}

	@Test
	public void queSePuedaObtenerElValorPromedioDeLosDepartamentos() throws UmbralMinimoNoAlcanzadoException {
		//Preparacion
		Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
		
		Cliente propietario = new Cliente (1,"pepe","argento");
		
	    Departamento depto1 = new Departamento("DEPTO1", "CARRASCO", 123, 50, 3,2, 'b',"San Justo", 10000.00, true, propietario,null,false,false,false);
	    Departamento depto2 = new Departamento("DEPTO2", "CATANIA", 723, 50, 3,2, 'b',"San Justo", 20000.00, true, propietario,null,false,false,false);
	    Departamento depto3 = new Departamento("DEPTO3", "PATRON", 623, 50, 3,2, 'b',"San Justo", 15000.00, true, propietario,null,false,false,false);
	    Departamento depto4 = new Departamento("DEPTO4", "VARELA", 323, 50, 3,2, 'b',"San Justo", 11000.00, true, propietario,null,false,false,false);
	
	    //Ejecucion
	    inmobiliaria.addPropiedad(depto1);
	    inmobiliaria.addPropiedad(depto2);
	    inmobiliaria.addPropiedad(depto3);
	    inmobiliaria.addPropiedad(depto4);
	    
	    double valorPromedio = inmobiliaria.obtenerValorPromedioPropiedades();
	    
	    //Validacion
	    double valorEsperado = (depto1.getPrecio() + depto2.getPrecio() + depto3.getPrecio() + depto4.getPrecio()) / 4.0;
        assertEquals(valorEsperado, valorPromedio, 0.001); 
		
	}
	
	
	
	@Test
	public void queLaBusquedaDePropiedadesPorVentaMeArrojeUnaLista() throws SinResultadosException, UmbralMinimoNoAlcanzadoException {
	     // Preparacion
		Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
		Cliente propietario = new Cliente (1,"pepe","argento");
        Casa casa = new Casa("CASA1", "CARRASCO", 123, 50, 3, "San Justo", 15000.00, true, propietario,null,true,false,false);
        Departamento departamento = new Departamento("DEPTO1", "CARRASCO", 123, 50, 3,2, 'b',"San Justo", 10000.00, true, propietario,null,true,false,false);
        
        //Ejecucion
        inmobiliaria.addPropiedad(casa);
        inmobiliaria.venderPropiedad(casa, propietario);
        inmobiliaria.addPropiedad(departamento);
        inmobiliaria.venderPropiedad(departamento, propietario);
        
        
        ArrayList<Propiedad> propiedadesVendidas = inmobiliaria.buscarPropiedadesPorVenta();
        
       
        //Validacion
       assertNotNull(propiedadesVendidas);
    }
	
	
	@Test
	public void queLaBusquedaDePropiedadesPorVentaMeArrojeUnaListaNuloSiNoAplicanResultados() throws SinResultadosException, UmbralMinimoNoAlcanzadoException {
		 // Preparacion
		Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
		Cliente propietario = new Cliente (1,"pepe","argento");
        Casa casa = new Casa("CASA1", "CARRASCO", 123, 50, 3, "San Justo", 15000.00, true, propietario,null,false,false,false);
        Departamento departamento = new Departamento("DEPTO1", "CARRASCO", 123, 50, 3,2, 'b',"San Justo", 10000.00, true, propietario,null,false,false,false);
        
        //Ejecucion
        inmobiliaria.addPropiedad(casa);
        inmobiliaria.addPropiedad(departamento);
        
        ArrayList<Propiedad> propiedadesVendidas = inmobiliaria.buscarPropiedadesPorVenta();
        
        //Validacion
       assertTrue(propiedadesVendidas.isEmpty());
	}
	
	
	@Test
	public void queSePuedaAgregarUnaCasaYLaDimensionDelArraySeaLaMinimaPosible() throws UmbralMinimoNoAlcanzadoException {
		//Preparacion
		final Integer DIMENSION_ARRAY_ESPERADA = 1;
		
		Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
		
		Cliente propietario = new Cliente (1,"pepe","argento");
		
		 Casa casa1 = new Casa("CASA1", "CARRASCO", 123, 50, 3, "San Justo", 15000.00, true, propietario,null,false,false,false);
		 
		 //Ejecucion
		 inmobiliaria.addPropiedad(casa1);
		 
		 //Validacion
		 assertEquals(DIMENSION_ARRAY_ESPERADA, (Integer)inmobiliaria.getPropiedades().size());
		
	}
	
	
	
	@Test
	public void queSePuedaAgregar3CasasYElTamanioDelArraySea3() throws UmbralMinimoNoAlcanzadoException {
		//Preparacion
		final Integer DIMENSION_ARRAY_ESPERADA = 3;
		
		Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
		
		Cliente propietario = new Cliente (1,"pepe","argento");
		
		 Casa casa1 = new Casa("CASA1", "CARRASCO", 123, 50, 3, "San Justo", 15000.00, true, propietario,null,false,false,false);
		 
		 Casa casa2 = new Casa("CASA2", "CARRASCO", 523, 50, 3, "San Justo", 18000.00, true, propietario,null,false,false,false);
		    
		 Casa casa3 = new Casa("CASA3", "CATANIA", 768, 50, 3, "San Justo", 20000.00, true, propietario,null,false,false,false);
		    
		 
		 //Ejecucion
		 inmobiliaria.addPropiedad(casa1);
		 inmobiliaria.addPropiedad(casa2);
		 inmobiliaria.addPropiedad(casa3);
		 
		 
		 //Validacion
		 assertEquals(DIMENSION_ARRAY_ESPERADA, (Integer)inmobiliaria.getPropiedades().size());
		
	}
	
	@Test
	public void queSePuedaAgregarUnClienteALaInmobiliaria() {
		//Preparacion
		final Integer DIMENSION_ARRAY_ESPERADA = 1;
		
		Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
		
		
		 Cliente cliente1 = new Cliente(12345678,"gian","pretto");
		 
		 //Ejecucion
		 inmobiliaria.addCliente(cliente1);
		 
		 //Validacion
		 assertEquals(DIMENSION_ARRAY_ESPERADA, (Integer)inmobiliaria.getClientes().size());
		 
		
	}
	
	@Test
	public void queSePuedaAgregar3ClientesYElTamanioDelArraySea3() {
		//Preparacion
		final Integer DIMENSION_ARRAY_ESPERADA = 3;		
		Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
				
				
		Cliente cliente1 = new Cliente(1,"gian","pretto");
		Cliente cliente2 = new Cliente(2,"giann","prettoo");
		Cliente cliente3 = new Cliente(3,"diego","pretti");
				 
		//Ejecucion
		inmobiliaria.addCliente(cliente1);
		inmobiliaria.addCliente(cliente2);
		inmobiliaria.addCliente(cliente3);
			 
		//Validacion
		assertEquals(DIMENSION_ARRAY_ESPERADA, (Integer)inmobiliaria.getClientes().size());
		
	}
	
	@Test
	public void queNoSePuedanAgregarDosClientesConMismoDni() {
		//Preparacion
		final Integer DIMENSION_ARRAY_ESPERADA = 2;		
		Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
				
				
		Cliente cliente1 = new Cliente(1,"Nombre1", "Apellido1");		
		Cliente cliente2 = new Cliente(2,"Nombre2", "Apellido2");
		Cliente cliente3 = new Cliente(2,"Nombre2", "Apellido2");

		
		
		//Ejecucion
		inmobiliaria.addCliente(cliente1);
		
		inmobiliaria.addCliente(cliente2);
		
		inmobiliaria.addCliente(cliente3);
		
		
		HashSet<Cliente> clientes = inmobiliaria.getClientes();	
		System.out.println("Tamaño del HashSet después de agregar cliente: " + clientes.size());
		//Validacion
		assertEquals(DIMENSION_ARRAY_ESPERADA, (Integer)inmobiliaria.getClientes().size());
		
	}

	@Test
	public void queSePuedaRealizarLaVentaDeUnaPropiedad() throws UmbralMinimoNoAlcanzadoException {
		//Preparacion
			
		Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
		Cliente propietario = new Cliente (1,"pepe","argento");
		
		Cliente propietarioNuevo = new Cliente (2,"patricio","rey");
		
		 Casa casa1 = new Casa("CASA1", "CARRASCO", 123, 50, 3, "San Justo", 15000.00, false, propietario,null,false,false,false);

		
		
		//Ejecucion
		 inmobiliaria.addPropiedad(casa1);
		inmobiliaria.venderPropiedad(casa1, propietarioNuevo);
				
		//Validacion
		assertEquals(false, casa1.getEstaDisponible());
		assertEquals(true, casa1.getEsVenta());
		assertEquals(propietarioNuevo, casa1.getPropietario());
		
	}
	
	@Test
	public void queSePuedaRealizarElAlquilerDeUnaPropiedad() throws UmbralMinimoNoAlcanzadoException {
		//Preparacion
			
		Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
		Cliente propietario = new Cliente (1,"pepe","argento");
		
		Cliente inquilinoNuevo = new Cliente (2,"patricio","rey");
		
		 Casa casa1 = new Casa("CASA1", "CARRASCO", 123, 50, 3, "San Justo", 15000.00, true, propietario,null,false,false,false);

		
		
		//Ejecucion
		 inmobiliaria.addPropiedad(casa1);
		inmobiliaria.alquilarPropiedad(casa1, inquilinoNuevo);
				
		//Validacion
		assertEquals(false, casa1.getEstaDisponible());
		assertEquals(true, casa1.getEsAlquiler());
		assertEquals(inquilinoNuevo, casa1.getInquilino());
		
	}
	
	@Test
	public void queSePuedaRealizarLaPermutaDeDosPropiedades() throws UmbralMinimoNoAlcanzadoException {
		//Preparacion
			
		Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
		Cliente propietarioA = new Cliente (1,"pepe","argento");
		
		Cliente propietarioB = new Cliente (2,"patricio","rey");
		
		 Casa casa1 = new Casa("CASA1", "CARRASCO", 123, 50, 3, "San Justo", 15000.00, true, propietarioA,null,false,false,false);
		 
		 Departamento depto1 = new Departamento("DEPTO1", "CARRASCO", 123, 50, 3,2, 'b', "San Justo", 18000.00, true, propietarioB,null,false,false,false);

		
		
		//Ejecucion
		 inmobiliaria.addPropiedad(casa1);
		 inmobiliaria.addPropiedad(depto1);
		inmobiliaria.permutarPropiedades(casa1, depto1);
				
		//Validacion		
		assertEquals(propietarioA, depto1.getPropietario());
		assertEquals(propietarioB, casa1.getPropietario());
		
	}

	@Test public void queSePuedaRealizarLaBusquedaDeCasasPorRangoDePreciosYElResultadoEsteOrdenadoPorPrecio() throws SinResultadosException, UmbralMinimoNoAlcanzadoException {
		Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
		
		Cliente propietario = new Cliente (1,"pepe","argento");
		
	    Casa casa1 = new Casa("CASA1", "CARRASCO", 123, 50, 3, "San Justo", 15000.00, true, propietario,null,false,false,false);
		 
	    Casa casa2 = new Casa("CASA2", "CARRASCO", 523, 50, 3, "San Justo", 18000.00, true, propietario,null,false,false,false);
	    
	    Casa casa3 = new Casa("CASA3", "CATANIA", 768, 50, 3, "San Justo", 20000.00, true, propietario,null,false,false,false);
	
	    //Ejecucion
	    inmobiliaria.addPropiedad(casa1);
	    inmobiliaria.addPropiedad(casa2);
	    inmobiliaria.addPropiedad(casa3);
	    
	    ArrayList<Propiedad> resultado = inmobiliaria.obtenerPropiedadesOrdenadasPorPrecio(10000.00,20000.00);
	    
	    //Validacion 
	    assertTrue(estaOrdenadoPorPrecio(resultado));
	}
	
	@Test public void queSePuedaRealizarLaBusquedaDeCasasPorUbicacionYElResultadoEsteOrdenadoPorUbicacion() throws SinResultadosException, UmbralMinimoNoAlcanzadoException {
		Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
		
		Cliente propietario = new Cliente (1,"pepe","argento");
		
	    Casa casa1 = new Casa("CASA1", "CARRASCO", 123, 50, 3, "Ramos Mejia", 15000.00, true, propietario,null,false,false,false);
		 
	    Casa casa2 = new Casa("CASA2", "CARRASCO", 523, 50, 3, "San Justo", 18000.00, true, propietario,null,false,false,false);
	    
	    Casa casa3 = new Casa("CASA3", "CATANIA", 768, 50, 3, "San Justo", 20000.00, true, propietario,null,false,false,false);
	
	    //Ejecucion
	    inmobiliaria.addPropiedad(casa1);
	    inmobiliaria.addPropiedad(casa2);
	    inmobiliaria.addPropiedad(casa3);
	    
	    ArrayList<Propiedad> resultado = inmobiliaria.obtenerPropiedadesOrdenadasPorUbicacion();
	    		
	    
	    //Validacion 
	    assertTrue(estaOrdenadoPorUbicacion(resultado));
	    
	}


	



	@Test public void queSePuedaRealizarLaBusquedaDeDepartamentosPorRangoDePreciosYElResultadoEsteOrdenadoPorPrecio() throws SinResultadosException, UmbralMinimoNoAlcanzadoException {
		Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
		
		Cliente propietario = new Cliente (1,"pepe","argento");
		
	    Departamento depto1 = new Departamento("DEPTO1", "CARRASCO", 123, 50, 3,2, 'b',"Ramos Mejia", 10000.00, true, propietario,null,false,false,false);
	    Departamento depto2 = new Departamento("DEPTO2", "CATANIA", 723, 50, 3,2, 'b',"San Justo", 20000.00, true, propietario,null,false,false,false);
	    Departamento depto3 = new Departamento("DEPTO3", "PATRON", 623, 50, 3,2, 'b',"San Justo", 15000.00, true, propietario,null,false,false,false);
	
	    Double precioMinimo = 10000.00;
	    Double precioMaximo = 20000.00;
	    
	    //Ejecucion
	    inmobiliaria.addPropiedad(depto1);
	    inmobiliaria.addPropiedad(depto2);
	    inmobiliaria.addPropiedad(depto3);
	    
	    ArrayList<Propiedad> resultado = inmobiliaria.obtenerPropiedadesOrdenadasPorPrecio(precioMinimo,precioMaximo);;
	    
	    //Validacion 
	    assertTrue(estaOrdenadoPorPrecio(resultado));
	    
	}
	
	@Test public void queSePuedaRealizarLaBusquedaDeDepartamentosPorUbicacionYElResultadoEsteOrdenadoPorUbicacion() throws SinResultadosException, UmbralMinimoNoAlcanzadoException {
		Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
		
		Cliente propietario = new Cliente (1,"pepe","argento");
		
	    Casa casa1 = new Casa("CASA1", "CARRASCO", 123, 50, 3, "Ramos Mejia", 15000.00, true, propietario,null,false,false,false);
		 
	    Casa casa2 = new Casa("CASA2", "CARRASCO", 523, 50, 3, "San Justo", 18000.00, true, propietario,null,false,false,false);
	    
	    Casa casa3 = new Casa("CASA3", "CATANIA", 768, 50, 3, "San Justo", 20000.00, true, propietario,null,false,false,false);
	
	    
	    
	    //Ejecucion
	    inmobiliaria.addPropiedad(casa1);
	    inmobiliaria.addPropiedad(casa2);
	    inmobiliaria.addPropiedad(casa3);
	    
	    
	    
	    ArrayList<Propiedad> resultado = inmobiliaria.obtenerPropiedadesOrdenadasPorUbicacion();
	    
	    //Validacion 
	    assertTrue(estaOrdenadoPorUbicacion(resultado));
	   
	}
	
	private boolean estaOrdenadoPorUbicacion(ArrayList<Propiedad> propiedades) {
		Propiedad anterior = null;
        for (Propiedad actual : propiedades) {
            if (anterior != null && anterior.getCiudad().compareTo(actual.getCiudad()) > 0) {
                return false;
            }
            anterior = actual;
        }		
		return true;
	}
	
	private Boolean estaOrdenadoPorPrecio(ArrayList<Propiedad> propiedades) {
		Propiedad anterior = null;
        for (Propiedad actual : propiedades) {
            if (anterior != null && anterior.getPrecio() > actual.getPrecio()) {
                return false;
            }
            anterior = actual;
        }		
		return true;
	}
	
	
	@Test (expected = SinResultadosException.class)
	public void  queAlBuscarPorUnCriterioQueNoArrojeResultadosSeProduzcaLaExcepcionSinResultadosException() throws SinResultadosException, UmbralMinimoNoAlcanzadoException{
		Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
		Cliente propietario = new Cliente (1,"pepe","argento");
		
	    Casa casa1 = new Casa("CASA1", "CARRASCO", 123, 50, 3, "Ramos Mejia", 15000.00, true, propietario,null,false,false,false);
		 
	    Casa casa2 = new Casa("CASA2", "CARRASCO", 523, 50, 3, "San Justo", 18000.00, true, propietario,null,false,false,false);
        
	    
	   //Ejecucion
	    inmobiliaria.addPropiedad(casa1);
	    inmobiliaria.addPropiedad(casa2);
	    
	    inmobiliaria.buscarPropiedadesPorRangoDePrecio(200000.00, 300000.00);

	}
	
	
	@Test (expected = UmbralMinimoNoAlcanzadoException.class)
	public void  queAlIntentarGuardarUnaPropiedadParaLaVentaCuyoImporteEstaPorDebajoDelUmbral10000SeArrojeLaExcepcionUmbralMinimoNoAlcanzadoException() throws UmbralMinimoNoAlcanzadoException, SinResultadosException{
		Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
		Cliente propietario = new Cliente (1,"pepe","argento");
		
	    Casa casa1 = new Casa("CASA1", "CARRASCO", 123, 50, 3, "Ramos Mejia", 15000.00, true, propietario,null,false,false,false);
		 
	    Casa casa2 = new Casa("CASA2", "CARRASCO", 523, 50, 3, "San Justo", 8000.00, true, propietario,null,false,false,false);
        
	    
	   //Ejecucion
	    inmobiliaria.addPropiedad(casa1);
	    inmobiliaria.addPropiedad(casa2);
	    
	    inmobiliaria.buscarPropiedadesPorRangoDePrecio(0.00, 300000.00);

	}
	


}

