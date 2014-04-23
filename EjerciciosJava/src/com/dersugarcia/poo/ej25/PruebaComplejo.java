package com.dersugarcia.poo.ej25;

public class PruebaComplejo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Complejo c1, c2, c3;
		
		c1 = new Complejo(1.0,7.1);
		System.out.println("c1: " + c1.toString());
		c2 = new Complejo();
		System.out.println("c2: " + c2.toString());
		c2.asignar(2.2, 3.5);
		System.out.println("c2: " + c2.toString());
		c3 = Complejo.sumar(c1,c2);
		System.out.println("c3: " + c3.toString());
		c3.sumar(c3);
		System.out.println("c3: " + c3.toString());
		System.out.println("c3 es igual a new Complejo(6.4,21.2)? " + c3.equals(new Complejo(6.4,21.2)));
		System.out.println("Se han creado  " + Complejo.getContador() + " instancias de la clase Complejo.");
		
	}

}
