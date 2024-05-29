package ar.edu.unlam.pb2;
import static org.junit.Assert.*;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.Test;



public class TestInmobiliaria {

    @Test
    public void testDarDeAltaCasa() {
        //Preparacion
        Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");

        String propietario = "pepe";
        
        
        Casa casa = new Casa("CASA1", "CARRASCO", 123, 50, 3, "San Justo", 18000.00, true, propietario,"",false,false,false);

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
	public void queSePuedanDarDeAltaDosCasasEnLaInmobiliaria() {
	    //Preparacion
	    Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
	
	    String propietario = "pepe";
	    
	    
	    Casa casa1 = new Casa("CASA1", "CARRASCO", 123, 50, 3, "San Justo", 18000.00, true, propietario, "",false,false,false);
	 
	    Casa casa2 = new Casa("CASA2", "CARRASCO", 523, 50, 3, "San Justo", 19000.00, true, propietario,"",false,false,false);
	
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
	public void testDarDeAltaDepto() {
	    //Preparacion
	    Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
	    String propietario = "pepe";
	    
	    Departamento depto = new Departamento("DEPTO1", "CARRASCO", 123, 50, 3,2, 'b', "San Justo", 18000.00, true, propietario,"",false,false,false);
	
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
	public void queSePuedanDarDeAltaDosDeptosEnLaInmobiliaria() {
	    //Preparacion
	    Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
	
	    String propietario = "pepe";
	    
	    
	    Departamento depto1 = new Departamento("DEPTO1", "CARRASCO", 123, 50, 3,2, 'b',"San Justo", 18000.00, true, propietario,"",false,false,false);
	    Departamento depto2 = new Departamento("DEPTO2", "CATANIA", 123, 50, 3,2, 'b',"San Justo", 18000.00, true, propietario,"",false,false,false);
	
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
	public void queSePuedaObtenerElValorPromedioDeLasCasas() {
		//Preparacion
		Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
		
	    String propietario = "pepe";
		
	    Casa casa1 = new Casa("CASA1", "CARRASCO", 123, 50, 3, "San Justo", 15000.00, true, propietario,"",false,false,false);
		 
	    Casa casa2 = new Casa("CASA2", "CARRASCO", 523, 50, 3, "San Justo", 10000.00, true, propietario,"",false,false,false);
	    
	    Casa casa3 = new Casa("CASA3", "CATANIA", 768, 50, 3, "San Justo", 20000.00, true, propietario,"",false,false,false);
	
	    //Ejecucion
	    inmobiliaria.addPropiedad(casa1);
	    inmobiliaria.addPropiedad(casa2);
	    inmobiliaria.addPropiedad(casa3);
	    
	    double valorPromedio = inmobiliaria.obtenerValorPromedioCasas();
	    
	    //Validacion
	    double valorEsperado = (casa1.getPrecio() + casa2.getPrecio() + casa3.getPrecio()) / 3.0;
        assertEquals(valorEsperado, valorPromedio, 0.001); 
		
	}

	@Test
	public void queSePuedaObtenerElValorPromedioDeLosDepartamentos() {
		//Preparacion
		Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
		
	    String propietario = "pepe";
		
	    Departamento depto1 = new Departamento("DEPTO1", "CARRASCO", 123, 50, 3,2, 'b',"San Justo", 10000.00, true, propietario,"",false,false,false);
	    Departamento depto2 = new Departamento("DEPTO2", "CATANIA", 723, 50, 3,2, 'b',"San Justo", 20000.00, true, propietario,"",false,false,false);
	    Departamento depto3 = new Departamento("DEPTO3", "PATRON", 623, 50, 3,2, 'b',"San Justo", 15000.00, true, propietario,"",false,false,false);
	    Departamento depto4 = new Departamento("DEPTO4", "VARELA", 323, 50, 3,2, 'b',"San Justo", 11000.00, true, propietario,"",false,false,false);
	
	    //Ejecucion
	    inmobiliaria.addPropiedad(depto1);
	    inmobiliaria.addPropiedad(depto2);
	    inmobiliaria.addPropiedad(depto3);
	    inmobiliaria.addPropiedad(depto4);
	    
	    double valorPromedio = inmobiliaria.obtenerValorPromedioDepartamentos();
	    
	    //Validacion
	    double valorEsperado = (depto1.getPrecio() + depto2.getPrecio() + depto3.getPrecio() + depto4.getPrecio()) / 4.0;
        assertEquals(valorEsperado, valorPromedio, 0.001); 
		
	}
	
	@Test
	public void queLaBusquedaPorRangoDePrecioDeMeArrojeUnArrayNoNuloSiAplicanResultados() {
		//Preparacion
		Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
		
	    String propietario = "pepe";
		
	    Casa casa1 = new Casa("CASA1", "CARRASCO", 123, 50, 3, "San Justo", 15000.00, true, propietario,"",false,false,false);
		 
	    Casa casa2 = new Casa("CASA2", "CARRASCO", 523, 50, 3, "San Justo", 8000.00, true, propietario,"",false,false,false);
	    
	    Casa casa3 = new Casa("CASA3", "CATANIA", 768, 50, 3, "San Justo", 20000.00, true, propietario,"",false,false,false);
	
	    //Ejecucion
	    inmobiliaria.addPropiedad(casa1);
	    inmobiliaria.addPropiedad(casa2);
	    inmobiliaria.addPropiedad(casa3);
	    
	    ArrayList<Casa> casasEnRango = inmobiliaria.buscarCasasPorRangoDePrecio(10000.00,20000.00);
	    
	    //Validacion Verifico que el array no sea nulo
        assertNotNull(casasEnRango); 
		
	}
	
	@Test
	public void queLaBusquedaPorRangoDePrecioDeCasasMeArrojeUnArrayNuloSiNoAplicanResultados() {
		//Preparacion
		Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
		
	    String propietario = "pepe";
		
	    Casa casa1 = new Casa("CASA1", "CARRASCO", 123, 50, 3, "San Justo", 15000.00, true, propietario,"",false,false,false);
		 
	    Casa casa2 = new Casa("CASA2", "CARRASCO", 523, 50, 3, "San Justo", 8000.00, true, propietario,"",false,false,false);
	    
	    Casa casa3 = new Casa("CASA3", "CATANIA", 768, 50, 3, "San Justo", 20000.00, true, propietario,"",false,false,false);
	
	    //Ejecucion
	    inmobiliaria.addPropiedad(casa1);
	    inmobiliaria.addPropiedad(casa2);
	    inmobiliaria.addPropiedad(casa3);
	    
	    ArrayList<Casa> casasEnRango = inmobiliaria.buscarCasasPorRangoDePrecio(1000.00,2000.00);
	    
	    //Validacion
	    //Verifico que el array sea nulo
        assertTrue(casasEnRango.isEmpty()); 
		
	}
	
	
	@Test
	public void queLaBusquedaDePropiedadesPorVentaMeArrojeUnaLista() {
	     // Preparacion
		Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
        Casa casa = new Casa("CASA1", "CARRASCO", 123, 50, 3, "San Justo", 15000.00, true, "pepe","",true,false,false);
        Departamento departamento = new Departamento("DEPTO1", "CARRASCO", 123, 50, 3,2, 'b',"San Justo", 10000.00, true, "pepe","",true,false,false);
        String propietario = "Juan Perez";
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
	public void queLaBusquedaDePropiedadesPorVentaMeArrojeUnaListaNuloSiNoAplicanResultados() {
		 // Preparacion
		Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
        Casa casa = new Casa("CASA1", "CARRASCO", 123, 50, 3, "San Justo", 15000.00, true, "pepe","",false,false,false);
        Departamento departamento = new Departamento("DEPTO1", "CARRASCO", 123, 50, 3,2, 'b',"San Justo", 10000.00, true, "pepe","",false,false,false);
        
        //Ejecucion
        inmobiliaria.addPropiedad(casa);
        inmobiliaria.addPropiedad(departamento);
        
        ArrayList<Propiedad> propiedadesVendidas = inmobiliaria.buscarPropiedadesPorVenta();
        
        //Validacion
       assertTrue(propiedadesVendidas.isEmpty());
	}
	
	
	//***-------------------------Tests de Colecciones---------------------------------------------***
	@Test
	public void queSePuedaAgregarUnaCasaYLaDimensionDelArraySeaLaMinimaPosible() {
		//Preparacion
		final Integer DIMENSION_ARRAY_ESPERADA = 1;
		
		Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
		
		String propietario = "pepe";
		
		 Casa casa1 = new Casa("CASA1", "CARRASCO", 123, 50, 3, "San Justo", 15000.00, true, propietario,"",false,false,false);
		 
		 //Ejecucion
		 inmobiliaria.addPropiedad(casa1);
		 
		 //Validacion
		 assertEquals(DIMENSION_ARRAY_ESPERADA, (Integer)inmobiliaria.getPropiedades().size());
		
	}
	
	
	
	@Test
	public void queSePuedaAgregar3CasasYElTamanioDelArraySea3() {
		//Preparacion
		final Integer DIMENSION_ARRAY_ESPERADA = 3;
		
		Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
		
		String propietario = "pepe";
		
		 Casa casa1 = new Casa("CASA1", "CARRASCO", 123, 50, 3, "San Justo", 15000.00, true, propietario,"",false,false,false);
		 
		 Casa casa2 = new Casa("CASA2", "CARRASCO", 523, 50, 3, "San Justo", 8000.00, true, propietario,"",false,false,false);
		    
		 Casa casa3 = new Casa("CASA3", "CATANIA", 768, 50, 3, "San Justo", 20000.00, true, propietario,"",false,false,false);
		    
		 
		 //Ejecucion
		 inmobiliaria.addPropiedad(casa1);
		 inmobiliaria.addPropiedad(casa2);
		 inmobiliaria.addPropiedad(casa3);
		 
		 
		 //Validacion
		 assertEquals(DIMENSION_ARRAY_ESPERADA, (Integer)inmobiliaria.getPropiedades().size());
		
	}
	
	@Test
	public void queSePuedaAgregarUnClienteYLaDimensionDelArraySeaLaMinimaPosible() {
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
	public void queSiAgrego3ClientesCon2ClientesRepetidosElTamanioDelArrayDebeSer2() {
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


}

