package gettingstartedjava.sectionfour;

public class Main {
    public static void main(String[] args) {
        int students = 150;
        int failrooms = 0;
        int passrooms = 5;

        // Logical Operator AND -- Executes only if both are true
//        if(failrooms != 0 & students/failrooms > 30)
            System.out.println("Logical AND - Failroom Crowded");

        // Conditional Logical Operator AND -- Right side executes only when left is true
        if(failrooms != 0 && students/failrooms > 30)
            System.out.println("Conditional Logical AND - Failroom Crowded");

        // No logical operator; working
        if(students/passrooms > 30)
            System.out.println("Passrooms is Crowded");

        System.out.println();
        System.out.println("*** end of program ***");
    }
}
