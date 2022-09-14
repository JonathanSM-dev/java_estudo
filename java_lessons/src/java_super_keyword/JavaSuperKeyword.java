package java_super_keyword;

public class JavaSuperKeyword {
	public static void main(String[] args) {
		
		// super = 	keyword refers to the superclass (parent) of an object
		//			very similar to the "this" keyword
		
		Hero hero1 = new Hero("Name: Batman",42,"Power: $$$");
		Hero hero2 = new Hero("Name: Superman",43,"Power: everything");
		Hero hero3 = new Hero("Name: Aquaman",41,"Power: blub");
		
		System.out.println(hero1.toString());
		System.out.println(hero2.toString());
		System.out.println(hero3.toString());
	}
}
