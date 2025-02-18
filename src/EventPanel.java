import javax.swing.*;
import java.awt.*;

public class EventPanel extends JPanel{
    private JButton completeButton;
    private Event event;
    private JLabel statusLabel;
    private Deadline deadline;
    private Meeting meeting;
    private Event completable; // assign event to this even if completable
    EventPanel(Event event){
        super();
        // Change later to set panel size in EventPlanner Main
        //setLayout(new BorderLayout());
        this.event = event;
        // check if completable object type


        completeButton = new JButton("Complete");
        completeButton.addActionListener(e -> completeEvent());
        statusLabel = new JLabel(event.isComplete() ? "Completed" : "Not Completed");

        this.event = event;
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setBackground(Color.green);
        setPreferredSize(new Dimension(200, 50));

        JLabel nameLabel = new JLabel("Event: " + event.getName());
        JLabel dateLabel = new JLabel("Date: " + event.getDateTime());

        add(nameLabel, BorderLayout.NORTH);
        add(dateLabel, BorderLayout.SOUTH);
    }
    private void completeEvent(){
        event.complete();
        statusLabel.setText("Completed");
        completeButton.setEnabled(false);

    }
}
