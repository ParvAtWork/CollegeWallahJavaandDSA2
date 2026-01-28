/*
===========================================
        📘 Java 2D Array Notes
===========================================

🔹 Overview:
- A 2D array is an array of arrays.
- It represents data in a tabular (rows & columns) format.
- Useful for matrices, grids, dynamic programming tables, and board games.

-------------------------------------------
🔹 Declaration & Initialization
-------------------------------------------

1) Declaration:
int[][] arr;

2) Initialization with size:
arr = new int[3][4];   // 3 rows, 4 columns //Giving input to the column is not that imp.

3) Declaration + Initialization:
int[][] arr = new int[3][4];

4) Initialization with values:
int[][] arr = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

-------------------------------------------
🔹 Accessing Elements
-------------------------------------------
- Use two indices: arr[row][col]
System.out.println(arr[1][2]); // prints 6

-------------------------------------------
🔹 Traversal
-------------------------------------------
Using nested loops:
for (int i = 0; i < arr.length; i++) {          // rows
    for (int j = 0; j < arr[i].length; j++) {   // columns
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
}

Enhanced for loop:
for (int[] row : arr) {
    for (int val : row) {
        System.out.print(val + " ");
    }
    System.out.println();
}

-------------------------------------------
🔹 Properties
-------------------------------------------
- arr.length → number of rows
- arr[i].length → number of columns in row i
- Can be jagged (rows of different lengths):
  int[][] jagged = {
      {1, 2},
      {3, 4, 5},
      {6}
  };

-------------------------------------------
🔹 Common Operations
-------------------------------------------
1) Sum of all elements
2) Transpose of a matrix
3) Search in 2D array
4) Row-wise and column-wise traversal
5) Diagonal elements

Example: Sum of all elements
int sum = 0;
for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[i].length; j++) {
        sum += arr[i][j];
    }
}
System.out.println("Sum = " + sum);

-------------------------------------------
🔹 Use Cases in DSA
-------------------------------------------
- Matrices (graph adjacency matrix, DP table)
- Grid problems (maze, shortest path)
- Image processing (pixel data)
- Board games (chess, sudoku)

-------------------------------------------
🔹 Example Demo
-------------------------------------------
public class TwoDArrayDemo {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Print matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Access element
        System.out.println("Element at [2][1]: " + matrix[2][1]); // 8
    }
}

===========================================
End of Notes ✅
===========================================
*/

/*
-------------------------------------------
🔹 Common Operations
-------------------------------------------
1) Sum of all elements
2) Transpose of a matrix
3) Search in 2D array
4) Row-wise and column-wise traversal
5) Diagonal elements
*/
//Example codes for these Operations are given below.

/*
===========================================
        📘 Java 2D Array Common Operations
===========================================

🔹 1) Sum of all elements
-------------------------------------------
public class Sum2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Sum of all elements = " + sum); // 45
    }
}

🔹 2) Transpose of a matrix
-------------------------------------------
public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transpose:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}

🔹 3) Search in 2D array
-------------------------------------------
public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        int target = 50;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    System.out.println("Found at position: [" + i + "][" + j + "]");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }
    }
}

🔹 4) Row-wise and Column-wise traversal
-------------------------------------------
public class RowColTraversal {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Row-wise
        System.out.println("Row-wise traversal:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Column-wise
        System.out.println("Column-wise traversal:");
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

🔹 5) Diagonal elements
-------------------------------------------
public class DiagonalElements {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Primary Diagonal:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        System.out.println("\nSecondary Diagonal:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][matrix.length - 1 - i] + " ");
        }
    }
}

===========================================
💡 DSA Notes:
-------------------------------------------
- Sum → prefix sums, matrix sum problems.
- Transpose → matrix rotation, graph adjacency matrix.
- Search → brute force search in 2D grids.
- Row/Column traversal → BFS/DFS in grids.
- Diagonals → DP problems, matrix diagonals, Sudoku checks.

===========================================
End of Notes ✅
===========================================
*/
