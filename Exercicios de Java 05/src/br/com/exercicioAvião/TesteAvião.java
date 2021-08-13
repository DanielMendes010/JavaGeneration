package br.com.exercicioAvião;

public class TesteAvião {
	
	public static void main(String[] args) {
		
		Avião av=new Avião();
		
		av.Modelo = "Latam airbus A320";
		
		av.PaisdeOrigem = "Brasil";
		
		av.KM = "871 km/h";
		
		av.Passageiros = "132";
		
		System.out.println("Modelos: " + av.Modelo);
		System.out.println("País de origem: " + av.PaisdeOrigem);
		System.out.println("KM: " + av.KM);
		System.out.println("Passageiros: " + av.Passageiros);
	}


}