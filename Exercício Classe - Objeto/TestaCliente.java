package br.com.generation.exercicios;

public class TestaCliente {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		
		c1.nome  = "Mariana";
		c1.idade = 28;
		c1.telefone = 900009000;
		c1.genero = "Feminino";
		c1.email = "mari@gmail.com";
		
		c2.nome  = "Roberto";
		c2.idade = 40;
		c2.telefone = 900008000;
		c2.genero = "Masculino";
		c2.email = "roberto@gmail.com";
		
		System.out.println("Nome: " + c1.nome);
		System.out.println("Idade: " + c1.idade);
		System.out.println("Tel.: " + c1.telefone);
		System.out.println("Gênero: " + c1.genero);
		c1.cadastro();
		System.out.println();
		System.out.println("Nome: " + c2.nome);
		System.out.println("Idade: " + c2.idade);
		System.out.println("Tel.: " + c2.telefone);
		System.out.println("Gênero: " + c2.genero);
		c2.cadastro();
	}
			
}
