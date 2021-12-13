package br.com.generation.repeticao;
/* 6- Escrever um programa que receba vários números inteiros no teclado. E no
   final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE) */

import java.util.Scanner;

public class Exercício06 {

	public static void main(String[] args) {
		
		int num, media = 0, contador = 0, soma = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número inteiro: ");
			num = leia.nextInt();
			if(num % 3 == 0) {		
			contador++;
			soma = soma + num;				
			}
		}
		while(num != 0);
		
		media = soma / (contador - 1);
				
		System.out.println("A média dos números inseridos múltiplos de 3 é: " + media);
		
		leia.close();
		
	}

}