import java.util.ArrayList;

public class MyClass {
  public static void main(String[] args) {

    ArrayList<String> students = new ArrayList<>();

    // Add students
    students.add("Amit");
    students.add("Neha");
    students.add("Ravi");
    students.add("Priya");

    System.out.println("Original list: " + students);

    // ✅ Update (set) name at index 2 (replaces "Ravi" with "Raj")
    students.set(2, "Raj");
    System.out.println("After set at index 2: " + students);

    // ✅ Check if a student is in the list
    boolean hasNeha = students.contains("Neha");
    System.out.println("Contains 'Neha'? " + hasNeha);

    boolean hasJohn = students.contains("John");
    System.out.println("Contains 'John'? " + hasJohn);
  }
}
