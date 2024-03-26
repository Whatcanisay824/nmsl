public class ConferenceEvent extends Event{

    private double conferenceEventCost;

    private CalculateEventCostClass calculateEventCostObject;

    public ConferenceEvent(String eventID, String eventName, String eventLocation, String pointOfContact, int totalParticipants, int totalEventDays, double breakfastCost, double lunchCost, double dinnerCost){

        super(eventID, eventName, eventLocation, pointOfContact, totalParticipants, totalEventDays);

        this.calculateEventCostObject = new CalculateEventCostClass();

        this.breakfastCost = breakfastCost;

        this.lunchCost = lunchCost;

        this.dinnerCost = dinnerCost;

    }

    @Override

    public void calculateEventCost(){

        super.calculateEventCost();

        double eventCost = calculateEventCostObject.calculateEventCost() + (calculateEventCostObject.calculateEventCost() * 0.3);

        conferenceEventCost = eventCost + ((breakfastCost + lunchCost + dinnerCost) * getTotalParticipants() * getTotalEventDays());

    }

    @Override

    public String toString(){

        return "Conference Event details: " + "\n" +

        "Event ID: " + getEventID() + "\n" +

        "Event Name: " + getEventName() + "\n" +

        "Event Location: " + getEventLocation() + "\n" +

        "Total participants: " + getTotalParticipants() + "\n" +

        "Total Conference Cost: " + conferenceEventCost;

    } 

}