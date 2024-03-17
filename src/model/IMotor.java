package model;

public interface IMotor {

	public void ligar();
	
	public void desligar();
	
	public double verificarVelocidade();
	
	public boolean verificarStatus();
}
