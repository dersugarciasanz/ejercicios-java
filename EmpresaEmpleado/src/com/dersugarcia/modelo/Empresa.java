package com.dersugarcia.modelo;
import java.util.ArrayList;

import com.dersugarcia.interfaces.IEmpleado;




public class Empresa {

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

	public IEmpleado getEmpleado(int num) throws IndexOutOfBoundsException {
		return empleados.get(num);
	}
	
	public void despideEmpleado(int num) throws IndexOutOfBoundsException {
		IEmpleado empleado = getEmpleado(num);
		empleado.despedir();
		empleados.remove(num);
	}
	
	public void nuevoEmpleado(String nombre, int sueldo)  {
		if(empleados.size()<tamanio) {
			empleados.add(new Empleado(this, nombre, sueldo));
			contador++;
		}
		
	}

	public int getContador() {

		return contador;
	}
	

}
