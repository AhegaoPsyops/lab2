import java.awt.*;
import javax.swing.*;
import java.time.LocalDateTime;

public class EventPlanner {
    static LocalDateTime deadline = LocalDateTime.of(2024, 12, 7, 17, 0);
    static String lastDeadlineName = "Last Deadline";
    static String lastDeadlineNameAlt = "Final Deadline";
    static Deadline lastDeadline = new Deadline(lastDeadlineName, deadline );
    static Deadline midDeadline = new Deadline("Mid Deadline", deadline.minusDays(10) );
    static Deadline firstDeadline = new Deadline("First Deadline", deadline.minusDays(20) );
    static final int INCREMENT = 1;

    static LocalDateTime start = LocalDateTime.of(2024, 10, 7, 15, 0);
    static LocalDateTime end = LocalDateTime.of(2024, 10, 7, 16, 0);
    static String location = "MCS 321";
    static String locationAlt =  "MCS 339";

    static Meeting firstMeeting = new Meeting("First Meeting", start, end, location);
    static Meeting lastMeeting = new Meeting("Last Meeting", start.plusDays(4), end.plusDays(4), location);
    static Meeting midMeeting = new Meeting("Middle Meeting", start.plusDays(2), end.plusDays(2), location);

    static Event[] events = new Event[] {
            midDeadline,
            lastMeeting,
            lastDeadline,
            firstDeadline,
            firstMeeting,
            midMeeting,
    };

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
        int width = 600, height = 600;
        int numEvents = 4; // temp until I create system that determines number of events
        int panelWidth = width/numEvents - 50;
        int panelHeight = height/numEvents - 50;
        JFrame frame = new JFrame("Event Planner");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel backPanel = new JPanel();
        backPanel.setBackground(Color.BLACK);
        backPanel.setPreferredSize(new Dimension(width, height));
        frame.getContentPane().add(backPanel);

        EventListPanel eventList = new EventListPanel();
        backPanel.add(eventList);
        frame.pack();
        frame.setVisible(true);
        eventList.repaint();
        eventList.revalidate();
        // Create a frame that breaks into a preset number of panels based on input events
        // Or do division based on frame size that
    }
    public static void addDefaultEvents(EventListPanel events){

    }
}
