package br.com.exerciciocliente;

public class Cliente {
	
	//Atributos - Vari�veis
	
	public String nome, sexo, idade; 
	public double pagar;
	
	void pagar(int cart�o) {
		pagar -= cart�o;
	}
	
	void parcelas(int parcelar) {
		pagar += parcelar;
	}
	
	
	
}
