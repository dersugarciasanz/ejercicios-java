package com.dersugarcia.basicos;

import java.util.Scanner;

public class Ej6_01 {


	public static void main(String[] args) {
		
		double peso, altura, imc;
		String mensaje;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu peso en kg: ");
		peso = entrada.nextDouble();
		System.out.println("Introduce tu altura en metros: ");
		altura = entrada.nextDouble();
		
		imc = peso/(altura*2);
		
		if (imc < 16) {
			mensaje = "Criterio de ingreso en hospital";
		} else if (imc < 17) {
			mensaje = "Infrapeso";
		} else if (imc < 18) {
			mensaje = "Bajo peso";
		} else if (imc < 25) {
			mensaje = "Peso normal (saludable)";
		} else if (imc < 30) {
			mensaje = "Sobrepeso";
		} else if (imc < 35) {
			mensaje = "Sobrepeso cr—nico";
		} else if (imc < 40) {
			mensaje = "Obesidad prem—rbida";
		} else {
			mensaje = "Obesidad m—rbida";
		}
		
		System.out.println("Resultado:\nPeso: " + peso + "\nAltura: " + altura + "\nIMC: " + imc + "\nValoraci—n: " + mensaje);
	}

}
