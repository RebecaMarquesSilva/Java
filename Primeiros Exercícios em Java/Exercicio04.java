package br.com.generation.exercicios01;

import java.util.Scanner;

/*4. Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a seguinte express�o: 
	D= (R+S)/2, onde: R=(A+B)� e S=(B+C)� */

	public class Exercicio04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double a, b, c, r, s, d;
		
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextDouble();
	
		System.out.println("Digite o valor de B: ");
		b = leia.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		c = leia.nextDouble();
		
		
		r = Math.pow((a + b), 2);
	
		s = Math.pow((b + c), 2);
		
		d= (r + s) / 2;
		
		System.out.println("Resultado: " + d);
		
		leia.close();		
		
	}
}
