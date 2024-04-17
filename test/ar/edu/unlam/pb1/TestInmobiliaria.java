package ar.edu.unlam.pb1;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestInmobiliaria {

    @Test
    public void testDarDeAltaCasa() {
        
        Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");

        Propietario propietario = Propietario.fromString("12345678,Tadeo,Garcia");
//        Inquilino inquilino = inquilino.fromString("12345678,Nicolas,Labriola");
        
        
        Casa casa = new Casa("CASA1", "CARRASCO", 123, 50, 3, "San Justo", 18000.00, true, propietario);

        
        inmobiliaria.addCasa(casa);

        boolean casaEncontrada = false;
        for (Casa c : inmobiliaria.getCasas()) {
            if (c.equals(casa)) {
                casaEncontrada = true;
                break;
            }
        }
        assertTrue(casaEncontrada);
    }


    @Test
	public void queSePuedanDarDeAltaDosCasasEnLaInmobiliaria() {
	    
	    Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
	
	    Propietario propietario = Propietario.fromString("12345678,Tadeo,Garcia");
	//    Inquilino inquilino = inquilino.fromString("12345678,Nicolas,Labriola");
	    
	    
	    Casa casa1 = new Casa("CASA1", "CARRASCO", 123, 50, 3, "San Justo", 18000.00, true, propietario);
	 
	    Casa casa2 = new Casa("CASA2", "CARRASCO", 523, 50, 3, "San Justo", 19000.00, true, propietario);
	
	    
	    inmobiliaria.addCasa(casa1);
	    inmobiliaria.addCasa(casa2);
	    
	    int casasNoNulas = 0;
	    for (Casa casa : inmobiliaria.getCasas()) {
	        if (casa != null) {
	            casasNoNulas++;
	        }
	    }
	    assertEquals(2, casasNoNulas);	   
	}
    
    @Test
	public void queNoSePuedanDarDeAltaDosCasasConUnaMismaDireccion() {
	    
	    Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
	
	    Propietario propietario = Propietario.fromString("12345678,Tadeo,Garcia");
	//    Inquilino inquilino = inquilino.fromString("12345678,Nicolas,Labriola");
	    
	    
	    Casa casa1 = new Casa("CASA1", "CARRASCO", 123, 50, 3, "San Justo", 18000.00, true, propietario);
	 
	    Casa casa2 = new Casa("CASA2", "CARRASCO", 123, 50, 3, "San Justo", 19000.00, true, propietario);
	
	     inmobiliaria.addCasa(casa1);
	    
	    boolean resultado = inmobiliaria.addCasa(casa2);

       
        assertFalse(resultado);	   
	}


	@Test
	public void testDarDeAltaDepto() {
	    
	    Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
	
	    Propietario propietario = Propietario.fromString("12345678,Tadeo,Garcia");
	//    Inquilino inquilino = inquilino.fromString("12345678,Nicolas,Labriola");
	    
	    
	    Departamento depto = new Departamento("DEPTO1", "CARRASCO", 123, 50, 3,'b', 2,"San Justo", 18000.00, true, propietario);
	
	    
	    inmobiliaria.addDepartamento(depto);
	
	    boolean deptoEncontrado = false;
	    for (Departamento d : inmobiliaria.getDepartamentos()) {
	        if (d.equals(depto)) {
	            deptoEncontrado = true;
	            break;
	        }
	    }
	    assertTrue(deptoEncontrado);
	}


	@Test
	public void queSePuedanDarDeAltaDosDeptosEnLaInmobiliaria() {
	    
	    Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
	
	    Propietario propietario = Propietario.fromString("12345678,Tadeo,Garcia");
	//    Inquilino inquilino = inquilino.fromString("12345678,Nicolas,Labriola");
	    
	    
	    Departamento depto1 = new Departamento("DEPTO1", "CARRASCO", 123, 50, 3,'b', 2,"San Justo", 18000.00, true, propietario);
	    Departamento depto2 = new Departamento("DEPTO2", "CATANIA", 123, 50, 3,'b', 2,"San Justo", 18000.00, true, propietario);
	
	    
	    inmobiliaria.addDepartamento(depto1);
	    inmobiliaria.addDepartamento(depto2);
	    
	    int deptosNoNulos = 0;
	    for (Departamento depto : inmobiliaria.getDepartamentos()) {
	        if (depto != null) {
	        	deptosNoNulos++;
	        }
	    }
	    assertEquals(2, deptosNoNulos);	   
	}

	@Test
	public void queNoSePuedanDarDeAltaDosDeptosConUnaMismaDireccion() {
	    
	    Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
	
	    Propietario propietario = Propietario.fromString("12345678,Tadeo,Garcia");
	//    Inquilino inquilino = inquilino.fromString("12345678,Nicolas,Labriola");
	    
	    
	    Departamento depto1 = new Departamento("DEPTO1", "CARRASCO", 123, 50, 3,'b', 2,"San Justo", 18000.00, true, propietario);
	    Departamento depto2 = new Departamento("DEPTO2", "CARRASCO", 123, 50, 3,'b', 2,"San Justo", 18000.00, true, propietario);
	
	    inmobiliaria.addDepartamento(depto1);
	    
	    boolean resultado = inmobiliaria.addDepartamento(depto2);
	
	   
	    assertFalse(resultado);	   
	}
	
	@Test
	public void queSePuedaObtenerElValorPromedioDeLasCasas() {
		
		Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
		
	    Propietario propietario = Propietario.fromString("12345678,Tadeo,Garcia");
		
	    Casa casa1 = new Casa("CASA1", "CARRASCO", 123, 50, 3, "San Justo", 15000.00, true, propietario);
		 
	    Casa casa2 = new Casa("CASA2", "CARRASCO", 523, 50, 3, "San Justo", 10000.00, true, propietario);
	    
	    Casa casa3 = new Casa("CASA3", "CATANIA", 768, 50, 3, "San Justo", 20000.00, true, propietario);
	
	    
	    inmobiliaria.addCasa(casa1);
	    inmobiliaria.addCasa(casa2);
	    inmobiliaria.addCasa(casa3);
	    
	    double valorPromedio = inmobiliaria.obtenerValorPromedioCasas();
	    
	    double valorEsperado = (casa1.getPrecio() + casa2.getPrecio() + casa3.getPrecio()) / 3.0;
        assertEquals(valorEsperado, valorPromedio, 0.001); 
		
	}

	@Test
	public void queSePuedaObtenerElValorPromedioDeLosDepartamentos() {
		
		Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
		
	    Propietario propietario = Propietario.fromString("12345678,Tadeo,Garcia");
		
	    Departamento depto1 = new Departamento("DEPTO1", "CARRASCO", 123, 50, 3,'b', 2,"San Justo", 10000.00, true, propietario);
	    Departamento depto2 = new Departamento("DEPTO2", "CATANIA", 723, 50, 3,'b', 2,"San Justo", 20000.00, true, propietario);
	    Departamento depto3 = new Departamento("DEPTO3", "PATRON", 623, 50, 3,'b', 2,"San Justo", 15000.00, true, propietario);
	    Departamento depto4 = new Departamento("DEPTO4", "VARELA", 323, 50, 3,'b', 2,"San Justo", 11000.00, true, propietario);
	
	    
	    inmobiliaria.addDepartamento(depto1);
	    inmobiliaria.addDepartamento(depto2);
	    inmobiliaria.addDepartamento(depto3);
	    inmobiliaria.addDepartamento(depto4);
	    
	    double valorPromedio = inmobiliaria.obtenerValorPromedioDepartamentos();
	    
	    double valorEsperado = (depto1.getPrecio() + depto2.getPrecio() + depto3.getPrecio() + depto4.getPrecio()) / 4.0;
        assertEquals(valorEsperado, valorPromedio, 0.001); 
		
	}
	
	@Test
	public void queLaBusquedaPorRangoDePrecioDeMeArrojeUnArrayNoNuloSiAplicanResultados() {
		
		Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
		
	    Propietario propietario = Propietario.fromString("12345678,Tadeo,Garcia");
		
	    Casa casa1 = new Casa("CASA1", "CARRASCO", 123, 50, 3, "San Justo", 15000.00, true, propietario);
		 
	    Casa casa2 = new Casa("CASA2", "CARRASCO", 523, 50, 3, "San Justo", 8000.00, true, propietario);
	    
	    Casa casa3 = new Casa("CASA3", "CATANIA", 768, 50, 3, "San Justo", 20000.00, true, propietario);
	
	    
	    inmobiliaria.addCasa(casa1);
	    inmobiliaria.addCasa(casa2);
	    inmobiliaria.addCasa(casa3);
	    
	    Casa [] casasEnRango = inmobiliaria.buscarCasasPorRangoDePrecio(10000.00,20000.00);
	    
	    //Verifico que el array no sea nulo
        assertNotNull(casasEnRango); 
		
	}
	
	@Test
	public void queLaBusquedaPorRangoDePrecioDeCasasMeArrojeUnArrayNuloSiNoAplicanResultados() {
		
		Inmobiliaria inmobiliaria = new Inmobiliaria("PrettoPaseiro", "Callefalsa 123", "inmobiliariapretto@gmail.com","1512345678");
		
	    Propietario propietario = Propietario.fromString("12345678,Tadeo,Garcia");
		
	    Casa casa1 = new Casa("CASA1", "CARRASCO", 123, 50, 3, "San Justo", 15000.00, true, propietario);
		 
	    Casa casa2 = new Casa("CASA2", "CARRASCO", 523, 50, 3, "San Justo", 8000.00, true, propietario);
	    
	    Casa casa3 = new Casa("CASA3", "CATANIA", 768, 50, 3, "San Justo", 20000.00, true, propietario);
	
	    
	    inmobiliaria.addCasa(casa1);
	    inmobiliaria.addCasa(casa2);
	    inmobiliaria.addCasa(casa3);
	    
	    Casa [] casasEnRango = inmobiliaria.buscarCasasPorRangoDePrecio(1000.00,2000.00);
	    
	    //Verifico que el array sea nulo
        assertNull(casasEnRango); 
		
	}


}

