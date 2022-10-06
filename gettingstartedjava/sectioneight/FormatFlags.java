
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
        String s5, s6, s7, s8 = String.format("",iVal);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s8);

        // Flags 0 and -
        int w = 5, x = 235, y = 481, z = 12;
        // no spaces between characters
        s1 = String.format("W:%d X:%d", w, x); // W:5 X:235
        s2 = String.format("Y:%d Z:%d", y, z); // Y:481 Z:12
        // 4 spaces between characters, so this way, things align
        s3 = String.format("W:%4d X:%4d", w, x); // W:   5 X: 235
        s4 = String.format("Y:%4d Z:%4d", y, z); // Y: 481 Z:  12
        // 4 spaces between characters, so this way, things align AND there's leading zeros
        s5 = String.format("W:%04d X:%04d", w, x); // W:0005 X:0235
        s6 = String.format("Y:%04d Z:%04d", y, z); // Y:0481 Z:0012
        // left justified by 4 characters
        s7 = String.format("W:%04d X:%04d", w, x); // W:0005 X:0235
        s8 = String.format("Y:%04d Z:%04d", y, z); // Y:0481 Z:0012
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s8);

        // Flags , (grouping separator)
        iVal = 1234567;
        double dVal = 1234567.0d;
        s1 = String.format("%d", iVal);    // 1234567
        s2 = String.format("%,d", iVal);   // 1,234,567
        s3 = String.format("%,.2f", dVal); // 1,234,567.00
        System.out.println("Flag comma , the grouping separator");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // Flags Space, +, and (
        int iPosVal = 123, iNegVal =-456;
        s1 = String.format("%d", iPosVal); // 123
        s2 = String.format("%d", iNegVal); // -456
        s3 = String.format("% d", iPosVal); //  123 (line up)
        s4 = String.format("% d", iNegVal); // -456
        System.out.println("Flags Space to line up");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        s5 = String.format("%+d", iPosVal); // +123
        s6 = String.format("%+d", iNegVal); // -456
        s7 = String.format("(%(d", iPosVal); // 123
        s8 = String.format("(%(d", iNegVal); // (456)
        String s9 = String.format("(% (d", iNegVal); //  123 (with space)
        System.out.println("Flags + and ( display positive and negative");
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s8);
        System.out.println(s9);

    }
}
