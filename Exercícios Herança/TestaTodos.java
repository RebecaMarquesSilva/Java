package br.com.generation.exercicios;

public class TestaTodos {

	public static void main(String[] args) {

		Cachorro c1 = new Cachorro(); // criando objeto
		Pregui�a p1 = new Pregui�a(); // novo objeto
		Cavalo   c2 = new Cavalo(); // novo objeto
		
		//Cachorro
		//heran�a da classe Animal
		System.out.println("Cachorro");
		c1.setNome("Luke");
		c1.setIdade(2);
		c1.setSom("Sim");
		
		//heran�a da classe Cachorro
		c1.setCorre("Sim");
		
		System.out.println("Nome: " + c1.getNome());
		System.out.println("Idade: " + c1.getIdade());
		System.out.println("Emite som: " + c1.getSom());
		System.out.println("Corre: " + c1.getCorre());
		System.out.println();
		
		//Cavalo
		//heran�a da classe Animal
		System.out.println("Cavalo");
		c2.setNome("BoJack");
		c2.setIdade(10);
		c2.setSom("Sim");
				
		//heran�a da classe Cavalo
		c2.setCorre("Sim");
				
		System.out.println("Nome: " + c2.getNome());
		System.out.println("Idade: " + c2.getIdade());
		System.out.println("Emite som: " + c2.getSom());
		System.out.println("Corre: " + c2.getCorre());
		System.out.println();
		
		//Pregui�a
		//heran�a da classe Animal
		System.out.println("Pregui�a");
		p1.setNome("Preguicinha");
		p1.setIdade(4);
		p1.setSom("Sim");
				
		//heran�a da classe Pregui�a
		p1.setSobeArvore("Sim");
		
		System.out.println("Nome: " + p1.getNome());
		System.out.println("Idade: " + p1.getIdade());
		System.out.println("Emite som: " + p1.getSom());
		System.out.println("Sobe em �rvores: " + p1.getSobeArvore());
		System.out.println();
		
	}

}
