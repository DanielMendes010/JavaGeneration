package br.generation.com.exerciciosdejava06;

public class Testeanimais {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		Cavalo cav = new Cavalo();
		BichoPreguiça preguiça = new BichoPreguiça();
		
		dog.setNome("Bobby");
		dog.setIdade(8);
		dog.setSom("Late");
		dog.setCorre("Corre");
		dog.setBrinca("Brinca");
		
		cav.setNome("Pé de pano");
		cav.setIdade(3);
		cav.setSom("Relincha");
		cav.setComealfafa("Come alfafa");
		cav.setDacoice("Da coice");
		
		preguiça.setNome("Zé soneca");
		preguiça.setIdade(13);
		preguiça.setSom("ai");
		preguiça.setDorme("Dorme");
		preguiça.setSobearvores("Sobe em árvores");
		
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
		
		System.out.println("Nome do Bicho-Preiguiça: " + preguiça.getNome());
		System.out.println("Idade: " + preguiça.getIdade());
		System.out.println("Som que emite: " + cav.getSom());
		System.out.println("O que faz?: " + preguiça.getDorme());
		System.out.println("Como se locomove?: " + preguiça.getSobearvores());
		
		
		
		

	}

}
