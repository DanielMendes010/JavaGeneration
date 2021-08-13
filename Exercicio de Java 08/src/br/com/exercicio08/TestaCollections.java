package br.com.exercicio08;

	import java.util.ArrayList;
	import java.util.Collections;

	public class TestaCollections {

		public static void main(String[] args) {

			String estoque1 = "Iphone";
			String estoque2 = "Samsumg";
			String estoque3 = "Xiaomi";
			String estoque4 = "Huawai";
			String estoque5 = "Nokia";
			
			ArrayList<String> estoque = new ArrayList<>();
			estoque.add(estoque1);
			estoque.add(estoque2);
			estoque.add(estoque3);
			estoque.add(estoque4);
			
			System.out.println(estoque);
			
			estoque.add(estoque5);
			System.out.println(estoque5);
			
			estoque.remove(0);
			System.out.println(estoque);
			

			//for each --> for mais estiloso... mais simples... mais limitado.
			for(String i: estoque) {
				System.out.println("Estoque: " + i);
			}
			//Mostrar o primeiro
		    String PrimeiroEstoque = estoque.get(0);
			System.out.println("\nO primeiro estoque �: " + PrimeiroEstoque);
			
			//Mostrar o estoque enumerado
			for(int i = 0; i < estoque.size(); i++) {
				System.out.println((i+1) + "�" + " estoque: " +    estoque.get(i));
			}
			//Mostrar o tamanho do Array
			System.out.println("\nO tamanho do estoque (Array) �: " + estoque.size());
			
			//Mostrar em ordem alfab�tica ou crescente se for numero
			Collections.sort(estoque);
			System.out.println(estoque);
			
			//Mostrar aleat�rio
			Collections.shuffle(estoque);
			System.out.println(estoque);
			
		}

}
	
