package br.com.exercicioHeranca;

public class Teste {

	public static void main(String[] args) {
		
		Cavalo horse = new Cavalo();
		Cachorro dog = new Cachorro();
		Pregui�a sloth = new Pregui�a();
		AnimalInter anima = new Cavalo();
		
		horse.setNome("Puro Sangue Ingl�s");
		horse.setIdade(5);
		
		dog.setNome("Pitbull");
		dog.setIdade(3);
		
		sloth.setNome("Pregui�a-bentinho");
		sloth.setIdade(10);
		
		System.out.println("Ra�a do Animal: " + horse.getNome());
		System.out.println("Idade: " + horse.getIdade());
		anima.emitirSom();
		anima.movimento();
		System.out.println();
		
		anima = new Cachorro();
		System.out.println("Ra�a do Animal: " + dog.getNome());
		System.out.println("Idade: " + dog.getIdade());
		anima.emitirSom();
		anima.movimento();
		System.out.println();
		
		anima = new Pregui�a();
		System.out.println("Ra�a do Animal: " + sloth.getNome());
		System.out.println("Idade: " + sloth.getIdade());
		anima.emitirSom();
		anima.movimento();
		
		
		

	}

}
