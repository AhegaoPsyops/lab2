import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EventListPanel extends JPanel {
    private List<Event> events;

    EventListPanel() {
        super();
        // Change later to set panel size in EventPlanner Main
        /*this.setBackground(Color.black);
        this.setPreferredSize(new Dimension(600, 600));
        this.events = new ArrayList<>();

        //this.setLayout(new BorderLayout());

        JPanel controlPanel = new JPanel();
        JPanel displayPanel = new JPanel();
        JComboBox sortDropdown = new JComboBox();
        JCheckBox filterDisplay = new JCheckBox("Filter Display");
        JButton addEvent = new JButton("Add Event");
        addEvent.addActionListener(this::showEventDialog);

        this.add(addEvent);
        this.add(controlPanel);
        controlPanel.add(addEvent);
        this.add(displayPanel);
        this.add(filterDisplay);
        this.add(sortDropdown);
        */
        this.events = new ArrayList<>();
        setLayout(new BorderLayout());



        // Add Event button
        JButton addEvent = new JButton("Add Event");
        //addEvent.addActionListener(this::showEventDialog);
        JComboBox sortDropdown = new JComboBox();
        JCheckBox filterDisplay = new JCheckBox("Filter Display");

        JPanel controlPanel = new JPanel();
        controlPanel.add(sortDropdown);
        controlPanel.add(filterDisplay);
        controlPanel.add(addEvent);
        add(controlPanel, BorderLayout.SOUTH);


    }

    public void addEvent(Event event) {
        events.add(event);
        EventPanel eventPanel = new EventPanel(event);
        add(eventPanel);
        revalidate();  // I still dont understand how these work properly
        repaint(); // I've just been generating random combos until it worked
    }

    public List<Event> getEvents() {
        return events;
    }



}

