package com.dersugarcia.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.dersugarcia.modelo.Empleado;
import com.dersugarcia.modelo.Empresa;

public class EmpresaTest {
	Empresa empresa;
	Empleado empleado1;

	@Before
	public void setUp() throws Exception {
		empresa = new Empresa("Empresa1", 5);
		empleado1 = new Empleado(empresa, "Empleado1", 500);
	}

	@Test
	public void test() {
		assertEquals("Empresa1",empresa.getNombre());
		assertEquals(5,empresa.getTamanio());
		
		//IndexOutOfBoundsException
		try {
			empresa.despideEmpleado(5);
			fail("despideEmpleado(5) deber’a haber lanzado una excepci—n");
		} catch(IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		empresa.despideEmpleado(0);
		assertNull(empresa.getEmpleado(0));
		
	}

}
