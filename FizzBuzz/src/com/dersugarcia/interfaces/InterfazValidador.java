package com.dersugarcia.interfaces;

import com.dersugarcia.excepciones.NumberNotValidException;

public interface InterfazValidador {
	
	public boolean validate(int num) throws NumberNotValidException;
	
	public String getOutput();
	
}
