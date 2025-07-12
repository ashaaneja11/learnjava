import java.util.ArrayList;

public class MyClass {
  public static void main(String[] args) {

    // Create first list of students
    ArrayList<String> students = new ArrayList<>();
    students.add("Amit");
    students.add("Neha");
    students.add("Ravi");

    System.out.println("Original students: " + students);

    // Insert a new student at index 1
    students.add(1, "Priya"); // Neha moves to index 2

    System.out.println("After adding at index 1: " + students);

    // Create another list of new students
    ArrayList<String> newStudents = new ArrayList<>();
    newStudents.add("John");
    newStudents.add("Zara");

    // Add all new students to main list
    students.addAll(newStudents); // Appends at the end

    System.out.println("After addAll(): " + students);

    // Insert all new students at index 2
    students.addAll(2, newStudents); // Inserts at index 2

    System.out.println("After addAll() at index 2: " + students);
  }
}
