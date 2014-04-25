package com.dersugarcia.modelo;

import com.dersugarcia.interfaces.IEmpleado;

public class Empleado implements IEmpleado {
	protected int numEmpleado;
	protected String nombre;
	protected Empresa empresa;
	protected double sueldo;
	
	
	
	public Empleado(Empresa empresa, String nombre, double sueldo) {
		this(empresa, nombre, sueldo, empresa.getContador());
	}
	protected Empleado(Empresa empresa, String nombre, double sueldo, int numEmpleado) {
		this.empresa = empresa;
		this.nombre = nombre;
		this.sueldo = sueldo;
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
		return "{numero: " + numEmpleado + ", nombre: \"" + nombre + "\", sueldo: " + sueldo + "}";
	}
	public final void aumentarSueldo(int N) {
		sueldo += sueldo*N;
	}
	public void despedir() {
		empresa = null;
	}

}
