
package gettingstartedjava.sectioneight;
/**
 * Argument Index
 */
public class ArgumentIndex {
    public static void main(String[] args) {
        int valA = 100, valB = 200, valC = 300;

        // We can define value is tied to what
        String s1 = String.format("%d %d %d", valA, valB, valC); // 100 200 300
        String s2 = String.format("%3$d %1$d %2$d", valA, valB, valC); // 300 100 200
        System.out.println(s1);
        System.out.println(s2);

        // tied to 2nd argument, format same value as the previous format specifier, then tied to the 1st argument
        String s3 = String.format("%2$d %<d %1$d", valA, valB, valC); // 200 200 100

    }
}
