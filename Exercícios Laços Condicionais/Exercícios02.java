package br.com.generation.condicionais;
// 2- Faça um programa que entre com três números e coloque em ordem crescente.

import java.util.Scanner;

public class Exercícios02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double num1, num2, num3, aux = 0;
		
		System.out.println("Digite um número inteiro: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite um número inteiro: ");
		num2 = leia.nextInt();
		
		
		System.out.println("Digite um número inteiro: ");
		num3 = leia.nextInt();
		
		if (num1 > num2){
			
			aux = num1;
			num1 = num2;
			num2 = aux;
		}
		if (num2 > num3){
	
			aux = num2;
			num2 = num3;
			num3 = aux;	
		}	
		if (num2 < num1){
			
			aux = num1;
			num1 = num2;
			num2 = aux;	
		}
		
		System.out.println("A ordem crescente dos números digitados é: " + num1 + ", " + num2 + ", " + num3);
		
		leia.close();
	}

}
