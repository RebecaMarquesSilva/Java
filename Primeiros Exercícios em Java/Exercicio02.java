package br.com.generation.exercicios01;

import java.util.Scanner;

//2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int dias, meses, anos, restoDivisao, resultado;
		
		System.out.println("Digite sua idade em dias: ");
		dias = leia.nextInt();
		
		anos = dias / 365;
		restoDivisao = dias % 365;
		
		meses = restoDivisao / 30;
				
		resultado = restoDivisao % 30;
		
		System.out.println("Você tem " + anos + " anos, " + meses + " meses e " + resultado + " dias");
		
		leia.close();
		
	}

}
