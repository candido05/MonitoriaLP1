package codigos.aula_I_0710.exercicios;

import java.util.Scanner;

public class Exercicio1_Main {

	/*
	 * Fazer um programa para ler os valores da largura e altura
	 * de um retangulo. Em seguida, mostrar na tela o valor de sua 
	 * area, perimentro e diagonal. 
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner r = new Scanner(System.in);
		
		System.out.printf("Digite a altura: ");
		float altura = r.nextFloat();
		System.out.printf("Digite a largura: ");
		float largura = r.nextFloat();
		
		Exercicio1 calculo = new Exercicio1(altura, largura);
		
		calculo.Area();
		calculo.Perimetro();
		calculo.Diagonal();
		
		r.close();
	}
}
