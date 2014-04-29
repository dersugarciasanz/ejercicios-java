package juegos.numeros;

import juegos.factories.RandomFactory;

public class JuegoAdivinaPar extends JuegoAdivinaNumero {

	public JuegoAdivinaPar(int vidasIniciales) {
		
		super(vidasIniciales);
	}
	
	protected boolean validaNumero(int numero) {
		
		if(numero%2 == 0) {
			
			return true;
		} else {
			
			System.out.println("Error: El n�mero " + numero + " no es par.");
			return false;
		}
	}
	
	@Override
	public void muestraNombre() {
		
		System.out.println("Adivina un n�mero par");
	}

	@Override
	public void muestraInfo() {
		
		System.out.println("Instrucciones: Tienes " + getVidasRestantes() + " intentos para adivinar un n�mero par entre 0 y 10");
	}
	
	@Override
	public void reiniciaPartida() {
		
		super.reiniciaPartida();
		numeroSecreto = RandomFactory.getEvenRandom(10); 
	}


}
