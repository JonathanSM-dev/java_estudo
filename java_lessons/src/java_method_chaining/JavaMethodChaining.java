package java_method_chaining;

public class JavaMethodChaining {
    public static void main(String[] args){
        // method chaining = 	a common syntax for invoking multiple method calls in OOP
        //						condense code into less lines

        String name = "      jonathan";

        //name = name.concat(" silva   ");
        //name = name.toUpperCase();
        //name = name.trim(); // remove blank characters/spaces
        name = name.concat("silva").toUpperCase().trim();
        System.out.println(name);
    }
}
