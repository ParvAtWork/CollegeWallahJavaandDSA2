/*
===========================================================
                📘 JAVA METHODS / FUNCTIONS NOTES
===========================================================

1. INTRODUCTION
   - Method ek block of code hota hai jo ek specific task perform karta hai.
   - Java mein sab kuch class ke andar hota hai, isliye technically unhe "methods" bola jata hai.
   - Benefits:
       * Code Reusability
       * Readability & Maintainability
       * Easy Debugging & Testing

-----------------------------------------------------------
2. SYNTAX OF A METHOD
   returnType methodName(parameters) {
       // method body
       return value; // optional
   }

   Example:
   public int addNumbers(int a, int b) {
       return a + b;
   }

-----------------------------------------------------------
3. TYPES OF METHODS
   a) User-defined Methods
      - Jo programmer khud likhta hai.
      Example:
      public void greet() {
          System.out.println("Hello World!");
      }

   b) Predefined Methods (Library Methods)
      - Java ke libraries mein pehle se defined hote hain.
      Example:
      Math.sqrt(25);  // returns 5.0

   c) Static Methods
      - Class ke naam se directly call kiye ja sakte hain.
      Example:
      public static void display() {
          System.out.println("Static Method");
      }

   d) Instance Methods
      - Object ke through call kiye jaate hain.
      Example:
      MyClass obj = new MyClass();
      obj.display();

-----------------------------------------------------------
4. METHOD SIGNATURE
   - Method name + parameter list milke ek unique identity banate hain.
   - Example: addNumbers(int a, int b)

-----------------------------------------------------------
5. METHOD OVERLOADING
   - Same method name, different parameter list.
   Example:
   public int sum(int a, int b) { return a+b; }
   public double sum(double a, double b) { return a+b; }

-----------------------------------------------------------
6. METHOD CALLING
   - Direct call (same class ke andar)
   - Object ke through call (instance methods)
   - Class ke naam se call (static methods)

-----------------------------------------------------------
7. RETURN TYPE
   - void → kuch return nahi karta
   - int, double, String → specific type return karta hai
   - Example:
     public String getName() {
         return "Copilot";
     }

-----------------------------------------------------------
8. BEST PRACTICES
   - Method name hamesha verb hona chahiye (calculateSum, printDetails).
   - Ek method ek hi responsibility handle kare.
   - Reusability ke liye methods ko modular rakho.
   - IntelliJ mein shortcut: type `psvm` → main method auto generate ho jata hai.

===========================================================
END OF NOTES
===========================================================
*/

