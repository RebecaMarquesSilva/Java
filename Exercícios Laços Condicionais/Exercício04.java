package br.com.generation.condicionais;
/* 4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
   n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
   �mpar exiba o n�mero elevado ao quadrado. */

import java.util.Scanner;

public class Exerc�cio04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double num, raiz, potencia;
			
		System.out.println("Digite um n�mero: ");
		num = entrada.nextInt();
		
		if (num % 2 == 0) {
			
			raiz = Math.sqrt(num);
			
			System.out.println(num + " � um n�mero par e sua raiz quadrada �: " + raiz);
		}
		else if (num % 2 == 1) {
			
			potencia = Math.pow(num, 2);
			
			System.out.println(num + " � um n�mero �mpar e seu valor elevado � segunda pot�ncia �: " + potencia);
		}
		
		entrada.close();

	}

}
