package juegos.numeros;


import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import juegos.Juego;
import juegos.interfaces.Jugable;


public class JuegoAdivinaNumero extends Juego implements Jugable {

	protected int numeroSecreto;

	public JuegoAdivinaNumero(int vidasIniciales) {
		
		super(vidasIniciales);
		asignarNumeroAleatorio();
	}
	
	protected void asignarNumeroAleatorio() {
		Random r = new Random(new Date().getTime());
		numeroSecreto = r.nextInt(10);
	}
	@Override
	public void juega() {
		
		int numero;
		Scanner entrada = new Scanner(System.in);
		reiniciaPartida();
		do {
			
			System.out.println("Adivina un nœmero entre 0 y 10: ");
			numero = entrada.nextInt();
			if(!validaNumero(numero)) {
				continue;
			}
			if (numero == numeroSecreto) {

				System.out.println("Acertaste!!");
				actualizarRecord();
			} else if (quitarVida()) {

				System.out.println("El nœmero introducido es "
						+ mensaje(numero) + " al nœmero secreto.");

			}

		} while (numero != numeroSecreto && getVidasRestantes() > 0);

	}

	private String mensaje(int numero) {
		String mensaje = "";

		if (numero > numeroSecreto) {
			mensaje = "mayor";
		} else if (numero < numeroSecreto) {
			mensaje = "menor";
		}
		return mensaje;
	}
	
	protected boolean validaNumero(int numero) {
		return true;
	}

	@Override
	public void muestraNombre() {
		
		System.out.println("Adivina un nœmero");
	}

	@Override
	public void muestraInfo() {
		
		System.out.println("Instrucciones: Tienes " + getVidasRestantes() + " intentos para adivinar un nœmero entre 0 y 10");
		
	}
	
}
