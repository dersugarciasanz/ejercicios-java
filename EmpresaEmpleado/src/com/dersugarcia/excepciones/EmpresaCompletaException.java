package com.dersugarcia.excepciones;

public class EmpresaCompletaException extends Exception {

	private static final long serialVersionUID = -4146454331696850036L;

	public EmpresaCompletaException() {
		super("La empresa no admite más empleados. Despida a alguien primero o elija otra empresa en la que designar al empleado.");
	}

}
