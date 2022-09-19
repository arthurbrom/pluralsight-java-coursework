
package gettingstartedjava.sectioneight;
/**
 * This is all about Strings
 */
public class StringFormatting {
    public static void main(String[] args) {

        // My nephews are d1, d2, d3, g1 years old
        int david = 17, dawson = 15, dillon = 8, gordon = 6;

        String s1 =
            "My nephews are "+david+", "+dawson+", "+dillon+", "+gordon+" years old";

        String s2 = String.format(
            "My nephews are %d, %d, %d, and %d years old", david, dawson, dillon, gordon);

        double avgDiff = ((david-dawson) + (dawson-dillon) + (dillon- gordon)) / 3.0d;

        String s3 = "The average age between each is " + avgDiff + " years";
        String s4 = String.format("The average age between each is %.1f years", avgDiff); // 3.7 years
        /**
        Parts of a Format Specifier
            - Decimal places to display - %[argument index] [flags] [width] [precision] conversion
            - Width being minimum characters to display
            - Precision being decimal places to display
         */



    }
}
