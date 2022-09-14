package java_interface;

public class JavaInterface {
	public static void main(String[] args) {
		
		//Interface = A template that can be applied to a class.
		//			  Similar to inheritance, but specifies what a class has/must do.
		//			  Classes can apply more than one interface, inheritance is limited to 1 super class
		
		Fish fish = new Fish();
		
		fish.hunt();
		fish.flee();
				
	}
}
