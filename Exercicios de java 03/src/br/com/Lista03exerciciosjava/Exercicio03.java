package br.com.Lista03exerciciosjava;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		int idade = 0, maior = 0, menor = 0, medio= 0;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Informe sua idade: ");
		
		while(idade!=-99) {
			idade = ler.nextInt();
			
			if(idade>0 && idade<21) menor++;
			
			if(idade>50) maior++;
			
			if(idade>21 && idade<50) medio++;
			
	}
		
		System.out.println("\nO total de pessoas com mais de 50 anos é: " + maior);
		System.out.println("O total de pessoas com menos de 21 anos é: " + menor);
		System.out.println("Total de pessoas entre 21 e 50 anos é: " + medio);
		ler.close();
}
}