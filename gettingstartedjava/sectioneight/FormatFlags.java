
package gettingstartedjava.sectioneight;
/**
 * This is all about Strings
 */
public class FormatFlags {
    public static void main(String[] args) {

        //Format Flags
        // Radix #
        int iVal = 32;
        String s1 = String.format("%d", iVal); // 32
        System.out.println(s1);

        String s2 = String.format("%x", iVal); // 20 (hexadecimal)
        String s3 = String.format("%#x", iVal); // 0x20 -- lowercase x
        String s4 = String.format("%#X", iVal); // 0X20 -- uppercase X

        // Flags 0 and -
        int w = 5, x = 235, y = 481, z = 12;
        s1 = String.format("W:%d X:%d", w, x); // W: 5 X: 235
        s2 = String.format("W:%d X:%d", w, x); // Y: 481 Z: 12




    }
}
