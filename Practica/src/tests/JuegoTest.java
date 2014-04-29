package tests;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;

import juegos.Application;
import juegos.excepciones.JuegoException;
import juegos.factories.JuegoFactory;
import juegos.interfaces.Jugable;
import juegos.numeros.JuegoAdivinaImpar;
import juegos.numeros.JuegoAdivinaNumero;
import juegos.numeros.JuegoAdivinaPar;

import org.junit.Before;
import org.junit.Ignore;
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

	@Ignore
	public void testMuestraVidasRestantes() {
		j = (JuegoAdivinaNumero) juegos.get(0);
		k = (JuegoAdivinaPar) juegos.get(1);
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
	public void testApp() {
		//JuegoAdivinaNumero
		ByteArrayInputStream in = new ByteArrayInputStream("0".getBytes());
		System.setIn(in);
		Application.inicializarLista();
		Jugable juego;
		try {
			juego = Application.eligeJuego();
			assertTrue(juego instanceof JuegoAdivinaNumero);
		} catch (JuegoException e) {
			System.out.println(e.getMessage());
		}
		
		
		in = new ByteArrayInputStream("1".getBytes());
		System.setIn(in);
		
		try {
			juego = Application.eligeJuego();
			assertTrue(juego instanceof JuegoAdivinaPar);
		} catch (JuegoException e) {
			System.out.println(e.getMessage());
		}
		
		in = new ByteArrayInputStream("2".getBytes());
		System.setIn(in);
		
		try {
			juego = Application.eligeJuego();
			assertTrue(juego instanceof JuegoAdivinaImpar);
		} catch (JuegoException e) {
			System.out.println(e.getMessage());
		}
		
		in = new ByteArrayInputStream("z".getBytes());
		System.setIn(in);
		
		try {
			juego = Application.eligeJuego();
			fail("El programa deber’a lanzar una excepci—n.");
		} catch (Exception e) {
			assertTrue(e instanceof JuegoException);
			System.out.println(e.getMessage());
		}
	}
	

	

}
