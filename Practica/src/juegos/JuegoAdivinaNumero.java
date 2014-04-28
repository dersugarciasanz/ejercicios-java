package juegos;

import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {

	private int numeroSecreto;

	public JuegoAdivinaNumero(int vidasIniciales, int numeroSecreto) {

		super(vidasIniciales);
		this.numeroSecreto = numeroSecreto;
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
	
}
