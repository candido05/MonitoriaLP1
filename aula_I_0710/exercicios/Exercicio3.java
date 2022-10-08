package codigos.aula_I_0710.exercicios;

public class Exercicio3 {

	public float nota1;
	public float nota2;
	public float nota3;
	public String nome;
	
	public Exercicio3(float nota1, float nota2, float nota3, String nome) {
		
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nome = nome;
	}
	
	public float Media() {
		return (nota1 + nota2+ nota3) /3;
	}
	
	public void Aprovado() {
		
		if (Media() < 7.0) {
			System.out.printf("Aluno %s esta reprovado, faltam  %f pontos" ,  nome, 7.00 - Media());
			return;
		} else {
			System.out.println("Aluno aprovado");
			return;
		}
	}
}
