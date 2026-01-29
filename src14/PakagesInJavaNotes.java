/*
===========================================================
        📦 PACKAGES IN JAVA – INTELLIJ NOTES
===========================================================

1. INTRODUCTION
   - Package ek namespace hai jo related classes aur interfaces ko group karta hai.
   - Purpose: Code organization, modularity, reusability, and avoiding name conflicts.
   - Java ka andar do tarah ke packages hote hain:
       a) Built-in packages (java.lang, java.util, java.io, etc.)
       b) User-defined packages (apne banaye huye)

-----------------------------------------------------------
2. SYNTAX
   - Package declare karne ke liye file ke top par likhte hain:
       package packageName;

   Example:
       package myutilities;

-----------------------------------------------------------
3. USING PACKAGES
   - Import karne ke liye:
       import packageName.ClassName;
       import packageName.*;   // imports all classes

   Example:
       import java.util.Scanner;

-----------------------------------------------------------
4. TYPES OF PACKAGES

   A) Built-in Packages
      - java.lang → Core classes (String, Math, Object)
      - java.util → Utility classes (Scanner, ArrayList, Collections)
      - java.io   → Input/Output classes (BufferedReader, File)
      - java.sql  → Database connectivity (JDBC)
      - java.time → Date and time API

   B) User-defined Packages
      - Developer apne classes ko ek package mein group kar sakta hai.
      - Steps:
          1. Create a package (folder).
          2. Write classes inside it with "package" keyword.
          3. Compile with: javac -d . ClassName.java
          4. Use with: import packageName.ClassName;

-----------------------------------------------------------
5. ACCESS MODIFIERS WITH PACKAGES
   - public    → Accessible everywhere
   - protected → Accessible within package + subclasses
   - default   → Accessible only within same package
   - private   → Accessible only within same class

-----------------------------------------------------------
6. ADVANTAGES OF PACKAGES
   - Code reusability
   - Better organization
   - Avoids name conflicts
   - Easier maintenance
   - Provides access control

-----------------------------------------------------------
7. EXAMPLES

   Example 1: Built-in Package
       import java.util.ArrayList;
       public class Test {
           public static void main(String[] args) {
               ArrayList<Integer> list = new ArrayList<>();
               list.add(10);
               list.add(20);
               System.out.println(list);
           }
       }

   Example 2: User-defined Package
       // File: mypack/MyClass.java
       package mypack;
       public class MyClass {
           public void show() {
               System.out.println("Hello from MyClass in mypack!");
           }
       }

       // File: Test.java
       import mypack.MyClass;
       public class Test {
           public static void main(String[] args) {
               MyClass obj = new MyClass();
               obj.show();
           }
       }

-----------------------------------------------------------
8. BEST PRACTICES
   - Always give meaningful package names (e.g., com.company.project.module).
   - Follow naming convention: lowercase letters for package names.
   - Keep related classes together in one package.
   - Use access modifiers wisely for encapsulation.

===========================================================
END OF NOTES
===========================================================
*/

