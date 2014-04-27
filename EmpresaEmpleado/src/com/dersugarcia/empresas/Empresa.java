package com.dersugarcia.empresas;

import java.util.ArrayList;

import com.dersugarcia.empleados.Ejecutivo;
import com.dersugarcia.empleados.Empleado;
import com.dersugarcia.excepciones.EmpresaCompletaException;
import com.dersugarcia.interfaces.IEmpleado;
import com.dersugarcia.interfaces.IEmpresa;

public class Empresa implements IEmpresa {

	private String nombre;
	private int tamanio;
	private ArrayList<IEmpleado> empleados;
	private int contador;
		
	public Empresa(String nombre, int tamanio) {
		
		this.nombre = nombre;
		this.tamanio = tamanio;
		empleados = new ArrayList<IEmpleado>(tamanio);
		contador = 0;	
	}

	public String getNombre() {
		
		return nombre;
	}

	public int getTamanio() {
		
		return tamanio;
	}

	public int getContador() {
		
		return contador;
	}
	
	public IEmpleado getEmpleado(int num) {
		
		IEmpleado e = null;
		int index = 0;
		while(e == null && index < empleados.size()) {
			
			if(empleados.get(index).getNumEmpleado() == num) {
				
				e = empleados.get(index);
			}
			index++;
		}
		return e;
	}
	
	public void despideEmpleado(int num) {
		
		IEmpleado empleado = getEmpleado(num);
		if(empleado != null) {
			
			empleados.remove(num);
		}
	}
	
	public void nuevoEmpleado(String nombre, int sueldo) throws EmpresaCompletaException {
		
		if(empleados.size() < tamanio) {
			
			empleados.add(new Empleado(this, nombre, sueldo));
			contador++;
		} else {
			
			throw new EmpresaCompletaException();
		}
	}

	public void ascender(int numEmpleado, Ejecutivo e) {
		
		despideEmpleado(numEmpleado);
		empleados.add(e);
	}
	
}
