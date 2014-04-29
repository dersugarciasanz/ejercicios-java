package juegos.numeros;

import profesor.Teclado;
import juegos.Juego;
import juegos.excepciones.JuegoException;
import juegos.factories.RandomFactory;
import juegos.interfaces.Jugable;

public class JuegoAdivinaNumero extends Juego implements Jugable {

	protected int numeroSecreto;

	public JuegoAdivinaNumero(int vidasIniciales) {

		super(vidasIniciales);
	}

	@Override
	public void juega() {

		int numero = -1;
		do {

			System.out.println("Adivina un n�mero entre 0 y 10: ");
			try {

				numero = Teclado.leeEntero();
				if (!validaNumero(numero)) {

					continue;
				}
				if (numero == numeroSecreto) {

					System.out.println("Acertaste!!");
					actualizarRecord();
				} else if (quitarVida()) {

					System.out.println("El n�mero introducido es "
							+ mensaje(numero) + " al n�mero secreto.");

				}
			} catch (JuegoException e) {
				System.out.println(e.getMessage());
			}

		} while (numero != numeroSecreto && getVidasRestantes() > 0);
		reiniciaPartida();

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

		System.out.println("Adivina un n�mero");
	}

	@Override
	public void muestraInfo() {

		System.out.println("Instrucciones: Tienes " + getVidasRestantes()
				+ " intentos para adivinar un n�mero entre 0 y 10");

	}

	public void reiniciaPartida() {

		super.reiniciaPartida();
		numeroSecreto = RandomFactory.getRandomInt(10);

	}

}
