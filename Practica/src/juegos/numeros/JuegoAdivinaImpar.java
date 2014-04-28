package juegos.numeros;

import java.util.Date;
import java.util.Random;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero {

	public JuegoAdivinaImpar(int vidasIniciales) {
		
		super(vidasIniciales);
	}
	
	protected boolean validaNumero(int numero) {
		if(numero%2 != 0) {
			return true;
		} else {
			System.out.println("Error: El nœmero" + numero + " no es impar.");
			return false;
		}
	}
	@Override
	public void muestraNombre() {
		
		System.out.println("Adivina un nœmero impar");
	}

	@Override
	public void muestraInfo() {
		
		System.out.println("Instrucciones: Tienes " + getVidasRestantes() + " intentos para adivinar un nœmero impar entre 0 y 10");
		
	}
	
	protected void asignarNumeroAleatorio() {
		
		Random r = new Random(new Date().getTime());
		do {
			
			numeroSecreto = r.nextInt(10);
		} while(numeroSecreto %2 == 0);
	}
}
