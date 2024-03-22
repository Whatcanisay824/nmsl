public class Main {
    public static void main(String[] args) {
        Event event = new Event("E001", "Business Conference", "New York", "John Smith",
                5000.00, 100, 2);
        System.out.println(event.toString());
        System.out.println("Event Cost: $" + event.calculateEventCost());

        ConferenceEvent conferenceEvent = new ConferenceEvent("E002", "Tech Summit", "San Francisco", "Jane Doe",
                8000.00, 200, 3, true, 10.00, true, 15.00, true, 20.00);
        System.out.println(conferenceEvent.toString());
        System.out.println("Event Cost: $" + conferenceEvent.calculateEventCost());

        MusicConcertEvent musicConcertEvent = new MusicConcertEvent("E003", "Rock Concert", "Los Angeles", "Mike Johnson",
                10000.00, 500, 1, true, 5.00);
        System.out.println(musicConcertEvent.toString());
        System.out.println("Event Cost: $" + musicConcertEvent.calculateEventCost());
    }
}