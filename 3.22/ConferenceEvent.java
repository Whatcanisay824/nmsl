public class ConferenceEvent extends Event {
    private boolean breakfastRequired;
    private double breakfastCost;
    private boolean lunchRequired;
    private double lunchCost;
    private boolean dinnerRequired;
    private double dinnerCost;

    public ConferenceEvent(String eventID, String eventName, String eventLocation, String eventPointOfContact,
                           double eventCost, int totalParticipants, int totalEventDays,
                           boolean breakfastRequired, double breakfastCost,
                           boolean lunchRequired, double lunchCost,
                           boolean dinnerRequired, double dinnerCost) {
        super(eventID, eventName, eventLocation, eventPointOfContact,
                eventCost, totalParticipants, totalEventDays);
        this.breakfastRequired = breakfastRequired;
        this.breakfastCost = breakfastCost;
        this.lunchRequired = lunchRequired;
        this.lunchCost = lunchCost;
        this.dinnerRequired = dinnerRequired;
        this.dinnerCost = dinnerCost;
    }

    @Override
    public double calculateEventCost() {
        double totalCost = super.calculateEventCost();
        if (breakfastRequired)
            totalCost += breakfastCost;
        if (lunchRequired)
            totalCost += lunchCost;
        if (dinnerRequired)
            totalCost += dinnerCost;
        return totalCost;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Breakfast Required: " + breakfastRequired + "\n" +
                "Breakfast Cost: $" + breakfastCost + "\n" +
                "Lunch Required: " + lunchRequired + "\n" +
                "Lunch Cost: $" + lunchCost + "\n" +
                "Dinner Required: " + dinnerRequired + "\n" +
                "Dinner Cost: $" + dinnerCost;
    }
}

