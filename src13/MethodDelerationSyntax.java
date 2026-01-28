/*
===========================================================
        📘 JAVA METHOD DECLARATION – DETAILED NOTES
===========================================================

1. METHOD DECLARATION SYNTAX
   [accessModifier] [nonAccessModifier] returnType methodName(parameterList) {
       // method body (statements)
       return value; // optional, depends on returnType
   }

-----------------------------------------------------------
2. COMPONENTS OF METHOD DECLARATION (LABELED)

   a) accessModifier
      - Defines visibility of method.
      - Types:
          * public    → Accessible from anywhere
          * private   → Accessible only within the same class
          * protected → Accessible within package + subclasses
          * default   → Accessible only within package (no keyword)

   b) nonAccessModifier (optional)
      - Defines additional properties of method.
      - Examples:
          * static   → Belongs to class, not object
          * final    → Cannot be overridden
          * abstract → Declared without body (used in abstract classes)

   c) returnType
      - Defines type of value method will return.
      - Examples:
          * void    → No return value
          * int     → Returns integer
          * double  → Returns decimal
          * String  → Returns text
          * Object/Class → Returns object

   d) methodName
      - Identifier for the method.
      - Naming convention: should be a verb (e.g., calculateSum, printDetails).
      - Must follow Java naming rules (no spaces, starts with lowercase letter).

   e) parameterList (optional)
      - Input values passed to method.
      - Format: dataType variableName
      - Multiple parameters separated by commas.
      - Example: (int a, int b)

   f) method body
      - Block of code inside `{ }`.
      - Contains statements to perform the task.

   g) return statement (optional)
      - Used only if returnType is NOT void.
      - Syntax: return value;
      - Example: return a + b;
/*
===========================================================
        📘 JAVA METHOD SIGNATURE – DETAILED NOTES
===========================================================

1. DEFINITION
   - Method Signature = methodName + parameterList
   - It uniquely identifies a method within a class.
   - Return type aur access modifiers signature ka part nahi hote.

-----------------------------------------------------------
2. COMPONENTS OF METHOD SIGNATURE

   a) methodName
      - Represents the name of the method.
      - Should be descriptive (usually a verb).
      - Example: calculateSum, printDetails

   b) parameterList
      - Defines the input values for the method.
      - Includes:
          * Data type of each parameter
          * Order of parameters
          * Number of parameters
      - Example: (int a, int b)

   NOTE:
   - Access modifiers (public, private, etc.) → NOT part of signature
   - Return type (int, void, String, etc.) → NOT part of signature
   - Example:
       public int addNumbers(int a, int b)
       Signature = addNumbers(int, int)

-----------------------------------------------------------
3. IMPORTANCE OF METHOD SIGNATURE
   - Compiler uses signature to differentiate between methods.
   - Helps in method overloading (same name, different parameters).
   - Ensures uniqueness of method calls.

-----------------------------------------------------------
4. METHOD OVERLOADING & SIGNATURE
   - Overloading = same method name but different signatures.
   - Example:
       public int sum(int a, int b) { return a+b; }
       public double sum(double a, double b) { return a+b; }
       public int sum(int a, int b, int c) { return a+b+c; }

   - All above have same name "sum" but different signatures:
       * sum(int, int)
       * sum(double, double)
       * sum(int, int, int)

-----------------------------------------------------------
5. BEST PRACTICES
   - Keep method names meaningful and consistent.
   - Avoid confusing signatures (too many parameters).
   - Prefer using descriptive parameter names.
   - IntelliJ IDEA tip:
       * Hover over method → shows signature in tooltip.
       * Ctrl+P → shows parameter info while calling method.

===========================================================
END OF NOTES
===========================================================
*/
/*
-----------------------------------------------------------
3. EXAMPLES

   Example 1: Simple Method
   public void greet() {
       System.out.println("Hello World!");
   }
   - public → accessible everywhere
   - void   → no return value
   - greet  → method name
   - ()     → no parameters
   - body   → prints message

   Example 2: Method with Parameters & Return
   public int addNumbers(int x, int y) {
       return x + y;
   }
   - public     → accessible everywhere
   - int        → returns integer
   - addNumbers → method name
   - (int x, int y) → parameters
   - body       → adds numbers
   - return     → returns sum

   Example 3: Static Method
   public static double square(double num) {
       return num * num;
   }
   - static → can be called using ClassName.square(4.0);

-----------------------------------------------------------
4. METHOD SIGNATURE
   - Combination of methodName + parameterList.
   - Example: addNumbers(int, int)
   - Used by compiler to differentiate overloaded methods.

-----------------------------------------------------------
5. METHOD OVERLOADING
   - Same method name, different parameter list.
   Example:
   public int sum(int a, int b) { return a+b; }
   public double sum(double a, double b) { return a+b; }

-----------------------------------------------------------
6. BEST PRACTICES
   - Keep method names descriptive and meaningful.
   - One method should do one specific task.
   - Use comments to explain logic inside method body.
   - Prefer library methods when available instead of reinventing.

===========================================================
END OF NOTES
===========================================================
*/

