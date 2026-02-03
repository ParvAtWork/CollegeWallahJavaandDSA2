// IntelliJ-Friendly Notes File
// Topic: Scope of Variables in Java (Hinglish Explanation)
// Author: Parv's Study Notes
// Purpose: Well-elaborated Hinglish explanation with dry runs + quick revision rules
/*
 * ==============================
 * 1. VARIABLE SCOPE INTRODUCTION
 * ==============================
 * Scope ka matlab hai: ek variable kitni der tak exist karega
 * aur kahan tak accessible hoga.
 *
 * Java mein mainly 4 types of scope hote hain:
 *   a) Local Scope
 *   b) Instance Scope
 *   c) Static/Class Scope
 *   d) Block Scope



 * ==============================
 * 2. LOCAL SCOPE
 * ==============================
 * - Variable jo method ke andar declare hota hai.
 * - Sirf us method ke andar accessible hota hai.
 * - Method ke khatam hote hi variable destroy ho jaata hai.
 *
 * Example:
 *   void demo() {
 *       int x = 10; // local variable
 *       System.out.println(x);
 *   }
 *
 * Dry Run:
 *   demo() call → x=10 create hota hai
 *   print 10 → method end → x destroy



 * ==============================
 * 3. INSTANCE SCOPE
 * ==============================
 * - Variable jo class ke andar declare hota hai, methods ke bahar.
 * - Har object ka apna copy hota hai.
 * - Object ke lifetime tak variable exist karta hai.
 *
 * Example:
 *   class Student {
 *       int rollNo; // instance variable
 *   }
 *
 * Dry Run:
 *   Student s1 = new Student();
 *   s1.rollNo = 101;
 *   Student s2 = new Student();
 *   s2.rollNo = 102;
 *   →
*/