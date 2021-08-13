package br.com.exercicioHeranca;

public class Preguiça extends Animal implements AnimalInter {
	
	
	public void movimento() {
		System.out.println("Movimentação: Sobe em arvores");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som Característico: grito");
		
	}
	
	
}
