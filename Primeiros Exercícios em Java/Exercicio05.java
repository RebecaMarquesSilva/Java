package br.com.generation.exercicios01;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double nota1, nota2, nota3, mediaPonderada;
		
		
		System.out.println("Digite o valor de nota1: ");
		nota1 = leia.nextDouble();
		
		System.out.println("Digite o valor de nota2: ");
		nota2 = leia.nextDouble();
		
		System.out.println("Digite o valor de nota3: ");
		nota3 = leia.nextDouble();
		
		
		nota1 = nota1 * 2;
		nota2 = nota2 * 3;
		nota3 = nota3 * 5;
		
		mediaPonderada = (nota1 + nota2 + nota3) / 10;
		
		System.out.println("A média ponderada é: " + mediaPonderada);
		
		leia.close();

	}

}
