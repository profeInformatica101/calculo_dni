package com.endes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CuentaBancariaTest {

	CuentaBancaria cuenta;
	@BeforeEach
	void setup() throws Exception{
		cuenta = new CuentaBancaria(1000);
	}

	/**
	 * Pruebas del constructor
	 */
	@Test
	@DisplayName("Prueba donde el saldo inicial es correcto")
	void testConstructorValido() {
		double resultadoEsperado = 1000.0;
		assertEquals(resultadoEsperado, cuenta.getSaldo(), "No se corresponde el saldo obtenido con el pasado al constructor");
	}
	
	@Test
	@DisplayName("Prueba donde el saldo incial es negativo")
	void testConstructorNoValido() {
		String mensajeEsperado = "El saldo inicial no puede ser negativo.";
		Exception exception = assertThrows(IllegalArgumentException.class, ()-> new CuentaBancaria(-200));
		
		assertEquals(mensajeEsperado, exception.getMessage(), "Deben coincidir las respuestas al crear la cuenta con un saldo negativo");
	}

}
