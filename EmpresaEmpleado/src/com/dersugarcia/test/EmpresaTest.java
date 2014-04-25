package com.dersugarcia.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.dersugarcia.modelo.Empresa;

public class EmpresaTest {
	Empresa empresa;

	@Before
	public void setUp() throws Exception {
		empresa = new Empresa("Empresa1", 5);
		empresa.nuevoEmpleado("Empleado1", 500);
	}

	@Test 
	public void test() {
		assertEquals("Empresa1",empresa.getNombre());
		assertEquals(5,empresa.getTamanio());
		
		empresa.getEmpleado(0).toString();
		
		empresa.despideEmpleado(0);
		assertNull(empresa.getEmpleado(0));
		
	}

	
}
