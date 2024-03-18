package model;

public class EstMotor extends ImplMotor {

	public void aumentarVelocidade() {
		double velocidadeAtual = motor.getVelocidade();
		double novaVelocidade = velocidadeAtual + 500;
		
		if(novaVelocidade > 7000) {
			System.out.println("Erro: Velocidade ultrapassou o limite de velocidade máxima do motor.");
			return;
		}
		
		System.out.println("Aumentando velocidade...");
		motor.setVelocidade(novaVelocidade);
	}
	
	public void diminuirVelocidade() {
		double velocidadeAtual = motor.getVelocidade();
		double novaVelocidade = velocidadeAtual - 500;
		
		if(novaVelocidade < 0) {
			System.out.println("Erro: Velocidade ultrapassou o limite de velocidade mínima do motor.");
			return;
		}
		
		System.out.println("Diminuindo velocidade...");
		motor.setVelocidade(novaVelocidade);
	}
}
