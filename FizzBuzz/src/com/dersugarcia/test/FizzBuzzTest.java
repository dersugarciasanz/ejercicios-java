package com.dersugarcia.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.dersugarcia.fizzbuzz.FizzBuzz;
import com.dersugarcia.interfaces.InterfazValidador;
import com.dersugarcia.validadores.Buzz;
import com.dersugarcia.validadores.Fizz;
import com.dersugarcia.validadores.Mozz;

public class FizzBuzzTest {
	
	FizzBuzz fb;
	ArrayList<InterfazValidador> arrayI;
	
	@Before
	public void setUp() throws Exception {
		fb = new FizzBuzz();
		
		arrayI = new ArrayList<InterfazValidador>();
		arrayI.add(new Fizz());
		arrayI.add(new Buzz());
		arrayI.add(new Mozz());
	}
	
	@Test
	public void testObtenerTexto() {
		
		assertEquals("1",fb.obtenerTexto(1));
		assertEquals("Fizz",fb.obtenerTexto(3));
		assertEquals("Buzz",fb.obtenerTexto(5));
		assertEquals("FizzBuzz",fb.obtenerTexto(15));
	}
	
	@Test
	public void testFizz() {
		
		assertFalse(arrayI.get(0).validate(1));
		assertFalse(arrayI.get(0).validate(2));
		assertTrue(arrayI.get(0).validate(3));
		assertTrue(arrayI.get(0).validate(15));
		assertTrue(arrayI.get(0).validate(30));
		assertEquals("Fizz", arrayI.get(0).getOutput());
	}
	@Test
	public void testBuzz() {
		assertFalse(arrayI.get(1).validate(1));
		assertFalse(arrayI.get(1).validate(2));
		assertTrue(arrayI.get(1).validate(5));
		assertTrue(arrayI.get(1).validate(15));
		assertTrue(arrayI.get(1).validate(30));
		assertEquals("Buzz", arrayI.get(1).getOutput());
	}
	@Test
	public void testMozz() {
		assertFalse(arrayI.get(2).validate(1));
		assertFalse(arrayI.get(2).validate(2));
		assertTrue(arrayI.get(2).validate(7));
		assertTrue(arrayI.get(2).validate(14));
		assertTrue(arrayI.get(2).validate(21));
		assertEquals("Mozz", arrayI.get(2).getOutput());
	}
	@Test
	public void test() {
		assertEquals("FizzBuzz 1","1", fb.calcular(1));
		assertEquals("FizzBuzz 2","1 2", fb.calcular(2));
		assertEquals("FizzBuzz 3","1 2 Fizz", fb.calcular(3));
		assertEquals("FizzBuzz 4","1 2 Fizz 4", fb.calcular(4));
		assertEquals("FizzBuzz 5","1 2 Fizz 4 Buzz", fb.calcular(5));
		assertEquals("FizzBuzz 6","1 2 Fizz 4 Buzz Fizz", fb.calcular(6));
		assertEquals("FizzBuzz 14","1 2 Fizz 4 Buzz Fizz Mozz 8 Fizz Buzz 11 Fizz 13 Mozz", fb.calcular(14));
		assertEquals("FizzBuzz 15","1 2 Fizz 4 Buzz Fizz Mozz 8 Fizz Buzz 11 Fizz 13 Mozz FizzBuzz", fb.calcular(15));
		assertEquals("FizzBuzz 50","1 2 Fizz 4 Buzz Fizz Mozz 8 Fizz Buzz 11 Fizz 13 Mozz FizzBuzz 16 17 Fizz 19 Buzz FizzMozz 22 23 Fizz Buzz 26 Fizz Mozz 29 FizzBuzz 31 32 Fizz 34 BuzzMozz Fizz 37 38 Fizz Buzz 41 FizzMozz 43 44 FizzBuzz 46 47 Fizz Mozz Buzz", fb.calcular(50));
		
	}

}
