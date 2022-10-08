package codigos.aula_I_0710.exemplos;

public class Exemplo6 {

	private String nome;
	
	/*
	 * Construtor que recebe uma variavel por paramento, essa variavel 
	 * � ""declarada"" no momento da cria��o do nosso objeto.
	 * 
	 * O uso da palavra reservada 'THIS' � usado quando se tem uma vari�vel de 
	 * escopo (ou par�metro) com o mesmo nome de um atributo (ou vari�vel de classe) e
	 * precisa diferenci�-los
	 */
	public Exemplo6(String nome) {
		this.nome = nome;
	}
	
	public void setNome(String nome_recebido) {
		nome = nome_recebido;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void ImprimirMensagem() {
		System.out.println("Monitoria de " + getNome());
	}
}
