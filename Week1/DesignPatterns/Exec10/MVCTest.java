

public class MVCTest {

    public static void main(String[] args) {
        // Create the model
        Student student = new Student("001", "John Doe", "A");

        // Create the view
        StudentView view = new StudentView();

        // Create the controller
        StudentController controller = new StudentController(student, view);

        // Display the initial details
        controller.updateView();

        // Update the student's details
        controller.setStudentName("Jane Smith");
        controller.setStudentGrade("B+");

        // Display the updated details
        controller.updateView();
    }
}
