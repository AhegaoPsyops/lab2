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

        // Scrollable container for events

        // Add Event button
        JButton addEvent = new JButton("Add Event");
        addEvent.addActionListener(this::showEventDialog);

        JPanel controlPanel = new JPanel();
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

    private void showEventDialog(ActionEvent e) {
        JTextField nameField = new JTextField();
        JTextField startField = new JTextField(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
        JTextField endField = new JTextField(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
        JComboBox<String> eventTypeBox = new JComboBox<>(new String[]{"Meeting", "Timeline"});

        Object[] message = {
                "Event Type:", eventTypeBox,
                "Event Name:", nameField,
                "Event Date (yyyy-mm-dd HH:mm):", startField,
                "Event End (yyyy-mm-dd HH:mm):", endField
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Create Event", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            String name = nameField.getText().trim();
            String startTimeStr = startField.getText().trim();
            String endTimeStr = endField.getText().trim();
            String selectedType = (String) eventTypeBox.getSelectedItem();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

            try {
                LocalDateTime startTime = LocalDateTime.parse(startTimeStr, formatter);
                LocalDateTime endTime = LocalDateTime.parse(startTimeStr, formatter);

                Event newEvent = null;

                if ("Meeting".equals(selectedType)) {
                    String location = JOptionPane.showInputDialog("Enter Meeting Location:");
                    newEvent = new Meeting(name, startTime, endTime, location);
                } else if ("Deadline".equals(selectedType)) {
                    String description = JOptionPane.showInputDialog("Enter Timeline Description:");
                    newEvent = new Deadline(name, startTime);
                }

                if (newEvent != null) {
                    addEvent(newEvent);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Invalid date format! Use yyyy-MM-dd HH:mm.");
            }
        }
    }
}

