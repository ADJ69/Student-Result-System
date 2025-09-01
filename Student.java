import java.util.Arrays;

public class Student {
    private int rollNo;
    private String name;
    private int[] marks;
    private int total;
    private double percentage;
    private char grade;

    // Constructor
    public Student(int rollNo, String name, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        calculateResult();
    }

    // Calculate total, percentage, grade
    private void calculateResult() {
        total = Arrays.stream(marks).sum();
        percentage = (double) total / marks.length;

        if (percentage >= 90) grade = 'A';
        else if (percentage >= 75) grade = 'B';
        else if (percentage >= 50) grade = 'C';
        else grade = 'F';
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public double getPercentage() {
        return percentage;
    }

    public char getGrade() {
        return grade;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.print("Marks: ");
        for (int m : marks) {
            System.out.print(m + " ");
        }
        System.out.println("\nTotal: " + total);
        System.out.println("Percentage: " + String.format("%.2f", percentage));
        System.out.println("Grade: " + grade);
        System.out.println("-----------------------------");
    }
}
