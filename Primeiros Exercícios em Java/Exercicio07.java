package br.com.generation.exercicios01;

import java.util.Scanner;

/*7. Um sistema de equações lineares do tipo: ax + by = c || dx + ey = f, pode ser resolvido segundo mostrado
	abaixo : x = (ce-bf)/(ae-bd)  ||  y = (af-cd)/(ae-bd). Escreva um sistema que lê os coeficientes a,b,c,d,e e f 
	e calcula e mostra os valores de x e y. */

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double a, b, c, d, e, f, x, y;
		
		System.out.println("Digite o valor de a: ");
		a = leia.nextDouble();
		
		System.out.println("Digite o valor de b: ");
		b = leia.nextDouble();
		
		System.out.println("Digite o valor de c: ");
		c = leia.nextDouble();
		
		System.out.println("Digite o valor de d: ");
		d = leia.nextDouble();
		
		System.out.println("Digite o valor de e: ");
		e = leia.nextDouble();
		
		System.out.println("Digite o valor de f: ");
		f = leia.nextDouble();
		
		
		x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		
		
		y = ((a * f) - (c * d)) / ((a * e) - (b * d));
				
		System.out.println("O valor de x é " + x + " e o valor de y é " + y + ".");
		
		leia.close();

	}

}
