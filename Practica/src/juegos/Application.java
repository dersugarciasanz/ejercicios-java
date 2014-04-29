package juegos;

import java.util.ArrayList;
import java.util.Scanner;

import juegos.factories.JuegoFactory;
import juegos.interfaces.Jugable;
import profesor.Teclado;

public class Application {

	public static ArrayList<Jugable> juegos = new ArrayList<Jugable>();

	public static void main(String[] args) {

		juegos.add(JuegoFactory.getJuegoAdivinaNumero(3));
		juegos.add(JuegoFactory.getJuegoAdivinaPar(3));
		juegos.add(JuegoFactory.getJuegoAdivinaImpar(3));

		Scanner entrada = new Scanner(System.in);
		do {

			Jugable j;
			j = eligeJuego();
			j.muestraNombre();
			j.muestraInfo();
			j.juega();

			System.out.println("Desea continuar? S/N");
		} while (entrada.next().toUpperCase().charAt(0) == 'S');
		System.out.println("Fin del programa.");
	}

	public static Jugable eligeJuego() {

		int numero;
		do {
			System.out.print("Elige juego: \n0- ");
			juegos.get(0).muestraNombre();
			System.out.print("1- ");
			juegos.get(1).muestraNombre();
			System.out.print("2- ");
			juegos.get(2).muestraNombre();
			numero = Teclado.leeEntero();

		} while (numero < 0 || numero > 2);
		return juegos.get(numero);
	}

}
