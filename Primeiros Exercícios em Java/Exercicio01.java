package br.com.generation.exercicios01;

/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a
	expressa apenas em dias.*/

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {


		Scanner leia = new Scanner(System.in);
		
		int anos, meses, dias, somaAnos, somaMeses, idadeTotal;
		
		System.out.println("Digite quantos anos você tem: ");
		anos = leia.nextInt();
		
		System.out.println("Digite os meses restantes: ");
		meses = leia.nextInt();
		
		System.out.println("Digite os dias restantes: ");
		dias = leia.nextInt();
		
		
		somaAnos = anos * 365;
		
		somaMeses = meses * 30;
		
		idadeTotal = somaAnos + somaMeses + dias;
		
		System.out.println("Sua idade em dias é: " + idadeTotal);
		
		leia.close();
	}

}
