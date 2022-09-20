package array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class JavaArrayList {
	public static void main(String[] args) {
		
		// ArrayList = 	a resizable array. 
		//				Elements can be added and removed after compilation phase
		//				store reference data types
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("pizza");//Position 0
		food.add("hamburger");//Position 1
		food.add("hotdog");//Position 2

		System.out.println("hotdog position: " + food.indexOf("hotdog")); // Print position of hot dog
		
		//food.set(0, "sushi"); //change pizza for sushi
		//food.remove(2); //remove food 2
		//foo.remove(2d); //remove the value Double 2
		//food.clear(); //clear list of food

		System.out.println("hamburguer exists?: " + food.contains("hamburger"));
		System.out.println("Second food added: " + food.get(1));

		//System.out.println(Collections.min(food)); //will return the minimum number of food
		//System.out.println(Collections.max(food)); //will return the maximum number of food

		//Iterator<Double> iterator = food.iterator(); //if food was Double this would return the sum of values
		//Double soma = 0d;
		//while(iterator.hasNext()) {
		// double next = iterator.next();
		// soma += next;
		//}

		//System.out.println(soma/food.size()); //if food was a number this would return the average of values

		//Iterator<Double> iterator1 = food.iterator(); //remove every item that's lower than 7
		//while(iterator1.hasNext())
		//{
		//  Double next = iterator1.next();
		//	if(next < 7 ){
		// 		iterator1.remove();
		//  }
		//}


		//System.out.println(food); // will print in insertion order

		//Collections.shuffle(food); // will randomize the list

		//



		for(int i=0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
	}
}
