package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import juegos.factories.JuegoFactory;
import juegos.interfaces.Jugable;
import juegos.numeros.JuegoAdivinaImpar;
import juegos.numeros.JuegoAdivinaNumero;
import juegos.numeros.JuegoAdivinaPar;

import org.junit.Before;
import org.junit.Test;

public class JuegoTest {

	
	JuegoAdivinaNumero j;
	JuegoAdivinaPar k;
	JuegoAdivinaImpar l;
	ArrayList<Jugable> juegos = new ArrayList<Jugable>();
	
	@Before
	public void setUp() throws Exception {
		
		juegos.add(JuegoFactory.getJuegoAdivinaNumero(3));
		juegos.add(JuegoFactory.getJuegoAdivinaPar(3));
		juegos.add(JuegoFactory.getJuegoAdivinaImpar(3));
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
		
	}
	

	

}
