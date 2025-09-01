import java.util.ArrayList;

public class ResultManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("✅ Student added successfully!\n");
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("⚠ No students found.\n");
            return;
        }
        System.out.println("\n📋 All Student Results:");
        for (Student s : students) {
            s.display();
        }
    }

    public void searchStudent(int rollNo) {
        for (Student s : students) {
            if (s.getRollNo() == rollNo) {
                System.out.println("\n🔍 Student Found:");
                s.display();
                return;
            }
        }
        System.out.println("❌ Student with Roll No " + rollNo + " not found.\n");
    }
}
