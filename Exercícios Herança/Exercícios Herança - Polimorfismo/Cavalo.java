package br.com.generation.exercicios02;


public class Cavalo extends Animal implements Acao{

	@Override
	public void acao() {
		System.out.println("O cavalo est� correndo");
	}

	@Override
	public void som() {
		System.out.println("O cavalo est� relinchando");
	}
	
}
