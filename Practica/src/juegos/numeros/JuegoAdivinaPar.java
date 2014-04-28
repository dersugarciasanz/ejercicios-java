package juegos.numeros;

import java.util.Date;
import java.util.Random;

public class JuegoAdivinaPar extends JuegoAdivinaNumero {

	public JuegoAdivinaPar(int vidasIniciales) {
		
		super(vidasIniciales);
	}
	
	protected boolean validaNumero(int numero) {
		if(numero%2 == 0) {
			return true;
		} else {
			System.out.println("Error: El nœmero" + numero + " no es par.");
			return false;
		}
	}
	
	@Override
	public void muestraNombre() {
		
		System.out.println("Adivina un nœmero par");
	}

	@Override
	public void muestraInfo() {
		
		System.out.println("Instrucciones: Tienes " + getVidasRestantes() + " intentos para adivinar un nœmero par entre 0 y 10");
		
	}
	@Override
	public void reiniciaPartida() {
		super.reiniciaPartida();
		asignarNumeroAleatorio();
	}
	protected void asignarNumeroAleatorio() {
		
		Random r = new Random(new Date().getTime());
		numeroSecreto = r.nextInt(10)*2;
	}

}
