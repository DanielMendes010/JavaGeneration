package br.com.Lista04exerciciosjava;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int[][] N1 = new int [4][6];
		int[][] N2 = new int [4][6];
		int[][] M1 = new int [4][6];
		int[][] M2 = new int [4][6];
		
		int l, c;
		
		for(l = 0; 1 < N1.length; l++) {
			for(c = 0; c < N1[l].length; c++) {
				System.out.printf("Digite os valores da matriz N1: [%d][%d]", l, c);
				N1[l][c] = ler.nextInt();
				
			}
			System.out.println();
		}
		for(l = 0; l < N2.length; l++) {
			for(c = 0; c < N2[l].length; c++) {
				System.out.printf("Digite os valores da matriz N2: [%d][%d]", l, c);
				N2[l][c] = ler.nextInt();
				M1[l][c] = N1[l][c] + N2[l][c];
				M2[l][c] = N1[l][c] + N2[l][c];
			}
			System.out.println();
	}
		 {
			System.out.println("M1:");
			for(l = 0; l < M1.length; l++) {
				for(c = 0; c < M1[l].length; c++) {
					System.out.print(M1[l][c] + ",");
				}
				
			}
			System.out.println();
			
		}
		 System.out.println("M1:");
			for(l = 0; l < M2.length; l++) {
				for(c = 0; c < M2[l].length; c++) {
					System.out.print(M2[l][c] + ",");

             }
				System.out.println("");
}
	}
}


