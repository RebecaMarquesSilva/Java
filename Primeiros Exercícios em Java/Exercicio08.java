package br.com.generation.exercicios01;
/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos
    (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever 
    um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. */

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double custoFabrica, distribuidor, custoConsumidor;
		
		System.out.println("Digite o valor do custo de fábrica: ");
		custoFabrica = leia.nextDouble();
		
		distribuidor = custoFabrica + (0.28 * custoFabrica);
		
		custoConsumidor = distribuidor + (0.45 * distribuidor);
		
		System.out.println("O custo para o consumidor é: " + custoConsumidor);
		
		leia.close();
	}

}
