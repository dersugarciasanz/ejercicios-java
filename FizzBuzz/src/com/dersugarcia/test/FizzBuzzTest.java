package com.dersugarcia.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.dersugarcia.excepciones.NumberNotValidException;
import com.dersugarcia.factories.ValidatorFactory;
import com.dersugarcia.fizzbuzz.FizzBuzz;
import com.dersugarcia.validadores.Buzz;
import com.dersugarcia.validadores.Fizz;
import com.dersugarcia.validadores.Mozz;

public class FizzBuzzTest {

	FizzBuzz fb;
	Fizz f;
	Buzz b;
	Mozz m;

	@Before
	public void setUp() throws Exception {
		fb = new FizzBuzz();

		f = ValidatorFactory.getFizzValidator();
		b = ValidatorFactory.getBuzzValidator();
		m = ValidatorFactory.getMozzValidator();

		fb.addValidador(f);
		fb.addValidador(b);
		fb.addValidador(m);
	}

	@Test
	public void testObtenerTexto() {

		assertEquals("1", fb.obtenerTexto(1));
		assertEquals("Fizz", fb.obtenerTexto(3));
		assertEquals("Buzz", fb.obtenerTexto(5));
		assertEquals("FizzBuzz", fb.obtenerTexto(15));
	}

	@Test
	public void testFizz() {
		try {
			assertFalse(f.validate(1));
			assertFalse(f.validate(2));
			assertTrue(f.validate(3));
			assertTrue(f.validate(15));
			assertTrue(f.validate(30));
		} catch(NumberNotValidException e) {
			System.out.println(e.getMessage());
		}
		assertEquals("Fizz", f.getOutput());
		
	}

	@Test
	public void testBuzz() {
		
		try {
		assertFalse(b.validate(1));
		assertFalse(b.validate(2));
		assertTrue(b.validate(5));
		assertTrue(b.validate(15));
		assertTrue(b.validate(30));
		} catch(NumberNotValidException e) {
			System.out.println(e.getMessage());
		}
		assertEquals("Buzz", b.getOutput());
		
	}

	@Test
	public void testMozz() {
		try {
	
		assertFalse(m.validate(1));
		assertFalse(m.validate(2));
		assertTrue(m.validate(7));
		assertTrue(m.validate(14));
		assertTrue(m.validate(21));
		} catch(NumberNotValidException e) {
			System.out.println(e.getMessage());
		}
		assertEquals("Mozz", m.getOutput());
		
	}

	@Test
	public void test() {

		assertEquals("FizzBuzz 1", "1", fb.calcular(1));
		assertEquals("FizzBuzz 2", "1 2", fb.calcular(2));
		assertEquals("FizzBuzz 3", "1 2 Fizz", fb.calcular(3));
		assertEquals("FizzBuzz 4", "1 2 Fizz 4", fb.calcular(4));
		assertEquals("FizzBuzz 5", "1 2 Fizz 4 Buzz", fb.calcular(5));
		assertEquals("FizzBuzz 6", "1 2 Fizz 4 Buzz Fizz", fb.calcular(6));
		assertEquals("FizzBuzz 14",
				"1 2 Fizz 4 Buzz Fizz Mozz 8 Fizz Buzz 11 Fizz 13 Mozz",
				fb.calcular(14));
		assertEquals(
				"FizzBuzz 15",
				"1 2 Fizz 4 Buzz Fizz Mozz 8 Fizz Buzz 11 Fizz 13 Mozz FizzBuzz",
				fb.calcular(15));
		assertEquals(
				"FizzBuzz 50",
				"1 2 Fizz 4 Buzz Fizz Mozz 8 Fizz Buzz 11 Fizz 13 Mozz FizzBuzz 16 17 Fizz 19 Buzz FizzMozz 22 23 Fizz Buzz 26 Fizz Mozz 29 FizzBuzz 31 32 Fizz 34 BuzzMozz Fizz 37 38 Fizz Buzz 41 FizzMozz 43 44 FizzBuzz 46 47 Fizz Mozz Buzz",
				fb.calcular(50));
	}
}
