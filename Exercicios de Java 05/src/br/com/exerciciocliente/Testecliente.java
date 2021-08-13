package br.com.exerciciocliente;

public class Testecliente {
	
	public static void main (String args[]) {

     Cliente cli = new Cliente();
     cli.nome = ("Alfredo");
     cli.idade = ("44");
     cli.sexo = ("Masculino");
     cli.pagar = 250;
     
     System.out.println("Nome:" + cli.nome);
     System.out.println("Sexo:" + cli.sexo);
     System.out.println("Idade: " + cli.idade);
     System.out.println("Pagamento: " + cli.pagar + " a vista");
	}
	
}
     
