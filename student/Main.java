public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numStudents = getNumberOfStudents(); // Get the number of students from user

        for (int i = 0; i < numStudents; i++) {
            createStudent(i); // Create a student for each iteration
        }

        scanner.close();
    }

    private static int getNumberOfStudents() {
        System.out.println("please enter the number of students:");
        return scanner.nextInt(); // Get the number of students from user
    }

    private static void createStudent(int index) {
        System.out.println("create " + (index + 1) + " student");

        String studentID = getInput("student ID: "); // Get input for student ID
        String studentName = getInput("student name: "); // Get input for student name

        Student student = new Student(studentID, studentName); // Create a Student object

        int numExtraActivities = getInput("number of additional activities: "); // Get the number of extra activities

        for (int i = 0; i < numExtraActivities; i++) {
            student.addExtraActivity(); // Add extra activities
        }
    }

    private static String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine(); // Get user input
    }
}