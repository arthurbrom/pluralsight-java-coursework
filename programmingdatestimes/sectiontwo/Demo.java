package programmingdatestimes.sectiontwo;

import java.time.*;

/**
 * Demo Application like a TO-DO List, but with a difference
 * Starting point is a work schedule
 *      - Including fixed events, like meetings
 * User guesses the duration of each task
 * System allocates tasks to work periods
 *      - Might need to split tasks between periods
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("Programming with Dates and Times in Java - Demo!");
        Clock testClock = Clock.fixed(Instant.EPOCH, ZoneOffset.UTC);

        // create a schedule calendar
        SchedulerCalendar calendar = new SchedulerCalendar();

        // add some tasks to the schedule calendar
        calendar.addTask("Answer urgent e-mail", 1, 0);
        calendar.addTask("Write deployment report", 4, 0);
        calendar.addTask("Plan security configuration", 4, 0);

        // add some work periods to the schedule calendar
        LocalDate clockDate = LocalDate.now(testClock);
        LocalDate mondayStart = clockDate.with(temporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        List<WorkPeriod> periods = WorkPeriods.generateWorkPeriods(mondayStart, 3);
        calendar.addWorkPeriods(periods);

        // add an event to the schedule calendar
        ZonedDateTime meetingStartTime = ZOnedDateTime.of(
                mondayStart, LocalTime.of(7, 30), ZoneId.of("America/New_York"));
        Event nyPlanningMeeting = Event.of(meetingStartTime, Duration.ofHours(1), "New York Planning");
        calendar.addEvent(nyPlanningMeeting);

        // create a working schedule
        Schedule schedule = calendar.createSchedule(mondayStart, ZoneId.of("Europe/London"));

        // and print it out
        System.out.println(schedule);


    }
}

class implicitExample {
    public static void example(){
        int monthLength = MonthDay.now().getMonth().maxLength(); // hidden dependency on the current date-time
        /*
        Don’t let your program depend on the current date-time or time zone:
        Make your date-time and time zone dependencies explicit.
         */
        switch (monthLength) {
            case 30:
                //process short month
                break;
            case 31:
                // process long month
                break;
            default:
                // this can't happen
                throw new IllegalStateException();
        }
    }
}

class explicitExample {
    public static void example(){
        Clock clock = Clock.fixed(Instant.EPOCH, ZoneOffset.UTC);
        int monthLength = MonthDay.now(clock).getMonth().maxLength(); // what you SHOULD use for production code
        // ^^^you would set it at the start of the program
        switch (monthLength) {
            case 30:
                //process short month
                break;
            case 31:
                // process long month
                break;
            default:
                // this can't happen
                throw new IllegalStateException();
        }
    }
