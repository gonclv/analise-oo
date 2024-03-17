package model;

public class Motor {

	private double velocidade;
	private String fabricante;
	private int voltagem;
	private boolean status;
	
	//Para teste
	public Motor() {
		this.velocidade = 3500;
		this.fabricante = "Scania";
		this.voltagem = 50;
		this.status = false;
	}
	
	public Motor(double velocidade, String fabricante, int voltagem, boolean status) {
		this.velocidade = velocidade;
		this.fabricante = fabricante;
		this.voltagem = voltagem;
		this.status = status;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public double getVelocidade() {
		return velocidade;
	}
	
	public boolean getStatus() {
		return status;
	}
}
