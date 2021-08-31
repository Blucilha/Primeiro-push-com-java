package br.Principal;

import java.util.Scanner;

import br.com.Calculadora.Calculadora;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro inteiro :");
		int a = scan.nextInt();
		System.out.println("Digite o segundo inteiro :");
		int b = scan.nextInt();
		
		Calculadora calculadora = new Calculadora();
		
		int soma = calculadora.Soma(a, b);
		int subtracao = calculadora.Subtracao(a, b);
		int multiplicacao = calculadora.multiplicacao(a, b);
		int divisao = calculadora.divisao(a, b);
		
		System.out.println("sum: " + soma);
		System.out.println("sub: " + subtracao);
		System.out.println("mult: " + multiplicacao);
		System.out.println("div: " + divisao);
	}

}
