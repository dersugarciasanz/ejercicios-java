package profesor;

import java.util.Scanner;

public abstract class Teclado {
	
	private static Scanner entrada = new Scanner(System.in);
	
	public static int leeEntero() {
		
		int numero = 0;
		boolean seguir = true;
		do {
			try {
				
				numero = entrada.nextInt();
				seguir = false;
			}catch(NumberFormatException e) {
				
				System.out.println("Debe introducir un nœmero v‡lido.");
			} catch(Exception ex) {
				
				numero = 0;
				seguir = false;
			}
		} while (seguir);
		return numero;
	}
}
