package br.com.generation.repeticao;

import java.util.Scanner;

// 2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

public class Exercício02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double num, i, contador1 = 0, contador2 = 0;
	
		for(i = 1; i <=10; i++ ) {
			System.out.println("Digite um número: ");
			num = leia.nextDouble();
			
			if(num % 2 == 0) {
			contador1++;
			
			}
			else if(num % 2 == 1) {
			contador2++;
			
			}
			
		}
			
		System.out.println("Quantidade de Números Pares Digitados: " + contador1);
		System.out.println("Quantidade de Números Ímpares Digitados: " + contador2);
		
		leia.close();
	}

}
