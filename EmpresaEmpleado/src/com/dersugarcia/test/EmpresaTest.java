package com.dersugarcia.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.dersugarcia.interfaces.IEmpleado;
import com.dersugarcia.modelo.Empresa;

public class EmpresaTest {
	Empresa empresa;
	IEmpleado empleado1;

	@Before
	public void setUp() throws Exception {
		empresa = new Empresa("Empresa1", 5);
		empresa.nuevoEmpleado("Empleado1", 500);
	}

	@Test 
	public void test() {
		assertEquals("Empresa1",empresa.getNombre());
		assertEquals(5,empresa.getTamanio());
		

		
		empresa.despideEmpleado(0);
		assertNull(empresa.getEmpleado(0));
		
	}

	
}
