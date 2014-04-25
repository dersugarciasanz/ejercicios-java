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
		
	}

	@Test
	public void test() {
		assertEquals("Empresa1",empresa.getNombre());
		assertEquals(5,empresa.getTamanio());
		try {
			empresa.despideEmpleado(5);
			fail("despideEmpleado(5) deber’a haber lanzado una excepci—n");
		} catch(IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

}
