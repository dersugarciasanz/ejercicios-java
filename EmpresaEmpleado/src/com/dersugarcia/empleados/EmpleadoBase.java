package com.dersugarcia.empleados;

import com.dersugarcia.interfaces.IEmpleado;
import com.dersugarcia.interfaces.IEmpresa;

public abstract class EmpleadoBase implements IEmpleado {

	protected IEmpresa empresa;
	protected String nombre;
	protected double sueldo;
	protected int numEmpleado;

	public EmpleadoBase(IEmpresa empresa, String nombre, double sueldo) {
		
		this(empresa, nombre, sueldo, empresa.getContador());
	}
	
	public EmpleadoBase(IEmpresa empresa, String nombre, double sueldo, int numEmpleado) {
		
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
		
		return this.getClass().getSimpleName() + "{numero: " + numEmpleado + ", nombre: \"" + nombre + "\", sueldo: " + sueldo + "}";
	}
	
	public final void aumentarSueldo(int N) {
		
		sueldo *= (1 + (N/100.0));
	}
	
	public void despedir() {
		
		empresa.despideEmpleado(numEmpleado);
		empresa = null;
	}
	




}
