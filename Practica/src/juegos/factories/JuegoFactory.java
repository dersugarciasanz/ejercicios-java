package juegos.factories;

import juegos.numeros.JuegoAdivinaImpar;
import juegos.numeros.JuegoAdivinaNumero;
import juegos.numeros.JuegoAdivinaPar;



public abstract class JuegoFactory {

	
	public static final JuegoAdivinaNumero getJuegoAdivinaNumero(int numero) {
		
		return new JuegoAdivinaNumero(numero);
	}
	
	public static final JuegoAdivinaPar getJuegoAdivinaPar(int numero) {
		
		return new JuegoAdivinaPar(numero);
	}
	
	public static final JuegoAdivinaImpar getJuegoAdivinaImpar(int numero) {
		
		return new JuegoAdivinaImpar(numero);
	}
}
