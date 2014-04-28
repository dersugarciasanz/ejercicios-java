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
		
		for(IEmpleado e: empleados) {
			
			if(e.getNumEmpleado() == num) {
				
				return e;
			}
		}
		return null;
	}
	
	public void despideEmpleado(int num) {
		
		IEmpleado empleado = getEmpleado(num);
		if(empleado != null) {
			
			empleados.remove(empleado);
			empleado.despedir();
		}
	}
	
	public void nuevoEmpleado(String nombre, int sueldo) throws EmpresaCompletaException {
		
		if(empleados.size() == tamanio) {
			
			throw new EmpresaCompletaException();
		}

		empleados.add(new Empleado(this, nombre, sueldo));
		contador++;
		
	}

	public void ascender(Ejecutivo ej) {
		
		for(int i=0; i<empleados.size(); i++) {
			
			IEmpleado e = empleados.get(i);
			if(e.getNumEmpleado() == ej.getNumEmpleado()) {
				
				empleados.set(empleados.indexOf(e), ej);
			}
		}
	}
	
}
