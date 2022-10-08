package codigos.aula_I_0710.exercicios;

import java.util.Scanner;

public class Exercico3_Main {

	/*
	 *  Fazer um programa para ler o nome de um aluno e as tres notas
	 *  que ele obteve no periodo. Ao final mostrar a nota final do aluno
	 *  no periodo. Dizer também se o aluno está aprovado ou não e, em caso 
	 *  negativo, quantos pontos faltam para o aluno obter o minimo para 
	 *  ser aprovado.
	 */
	
	public static void main(String[] args) {
		
		Scanner r = new Scanner(System.in);
		
		System.out.printf("Nome do aluno: ");
		String nome = r.nextLine();
		System.out.printf("Nota 1: ");
		float nota1 = r.nextFloat();
		System.out.printf("Nota 2: ");
		float nota2 = r.nextFloat();
		System.out.printf("Nota 3: ");
		float nota3 = r.nextFloat();
		
		Exercicio3 boletim_do_aluno = new Exercicio3(nota1, nota2, nota3, nome);
		
		System.out.println(boletim_do_aluno.Media());
		boletim_do_aluno.Aprovado();
		
		r.close();
	}
}
