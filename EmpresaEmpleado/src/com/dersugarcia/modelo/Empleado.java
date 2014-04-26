package com.dersugarcia.modelo;

import com.dersugarcia.interfaces.IEmpleado;

public class Empleado implements IEmpleado {
	protected int numEmpleado;
	protected String nombre;
	protected Empresa empresa;
	protected double sueldo;
	
	
	
	public Empleado(Empresa empresa, String nombre, double sueldo) {
		this.empresa = empresa;
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	protected Empleado(Empresa empresa, String nombre, double sueldo, int numEmpleado) {
		this(empresa, nombre, sueldo);
		this.numEmpleado = numEmpleado;
	}
	
	
	
	public int getNumEmpleado() {
		return numEmpleado;
	}
	public String getNombre() {
		return nombre;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + "{numero: " + numEmpleado + ", nombre: \"" + nombre + "\", sueldo: " + sueldo + "}";
	}
	public final void aumentarSueldo(int N) {
		sueldo *= (1 + (N/100.0));
	}
	public void despedir() {
		empresa = null;
	}
	


}
