/*===========================================
🔹 2. java.util.ArrayList (Dynamic Array)
===========================================
Definition:
- Resizable array implementation of List interface.
- Stores objects, maintains insertion order.

/*
===========================================
        📘 ArrayList Syntax Structure
===========================================

🔹 Import Statement
-------------------------------------------
import java.util.ArrayList;

🔹 Declaration
-------------------------------------------
ArrayList<Type> list;

Example:
ArrayList<Integer> numbers;
ArrayList<String> names;

🔹 Initialization
-------------------------------------------
list = new ArrayList<>();

Example:
numbers = new ArrayList<>();
names = new ArrayList<>();

🔹 Combined Declaration + Initialization
-------------------------------------------
ArrayList<Type> list = new ArrayList<>();

Example:
ArrayList<Integer> numbers = new ArrayList<>();
ArrayList<String> names = new ArrayList<>();

🔹 Adding Elements
-------------------------------------------
list.add(element);
list.add(index, element);

Example:
numbers.add(10);
numbers.add(20);
numbers.add(1, 15); // insert at index 1

🔹 Accessing Elements
-------------------------------------------
list.get(index);

Example:
System.out.println(numbers.get(0)); // prints 10

🔹 Updating Elements
-------------------------------------------
list.set(index, element);

Example:
numbers.set(1, 99); // updates index 1 → 99

🔹 Removing Elements
-------------------------------------------
list.remove(index);
list.remove(object);

Example:
numbers.remove(0);     // removes element at index 0
numbers.remove(Integer.valueOf(99)); // removes object 99

🔹 Other Useful Methods
-------------------------------------------
list.size();       // number of elements
list.contains(x);  // check if element exists
list.clear();      // remove all elements
list.isEmpty();    // check if list is empty

🔹 Example Demo
-------------------------------------------
import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Parv");
        names.add("Kunal");
        names.add("Rahul");

        System.out.println(names);        // [Parv, Kunal, Rahul]
        System.out.println(names.get(1)); // Kunal
        names.set(2, "Ravi");             // update Rahul → Ravi
        names.remove("Parv");             // remove object "Parv"
        System.out.println(names.size()); // 2
    }
}

===========================================
💡 DSA Notes:
-------------------------------------------
- ArrayList is dynamic → grows/shrinks automatically.
- Commonly used for adjacency lists in graphs.
- Easier than arrays for insert/remove operations.
- Preferred over Vector (non-synchronized, faster).
===========================================
End of Notes ✅
===========================================
*/
/*

Common Methods:
- add(element), add(index, element)
- get(index), set(index, element)
- remove(index/object)
- size(), contains(element), clear()

===========================================
        📘 Java ArrayList Common Methods
===========================================

🔹 Overview:
- ArrayList is a dynamic array implementation of List interface.
- Common methods make it easy to add, access, update, remove, and check elements.

-------------------------------------------
🔹 1) add(element), add(index, element)
-------------------------------------------
- add(element) → adds element at the end.
- add(index, element) → inserts element at specific index.

Example:
import java.util.ArrayList;
public class AddDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add(1, "C"); // insert at index 1
        System.out.println(list); // [A, C, B]
    }
}

-------------------------------------------
🔹 2) get(index), set(index, element)
-------------------------------------------
- get(index) → returns element at given index.
- set(index, element) → updates element at given index.

Example:
import java.util.ArrayList;
public class GetSetDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        System.out.println(list.get(1)); // 20
        list.set(1, 99); // update index 1
        System.out.println(list); // [10, 99]
    }
}

-------------------------------------------
🔹 3) remove(index/object)
-------------------------------------------
- remove(index) → removes element at given index.
- remove(object) → removes first occurrence of object.

Example:
import java.util.ArrayList;
public class RemoveDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("X");
        list.add("Y");
        list.add("Z");
        list.remove(1); // removes element at index 1
        list.remove("Z"); // removes object "Z"
        System.out.println(list); // [X]
    }
}

-------------------------------------------
🔹 4) size(), contains(element), clear()
-------------------------------------------
- size() → returns number of elements.
- contains(element) → checks if element exists.
- clear() → removes all elements.

Example:
import java.util.ArrayList;
public class SizeContainsClearDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        System.out.println(list.size()); // 2
        System.out.println(list.contains(10)); // true
        list.clear();
        System.out.println(list); // []
    }
}

===========================================
💡 DSA Notes:
-------------------------------------------
- add → building adjacency lists, dynamic storage.
- get/set → accessing/updating values in dynamic arrays.
- remove → deleting nodes/elements in problems.
- size → loop control in dynamic structures.
- contains → membership check in problems.
- clear → reset data structure between test cases.

===========================================
End of Notes ✅
===========================================
*/



