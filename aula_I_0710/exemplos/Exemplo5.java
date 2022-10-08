package codigos.aula_I_0710.exemplos;

public class Exemplo5 {

	private float valor;
	private float porcentagem;
	
	public float Saldo() {

		/*
		 * AVISO -- Essa não é a melhor das implementações, porém esta
		 * sendo trabalaho para demonstrar o uso. Poderia ter feito 
		 * float saldo = valor - (valor * (porcentagem /100 )); que 
		 * resultaria na mesma coisa.
		 */
		
		float saldo = getValor() - (getValor() * (getPorcentagem() / 100));
		
		return saldo;
	}
	
	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public float getPorcentagem() {
		return porcentagem;
	}
	
	public void setPorcentagem(float porcentagem) {
		this.porcentagem = porcentagem;
	}
	

}
