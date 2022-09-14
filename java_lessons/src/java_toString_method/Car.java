package java_toString_method;

public class Car {
	 String make = "Ford";
	 String model = "Mustang";
	 String color = "red";
	 int year = 2021;
	 
	 public String toString() {
	  
	  return make +"\n"+model+"\n"+color+"\n"+year;
	  //without it, the toString method (explicit or implicit) will just print the memory address
	 } 
}
