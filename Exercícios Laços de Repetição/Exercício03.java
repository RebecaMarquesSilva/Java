package br.com.generation.repeticao;
/* 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
   21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
   idade for =-99. (WHILE) */

import java.util.Scanner;

public class Exercício03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade = 0, contador1 = 0, contador2 = 0;
		
		while(idade != -99) {
			System.out.println("Digite sua idade: ");
			idade = entrada.nextInt();
			
			if(idade < 21 && idade > 0) {
				contador1++;
							
				}
				else if(idade > 50) {
				contador2++;
				
				}
			
		}
		System.out.println("Total de pessoas com menos de 21 anos: " + contador1
				+ "\nTotal de pessoas com mais de 50 anos: " + contador2);
		
		entrada.close();
	}

}
