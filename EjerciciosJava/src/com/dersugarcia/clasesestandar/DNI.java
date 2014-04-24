package com.dersugarcia.clasesestandar;

public abstract class DNI {

	private final static char[] NIF_STRING_ASOCIATION = { 'T', 'R', 'W', 'A', 'G', 'M',
			'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
			'L', 'C', 'K', 'E', 'T' };

	public static boolean validar(String dni) {
		return comprobarFormato(dni) && comprobarLetra(dni);
	}
	private static boolean comprobarFormato(String dni) {
		boolean valido = dni.length()==9;
		
		if(valido) {
			valido = Character.isLetter(dni.charAt(dni.length()-1));
		}
		int i=0;
		char c;
		while(valido && i<dni.length()-2) {
			c=dni.charAt(i);
			valido = Character.isDigit(c);
			i++;
		}
		return valido;
	}
	private static boolean comprobarLetra(String dni) {
		char letra = dni.charAt(dni.length() - 1);
		int num = Integer.valueOf(dni.substring(0, dni.length() - 1));
		
		return NIF_STRING_ASOCIATION[num % 23] == letra;
	}
	

}
