/*
===========================================
        📘 Java Array Classes Notes
===========================================

🔹 Overview:
- Arrays are fundamental data structures in Java.
- Java provides multiple classes/utilities to work with arrays:
  1) java.util.Arrays
  2) java.util.ArrayList
  3) java.util.Vector
  4) java.util.Stack
  5) java.util.LinkedList (though not array-based, often compared)
- Each has unique use cases in DSA and real-world projects.

===========================================
🔹 1. java.util.Arrays (Utility Class)
===========================================
Definition:
- Provides static methods to manipulate arrays (sorting, searching, printing).

Common Methods:
- Arrays.toString(arr) → prints 1D array
- Arrays.deepToString(arr) → prints multi-dimensional array
- Arrays.sort(arr) → sorts array
- Arrays.binarySearch(arr, key) → searches in sorted array
- Arrays.copyOf(arr, newLength) → copies array
- Arrays.equals(arr1, arr2) → compares arrays

Example:
import java.util.Arrays;
int[] arr = {5, 2, 9};
Arrays.sort(arr);
System.out.println(Arrays.toString(arr)); // [2, 5, 9]

Use Cases:
- Quick debugging (toString, deepToString)
- Sorting/searching in DSA problems
- Copying arrays in DP/recursion

===========================================
🔹 2. java.util.ArrayList (Dynamic Array)
===========================================
Definition:
- Resizable array implementation of List interface.
- Stores objects, maintains insertion order.

Common Methods:
- add(element), add(index, element)
- get(index), set(index, element)
- remove(index/object)
- size(), contains(element), clear()

Example:
import java.util.ArrayList;
ArrayList<Integer> list = new ArrayList<>();
list.add(10);
list.add(20);
System.out.println(list); // [10, 20]

Use Cases:
- Dynamic storage in DSA (BFS/DFS adjacency lists)
- Real-world: shopping carts, dynamic lists
- Easier manipulation compared to fixed arrays

===========================================
🔹 3. java.util.Vector (Legacy Dynamic Array)
===========================================
Definition:
- Similar to ArrayList but synchronized (thread-safe).
- Rarely used now, but important in legacy systems.

Common Methods:
- add(), get(), remove(), size()

Example:
import java.util.Vector;
Vector<String> v = new Vector<>();
v.add("A");
v.add("B");
System.out.println(v); // [A, B]

Use Cases:
- Multi-threaded environments (legacy)
- Rare in modern DSA, but useful in concurrent apps

===========================================
🔹 4. java.util.Stack (LIFO Data Structure)
===========================================
Definition:
- Extends Vector, represents stack (Last-In-First-Out).

Common Methods:
- push(element)
- pop()
- peek()
- empty()

Example:
import java.util.Stack;
Stack<Integer> stack = new Stack<>();
stack.push(10);
stack.push(20);
System.out.println(stack.pop()); // 20

Use Cases:
- DSA: Balanced parentheses, recursion simulation
- Real-world: Undo/Redo operations

===========================================
🔹 5. java.util.LinkedList (List + Queue)
===========================================
Definition:
- Doubly linked list implementation of List and Deque.
- Not array-based, but often compared with ArrayList.

Common Methods:
- addFirst(), addLast()
- removeFirst(), removeLast()
- getFirst(), getLast()

Example:
import java.util.LinkedList;
LinkedList<Integer> ll = new LinkedList<>();
ll.add(1);
ll.add(2);
System.out.println(ll); // [1, 2]

Use Cases:
- DSA: Queue/Deque problems
- Real-world: Task scheduling, playlist management

===========================================
🔹 Comparison Table
-------------------------------------------
| Class       | Type             | Key Use Cases                     |
|-------------|------------------|-----------------------------------|
| Arrays      | Utility class    | Sorting, searching, printing      |
| ArrayList   | Dynamic array    | BFS/DFS, dynamic storage          |
| Vector      | Legacy array     | Thread-safe legacy apps           |
| Stack       | LIFO structure   | Recursion, undo/redo              |
| LinkedList  | Linked structure | Queue, deque, scheduling          |

===========================================
🔹 DSA Notes
-------------------------------------------
- Arrays → base for algorithms (sorting, searching).
- ArrayList → adjacency lists, dynamic problems.
- Stack → recursion, expression evaluation.
- LinkedList → queue/deque problems.
- Arrays class → quick utilities for debugging.

===========================================
End of Notes ✅
===========================================
*/
