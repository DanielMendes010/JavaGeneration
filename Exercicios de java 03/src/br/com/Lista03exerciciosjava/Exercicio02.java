package br.com.Lista03exerciciosjava;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		int i, num; 
		int pares = 0;
		int impares = 0;

		
		System.out.println("Escreva 10 n�meros, um de cada vez: " );
		
		for(i = 1; i <= 10; i++) {
			num = leia.nextInt();
			if(num % 2 != 0) {
				impares++;
		}
		
		else {
			pares++;
		}
			
			
		}
	
	
	    System.out.println("Voc� digitou " + pares +" n�meros pares e " + impares + " n�meros �mpares");
	    
	    leia.close();
	    
	}
}
	

	
	

