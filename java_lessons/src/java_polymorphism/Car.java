package java_polymorphism;

public class Car extends Vehicle{
	//Exemplo:
	/*
	int velocidade;
	String cor;
	String marca;
	
	public Car(int velocidade, String cor, String marca) {
		super();
		this.velocidade = velocidade;
		this.cor = cor;
		this.marca = marca;
	}
	
	public Car(String cor) {
		super();
		this.cor = cor;
	}
	*/


	@Override
	public void go() {
		System.out.println("*The car begins moving*");
	}
}
