package br.com.generation.repeticao;
/* 4- Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
   psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
   era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
   (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
   agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
   pessoas, calcule e mostre: (WHILE) 
   
   * o n�mero de pessoas calmas;
   * o n�mero de mulheres nervosas;
   * o n�mero de homens agressivos;
   * o n�mero de outros calmos;
   * o n�mero de pessoas nervosas com mais de 40 anos;
   * o n�mero de pessoas calmas com menos de 18 anos. */

import java.util.Scanner;

public class Exerc�cio04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int contador = 0, idade, genero, humor, nervMais40 = 0, calmMenos18 = 0;
		int calma = 0, mulNervosa = 0, homAgressivo = 0, outrosCalmos= 0;
		
		while(contador != 2) {
			
			System.out.println("Digite a sua idade: ");
			idade = entrada.nextInt();
			
			System.out.println("Declare seu g�nero: \n[ 1 ] Feminino | [ 2 ] Masculino | [ 3 ] Outros");
			genero = entrada.nextInt();
			
			System.out.println("Escolha entra as op��es: \n[ 1 ] Sou uma Pessoa Calma |" +
			" [ 2 ] Sou uma Pessoa Nervosa | [ 3 ] Sou uma Pessoa Agressiva");
			humor = entrada.nextInt();
			
				if(humor == 1) {
					calma++;
				}
				if(genero == 1 && humor == 2) {
					mulNervosa++;
				}
				if(genero == 2 && humor == 3) {
					homAgressivo++;
				}
				if(genero == 3 && humor == 1) {
					outrosCalmos++;
				}
				if(idade > 40 && humor == 2) {
					nervMais40++;
				}
				if(idade < 18 && humor == 1) {
					calmMenos18++;
				}
			contador++;
		}
		
		System.out.println("O n�mero de pessoas calmas �: " + calma);
		System.out.println("O n�mero de mulheres nervosas �: " + mulNervosa);
		System.out.println("O n�mero de homens agressivos �: " + homAgressivo);
		System.out.println("O n�mero de outros calmos �: " + outrosCalmos);
		System.out.println("O n�mero de pessoas nervosas com mais de 40 anos �: " + nervMais40);
		System.out.println("O n�mero de pessoas calmas com menos de 18 anos �: " + calmMenos18);
		
		entrada.close();
	}

}
