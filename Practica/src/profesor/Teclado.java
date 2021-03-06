package profesor;

import java.util.Scanner;

import juegos.excepciones.JuegoException;

public abstract class Teclado {
	
	public static int leeEntero() throws JuegoException {
		Scanner entrada = new Scanner(System.in);
		int numero = 0;

		try {

			numero = Integer.parseInt(entrada.next());
		} catch (NumberFormatException e) {

			throw new JuegoException("Debe introducir un número válido.");
		} catch (Exception ex) {

			numero = 0;
		} finally {
			
			entrada.close();
		}
		
		return numero;
	}
}
