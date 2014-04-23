package com.dersugarcia.clasesestandar;

public class DNI {

	private final static char[] CARACTERES ={'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'};
	
	public static void validar(String s) {
		
		if(s.length()!=9) {
			System.out.println("El dni debe tener 9 caracteres.");
			System.exit(1);
		}
		
		
		int numero = Integer.parseInt(s.substring(0, s.length()-1));
		char letra = Character.toUpperCase(s.charAt(s.length()-1));
		
		
		int indice = numero % 23;
		
		if(CARACTERES[indice] == letra) {
			System.out.println("DNI correcto, parte numérica: " + numero);
		} else {
			System.out.println("NIF no válido, el número y la letra no coinciden.");
		}
		
		
	}
	
}
