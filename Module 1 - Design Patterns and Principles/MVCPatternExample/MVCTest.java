public class MVCTest {

    public static void main(String[] args) {

        Student student = new Student();

        student.setName("Siddhu");
        student.setId("101");
        student.setGrade("A");

        StudentView view = new StudentView();

        StudentController controller =
                new StudentController(student, view);

        controller.updateView();

        System.out.println();

        controller.setStudentName("Sindhu");
        controller.setStudentGrade("A+");

        controller.updateView();

    }

}