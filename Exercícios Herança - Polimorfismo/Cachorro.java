package br.com.generation.exercicios02;

public class Cachorro extends Animal implements Acao{

	@Override
	public void acao() {
		System.out.println("O cachorro está correndo");
	}

	@Override
	public void som() {
		System.out.println("O cachorro está latindo");
	}
	
}
