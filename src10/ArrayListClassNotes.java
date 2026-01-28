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
