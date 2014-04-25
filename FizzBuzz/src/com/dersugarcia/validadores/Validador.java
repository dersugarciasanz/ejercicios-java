package com.dersugarcia.validadores;

import com.dersugarcia.excepciones.NumberNotValidException;
import com.dersugarcia.interfaces.InterfazValidador;

public abstract class Validador implements InterfazValidador {

	private String output;
	
//	public Validador(String output) {
//		this.output = output;
//	}
	
	public abstract boolean validate(int num) throws NumberNotValidException;
	
	protected void validateException(int num)  throws NumberNotValidException {

		if (num < 1) {
			throw new NumberNotValidException("Nœmero no v‡lido, es menor que 1.");
		}
	}

	@Override
	public String getOutput() {
		return output;
	}
	
	public void setOutput(String output) {
		this.output = output;
	}

}
