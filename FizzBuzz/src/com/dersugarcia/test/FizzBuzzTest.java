package com.dersugarcia.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.dersugarcia.fizzbuzz.FizzBuzz;
import com.dersugarcia.validadores.Buzz;
import com.dersugarcia.validadores.Fizz;

public class FizzBuzzTest {
	
	FizzBuzz fb;


	
	@Before
	public void setUp() throws Exception {
		fb = new FizzBuzz();
		
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
		assertFalse(Fizz.validate(1));
		assertFalse(Fizz.validate(2));
		assertTrue(Fizz.validate(3));
		assertTrue(Fizz.validate(15));
		assertTrue(Fizz.validate(30));
		assertEquals("Fizz", Fizz.getOutput());
	}
	@Test
	public void testBuzz() {
		assertFalse(Buzz.validate(1));
		assertFalse(Buzz.validate(2));
		assertTrue(Buzz.validate(5));
		assertTrue(Buzz.validate(15));
		assertTrue(Buzz.validate(30));
		assertEquals("Buzz", Buzz.getOutput());
	}
	@Test
	public void test() {
		assertEquals("FizzBuzz 1","1", fb.calcular(1));
		assertEquals("FizzBuzz 2","1 2", fb.calcular(2));
		assertEquals("FizzBuzz 3","1 2 Fizz", fb.calcular(3));
		assertEquals("FizzBuzz 4","1 2 Fizz 4", fb.calcular(4));
		assertEquals("FizzBuzz 5","1 2 Fizz 4 Buzz", fb.calcular(5));
		assertEquals("FizzBuzz 6","1 2 Fizz 4 Buzz Fizz", fb.calcular(6));
		assertEquals("FizzBuzz 14","1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14", fb.calcular(14));
		assertEquals("FizzBuzz 15","1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz", fb.calcular(15));
		assertEquals("FizzBuzz 50","1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz Fizz 22 23 Fizz Buzz 26 Fizz 28 29 FizzBuzz 31 32 Fizz 34 Buzz Fizz 37 38 Fizz Buzz 41 Fizz 43 44 FizzBuzz 46 47 Fizz 49 Buzz", fb.calcular(50));
		
	}

}
