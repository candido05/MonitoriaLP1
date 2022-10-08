package codigos.aula_I_0710.exemplos;

public class Exemplo4 {

	private String nome1;
	private String nome2 = "Ciencia da Computa��o";
	
	/*
	 * 	Metodo que ir� imprimir o 'nome1' pegando seu valor
	 *  por meio de um get.
	 *  
	 *  Como a variavel 'nome1' � private, n�o h� a necessidade
	 *  de usar um get nessa classe por ser uma variavel dessa classe
	 *  (private tem o escopo apenas para a propria classe). Por�m � 
	 *  usada aqui para demonstra��o.
	 */
	public void Mensagem() {
		System.out.println("Bem vindo a monitoria de " + getNome1());
	}

	public void setNome1(String n) {
		nome1 = n;
	}
	
	public String getNome1() {
		return nome1;
	}
	
	public String getNome2() {
		return nome2;
	}

	public void setNome2(String nome2) {
		this.nome2 = nome2;
	}
}
