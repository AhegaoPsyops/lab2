import java.util.*;
import java.awt.*;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.stream.Stream;

public class EventPlanner {
    static Meeting firstMeeting = new Meeting("First Meeting", start, end, location);
    static Meeting lastMeeting = new Meeting("Last Meeting", start.plusDays(4), end.plusDays(4), location);
    static Meeting midMeeting = new Meeting("Middle Meeting", start.plusDays(2), end.plusDays(2), location);
    static Deadline lastDeadline = new Deadline(lastDeadlineName, deadline );
    static Deadline midDeadline = new Deadline("Mid Deadline", deadline.minusDays(10) );
    static Deadline firstDeadline = new Deadline("First Deadline", deadline.minusDays(20) );
    static LocalDateTime start = LocalDateTime.of(2024, 10, 7, 15, 0);
    static LocalDateTime end = LocalDateTime.of(2024, 10, 7, 16, 0);
    static String location = "MCS 321";
    static String locationAlt =  "MCS 339";
    static Deadline[] deadlines = new Deadline[] {
            firstDeadline,
            midDeadline,
            lastDeadline,
    };

    static Meeting[] meetings = new Meeting[] {
            firstMeeting,
            midMeeting,
            lastMeeting,
    };
    public static void main(String[] args) {

    }
    public static void addDefaultEvents(EventListPanel events){

    }
}
