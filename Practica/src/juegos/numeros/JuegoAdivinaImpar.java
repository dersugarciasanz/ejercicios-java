package juegos;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero {

	public JuegoAdivinaImpar(int vidasIniciales, int numeroSecreto) {
		
		super(vidasIniciales, numeroSecreto);
	}
	
	protected boolean validaNumero(int numero) {
		if(numero%2 != 0) {
			return true;
		} else {
			System.out.println("Error: El nœmero" + numero + " no es impar.");
			return false;
		}
	}

}
