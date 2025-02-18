import javax.swing.*;
import java.awt.*;

public class EventListPanel extends JPanel{
    EventListPanel(){
        super();
        // Change later to set panel size in EventPlanner Main
        this.setBackground(Color.GREEN);
        this.setPreferredSize(new Dimension(500, 500));
        Event[] events = new Event[4];
        JPanel controlPanel = new JPanel();
        JPanel displayPanel = new JPanel();
        JComboBox sortDropdown = new JComboBox(events);
        JCheckBox filterDisplay = new JCheckBox("Filter Display");
        JButton addEvent = new JButton("Add Event");

    }
}
