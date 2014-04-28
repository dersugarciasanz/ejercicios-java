package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Scanner;

import juegos.Juego;
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
		j = new JuegoAdivinaNumero(3);
		k = new JuegoAdivinaPar(3);
		l = new JuegoAdivinaImpar(3);
		juegos.add(j);
		juegos.add(k);
		juegos.add(l);
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
		Scanner entrada = new Scanner(System.in);
		do {
			
		Jugable j = eligeJuego();
		j.muestraNombre();
		j.muestraInfo();
		j.juega();
		System.out.println("Desea continuar? S/N");
		} while (entrada.next().toUpperCase().charAt(0) == 'S');
	}
	
	public Jugable eligeJuego() {
	
		int numero;
		Scanner entrada = new Scanner(System.in);
		do {
		System.out.print("Elige juego: \n0- ");
		juegos.get(0).muestraNombre();
		System.out.print("1- ");
		juegos.get(1).muestraNombre();
		System.out.print("2- ");
		juegos.get(2).muestraNombre();
		numero = entrada.nextInt();
		
		} while(numero<0 || numero >2);
		return juegos.get(numero);
	}
	

}
