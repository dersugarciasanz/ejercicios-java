package juegos.numeros;

import profesor.Teclado;
import juegos.Juego;
import juegos.excepciones.JuegoException;
import juegos.factories.RandomFactory;
import juegos.interfaces.Jugable;

public class JuegoAdivinaNumero extends Juego implements Jugable {

	protected int numeroSecreto;
	protected String info;

	public JuegoAdivinaNumero(int vidasIniciales) {

		super(vidasIniciales);
		inicializarInfo();
	}
	
	protected void inicializarInfo() {
		info =  "entre 0 y 10";
	}

	@Override
	public void juega() {

		int numero = 0;
		do {

			muestraNombre();
			try {

				numero = Teclado.leeEntero();
				if (!validaNumero(numero)) {

					continue;
				}
				if (numero == numeroSecreto) {

					System.out.println("Acertaste!!");
					actualizarRecord();
				} else if (quitarVida()) {

					System.out.println("El número introducido es "
							+ mensaje(numero) + " al número secreto.");

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

		System.out.println("Adivina un número " + info);
	}

	@Override
	public void muestraInfo() {
		
		System.out.println("Instrucciones: Tienes " + getVidasRestantes()
				+ " intentos para adivinar un número " + info);

	}

	public void reiniciaPartida() {

		super.reiniciaPartida();
		numeroSecreto = obtenerNumeroSecreto();

	}

	protected int obtenerNumeroSecreto() {
		
		return RandomFactory.getRandomInt(10);
	}
}
