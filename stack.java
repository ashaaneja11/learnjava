import java.util.Stack;
import java.util.Iterator;

public class MyClass {
  public static void main(String[] args) {

    // ✅ Create a stack and add elements
    Stack<String> stack = new Stack<>();
    stack.push("Amit");
    stack.push("Neha");
    stack.push("Ravi");

    System.out.println("Stack after pushes: " + stack);

    // ✅ Peek: view top element
    String top = stack.peek();
    System.out.println("Top element (peek): " + top);

    // ✅ Pop: remove top element
    String removed = stack.pop();
    System.out.println("Removed element (pop): " + removed);
    System.out.println("Stack after pop: " + stack);

    // ✅ Check if empty
    boolean isEmpty = stack.isEmpty();
    System.out.println("Is stack empty? " + isEmpty);

    // ✅ Looping over stack

    System.out.println("\n--- 1. Loop using for-each ---");
    for (String name : stack) {
      System.out.println(name);
    }

    System.out.println("\n--- 2. Loop using for loop (index) ---");
    for (int i = 0; i < stack.size(); i++) {
      System.out.println("Index " + i + ": " + stack.get(i));
    }

    System.out.println("\n--- 3. Loop using Iterator ---");
    Iterator<String> iterator = stack.iterator();
    while (iterator.hasNext()) {
      System.out.println("From iterator: " + iterator.next());
    }

    System.out.println("\n--- 4. Loop from top to bottom manually ---");
    for (int i = stack.size() - 1; i >= 0; i--) {
      System.out.println("Top to bottom: " + stack.get(i));
    }
  }
}
