package tests;

import static org.junit.Assert.*;
import juegos.Juego;
import juegos.JuegoAdivinaImpar;
import juegos.JuegoAdivinaNumero;
import juegos.JuegoAdivinaPar;

import org.junit.Before;
import org.junit.Test;

public class JuegoTest {

	
	JuegoAdivinaNumero j;
	JuegoAdivinaPar k;
	JuegoAdivinaImpar l;
	
	
	@Before
	public void setUp() throws Exception {
		j = new JuegoAdivinaNumero(3, 9);
		k = new JuegoAdivinaPar(3, 8);
		l = new JuegoAdivinaImpar(3, 7);
	}

	@Test
	public void testMuestraVidasRestantes() {
		assertEquals(3,j.getVidasRestantes());
		j.quitarVida();
		assertEquals(2,j.getVidasRestantes());
		j.reiniciaPartida();
		assertEquals(3,j.getVidasRestantes());
		j.actualizarRecord();
		
		assertEquals(3,k.getVidasRestantes());
		k.actualizarRecord();
	}

	@Test
	public void testJuega() {
		j.juega();
		k.juega();
		l.juega();
	}

}
