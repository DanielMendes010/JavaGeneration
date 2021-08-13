package br.com.Lista04exerciciosjava;

import java.util.Random;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
	     int maiorpont = 0, maior = 0;
	     double media = 0.0, soma = 0.0;
	     int[] dado = new int [10];
	     Random gerador = new Random();
	     
	    for(int i = 0; i <= 9; i++) {
	    	dado[i] = gerador.nextInt(6) + 1;
	    	System.out.println((i+1)+ " Lançamento: " + dado[i]);
	    	
	    	soma = soma + dado[i];
	    	media = soma / 10;
	    	
	    	if(dado[i] == 6) {
	    		maiorpont++;
	    	}
	    	
	    	if(maior < dado[i]){
	    		maior = dado[i];
	    	
	     
	     
	     
	     }
	    			 
	     }
	     
	    System.out.println("A média do lançamento é: " + media);
	    System.out.println("A quantidade de maior pontuação é: " + maiorpont + "\nO maior lançamento foi: " + maior);
	}

}
