import javax.swing.*;
import java.awt.*;

public class EventPanel extends JPanel{
    EventPanel(Event e){
        super();
        // Change later to set panel size in EventPlanner Main
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setPreferredSize(new Dimension(200, 50));

        JLabel nameLabel = new JLabel("Event: " + e.getName());
        JLabel dateLabel = new JLabel("Date: " + e.getDateTime());

        add(nameLabel, BorderLayout.NORTH);
        add(dateLabel, BorderLayout.SOUTH);
    }
}
