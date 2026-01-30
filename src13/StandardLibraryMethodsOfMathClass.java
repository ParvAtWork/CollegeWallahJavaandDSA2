/*
===========================================================
        📘 JAVA MATH LIBRARY – INTELLIJ NOTES
===========================================================

1. INTRODUCTION
   - Math class Java ke java.lang package mein hoti hai.
   - Automatically imported hoti hai (import karne ki zaroorat nahi).
   - Saare methods static hote hain → object banane ki zaroorat nahi.
   - Usage: Math.methodName(arguments);

-----------------------------------------------------------
2. COMMONLY USED METHODS

   A) Basic Operations
      - Math.max(a, b)      → returns larger of two values
      - Math.min(a, b)      → returns smaller of two values
      - Math.abs(x)         → returns absolute value
      - Math.sqrt(x)        → square root
      - Math.pow(a, b)      → a raised to power b
      - Math.random()       → random double [0.0, 1.0)

   B) Rounding Methods
      - Math.round(x)       → nearest integer (long/int)
      - Math.ceil(x)        → smallest integer ≥ x
      - Math.floor(x)       → largest integer ≤ x

   C) Trigonometric Methods
      - Math.sin(angle)     → sine of angle (in radians)
      - Math.cos(angle)     → cosine of angle
      - Math.tan(angle)     → tangent of angle
      - Math.toRadians(deg) → converts degrees → radians
      - Math.toDegrees(rad) → converts radians → degrees

   D) Logarithmic & Exponential
      - Math.log(x)         → natural log (base e)
      - Math.log10(x)       → log base 10
      - Math.exp(x)         → e^x

   E) Special Constants
      - Math.PI             → 3.141592653589793
      - Math.E              → 2.718281828459045

-----------------------------------------------------------
3. EXAMPLES

   Example 1: Square Root
       double result = Math.sqrt(25); // 5.0

   Example 2: Power
       double result = Math.pow(2, 3); // 8.0

   Example 3: Random Number
       double rand = Math.random(); // 0.0 to 1.0

   Example 4: Rounding
       double val = 7.8;
       System.out.println(Math.round(val)); // 8
       System.out.println(Math.floor(val)); // 7
       System.out.println(Math.ceil(val));  // 8

   Example 5: Trigonometry
       double angle = Math.toRadians(30);
       System.out.println(Math.sin(angle)); // 0.5

-----------------------------------------------------------
4. BEST PRACTICES
   - Always remember: angles in trigonometric methods are in radians.
   - Use Math constants (PI, E) instead of hardcoding values.
   - For random integers:
       int randInt = (int)(Math.random() * 100); // 0 to 99
   - IntelliJ Tip: Hover over method → quick documentation.

===========================================================
END OF NOTES
===========================================================
*/


public class StandardLibraryMethodsOfMathClass {
    public static void main(String[] args){
        System.out.println(Math.sqrt(25));
        System.out.println(Math.sqrt(16));

        System.out.println(Math.floor(4.6));  //4.6 sa choti value round off vali konsi hoyi hai yaha pa 4.0 tho de da gha.
        System.out.println(Math.floor(5.3));

        System.out.println(Math.ceil(2.4));   //2.4 sa ki round off badi value kya ho ghi 3 tho vo answer main de gha.
        System.out.println(Math.ceil(8.6));

         //Sab math methods ki values double main return ho ghi.

    }
}
