/*
===========================================================
        JAVA CONDITIONALS NOTES (Practice Reference)
===========================================================

👉 Conditionals ka use decision making ke liye hota hai.
   Program flow ko condition ke basis pe control karte hain.

-----------------------------------------------------------
1. if Statement
   -> Agar condition true hai to block execute hoga.
   Example:
   if (a > b) {
       System.out.println("a is greater");
   }

-----------------------------------------------------------
2. if-else Statement
   -> Agar condition true hai to 'if' block chalega,
      warna 'else' block chalega.
   Example:
   if (a % 2 == 0) {
       System.out.println("Even");
   } else {
       System.out.println("Odd");
   }

-----------------------------------------------------------
3. if-else-if Ladder
   -> Multiple conditions check karne ke liye use hota hai.
   Example:
   if (marks >= 90) {
       System.out.println("Grade A");
   } else if (marks >= 75) {
       System.out.println("Grade B");
   } else {
       System.out.println("Grade C");
   }

-----------------------------------------------------------
4. Nested if
   -> Ek if ke andar dusra if likh sakte ho.
   Example:
   if (age >= 18) {
       if (citizen == true) {
           System.out.println("Eligible to vote");
       }
   }

-----------------------------------------------------------
5. switch Statement
   -> Multiple values ke liye ek hi variable check karna.
   Example:
   switch (day) {
       case 1: System.out.println("Monday"); break;
       case 2: System.out.println("Tuesday"); break;
       case 3: System.out.println("Wednesday"); break;
       default: System.out.println("Invalid day");
   }

-----------------------------------------------------------
6. Ternary Operator (?:)
   -> Short form of if-else.
   Example:
   int max = (a > b) ? a : b;

===========================================================
🧠 Quick Notes:
- if → single condition
- if-else → dual condition
- if-else-if → multiple conditions
- nested if → hierarchical check
- switch → multiple fixed values
- ternary → short decision making
===========================================================
*/

