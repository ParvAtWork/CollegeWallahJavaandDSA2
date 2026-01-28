/*
===========================================
        📘 Java Math Library Notes
===========================================

🔹 Overview:
- Java provides a built-in Math class in java.lang package.
- Contains static methods → directly called as Math.methodName().
- Useful for scientific, financial, and DSA problems.

-------------------------------------------
🔹 Commonly Used Methods
-------------------------------------------

1) Absolute Value
   Math.abs(x)
   - Returns positive value of x.
   Example: Math.abs(-10) → 10

2) Maximum & Minimum
   Math.max(a, b), Math.min(a, b)
   - Compare two values.
   Example: Math.max(5, 9) → 9

3) Power & Roots
   Math.pow(a, b) → a^b
   Math.sqrt(x)   → √x
   Math.cbrt(x)   → ∛x
   Example: Math.pow(2, 3) → 8

4) Rounding
   Math.round(x) → nearest integer
   Math.floor(x) → round down
   Math.ceil(x)  → round up
   Example: Math.floor(3.9) → 3

5) Random Number
   Math.random()
   - Returns double in [0.0, 1.0).
   Example: (int)(Math.random() * 10) → 0 to 9

6) Trigonometry
   Math.sin(rad), Math.cos(rad), Math.tan(rad)
   Math.toRadians(deg), Math.toDegrees(rad)
   Example: Math.sin(Math.toRadians(90)) → 1.0

7) Logarithms & Exponentials
   Math.log(x)   → natural log (base e)
   Math.log10(x) → log base 10
   Math.exp(x)   → e^x
   Example: Math.log10(100) → 2.0

8) Hypotenuse
   Math.hypot(a, b)
   - Returns √(a² + b²).
   Example: Math.hypot(3, 4) → 5.0

-------------------------------------------
🔹 Constants
-------------------------------------------
- Math.PI → 3.141592653589793
- Math.E  → 2.718281828459045

-------------------------------------------
🔹 Use Cases in DSA
-------------------------------------------
- Math.max/min → Array problems (find largest/smallest element).
- Math.abs     → Distance problems, difference calculations.
- Math.pow     → Exponentiation in recursion/DP.
- Math.sqrt    → Perfect square checks.
- Math.random  → Randomized algorithms, test data generation.
- Math.floor/ceil → Binary search mid calculation (avoid overflow).
- Trigonometry → Geometry/graphics problems.

-------------------------------------------
🔹 Example Code
-------------------------------------------
public class MathLibraryDemo {
    public static void main(String[] args) {
        int a = -25;
        System.out.println("Absolute: " + Math.abs(a));
        System.out.println("Max: " + Math.max(10, 20));
        System.out.println("Power: " + Math.pow(2, 5));
        System.out.println("Square Root: " + Math.sqrt(49));
        System.out.println("Random (0-9): " + (int)(Math.random() * 10));
        System.out.println("PI Constant: " + Math.PI);
    }
}

===========================================
End of Notes ✅
===========================================
*/

/*
===========================================
        📘 Advanced Java Math Libraries Notes
===========================================

🔹 Why Advanced Libraries?
- Built-in java.lang.Math covers basics (abs, sqrt, pow, random).
- For complex DSA, statistics, optimization, geometry, or scientific computing,
  external libraries provide powerful tools.

===========================================
🔹 1. Apache Commons Math
===========================================
Dependency: org.apache.commons:commons-math3

Features:
- Linear algebra (matrices, vectors)
- Probability distributions
- Optimization algorithms
- Complex numbers
- Statistical functions

DSA Uses:
- Randomized algorithms (better random generators)
- Probability problems (binomial, normal distribution)
- Matrix operations in graph algorithms
- Optimization in DP/Greedy problems

Example:
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
DescriptiveStatistics stats = new DescriptiveStatistics();
stats.addValue(10);
stats.addValue(20);
System.out.println(stats.getMean()); // 15.0

-------------------------------------------
🔹 2. JScience
-------------------------------------------
Dependency: org.jscience:jscience

Features:
- Units of measurement (SI units, conversions)
- Complex numbers
- Matrices and algebra

DSA Uses:
- Geometry problems (unit conversions, precise calculations)
- Complex number handling in algorithms
- Matrix-based problems (graph, DP)

Example:
import org.jscience.physics.amount.Amount;
import javax.measure.unit.SI;
Amount<?> length = Amount.valueOf(10, SI.METER);
System.out.println(length); // 10 m

-------------------------------------------
🔹 3. Colt Library
-------------------------------------------
Dependency: colt:colt

Features:
- High-performance numerical computing
- Random number generators
- Matrix operations
- Statistical functions

DSA Uses:
- Large-scale simulations
- Fast matrix multiplications in graph algorithms
- Randomized algorithms (Monte Carlo, probabilistic methods)

-------------------------------------------
🔹 4. JTS Topology Suite (Geometry-focused)
-------------------------------------------
Dependency: org.locationtech.jts:jts-core

Features:
- Geometric objects (Point, Line, Polygon)
- Intersection, Union, Buffer
- Spatial analysis

DSA Uses:
- Geometry problems (convex hull, intersection)
- Computational geometry in contests
- GIS/map-based algorithms

Example:
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Point;
GeometryFactory gf = new GeometryFactory();
Point p = gf.createPoint(new org.locationtech.jts.geom.Coordinate(5, 10));
System.out.println(p); // POINT (5 10)

===========================================
🔹 Comparison Table
-------------------------------------------
| Library             | Focus Area             | DSA Uses                          |
|---------------------|------------------------|-----------------------------------|
| java.lang.Math      | Basic math             | Arrays, searching, binary search  |
| Apache Commons Math | Statistics, algebra    | Probability, optimization, matrix |
| JScience            | Scientific units       | Geometry, complex numbers         |
| Colt                | Numerical computing    | Simulations, matrix ops           |
| JTS Topology Suite  | Geometry/GIS           | Computational geometry problems   |

===========================================
💡 Key Takeaways
-------------------------------------------
- For interviews/DSA → java.lang.Math is sufficient.
- For advanced prep → Apache Commons Math (probability, optimization) is most useful.
- For geometry-heavy problems → JTS is excellent.
- For scientific/engineering → JScience is handy.
- For large simulations → Colt library is efficient.

===========================================
End of Notes ✅
===========================================
*/

