package br.com.exerciciojava01;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int A, B, C;
		int D, R, S;
		
		System.out.println("Cálculo da expressões de números inteiro ");
		
		System.out.println("Digite o valor de A: ");
		A = ler.nextInt();
		
		System.out.println("Digite o valor de B: ");
		B = ler.nextInt();
		
		System.out.println("Digite o valor de C: ");
		C = ler.nextInt();
		
		R = (A + B)/2;
		
		S = (B + C)/2;
		
		D = (R + S)/2;
		
		D = (R + D)/2;
		
		System.out.println("O resultado de D é: " + D);

	}

}
