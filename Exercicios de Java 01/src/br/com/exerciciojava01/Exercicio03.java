package br.com.exerciciojava01;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int segundos, h, m, s, r;
		
		System.out.println("Digite uma quantidade de segundos: ");
		segundos = ler.nextInt();
		
		h = (segundos /3600);
		r = (segundos %3600);
		m = (r/60);
		s = (r%60);
		
		System.out.println("O resultado é: " + h);
		System.out.println("O resultado é: " + m);
		System.out.println("O resultado é: " + s);
		
		
		
	}

}
