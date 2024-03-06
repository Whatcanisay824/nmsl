
import java.util.ArrayList;
import java.util.Scanner;

public class event {
    private String eventID;
    private String eventName;
    private String eventVenue;
    private java.util.Date eventDate;
    private ArrayList<String> eventAttendees;

    // Constructor to initialize the event object
    public event() {
        this.eventAttendees = new ArrayList<>();
    }

    // Constructor to initialize the event object with initial values
    public event(String eventID, String eventName, String eventVenue, java.util.Date eventDate) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventVenue = eventVenue;
        this.eventDate = eventDate;
    }

    // Getter methods to access the event details
    public String getEventID() {
        return eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventVenue() {
        return eventVenue;
    }

    public java.util.Date getEventDate() {
        return eventDate;
    }

    public ArrayList<String> getEventAttendees() {
        return eventAttendees;
    }

    // Setter methods to update the event details
    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setEventVenue(String eventVenue) {
        this.eventVenue = eventVenue;
    }

    public void setEventDate(java.util.Date eventDate) {
        this.eventDate = eventDate;
    }

    // Method to add an attendee to the event
    public void addAttendee(String attendeeName) {
        eventAttendees.add(attendeeName);
    }

    // Method to remove an attendee from the event
    public void removeAttendee(String attendeeName) {
        eventAttendees.remove(attendeeName);
    }

    // Method to update an attendee's details in the event
    public void updateAttendee(String oldAttendeeName, String newAttendeeName) {
        int index = eventAttendees.indexOf(oldAttendeeName);
        if (index!= -1) {
            eventAttendees.set(index, newAttendeeName);
        }
    }

    // Method to find an attendee in the event
    public boolean findAttendee(String attendeeName) {
        return eventAttendees.contains(attendeeName);
    }

    // Method to display the total number of attendees for the event
    public int getTotalAttendees() {
        return eventAttendees.size();
    }

    // Method to organize the event and handle its details
    public void organizeEvent() {
        System.out.println("Event ID: " + eventID);
        System.out.println("Event Name: " + eventName);
        System.out.println("Event Venue: " + eventVenue);
        System.out.println("Event Date: " + eventDate);
        System.out.println("Total Attendees: " + getTotalAttendees());

        System.out.println("Attendees:");
        for (String attendee : eventAttendees) {
            System.out.println(attendee);
        }
    }

    // toString method to represent the event object as a string
    @Override
    public String toString() {
        return "Event{" +
                "eventID='" + eventID + '\'' +
                ", eventName='" + eventName + '\'' +
                ", eventVenue='" + eventVenue + '\'' +
                ", eventDate=" + eventDate +
                ", eventAttendees=" + eventAttendees +
                '}';
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        event event = new event();

        // Ask the user to enter the event details
        System.out.print("Enter the event ID: ");
        event.setEventID(new Scanner(System.in).next());

        System.out.print("Enter the event name: ");
        event.setEventName(new Scanner(System.in).next());

        System.out.print("Enter the event venue: ");
        event.setEventVenue(new Scanner(System.in).next());

        System.out.print("Enter the event date (in MM/dd/yyyy format): ");
        String date = new Scanner(System.in).next();
        try {
            event.setEventDate(java.util.Date.valueOf(date));
        } catch (Exception e) {
            System.out.println("Invalid date format. Please enter a valid date.");
            return;
        }

        // Ask the user to enter the attendee names
        System.out.print("Enter the attendee names (separate with spaces): ");
        String attendees = new Scanner(System.in).next();
        String[] attendeeNames = attendees.split(" ");

        // Add the attendee names to the event
        for (String attendeeName : attendeeNames) {
            event.addAttendee(attendeeName);
        }

        // Organize the event and display its details
        event.organizeEvent();
    }
}