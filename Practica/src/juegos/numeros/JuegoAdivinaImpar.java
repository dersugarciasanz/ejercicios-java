package juegos.numeros;

import juegos.factories.RandomFactory;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero {

	public JuegoAdivinaImpar(int vidasIniciales) {
		
		super(vidasIniciales);
	}
	
	protected boolean validaNumero(int numero) {
		
		boolean condicion = (numero%2 != 0);
		if(!condicion) {
			
			System.out.println("Error: El número " + numero + " no es impar.");
		}
		return condicion;
	}

	//Método llamado por JuegoAdivinaNumero.reiniciarPartida
	@Override
	protected int obtenerNumeroSecreto() {
		
		return RandomFactory.getOddRandom(10); 
	}
	
	//Método llamado por el constructor de JuegoAdivinaNumero
	@Override
	protected void inicializarInfo() {
		
		info =  "impar entre 0 y 10";
	}
	
}
