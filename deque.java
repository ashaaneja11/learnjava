import java.util.Deque;
import java.util.LinkedList;

public class DequeFunctions {
  public static void main(String[] args) {
    Deque<String> deque = new LinkedList<>();

    // ✅ Add elements
    deque.add("A");              // add at tail
    deque.addFirst("B");         // add at head
    deque.addLast("C");          // add at tail

    // ✅ Offer (safe add)
    deque.offer("D");
    deque.offerFirst("E");
    deque.offerLast("F");

    System.out.println("Deque: " + deque);

    // ✅ Peek (view elements)
    System.out.println("First: " + deque.peekFirst());
    System.out.println("Last: " + deque.peekLast());

    // ✅ Poll (remove and return)
    System.out.println("Poll First: " + deque.pollFirst());
    System.out.println("Poll Last: " + deque.pollLast());

    // ✅ Remove (throws exception if empty)
    deque.removeFirst();
    deque.removeLast();

    // ✅ Check size and clear
    System.out.println("Size: " + deque.size());
    System.out.println("Is empty? " + deque.isEmpty());

    // ✅ Iterate
    System.out.println("Forward:");
    for (String s : deque) {
      System.out.println(s);
    }

    System.out.println("Clear all");
    deque.clear();
    System.out.println("Deque after clear: " + deque);
  }
}
