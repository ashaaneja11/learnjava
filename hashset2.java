HashSet<String> set1 = new HashSet<>();
set1.add("A");
set1.add("B");
set1.add("C");

HashSet<String> set2 = new HashSet<>();
set2.add("B");
set2.add("C");
set2.add("D");

// Union
set1.addAll(set2); // now set1 = [A, B, C, D]

// Intersection
set1.retainAll(set2); // now set1 = [B, C]

// Difference
set1.removeAll(set2); // now set1 = []


✅ Summary
Feature	Supported?
Duplicates allowed	❌ No
Null values	✅ Yes (one)
Ordered	❌ No
Random access by index	❌ No
Fast lookup	✅ Yes (O(1) average)

Let me know if you want:

✅ HashSet with custom objects (e.g., Employee)
✅ Convert HashSet to Array or List
✅ Sorted version using TreeSet


Method	Description
add(E e)	Adds element if not present
addAll(Collection)	Adds all elements from another collection
contains(Object o)	Checks if element exists
remove(Object o)	Removes element if exists
removeAll(Collection)	Removes all elements that are in another collection
retainAll(Collection)	Keeps only elements also in the other collection
isEmpty()	Checks if set is empty
size()	Returns number of elements
clear()	Removes all elements
clone()	Creates shallow copy
iterator()	Returns iterator for traversal
toArray()	Converts to Object[] array
equals(Object o)	Compares two sets
