package model;

public class EstMotor extends ImplMotor {

	public void aumentarVelocidade() {
		System.out.println("Aumentando velocidade...");
		double velocidadeAtual = motor.getVelocidade();
		motor.setVelocidade(velocidadeAtual + 500);
	}
	
	public void diminuirVelocidade() {
		System.out.println("Diminuindo velocidade...");
		double velocidadeAtual = motor.getVelocidade();
		motor.setVelocidade(velocidadeAtual - 500);
	}
}
