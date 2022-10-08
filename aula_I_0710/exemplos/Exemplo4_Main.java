package codigos.aula_I_0710.exemplos;

import java.util.Scanner;

public class Exemplo4_Main {

	public static void main(String[] args) {
	
		/*
		 * GET sempre vai retornar o valor da minha variavel
		 * SET sempre vai modificar o valor da minha variavel
		 */
		
		Scanner sc = new Scanner(System.in);
		
		Exemplo4 mensagem = new Exemplo4();
		
		/*
		 * Passagem por parametro de uma variavel declarada pelo usuario
		 * para a impressão atraves do uso de um metodo set
		 */
		String nome1 = sc.nextLine();
		mensagem.setNome1(nome1);
		mensagem.Mensagem();
		
		/*
		 * Pegando o valor da variavel 'nome2' pelo metodo get
		 */
		System.out.println(mensagem.getNome2());
		
		sc.close();
	}

}
