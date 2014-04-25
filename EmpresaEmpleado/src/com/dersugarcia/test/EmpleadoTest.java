package com.dersugarcia.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.dersugarcia.interfaces.IEmpleado;
import com.dersugarcia.modelo.Empleado;
import com.dersugarcia.modelo.Empresa;

public class EmpleadoTest {

	IEmpleado empleado;
	Empresa empresa;
	@Before
	public void setUp() throws Exception {
		empresa = new Empresa("Empresa1", 5);
		empleado = new Empleado(empresa, "Empleado1", 500);
		
	}

	@Test
	public void testToString() {
		assertEquals("{numero: 0, nombre: \"Empleado1\", sueldo: 500.0}", empleado.toString());
	}


	@Test
	public void testAumentarSueldo() {
		empleado.aumentarSueldo(50);
		assertEquals(750.0,empleado.getSueldo(),0.0);
		
	}



}
