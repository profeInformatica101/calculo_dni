/**
 * 
 */
package com.endes;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class ControladorDNITest {

	ControladorDNI controlador;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeAll");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("@BeforeEach");
		controlador = new ControladorDNI();
	}
	
	// Prueba para verificar que el calculo de la letra del DNI es correcto
	@Test
	@DisplayName("Prueba de dni valido")
	void testEsValidoDNI() {
		// Caso de prueba válido
		String dniCorrecto = "11111111H";
		assertTrue(controlador.esValido(dniCorrecto));
	
	}

	@Test
	@DisplayName("Validación de entradas con letra incorrecta")
	void testEsFalsoDNI() {
		String dniFalso = "11111111R";
		
		assertFalse(controlador.esValido(dniFalso));
	}
	
	/** Prueba para manejar las entradas nulas, longitud incorrecta y caracteres invalidos*/
	@Test
	@DisplayName("Validación de entradas nulas")
	void testEsValido_DNIEntradasInvalidas() {
		assertFalse(controlador.esValido(null), "Un DNI nulo fue reconocido como valido");
	}
	
	@Test
	@DisplayName("Un dni demasiado corto")
	void testDNIcorto() {
		assertFalse(controlador.esValido("111111H"), "El DNI es demasiado corto y fue reconocido como valido");
	}
	
	
	
	@Test
	@DisplayName("DNI con caracteres no númericos")
	void testDNIconCaracteresNoNumericos() {
		assertFalse(controlador.esValido("sdfñasdfl"));
	}
	
	
}
