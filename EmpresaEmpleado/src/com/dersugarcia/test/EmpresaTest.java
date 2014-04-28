package com.dersugarcia.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.dersugarcia.empresas.Empresa;
import com.dersugarcia.excepciones.EmpresaCompletaException;

public class EmpresaTest {
	Empresa empresa;

	@Before
	public void setUp() throws Exception {
		
		empresa = new Empresa("Empresa1", 5);
		empresa.nuevoEmpleado("Empleado1", 1000);
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
		try {
			empresa.nuevoEmpleado("Dersu", 2000);
		} catch (EmpresaCompletaException e) {
			fail("La empresa no deber’a estar completa");
		}
		empresa.despideEmpleado(1);
		assertNull(empresa.getEmpleado(0));
		
	}
	
}
