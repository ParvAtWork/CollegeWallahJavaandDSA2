/*
===========================================
        📘 Difference: Vector vs Arrays Class
===========================================

🔹 Arrays Class (java.util.Arrays)
-------------------------------------------
- Utility class → provides static methods to work with arrays.
- Works on normal Java arrays (int[], String[], etc.).
- Common methods:
  - Arrays.toString(arr) → print array
  - Arrays.deepToString(arr) → print 2D array
  - Arrays.sort(arr) → sort array
  - Arrays.binarySearch(arr, key) → search in sorted array
  - Arrays.copyOf(arr, newLength) → copy array

Use Cases:
- DSA: Sorting, searching, debugging arrays
- Real-world: Quick manipulation of primitive/object arrays


===========================================
        📘 Java Arrays Class Common Methods
===========================================

🔹 Overview:
- java.util.Arrays is a utility class with static methods
  for manipulating arrays (sorting, searching, printing, copying, comparing).
- Very useful in DSA and debugging.

-------------------------------------------
🔹 1) Arrays.toString(arr)
-------------------------------------------
- Prints a 1D array in readable format.

Example:
import java.util.Arrays;
public class ToStringDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4]
    }
}

-------------------------------------------
🔹 2) Arrays.deepToString(arr)
-------------------------------------------
- Prints multi-dimensional arrays in readable format.

Example:
import java.util.Arrays;
public class DeepToStringDemo {
    public static void main(String[] args) {
        int[][] arr = { {1, 2}, {3, 4}, {5, 6} };
        System.out.println(Arrays.deepToString(arr)); // [[1, 2], [3, 4], [5, 6]]
    }
}

-------------------------------------------
🔹 3) Arrays.sort(arr)
-------------------------------------------
- Sorts array in ascending order (default).
- Can also sort with custom comparator for objects.

Example:
import java.util.Arrays;
public class SortDemo {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [1, 2, 5, 9]
    }
}

-------------------------------------------
🔹 4) Arrays.binarySearch(arr, key)
-------------------------------------------
- Searches for key in a sorted array.
- Returns index if found, else returns negative value.

Example:
import java.util.Arrays;
public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 9};
        int index = Arrays.binarySearch(arr, 5);
        System.out.println("Index of 5: " + index); // 2
    }
}

-------------------------------------------
🔹 5) Arrays.copyOf(arr, newLength)
-------------------------------------------
- Copies array into a new array with given length.
- If new length > original, extra elements are default values.

Example:
import java.util.Arrays;
public class CopyOfDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] copy = Arrays.copyOf(arr, 5);
        System.out.println(Arrays.toString(copy)); // [1, 2, 3, 0, 0]
    }
}

-------------------------------------------
🔹 6) Arrays.equals(arr1, arr2)
-------------------------------------------
- Compares two arrays for equality (same length + same elements).

Example:
import java.util.Arrays;
public class EqualsDemo {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        System.out.println(Arrays.equals(arr1, arr2)); // true
    }
}

===========================================
💡 DSA Notes:
-------------------------------------------
- toString / deepToString → Debugging arrays quickly.
- sort → Sorting before binary search, greedy problems.
- binarySearch → Searching in sorted arrays.
- copyOf → Useful in DP, recursion (copy states).
- equals → Comparing arrays in test cases.

===========================================
End of Notes ✅
===========================================
*/




