import java.util.ArrayList;

public class MyClass {
  public static void main(String[] args) {

    ArrayList<String> students = new ArrayList<>();

    // Add some students
    students.add("Amit");
    students.add("Neha");
    students.add("Ravi");
    students.add("Priya");
    students.add("Neha"); // Duplicate name for testing

    System.out.println("Original list: " + students);

    // ✅ Remove by index (removes "Neha" at index 1)
    students.remove(1);
    System.out.println("After removing index 1: " + students);

    // ✅ Remove by value (removes first "Neha" found)
    students.remove("Neha");
    System.out.println("After removing value 'Neha': " + students);

    // ✅ Remove by value (non-existent name)
    boolean removed = students.remove("John"); // returns false
    System.out.println("Tried removing 'John' (was found? " + removed + ")");
    System.out.println("List after trying to remove 'John': " + students);

    // ✅ Clear the list
    students.clear();
    System.out.println("After clear(): " + students);
  }
}
