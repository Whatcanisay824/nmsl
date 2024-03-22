
public class Event {
    private String eventID;
    private String eventName;
    private String eventLocation;
    private String eventPointOfContact;
    private double eventCost;
    private int totalParticipants;
    private int totalEventDays;

    public Event(String eventID, String eventName, String eventLocation, String eventPointOfContact,
                 double eventCost, int totalParticipants, int totalEventDays) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.eventPointOfContact = eventPointOfContact;
        this.eventCost = eventCost;
        this.totalParticipants = totalParticipants;
        this.totalEventDays = totalEventDays;
    }

    public double calculateEventCost() {
        return eventCost;
    }

    @Override
    public String toString() {
        return "Event ID: " + eventID + "\n" +
                "Event Name: " + eventName + "\n" +
                "Event Location: " + eventLocation + "\n" +
                "Event Point of Contact: " + eventPointOfContact + "\n" +
                "Event Cost: $" + eventCost + "\n" +
                "Total Participants: " + totalParticipants + "\n" +
                "Total Event Days: " + totalEventDays;
    }
}

