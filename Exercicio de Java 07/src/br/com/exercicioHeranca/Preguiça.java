package br.com.exercicioHeranca;

public class Pregui�a extends Animal implements AnimalInter {
	
	
	public void movimento() {
		System.out.println("Movimenta��o: Sobe em arvores");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som Caracter�stico: grito");
		
	}
	
	
}
