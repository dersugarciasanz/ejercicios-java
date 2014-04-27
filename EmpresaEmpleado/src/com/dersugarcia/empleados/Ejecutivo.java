package com.dersugarcia.empleados;

import com.dersugarcia.interfaces.IEmpleado;
import com.dersugarcia.interfaces.IEmpresa;

public class Ejecutivo extends EmpleadoBase implements IEmpleado {

	private int presupuesto;
	
	public Ejecutivo(IEmpresa empresa, String nombre, double sueldo) {
		
		super(empresa, nombre, sueldo);
	}
	
	public Ejecutivo(IEmpresa empresa, String nombre, double sueldo, int numEmpleado) {
		
		super(empresa, nombre, sueldo, numEmpleado);
	}

	public int getPresupuesto() {
		
		return presupuesto;
	}

	public void setPresupuesto(int presupuesto) {
		
		this.presupuesto = presupuesto;
	}

}
