package codigos.aula_I_0710.exemplos;

import java.util.Scanner;

public class Exemplo6_Main {

	public static void main(String[] args) {
		
		/*
		 * Agora nesse exemplo, fazemos o uso de um Construtor explicito
		 * Mas como assim explicito? Simples, todo programa q foi feito
		 * realizamos o uso de um construtor, porém foi o constrtutor 
		 * padrão do JAVA, enquanto agora fazemos a nossa propria declaração.
		 * 
		 * Ao fazer isso, temos uma mudança na forma que realizamos nossos
		 * codigos, agora temos que declarar nossas variaveis de parametro
		 * diretamente no objeto
		 */
		
		Scanner s = new Scanner(System.in);
		
		String variavel1 = s.nextLine();
		String variavele2 = s.nextLine();
		
		/*
		 * Decleração direta logo na instanciação dos objetos
		 */
		Exemplo6 nome1 = new Exemplo6(variavel1);
		Exemplo6 nome2 = new Exemplo6(variavele2);
		
		//System.out.println("Monitoria de " + nome1.getNome());
		//System.out.println("Monitoria de " + nome2.getNome());
		
		nome1.ImprimirMensagem();
		nome2.ImprimirMensagem();
		
		s.close();

	}

}
