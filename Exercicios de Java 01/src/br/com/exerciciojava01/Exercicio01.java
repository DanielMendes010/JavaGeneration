package br.com.exerciciojava01;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
	    int idadeAno, idadeMes, idadeDia;
		
	    System.out.println("Digite os anos: ");
	    idadeAno = ler.nextInt();
	    
	    System.out.println("Digite os meses: ");
	    idadeMes = ler.nextInt();
	    
	    System.out.println("Digite os dias: ");
	    idadeDia = ler.nextInt();
	    
	    idadeDia = + (idadeAno*365);
	    idadeDia = + (idadeMes*30);
	    idadeDia = (idadeDia+(idadeAno*365)+(idadeMes*30));
	    
	    System.out.println("O seu total de anos de em dia é: " + idadeDia);
	    
	    
	}

}

