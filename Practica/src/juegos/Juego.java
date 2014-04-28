package juegos;

public abstract class Juego {

	private int vidasRestantes;
	private int vidasIniciales;
	private static int record = 0;
	
	public Juego(int vidasIniciales) {
		this.vidasIniciales = vidasIniciales;
		vidasRestantes = vidasIniciales;
	}
	
	public int getVidasRestantes() {
		
		return vidasRestantes;
	}
	
	public void muestraVidasRestantes() {
		
		System.out.println(vidasRestantes);
	}
	
	public boolean quitarVida() {
		
		if (vidasRestantes > 1) {
			
			vidasRestantes--;
		} else {
			
			System.out.println("Juego Terminado");
		}
		return vidasRestantes > 0;
	}
	
	public void reiniciaPartida() {
		
		vidasRestantes = vidasIniciales;
	}
	
	public void actualizarRecord() {
		
		if(vidasRestantes == record) {
			
			System.out.println("Se ha alcanzado el record.");
		} else if(vidasRestantes > record) {
			
			record = vidasRestantes;
			System.out.println("Se ha batido el record. El nuevo record es " + record);
		}
	}
	
	public abstract void juega();
	
}
