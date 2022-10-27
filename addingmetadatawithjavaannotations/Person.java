package addingmetadatawithjavaannotations;

// Comparable Interface forces to follow rules
// Person is a part of the implied extension of Object class
public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int compareTo(Person person){
        int compare = name.compareTo(person.name);
        return compare != 0 ? compare : person.age - age;
    }

    // Intent to override an inherited method, toString()
    @Override
    public String toString(){
        return name;
    }

    // We often manually supplement Type System, why we use code comments or Documentation
    // We need a better way, a structured way to express context and intent.
    // Allow tools and other code to access and act on that stuff.

    /*
        Core Java Platform - provides types for creating annotations
        Annotations in code is widely used by other tools/environments
            - XML and JSON processors
            - IntelliJ
            - Java EE
            - Your own code

       Common Java
     */


}
