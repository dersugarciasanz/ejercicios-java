package com.dersugarcia.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.dersugarcia.empleados.Empleado;
import com.dersugarcia.empresas.Empresa;
import com.dersugarcia.interfaces.IEmpleado;

public class EmpleadoTest {
	
	IEmpleado empleado;
	Empresa empresa;
	
	@Before
	public void setUp() throws Exception {
		
		empresa = new Empresa("Empresa1", 5);
		empresa.nuevoEmpleado("Empleado1", 500);
		empleado = empresa.getEmpleado(0);
	}

	@Test
	public void testToString() {
		
		assertEquals("Empleado{numero: 0, nombre: \"Empleado1\", sueldo: 500.0}", empleado.toString());
		
	}

	@Test
	public void testAumentarSueldo() {
		
		empleado.aumentarSueldo(50);
		assertEquals(750.0,empleado.getSueldo(),0.0);
	}

	@Test
	public void testDespedir() {
		
		empleado.despedir();
		assertNull(empresa.getEmpleado(0));
	}

	@Test
	public void testAscender() {
		((Empleado) empleado).ascender();
		IEmpleado ejecutivo = empresa.getEmpleado(0);
		assertEquals("Ejecutivo",ejecutivo.getClass().getSimpleName());
		assertEquals("Ejecutivo{numero: 0, nombre: \"Empleado1\", sueldo: 500.0}", ejecutivo.toString());
	}

}
