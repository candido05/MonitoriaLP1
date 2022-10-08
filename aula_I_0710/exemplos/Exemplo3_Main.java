package codigos.aula_I_0710.exemplos;

import java.util.Scanner;

public class Exemplo3_Main {

	public static void main(String[] args) {
		
		/*
		 * Agora, fazendo esse exemplo, podemos ver como 
		 * funciona a passagem por paramentro para um 
		 * metodo. Como visto nos exemplos anteriores,
		 * basta instancioar nosso objeto com um nome, que 
		 * nesse exemplo � 'saldo' (LEMBRANDO, � UM PONTEIRO), 
		 * podemos acessar nosso metodo e passar por parametro,
		 * como uma fun��o, o 'valor' e o 'desconto'
		 * que queremos para solucionar o problema
		 * 
		 *	PROBLEMA: Fa�a um programa que leia o saldo e o % de 
		 *	reajuste de uma aplica��o financeira
		 *	e imprimir o novo saldo ap�s o reajuste. 
		 *	O c�lculo deve ser feito por uma metodo.
		 */
		 
		Exemplo3 saldo = new Exemplo3();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o valor: ");
		float valor = sc.nextFloat();
		System.out.printf("Digite a porcentagem: ");
		float porcentagem = sc.nextFloat();
		
		saldo.Saldo(valor, porcentagem);
		
		sc.close();

	}

}
