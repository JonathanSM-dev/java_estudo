package java_super_keyword;

public class Person {
	String name;
	int age;
	
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return this.name + "\n" + "Age: " + this.age + "\n";
	}
}
