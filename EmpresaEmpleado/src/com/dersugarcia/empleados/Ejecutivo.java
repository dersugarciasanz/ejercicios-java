package com.dersugarcia.modelo;

public class Ejecutivo extends Empleado {

	private int presupuesto;
	
	public Ejecutivo(Empresa empresa, String nombre, double sueldo) {
		super(empresa, nombre, sueldo);
	}
	
	public Ejecutivo(Empresa empresa, String nombre, double sueldo, int numEmpleado) {
		super(empresa, nombre, sueldo, numEmpleado);
	}

	public int getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}
	

	
	

}
