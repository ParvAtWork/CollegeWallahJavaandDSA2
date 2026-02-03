/*
==========================================================
📘 Notes: Actual Parameters vs Formal Parameters
==========================================================

🔹 1. Definitions
----------------------------------------------------------
- Actual Parameters:
    → The values/variables passed to a method at the time of calling.
    → Exist in the caller method (like main()).
    → Example: sum(5, 10); → here 5 and 10 are actual parameters.

- Formal Parameters:
    → The variables declared in the method definition to receive values.
    → Exist inside the called method.
    → Example: int sum(int a, int b) → here a and b are formal parameters.

----------------------------------------------------------

🔹 2. Example in Java
----------------------------------------------------------
class Algebra {
    // Formal parameters: a, b
    static int add(int a, int b) {
        return a + b;
    }
}

public class Demo {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;

        // Actual parameters: x, y
        int result = Algebra.add(x, y);

        System.out.println("Sum = " + result);
    }
}

----------------------------------------------------------

🔹 3. Dry Run
----------------------------------------------------------
main():
    x = 5, y = 7
    call → Algebra.add(x, y)

add():
    formal parameters a = 5, b = 7
    return a + b = 12

Output:
    Sum = 12

----------------------------------------------------------

🔹 4. Key Rules
----------------------------------------------------------
1. Actual parameters → values/variables passed during method call.
2. Formal parameters → variables declared in method signature.
3. Names of actual and formal parameters can be different.
   Example: add(x, y) → formal parameters are a, b.
4. Java always uses "pass by value":
   → Copy of actual parameter is given to formal parameter.
   → For objects, copy of reference value is passed (so object fields can change).

----------------------------------------------------------

🔹 5. Comparison Table
----------------------------------------------------------
| Aspect              | Actual Parameters         | Formal Parameters        |
|---------------------|---------------------------|--------------------------|
| Location            | At method call site       | In method definition     |
| Purpose             | Provide values            | Receive values           |
| Lifetime            | Caller method scope       | Called method scope      |
| Example             | add(x, y);                | int add(int a, int b)    |

==========================================================
*/

