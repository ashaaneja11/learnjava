Feature	Behavior
Duplicates	❌ Not allowed (only unique elements)
Order	❌ No guarantee (unlike List)
Null elements	✅ One null is allowed
Backed by	HashMap internally
Time complexity	✅ O(1) for add(), remove(), contains() (on average)



import java.util.HashSet;
import java.util.Iterator;

public class HashSetFunctions {
  public static void main(String[] args) {
    // ✅ Create a HashSet
    HashSet<String> set = new HashSet<>();

    // ✅ Add elements
    set.add("Amit");
    set.add("Neha");
    set.add("Ravi");
    set.add("Neha"); // Duplicate - ignored

    System.out.println("HashSet: " + set);

    // ✅ Size
    System.out.println("Size: " + set.size());

    // ✅ Contains
    System.out.println("Contains 'Ravi'? " + set.contains("Ravi"));
    System.out.println("Contains 'Zara'? " + set.contains("Zara"));

    // ✅ Remove
    set.remove("Amit");
    System.out.println("After removing 'Amit': " + set);

    // ✅ isEmpty
    System.out.println("Is empty? " + set.isEmpty());

    // ✅ Iteration - Method 1: for-each
    System.out.println("\n--- Loop using for-each ---");
    for (String name : set) {
      System.out.println(name);
    }

    // ✅ Iteration - Method 2: Iterator
    System.out.println("\n--- Loop using Iterator ---");
    Iterator<String> it = set.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }

    // ✅ Add null
    set.add(null);
    System.out.println("After adding null: " + set);

    // ✅ Clone
    HashSet<String> copy = (HashSet<String>) set.clone();
    System.out.println("Cloned set: " + copy);

    // ✅ Clear all elements
    set.clear();
    System.out.println("After clear(): " + set);
  }
}
