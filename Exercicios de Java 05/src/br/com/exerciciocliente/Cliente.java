package br.com.exerciciocliente;

public class Cliente {
	
	//Atributos - Variáveis
	
	public String nome, sexo, idade; 
	public double pagar;
	
	void pagar(int cartão) {
		pagar -= cartão;
	}
	
	void parcelas(int parcelar) {
		pagar += parcelar;
	}
	
	
	
}
