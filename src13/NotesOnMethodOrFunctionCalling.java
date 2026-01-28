/*
===========================================================
        📘 JAVA METHOD CALLING – DETAILED NOTES
===========================================================

1. INTRODUCTION
   - Method calling ka matlab hai ek method ko execute karna.
   - Java mein methods ko call karne ke multiple ways hote hain:
       * Direct call (same class ke andar)
       * Object ke through call (instance methods)
       * Class ke naam se call (static methods)
       * From another method
       * Recursive call (method calling itself)
       * Library method calls (predefined methods)

-----------------------------------------------------------
2. CALLING INSTANCE METHODS (Object ke through)
   - Instance methods ko call karne ke liye object banana padta hai.
   Example:
       class MyClass {
           public void display() {
               System.out.println("Instance Method Called");
           }
       }
       MyClass obj = new MyClass(); // object creation
       obj.display(); // method call

-----------------------------------------------------------
3. CALLING STATIC METHODS (Class ke naam se)
   - Static methods ko object ke bina call kiya ja sakta hai.
   Example:
       class MyClass {
           public static void show() {
               System.out.println("Static Method Called");
           }
       }
       MyClass.show(); // class name ke through call

   - IntelliJ Tip: Type `psvm` → main method auto generate ho jata hai.

-----------------------------------------------------------
4. DIRECT METHOD CALL (Same Class ke andar)
   - Agar method same class mein hai, to directly call kar sakte ho.
   Example:
       public class Test {
           public void greet() {
               System.out.println("Hello!");
           }
           public void mainMethod() {
               greet(); // direct call
           }
       }

-----------------------------------------------------------
5. CALLING METHODS WITH PARAMETERS
   - Method ko call karte waqt arguments pass karne hote hain.
   Example:
       public int add(int a, int b) {
           return a + b;
       }
       int result = add(5, 10); // call with arguments

-----------------------------------------------------------
6. CALLING METHODS WITH RETURN VALUES
   - Agar method koi value return karta hai, to usse variable mein store kar sakte ho.
   Example:
       public String getName() {
           return "Copilot";
       }
       String name = getName(); // return value stored

-----------------------------------------------------------
7. CALLING LIBRARY METHODS (Predefined)
   - Java ke built-in methods ko directly call kar sakte ho.
   Examples:
       Math.sqrt(25); // returns 5.0
       "Hello".toUpperCase(); // returns "HELLO"
       Arrays.sort(arr); // sorts array

-----------------------------------------------------------
8. CALLING METHODS FROM ANOTHER METHOD
   - Ek method ke andar dusra method call kiya ja sakta hai.
   Example:
       public void methodA() {
           System.out.println("Method A");
       }
       public void methodB() {
           methodA(); // calling methodA inside methodB
       }

-----------------------------------------------------------
9. RECURSIVE METHOD CALL (Method calling itself)
   - Jab ek method apne aapko call karta hai.
   Example:
       public int factorial(int n) {
           if(n == 0) return 1;
           else return n * factorial(n-1); // recursive call
       }

-----------------------------------------------------------
10. METHOD CALLING VIA OBJECT REFERENCE VARIABLE
   - Object reference ke through method call karna.
   Example:
       MyClass obj = new MyClass();
       MyClass anotherObj = obj;
       anotherObj.display(); // called via reference

-----------------------------------------------------------
11. METHOD CALLING USING INTERFACE REFERENCE
   - Interface ke reference ke through method call.
   Example:
       interface Animal {
           void sound();
       }
       class Dog implements Animal {
           public void sound() {
               System.out.println("Bark");
           }
       }
       Animal a = new Dog();
       a.sound(); // interface reference call

-----------------------------------------------------------
12. METHOD CALLING USING INHERITANCE (Subclass object)
   - Subclass object ke through parent class ke method ko call karna.
   Example:
       class Parent {
           public void show() {
               System.out.println("Parent Method");
           }
       }
       class Child extends Parent {}
       Child c = new Child();
       c.show(); // inherited method call

-----------------------------------------------------------
13. METHOD CALLING USING SUPER KEYWORD
   - Subclass ke andar parent class ke method ko explicitly call karna.
   Example:
       class Parent {
           public void display() {
               System.out.println("Parent Method");
           }
       }
       class Child extends Parent {
           public void display() {
               super.display(); // calling parent method
               System.out.println("Child Method");
           }
       }

-----------------------------------------------------------
14. METHOD CALLING USING THIS KEYWORD
   - Current object ke method ko call karna.
   Example:
       public void methodA() {
           System.out.println("Method A");
       }
       public void methodB() {
           this.methodA(); // calling using 'this'
       }

===========================================================
END OF NOTES
===========================================================
*/

