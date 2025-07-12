import java.util.ArrayList;
import java.util.Iterator;

public class MyClass {
  public static void main(String[] args) {

    ArrayList<String> students = new ArrayList<>();
    students.add("Amit");
    students.add("Neha");
    students.add("Raj");
    students.add("Priya");

    System.out.println("----- 1. Using basic for loop -----");
    for (int i = 0; i < students.size(); i++) {
      System.out.println("Index " + i + ": " + students.get(i));
    }

    System.out.println("----- 2. Using for-each loop -----");
    for (String student : students) {
      System.out.println("Student: " + student);
    }

    System.out.println("----- 3. Using Iterator -----");
    Iterator<String> iterator = students.iterator();
    while (iterator.hasNext()) {
      String student = iterator.next();
      System.out.println("From iterator: " + student);
    }
  }
}
