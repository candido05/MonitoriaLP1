package codigos.aula_I_0710.exercicios;

public class Exercicio1 {

	public float altura;
	public float largura;
	
	public Exercicio1(float altura, float largura) {
		this.altura = altura;
		this.largura = largura;
	}
	
	public void Area() {
		
		float area = altura * largura;
	
		System.out.println("A area é: " + area);
	}
	
	public void Perimetro() {
		
		float perimetro = (altura * 2) + (largura * 2);
		System.out.println("O perimetro é: " + perimetro);
	}
	
	public void Diagonal() {
		float diagonal = (float) Math.sqrt((altura * altura) + (largura * largura));
		System.out.println("A diadonal é: " + diagonal);
	}
}
