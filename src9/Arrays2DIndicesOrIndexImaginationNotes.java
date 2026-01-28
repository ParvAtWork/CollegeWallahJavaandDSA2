/*
===========================================
        📘 Visualizing Indices in 2D Arrays
===========================================

🔹 Structure of a 2D Array
-------------------------------------------
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

Visual Grid:
Row → Horizontal
Column → Vertical

Index Mapping:
matrix[0][0] = 1   // First row, first column
matrix[0][1] = 2   // First row, second column
matrix[1][2] = 6   // Second row, third column
matrix[2][1] = 8   // Third row, second column

Grid View:
[0][0] [0][1] [0][2]
[1][0] [1][1] [1][2]
[2][0] [2][1] [2][2]

-------------------------------------------
🔹 Access Pattern
-------------------------------------------
- Outer loop → rows (i)
- Inner loop → columns (j)

for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.println("matrix[" + i + "][" + j + "] = " + matrix[i][j]);
    }
}

-------------------------------------------
🔹 Real-World Analogy
-------------------------------------------
Imagine a chessboard:
- Rows → ranks (1 to 8)
- Columns → files (A to H)
- Each cell has a coordinate → [row][column]

Same in 2D array:
- Each element has a coordinate → [i][j]

-------------------------------------------
🔹 DSA Tip
-------------------------------------------
- Always visualize 2D array as a grid.
- Use dry runs to trace indices.
- For diagonals:
  - Primary → matrix[i][i]
  - Secondary → matrix[i][n-1-i]

-------------------------------------------
🔹 Example: Print Indices
-------------------------------------------
public class IndexVisualizer {
    public static void main(String[] args) {
        int[][] grid = {
            {10, 20},
            {30, 40}
        };

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.println("grid[" + i + "][" + j + "] = " + grid[i][j]);
            }
        }
    }
}

===========================================
End of Notes ✅
===========================================
*/

