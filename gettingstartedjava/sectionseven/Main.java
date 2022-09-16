package gettingstartedjava.sectionseven;

/**
 * This is all about Strings
 */
public class Main {
    public static void main(String[] args) {

        // Holds a sequence of Unicode characters
        String name = "Jim";
        String greeting = "Hello " + name;
        System.out.println(greeting); // Hello Jim
        greeting += " good to see you!";
        System.out.println(greeting); // Hello Jim good to see you!

        // Strings are Immutable
        String message = "I";
        message += " Love"; // what happens is that a new String is made
        message += " Java"; // memory is being allocated

        // String Equality
        String s1 = "I love";
        s1 += " Java";
        String s2 = "I";
        s2 += " love Java";
        if(s1 == s2) { // false
            // do something
            System.out.println("Success for ==!");
        }
        if(s1.equals(s2)){ // true
            System.out.println("Success for equals!");
        }

        // Interning a String
        String s3 = s1.intern();
        String s4 = s2.intern();
        if(s3 == s4) { // true
            System.out.println("Success for interning String!");
        }

        // Converting Non-string Types to String
        int iVal = 100;
        String sVal = String.valueOf(iVal); // "100"

        int i = 2, j = 3;
        int result = i * j;
        String output = i + " * " + j + " = " + result; // "2 * 3 = 6"

        // StringBuilder Class
        String location = "Flordia";
        int flightNumber = 175;
        StringBuilder sb = new StringBuilder(40);


    }
}
