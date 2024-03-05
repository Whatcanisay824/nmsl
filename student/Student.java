public class Student {
    private String studentID;
    private String studentName;
    private HashSet<String> extraActivities; // Using HashSet for unique activities

    // Constructor to initialize the student details
    public Student(String studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.extraActivities = new HashSet<>();
    }

    // Getter and setter methods for the student ID
    public String getStudentID() {
        return studentID;
    }
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    // Getter and setter methods for the student name
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // Method to add extra activities
    public void addExtraActivity() {
        System.out.println("Enter the extra activity: ");
        extraActivities.add(scanner.nextLine()); // Adding activities to the HashSet
    }

    // toString method to display the student details
    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", studentName='" + studentName + '\'' +
                ", extraActivities=" + extraActivities +
                '}';
    }
}