package codigos.aula_I_0710.exemplos;

public class Exemplo3 {

	/*
	 * Metodo para o calculo do nosso saldo, aqui s�o 
	 * passado duas variaveis por parametro semelhante 
	 * a uma fun��o como j� foi visto em C na cadeira
	 * de Introdu�ao a Programa��o e � feito o calculo
	 * 
	 * Por ser um metodo 'void' n�o � necessario usar o 
	 * 'return'. Aqui � criado uma variavel dentro do 
	 * metodo que recebe o valor de nossa opera��o e 
	 * apos isso imprime o valor com o 'System.out.println(s)'
	 */
	
	public void Saldo(float valor, float porcentagem) {
		
		float s = valor * ( valor * (porcentagem/100));
		
		System.out.println(s);
	}
}
