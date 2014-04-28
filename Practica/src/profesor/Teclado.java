package profesor;

import java.util.Scanner;

public class Teclado {
	public int leeEntero() {
		
		int numero = 0;
		Scanner entrada = new Scanner(System.in);
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
