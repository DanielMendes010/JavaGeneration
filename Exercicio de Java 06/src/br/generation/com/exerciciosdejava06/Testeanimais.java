package br.generation.com.exerciciosdejava06;

public class Testeanimais {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		Cavalo cav = new Cavalo();
		BichoPregui�a pregui�a = new BichoPregui�a();
		
		dog.setNome("Bobby");
		dog.setIdade(8);
		dog.setSom("Late");
		dog.setCorre("Corre");
		dog.setBrinca("Brinca");
		
		cav.setNome("P� de pano");
		cav.setIdade(3);
		cav.setSom("Relincha");
		cav.setComealfafa("Come alfafa");
		cav.setDacoice("Da coice");
		
		pregui�a.setNome("Z� soneca");
		pregui�a.setIdade(13);
		pregui�a.setSom("ai");
		pregui�a.setDorme("Dorme");
		pregui�a.setSobearvores("Sobe em �rvores");
		
		System.out.println("Nome do Cachorro: " + dog.getNome());
		System.out.println("Idade: " + dog.getIdade());
		System.out.println("Som que emite: " + dog.getSom());
		System.out.println("O que faz?: " + dog.getCorre());
		System.out.println("Como se diverte?: " + dog.getBrinca());
		
		System.out.println("Nome do Cavalo: " + cav.getNome());
		System.out.println("Idade: " + cav.getIdade());
		System.out.println("Som que emite: " + cav.getSom());
		System.out.println("O que come?: " + cav.getComealfafa());
		System.out.println("Como se defende?: " + cav.getDacoice());
		
		System.out.println("Nome do Bicho-Preigui�a: " + pregui�a.getNome());
		System.out.println("Idade: " + pregui�a.getIdade());
		System.out.println("Som que emite: " + cav.getSom());
		System.out.println("O que faz?: " + pregui�a.getDorme());
		System.out.println("Como se locomove?: " + pregui�a.getSobearvores());
		
		
		
		

	}

}
