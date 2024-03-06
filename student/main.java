import java.util.Scanner
public static void main(String[] args) {
    event event = new event();

    System.out.print("Enter the event ID: ");
    event.setEventID(Scanner.nextLine()); // Use Scanner.nextLine() to read the entire line instead of next()

    System.out.print("Enter the event name: ");
    event.setEventName(Scanner.nextLine());

    System.out.print("Enter the event venue: ");
    event.setEventVenue(Scanner.nextLine());

    System.out.print("Enter the event date (in MM/dd/yyyy format): ");
    event.setEventDate(java.util.Date.valueOf(Scanner.nextLine())); // Use java.util.Date.valueOf() to convert the input date

    System.out.print("Enter the attendee names (separate with spaces or new lines): "); // Allow the user to enter attendee names separated by spaces or new lines
    String attendees = Scanner.nextLine(); // Use Scanner.nextLine() to read the entire line

    String[] attendeeNames = attendees.split("[\\s\r\n]+"); // Split the attendee names based on spaces or new lines
    for (String attendeeName : attendeeNames) {
        event.addAttendee(attendeeName);
    }

    event.organizeEvent();
}
