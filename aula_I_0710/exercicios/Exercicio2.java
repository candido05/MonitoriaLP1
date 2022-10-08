package codigos.aula_I_0710.exercicios;

public class Exercicio2 {

	public String nome;
	public float salario;
	public float imposto;
	public float porcentagem;
	
	public float SalarioLiquido() {
		return salario - imposto;
	}
	
	public void AumentaSalario() {
		salario += salario * (porcentagem/100);
	}
	
	public String toString() {
		return nome + " R$ " + SalarioLiquido();
	}
}
