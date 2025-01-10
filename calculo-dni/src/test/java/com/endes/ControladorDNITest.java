/**
 * 
 */
package com.endes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class ControladorDNITest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		//System.out.println("@BeforeAll");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		//.out.println("@BeforeEach");
	}
	
	// Prueba para verificar que el calculo de la letra del DNI es correcto
	@Test
	void testCalcularLetraValida() {
		// Caso de prueba válido
		String numeroDNI = "11111111";
		char letraEsperada = 'H';
		
		
	}


}
