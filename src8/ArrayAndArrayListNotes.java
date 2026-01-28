/*
===========================================
        📘 Java Arrays & ArrayList Notes
===========================================

🔹 Arrays (Fixed-size, Homogeneous Data Structure)
-------------------------------------------
Definition:
- An array is a collection of elements of the same type stored in contiguous memory.
- Size is fixed at creation.

Declaration & Initialization:
int[] arr = new int[5];          // declaration with size
int[] nums = {1, 2, 3, 4, 5};    // declaration with values

Access:
System.out.println(nums[2]);     // prints 3

Properties:
- Index-based (0 to length-1)
- Fixed size (cannot grow/shrink)
- Can store primitives or objects
- Default values: int → 0, boolean → false, object → null

Common Operations:
- Traversal: for loop, enhanced for loop
- Searching: Linear Search, Binary Search (sorted arrays)
- Sorting: Arrays.sort(arr)
- Utility: Arrays.toString(arr), Arrays.copyOf(arr, newLength)

Example:
import java.util.Arrays;
int[] arr = {10, 20, 30};
System.out.println(Arrays.toString(arr)); // [10, 20, 30]

Use Cases in DSA:
- Storing fixed-size data (marks, elements)
- Implementing algorithms (prefix sum, sliding window)
- Basis for advanced structures (matrix, DP tables)

-------------------------------------------
🔹 ArrayList (Dynamic, Resizable Collection)
-------------------------------------------
Definition:
- Part of java.util package.
- A resizable array implementation of List interface.
- Can grow/shrink dynamically.

Declaration & Initialization:
import java.util.ArrayList;                 Declaration-> What it means: You are telling the compiler that a variable named list will exist, and it will hold an object of type ArrayList<Integer>.ArrayList<Integer> → the data type (a generic ArrayList that stores Integer objects).list → the variable name.
ArrayList<Integer> list = new ArrayList<>();

Adding Elements:
list.add(10);
list.add(20);

Access:
System.out.println(list.get(0)); // prints 10

Properties:
- Dynamic size (auto-resizes)
- Stores objects (Generics used for type safety)
- Allows duplicates
- Maintains insertion order

Common Operations:
- add(element), add(index, element)
- get(index)
- set(index, element)
- remove(index), remove(object)
- size()
- contains(element)
- clear()

Example:
ArrayList<String> names = new ArrayList<>();
names.add("Parv");
names.add("Copilot");
System.out.println(names); // [Parv, Copilot]

Use Cases in DSA:
- When size is unknown or changes frequently
- Useful in problems requiring dynamic storage
- Easier manipulation compared to arrays (insert/remove)

-------------------------------------------
🔹 Comparison: Array vs ArrayList
-------------------------------------------
| Feature          | Array                        | ArrayList                    |
|------------------|------------------------------|------------------------------|
| Size             | Fixed                        | Dynamic (auto-resizes)       |
| Data Type        | Primitives & Objects         | Objects only (Generics)      |
| Performance      | Faster (low-level)           | Slight overhead (resizing)   |
| Flexibility      | Less flexible                | More flexible                |
| Utilities        | Arrays class methods         | ArrayList methods            |

-------------------------------------------
🔹 Example Demo
-------------------------------------------
public class ArrayVsArrayListDemo {
    public static void main(String[] args) {
        // Array Example
        int[] arr = {1, 2, 3};
        System.out.println("Array element: " + arr[1]); // 2

        // ArrayList Example
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        System.out.println("ArrayList element: " + list.get(1)); // 200
    }
}

===========================================
End of Notes ✅
===========================================
*/
