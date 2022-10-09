
package gettingstartedjava.sectionnine;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Date Formatting
 */
public class DateFormatting {
    public static void main(String[] args) throws InterruptedException {
        LocalDate today = LocalDate.now();
        System.out.println(today); // 2022-10-09

        DateTimeFormatter usDateFormat =
                DateTimeFormatter.ofPattern("MM-dd-yyyy");
        System.out.println(today.format(usDateFormat)); // 10-09-2022

        String usDateString = "12-25-2022";
        // LocalDate failedDate = LocalDate.parse(usDateString); // ERROR - could not be parsed
        LocalDate theDate = LocalDate.parse(usDateString, usDateFormat);
        System.out.println(theDate); // will parse what the date is from a string 2022-12-25

        // converting the parsed date and outputting it into the usDateFormat
        System.out.println(theDate.format(usDateFormat)); // 12-25-2022
    }
}
