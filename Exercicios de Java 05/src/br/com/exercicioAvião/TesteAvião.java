package br.com.exercicioAvi�o;

public class TesteAvi�o {
	
	public static void main(String[] args) {
		
		Avi�o av=new Avi�o();
		
		av.Modelo = "Latam airbus A320";
		
		av.PaisdeOrigem = "Brasil";
		
		av.KM = "871 km/h";
		
		av.Passageiros = "132";
		
		System.out.println("Modelos: " + av.Modelo);
		System.out.println("Pa�s de origem: " + av.PaisdeOrigem);
		System.out.println("KM: " + av.KM);
		System.out.println("Passageiros: " + av.Passageiros);
	}


}