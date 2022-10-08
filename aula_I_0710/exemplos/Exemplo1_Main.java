package codigos.aula_I_0710.exemplos;

import java.util.Scanner;

public class Exemplo1_Main {

	public static void main(String[] args) {
		
		
		/*
		 * Neste exemplo, � declarado nosso objeto nomeado de 
		 * 'mensagem' o qual tem por finalidade possibilitar 
		 * o acesso ao metodo 'mostrarMensagem'.
		 * 
		 * Lembrem-se que um objeto � uma variavel de ponteiro
		 * que aponto para algo, com esse algo podendo ser uma
		 * variavel ou um metodo em outra classe. Se duvida, basta 
		 * desmarcar a linha comentada para ver onde est� o 
		 * endere�o de memoria e sua identifica��o
		 */
		
		Exemplo1 mensagem = new Exemplo1();
		
		Scanner s = new Scanner(System.in);
		String nome = s.nextLine();
		
		mensagem.mostrarMensagem(nome);
		
		//System.out.println(mensagem);
		
		s.close();
	}
}
