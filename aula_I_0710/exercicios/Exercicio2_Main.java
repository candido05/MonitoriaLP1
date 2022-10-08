package codigos.aula_I_0710.exercicios;

import java.util.Scanner;

import codigosTestes.aula_I_0710_TESTE.Questoes.Questao2_class;

public class Exercicio2_Main {

	public static void main(String[] args) {
		
		/*
		 *  Fazer um programa para ler os dados de um funcionario 
		 *  (nome, salario bruto, imposto). Em seguida, mostrar os dados
		 *  do funcionario (nome e salario liquido). Em seguida, aumentar
		 *  o salario do funcionario com base em uma porcetagem dada e 
		 *  mostrar novamente os dados do funcionario.
		 */
		
		Scanner r = new Scanner(System.in);
		
		Questao2_class funcionario = new Questao2_class();
		
		System.out.printf("Nome: ");
		funcionario.nome = r.nextLine();
		System.out.printf("Salario: ");
		funcionario.salario = r.nextFloat();
		System.out.printf("Imposto: ");
		funcionario.imposto = r.nextFloat();
		System.out.println();
		
		System.out.println("Funcionario " + funcionario);
		System.out.println();
		
		System.out.printf("Percentual de aumento do salario: ");
		funcionario.porcentagem = r.nextFloat();
		funcionario.aumentaSalario();
		
		System.out.println();
		System.out.println("Dados atualizados " + funcionario);
		
		r.close();
		
	}
}
