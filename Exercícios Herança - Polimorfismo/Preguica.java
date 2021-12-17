package br.com.generation.exercicios02;

public class Preguica {

	public class Preguiça extends Animal implements Acao{

		@Override
		public void acao() {
			System.out.println("A preguiça está subindo na árvore");
			
		}

		@Override
		public void som() {
			System.out.println("Zzzzz");
		}
	
	}
	
}
