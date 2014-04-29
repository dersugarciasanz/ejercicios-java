package profesor;

import java.util.Scanner;

public abstract class Teclado {
	

	
	public static int leeEntero() {
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		boolean seguir = true;
		do {
			
			try {
				
				numero = Integer.parseInt(entrada.next());
				
				seguir = false;
			}catch(NumberFormatException  e) {
				
				System.out.println("Debe introducir un nœmero v‡lido.");
			} catch(Exception ex) {
				
				numero = 0;
				seguir = false;
			}
		} while (seguir);
		return numero;
	}
}
