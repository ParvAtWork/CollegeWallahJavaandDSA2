
/*
===========================================================
        📦 JAVA PACKAGES + METHODS (STATIC vs NON-STATIC)
===========================================================

1. PACKAGE BASICS
   - Package ek tarika hai classes ko group karne ka.
   - Syntax: package packageName;
   - Folder structure hamesha package name ke sath match hona chahiye.
     Example: package Parv.skills; → src/Parv/skills/App.java

-----------------------------------------------------------
2. STATIC METHODS IN PACKAGE
   - Static method class ke sath belong karta hai, object ke sath nahi.
   - Call karne ke liye ClassName.methodName() use karte ho.
   - Agar method dusre package mein hai to import karna zaruri hai.

   Example:
       // File: src/Parv/skills/App.java
       package Parv.skills;
       public class App {
           public static void greet() {
               System.out.println("Hello from Static Method in Package");
           }
       }

       // File: src/OutsideParvSkills.java
       import Parv.skills.App;
       public class OutsideParvSkills {
           public static void main(String[] args) {
               App.greet(); // ✅ Class ke naam se call
           }
       }

-----------------------------------------------------------
3. NON-STATIC METHODS IN PACKAGE
   - Non-static method object ke sath belong karta hai.
   - Call karne ke liye pehle object banana padta hai.
   - Agar class dusre package mein hai to import karna zaruri hai.

   Example:
       // File: src/Parv/skills/App.java
       package Parv.skills;
       public class App {
           public void greet() {
               System.out.println("Hello from Non-Static Method in Package");
           }
       }

       // File: src/OutsideParvSkills.java
       import Parv.skills.App;
       public class OutsideParvSkills {
           public static void main(String[] args) {
               App obj = new App(); // ✅ Object bana
               obj.greet();         // ✅ Object se call
           }
       }

-----------------------------------------------------------
4. PARAMETERS IN METHODS
   - Agar method mein parameter defined hai → call karte waqt pass karna hoga.
   - Agar parameter nahi hai → direct call kar sakte ho.

   Example:
       public static void greetWithName(String name) {
           System.out.println("Hello " + name);
       }

       Usage:
           App.greetWithName("Parv"); // ✅ Parameter diya

-----------------------------------------------------------
5. QUICK RULES WITH PACKAGES
   - STATIC → ClassName.methodName(...); (import ke baad)
   - NON-STATIC → Object.methodName(...); (import ke baad)
   - Parameters → Method definition ke according pass karo.
   - Import → Agar class dusre package mein hai to import compulsory.
   - Folder path hamesha package name ke sath match hona chahiye.

===========================================================
END OF NOTES
===========================================================
*/

