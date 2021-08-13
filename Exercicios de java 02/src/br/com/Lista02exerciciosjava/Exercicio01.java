package br.com.Lista02exerciciosjava;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main (String [] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int i, num, maior = 0; 
		
		System.out.println("Digite um número 3 números: ");
		
		for(i = 0; i < 3; i++) {
			
			num = ler.nextInt();
		
		if(num >= maior) {
			
			maior = num;
		  }
		
		}
		System.out.println("O maior número é: " + maior);
	

		}
	}
