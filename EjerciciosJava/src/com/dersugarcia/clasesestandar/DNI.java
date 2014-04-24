package com.dersugarcia.clasesestandar;

public abstract class DNI {

	private final static char[] CARACTERES = { 'T', 'R', 'W', 'A', 'G', 'M',
			'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
			'L', 'C', 'K', 'E', 'T' };

	public static void validar(String s) {
		int numero;
		//Comprobar el número de caracteres
		if (s.length() != 9) {
			System.out.println("NIF no válido, el dni debe tener 9 caracteres.");
			return;
		}
		//Comprobar que los 8 primeros caracteres sean dígitos
		try {
			numero = Integer.parseInt(s.substring(0, s.length() - 1));
		} catch (NumberFormatException nfe) {
			System.out.println("NIF no válido, los 8 primeros caracteres del DNI deben ser dígitos.");
			return;
		}
		
		char letra = Character.toUpperCase(s.charAt(s.length() - 1));
		
		//Comprobar que el último carácter sea una letra
		if (!Character.isLetter(letra)) {
			System.out.println("NIF no válido, el último carácter no es una letra.");
			return;
		}
		int indice = numero % 23;
		
		//Comprobar que la letra coincide con el número
		if (CARACTERES[indice] == letra) {
			System.out.println("DNI correcto, parte numérica: " + numero);
		} else {
			System.out.println("NIF no válido, el número y la letra no coinciden.");
		}

	}

}
