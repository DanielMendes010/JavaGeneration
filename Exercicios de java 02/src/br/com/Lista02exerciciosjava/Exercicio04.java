package br.com.Lista02exerciciosjava;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Digite um n�mero: ");
		numero = ler.nextDouble();
		
		if(numero % 2 !=0) {
			System.out.println("O n�mero" + numero + " � �mpar.\n");
			System.out.println(numero + "�: " + Math.pow(numero, 2));
		}
		else {
			System.out.println("O n�mero" + numero + "� par.");
			System.out.println("A raiz quadrada de" + numero + "�: "+ Math.sqrt(numero));
			
		}
		
		ler.close();
	}

}
