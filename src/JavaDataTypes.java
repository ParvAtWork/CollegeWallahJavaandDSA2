/*
===========================================
        📘 Java Data Types Notes + Uses
===========================================

Java data types are divided into two categories:
1. Primitive Data Types
2. Non-Primitive (Reference) Data Types
-------------------------------------------

🔹 1. Primitive Data Types (8 types)
-------------------------------------------

1) byte (8-bit)
   - Range: -128 to 127
   - Use: Memory-efficient storage for small numbers, file handling (e.g., reading bytes).
   Example:
   byte age = 25;

2) short (16-bit)
   - Range: -32,768 to 32,767
   - Use: Useful when memory is tight and values fit in range (e.g., sensor data).
   Example:
   short temperature = 300;

3) int (32-bit)
   - Range: -2^31 to 2^31-1
   - Use: Default choice for integers, counters, loop variables.
   Example:
   int count = 1000;

4) long (64-bit)
   - Range: -2^63 to 2^63-1
   - Use: Large integer values (e.g., timestamps, big calculations).
   Example:
   long population = 7800000000L;

5) float (32-bit, single precision)
   - Use: Decimal values with less precision, graphics, scientific calculations.
   Example:
   float pi = 3.14f;

6) double (64-bit, double precision)
   - Use: Default choice for decimal values, financial & scientific computations.
   Example:
   double price = 99.99;

7) char (16-bit Unicode)
   - Use: Single characters, ASCII/Unicode symbols.
   Example:
   char grade = 'A';

8) boolean (1-bit, JVM dependent)
   - Use: Logical values, conditions, flags.
   Example:
   boolean isJavaFun = true;

-------------------------------------------
🔹 2. Non-Primitive (Reference) Data Types
-------------------------------------------

1) String
   - Use: Text storage and manipulation.
   Example:
   String name = "Parv";

2) Arrays
   - Use: Store multiple values of same type.
   Example:
   int[] marks = {90, 85, 88};

3) Classes & Objects
   - Use: Represent real-world entities, OOP concepts.
   Example:
   class Student {
       String name;
       int rollNo;
   }

4) Interfaces
   - Use: Define contracts, achieve abstraction.
   Example:
   interface Vehicle {
       void drive();
   }

-------------------------------------------
💡 Key Points:
-------------------------------------------
- Default values:
  byte/short/int/long → 0
  float/double → 0.0
  char → '\u0000'
  boolean → false
  reference types → null

- Use 'var' (Java 10+) for type inference:
  var x = 10;        // int
  var y = "Copilot"; // String

- int & double are most commonly used.
- byte/short are rare, mainly for optimization.
===========================================
End of Notes ✅
===========================================
*/
