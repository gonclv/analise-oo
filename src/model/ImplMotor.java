package model;

public class ImplMotor implements IMotor {

	protected Motor motor;
	
	public ImplMotor() {
		motor = new Motor();
	}

	@Override
	public void ligar() {
		System.out.println("Ligando o motor...");
		motor.setStatus(true);
	}

	@Override
	public void desligar() {
		System.out.println("Desligando o motor...");
		motor.setStatus(false);
	}

	@Override
	public double verificarVelocidade() {
		return motor.getVelocidade();
	}
}
