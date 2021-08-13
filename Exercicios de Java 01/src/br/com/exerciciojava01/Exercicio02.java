package br.com.exerciciojava01;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int anos, meses, dias;
		
		System.out.println("Digite os dias: ");
		dias = ler.nextInt();
		
		anos = (dias/365);
		meses = ((dias % 365)/30);
		dias = ((dias % 365)%30);
		
		System.out.println("Idade em anos = : " + anos);
		System.out.println("Idade em meses: = " + meses);
		System.out.println("Idade em dias: = " + anos);
	}

}
