package com.dersugarcia.poo.ej25;

public class Complejo {

	//Variables de instancia
	private double pReal, pImag;
	//Variables de clase
	private static int contador = 0;
	
	
	//Constructores
	public Complejo() {
		this.pReal = 0.0;
		this.pImag = 0.0;
		contador++;
	}
	public Complejo(double pReal, double pImag) {
		this(); //Llamar al constructor sin par‡metros
		this.pReal = pReal;
		this.pImag = pImag;
	}
	
	//Getters y setters
	public static int getContador() {
		return contador;
	}

	//MŽtodos de instancia
	public void asignar(double x, double y) {
		this.pReal = x;
		this.pImag = y;
	}
	
	public void sumar(Complejo b) {
		this.pReal += b.pReal;
		this.pImag += b.pImag;
	}
	
	public String toString() {
		return "(" + this.pReal + ", " + this.pImag + ")";
	}
	public boolean equals(Complejo c) {
		
		return (this.pReal == c.pReal && this.pImag == c.pImag);
		
	}
	
	
	//MŽtodos de clase
	public static Complejo sumar(Complejo a, Complejo b) {
		Complejo c = new Complejo();
		c.pReal = a.pReal + b.pReal;
		c.pImag = a.pImag + b.pImag;
		return c;
	}
	
}
