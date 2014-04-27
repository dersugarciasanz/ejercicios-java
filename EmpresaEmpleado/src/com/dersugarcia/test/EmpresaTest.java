package com.dersugarcia.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.dersugarcia.empresas.Empresa;

public class EmpresaTest {
	Empresa empresa;

	@Before
	public void setUp() throws Exception {
		
		empresa = new Empresa("Empresa1", 5);
		empresa.nuevoEmpleado("Empleado1", 500);
	}
	
	@Test 
	public void testGetEmpleado() {
		
		empresa.getEmpleado(0).toString();
		try {
		
			empresa.getEmpleado(1).toString();
			fail("El empleado no existe.");
		} catch (Exception e) {

			assertTrue(e instanceof NullPointerException);
		}
	}

	@Test 
	public void testDespideEmpleado() {
		
		empresa.despideEmpleado(0);
		assertNull(empresa.getEmpleado(0));
		
	}
	
}
