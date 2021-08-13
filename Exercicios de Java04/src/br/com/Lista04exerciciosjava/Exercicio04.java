package br.com.Lista04exerciciosjava;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[][] M1 = new int [3][3];
		int soma = 0, diagonal = 0, l, c;
		
		System.out.println("Digite os valores das matrizes");
		for(l = 0; l < M1.length; l++) {
			for(c = 0; c < M1 [l].length; c++) {
				M1[l][c]=entrada.nextInt();
				soma += M1[l][c];
				
				if(l == c) {
					diagonal += M1[l][c];
				}
			}
		}
		System.out.println("A soma total dos elementos foi de: " + soma);
		System.out.println("A soma diagonal dos elemento foi de: " + diagonal);
	}

}
