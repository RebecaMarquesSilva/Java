package br.com.generation.exercicios01;
/*8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do distribuidor e dos impostos
    (aplicados ao custo de f�brica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever 
    um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor. */

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double custoFabrica, distribuidor, custoConsumidor;
		
		System.out.println("Digite o valor do custo de f�brica: ");
		custoFabrica = leia.nextDouble();
		
		distribuidor = custoFabrica + (0.28 * custoFabrica);
		
		custoConsumidor = distribuidor + (0.45 * distribuidor);
		
		System.out.println("O custo para o consumidor �: " + custoConsumidor);
		
		leia.close();
	}

}
