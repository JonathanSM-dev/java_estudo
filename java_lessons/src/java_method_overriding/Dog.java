package java_method_overriding;

public class Dog extends Animal {
	@Override //Isn't necessary, but It's a good practice
	void speak() {
		System.out.println("The dog goes *bark*");
	}
}
