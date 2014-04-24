package com.dersugarcia.validadores;

import com.dersugarcia.interfaces.InterfazValidador;

public abstract class Validador implements InterfazValidador {

	private String output;
	
	public Validador(String output) {
		this.output = output;
	}
	
	public abstract boolean validate(int num);

	@Override
	public String getOutput() {
		return output;
	}

}
