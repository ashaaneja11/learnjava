TreeSet is a part of Java’s Collection Framework based on a Red-Black Tree (self-balancing binary search tree).

Feature	Description
Ordering	✅ Sorted in natural order or via custom Comparator
Duplicates	❌ Not allowed (only unique elements)
Null values	❌ Not allowed (unless first inserted, and only one null)
Time complexity	O(log n) for add, remove, and contains
Backed by	NavigableSet → SortedSet → Set

✅ TreeSet Core Features
Automatically sorted

Allows range queries (e.g. from X to Y)

Supports ceiling, floor, higher, lower

Provides subset views using subSet(), headSet(), tailSet()

import java.util.TreeSet;

public class TreeSetExample {
  public static void main(String[] args) {
    TreeSet<Integer> set = new TreeSet<>();

    // ✅ Add elements
    set.add(50);
    set.add(10);
    set.add(30);
    set.add(20);
    set.add(40);

    System.out.println("TreeSet (Sorted): " + set);

    // ✅ Size and check
    System.out.println("Size: " + set.size());
    System.out.println("Contains 30? " + set.contains(30));

    // ✅ First and last
    System.out.println("First: " + set.first());
    System.out.println("Last: " + set.last());

    // ✅ Ceiling, Floor, Higher, Lower
    System.out.println("Ceiling(25): " + set.ceiling(25)); // ≥ 25
    System.out.println("Floor(25): " + set.floor(25));     // ≤ 25
    System.out.println("Higher(30): " + set.higher(30));   // > 30
    System.out.println("Lower(30): " + set.lower(30));     // < 30

    // ✅ Subsets
    System.out.println("HeadSet(30): " + set.headSet(30));         // < 30
    System.out.println("TailSet(30): " + set.tailSet(30));         // ≥ 30
    System.out.println("SubSet(20, 40): " + set.subSet(20, 40));   // ≥20 and <40

    // ✅ Remove
    set.remove(10);
    System.out.println("After removing 10: " + set);

    // ✅ Poll (remove and return first/last)
    System.out.println("PollFirst: " + set.pollFirst());
    System.out.println("PollLast: " + set.pollLast());
    System.out.println("After polling: " + set);

    // ✅ isEmpty and clear
    System.out.println("Is empty? " + set.isEmpty());
    set.clear();
    System.out.println("After clear: " + set);
  }
}
