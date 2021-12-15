package br.com.generation.exercicios;

public class TestaAviao {

	public static void main(String[] args) {
		Aviao a1= new Aviao();
		Aviao a2 = new Aviao();
		
		a1.nome  = "747";
		a1.assentos = 203;
		a1.pessoas = 168;
		a1.numeroSerie = 300000001;
		a1.modelo = "Boeing";
		
		a2.nome  = "A320";
		a2.assentos = 312;
		a2.pessoas = 200;
		a2.numeroSerie = 100000002;
		a2.modelo = "Airbus";
		
		System.out.println("Nome: " + a1.nome);
		System.out.println("Modelo: " + a1.modelo);
		System.out.println("Nº de Assentos: " + a1.assentos);
		System.out.println("Pessoas: " + a1.pessoas);
		System.out.println("Nº de Série: " + a1.numeroSerie);
		a1.estacionado();
		System.out.println();
		System.out.println("Nome: " + a2.nome);
		System.out.println("Modelo: " + a2.modelo);
		System.out.println("Nº de Assentos: " + a2.assentos);
		System.out.println("Pessoas: " + a2.pessoas);
		System.out.println("Nº de Série: " + a2.numeroSerie);
		a2.voando();

	}

	
	
}
