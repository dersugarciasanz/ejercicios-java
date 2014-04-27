package com.dersugarcia.interfaces;

import com.dersugarcia.empleados.Ejecutivo;
import com.dersugarcia.excepciones.EmpresaCompletaException;

public interface IEmpresa {

	public String getNombre();
	public int getTamanio();
	public int getContador();
	public IEmpleado getEmpleado(int num);
	public void despideEmpleado(int num);
	public void nuevoEmpleado(String nombre, int sueldo) throws EmpresaCompletaException;
	public void ascender(int numEmpleado, Ejecutivo e);
	
}
