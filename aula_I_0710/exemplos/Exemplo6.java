package codigos.aula_I_0710.exemplos;

public class Exemplo6 {

	private String nome;
	
	/*
	 * Construtor que recebe uma variavel por paramento, essa variavel 
	 * é ""declarada"" no momento da criação do nosso objeto.
	 * 
	 * O uso da palavra reservada 'THIS' é usado quando se tem uma variável de 
	 * escopo (ou parâmetro) com o mesmo nome de um atributo (ou variável de classe) e
	 * precisa diferenciá-los
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
