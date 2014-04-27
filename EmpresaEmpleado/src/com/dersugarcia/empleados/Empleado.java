package com.dersugarcia.empleados;

import com.dersugarcia.interfaces.IEmpleado;
import com.dersugarcia.interfaces.IEmpresa;

public class Empleado extends EmpleadoBase implements IEmpleado {
	
	public Empleado(IEmpresa empresa, String nombre, double sueldo) {
		
		super(empresa, nombre, sueldo, empresa.getContador());
	}
	
	public Empleado(IEmpresa empresa, String nombre, double sueldo, int numEmpleado) {
		
		super(empresa, nombre, sueldo, numEmpleado);
	}
	
	public void ascender() {
		
		Ejecutivo e = new Ejecutivo(empresa, nombre, sueldo, numEmpleado);
		empresa.ascender(numEmpleado,e);
	}
	
}
