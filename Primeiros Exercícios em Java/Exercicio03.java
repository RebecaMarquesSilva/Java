package br.com.generation.exercicios01;

import java.util.Scanner;

/*3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em segundos
	e mostre-o expresso em horas, minutos e segundos. */


public class Exercicio03 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		int seg, min, horas, restoDivisao, segundos;
		
		System.out.println("Digite a dura��o do evento em segundos: ");
		seg = leia.nextInt();
		
		horas = seg / 3600;
		restoDivisao = seg % 3600;
		
		min = restoDivisao / 60;
		segundos = restoDivisao % 60;
		
		System.out.println("A dura��o do evento � de " + horas + " horas, " + min + " minutos e " + segundos + " segundos.");
		
		leia.close();
		
	}

}
