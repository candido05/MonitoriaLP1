package codigos.aula_I_0710.exemplos;

public class Exemplo3 {

	/*
	 * Metodo para o calculo do nosso saldo, aqui são 
	 * passado duas variaveis por parametro semelhante 
	 * a uma função como já foi visto em C na cadeira
	 * de Introduçao a Programação e é feito o calculo
	 * 
	 * Por ser um metodo 'void' não é necessario usar o 
	 * 'return'. Aqui é criado uma variavel dentro do 
	 * metodo que recebe o valor de nossa operação e 
	 * apos isso imprime o valor com o 'System.out.println(s)'
	 */
	
	public void Saldo(float valor, float porcentagem) {
		
		float s = valor * ( valor * (porcentagem/100));
		
		System.out.println(s);
	}
}
