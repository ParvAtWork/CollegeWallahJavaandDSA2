/*
===========================================================
        📘 NOTES: CONSTRUCTORS IN JAVA (with line explanation)
===========================================================

1. INTRODUCTION
   - Constructor ek special method hota hai jo object create hote hi
     automatically call hota hai.
   - Constructor ka naam hamesha class ke naam ke sath same hota hai.
   - Constructor ka koi return type nahi hota (not even void).
   - Purpose: Object ko initialize karna.

-----------------------------------------------------------
2. TYPES OF CONSTRUCTORS

A) DEFAULT CONSTRUCTOR (Compiler provided)
   - Agar tum khud constructor define nahi karte,
     Java compiler automatically ek default constructor provide karta hai.
   - Ye object ko default values assign karta hai.

   Example:
       class Student {
           int id;
           String name;
           // ❌ No constructor defined → compiler automatically adds:
           // Student() { super(); }
       }

       public class Test {
           public static void main(String[] args) {
               Student s1 = new Student(); // ✅ default constructor called
               System.out.println(s1.id);   // 0
               System.out.println(s1.name); // null
           }
       }

-----------------------------------------------------------
B) NO-ARG CONSTRUCTOR (User-defined)
   - Tum khud ek constructor define karte ho bina parameters ke.

   Example:
       class Student {
           int id;
           String name;

           Student() { // ✅ Constructor line → initializes object with fixed values
               id = 101;
               name = "Parv";
           }
       }

       public class Test {
           public static void main(String[] args) {
               Student s1 = new Student(); // ✅ calls no-arg constructor
               System.out.println(s1.id);   // 101
               System.out.println(s1.name); // Parv
           }
       }

-----------------------------------------------------------
C) PARAMETERIZED CONSTRUCTOR
   - Constructor jo parameters accept karta hai.

   Example:
       class Student {
           int id;
           String name;

           Student(int i, String n) { // ✅ Constructor line → assigns values from arguments
               id = i;
               name = n;
           }
       }

       public class Test {
           public static void main(String[] args) {
               Student s1 = new Student(201, "Parv Maheshwari"); // ✅ parameterized constructor called
               System.out.println(s1.id);   // 201
               System.out.println(s1.name); // Parv Maheshwari
           }
       }

-----------------------------------------------------------
D) COPY CONSTRUCTOR (User-defined)
   - Ek object ki values ko dusre object mein copy karne ke liye.

   Example:
       class Student {
           int id;
           String name;

           Student(int i, String n) { // ✅ parameterized constructor
               id = i;
               name = n;
           }

           Student(Student s) { // ✅ copy constructor line → copies values from another object
               id = s.id;
               name = s.name;
           }
       }

       public class Test {
           public static void main(String[] args) {
               Student s1 = new Student(301, "Parv"); // parameterized constructor
               Student s2 = new Student(s1);          // copy constructor called
               System.out.println(s2.id);   // 301
               System.out.println(s2.name); // Parv
           }
       }

-----------------------------------------------------------
3. REAL-WORLD EXAMPLE

   Example: Bank Account Initialization
       class BankAccount {
           int accountNumber;
           String holderName;
           double balance;

           BankAccount(int accNo, String name, double bal) { // ✅ parameterized constructor line and it is ✅ Constructor (NOT a method)
               accountNumber = accNo;
               holderName = name;
               balance = bal;
           }

           void display() { // ✅ Method #1
               System.out.println("Account No: " + accountNumber);
               System.out.println("Holder: " + holderName);
               System.out.println("Balance: " + balance);
           }
       }

       public class Test { // ✅ Method #2 (main method)
           public static void main(String[] args) {
               BankAccount acc1 = new BankAccount(12345, "Parv Maheshwari", 5000.0); // ✅ constructor call
               acc1.display();
           }
       }

   Output:
       Account No: 12345
       Holder: Parv Maheshwari
       Balance: 5000.0

-----------------------------------------------------------
4. KEY POINTS TO REMEMBER
   - Constructor line hamesha `ClassName(...) { ... }` hoti hai.
   - Us line ka use object ko initialize karna hota hai.
   - Agar tum constructor define nahi karte → compiler default constructor provide karega.
   - Tum multiple constructors bana sakte ho (Constructor Overloading).
   - Copy constructor manually likhna padta hai.

===========================================================
END OF NOTES
===========================================================
*/
