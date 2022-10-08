package codigos.aula_I_0710.exemplos;

import java.util.Scanner;

public class Exemplo5_Main {

	public static void main(String[] args) {
		
		/*
		 * Refazendo o mesmo probelam do Exemplo3 porém com 
		 * o uso de gets e sets
		 */
		
		Scanner sc = new Scanner(System.in);
		
		Exemplo5 valorSaldo = new Exemplo5();
		
		System.out.printf("Valor: ");
		float valor = sc.nextFloat();
		System.out.println("Desconto: ");
		float porcentagem = sc.nextFloat();
		
		valorSaldo.setValor(valor);
		valorSaldo.setPorcentagem(porcentagem);
		
		System.out.println("O valor desconto é: " + valorSaldo.Saldo());
		
		sc.close();
	}
}
