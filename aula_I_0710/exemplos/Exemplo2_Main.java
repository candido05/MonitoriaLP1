package codigos.aula_I_0710.exemplos;

public class Exemplo2_Main {

	public static void main(String[] args) {
		
		/*
		 * Neste exemplo, vemos uma chamada para um metodo 
		 * dentro de um System.out.println, mas qual a diferença
		 * para a chamada de metodo desse exemplo para o anterior?
		 * 
		 * A resposta é bem simples, se olharmos nosso metodo 'valor()',
		 * observamos que é do tipo int e retorna um valor, esse 
		 * valor é 4 e não um uma mensagem para ser escrita na tela
		 * como no exemplo anterior.
		 *
		 */
		
		Exemplo2 m = new Exemplo2();
		
		System.out.println(m.valor());
	}
}
