/*
    ===========================================================
                LOOPS IN JAVA (Practice Notes)
    ===========================================================

    👉 Loops ka use repeated execution ke liye hota hai.
       Jab tak condition true hai, tab tak block execute hota hai.

    -----------------------------------------------------------
    1. for Loop
       -> Fixed number of iterations ke liye best.
       Syntax:
       for(initialization; condition; update) {
           // code
       }

       Example:
       for(int i = 1; i <= 5; i++) {
           System.out.println("i = " + i);
       }

    -----------------------------------------------------------
    2. while Loop
       -> Jab iterations ka count pehle se pata nahi ho.
       Syntax:
       while(condition) {
           // code
       }

       Example:
       int i = 1;
       while(i <= 5) {
           System.out.println("i = " + i);
           i++;
       }

    -----------------------------------------------------------
    3. do-while Loop(Iss mein first iteration hamesha execute hoti hai if agar vo false bhi ho tho tab bhi execute hoghi and second iteration exit kar jaye ghi.)
       -> At least ek baar execute hoga, chahe condition false ho.
       Syntax:
       do {
           // code
       } while(condition);

       Example:
       int i = 1;
       do {
           System.out.println("i = " + i);
           i++;
       } while(i <= 5);

    -----------------------------------------------------------
    4. Enhanced for Loop (for-each)
       -> Arrays/Collections iterate karne ke liye.
       Syntax:
       for(type var : arrayName) {
           // code
       }

       Example:
       int[] arr = {10, 20, 30};
       for(int num : arr) {
           System.out.println(num);
       }

    -----------------------------------------------------------
    5. Break and Continue
       -> break → loop terminate karta hai.
       -> continue → current iteration skip karta hai.

       Example:
       for(int i = 1; i <= 5; i++) {
           if(i == 3) continue; // skip 3
           if(i == 4) break;    // stop at 4
           System.out.println("i = " + i);
       }

    ===========================================================
    🧠 Quick Notes:
    - for → fixed iterations
    - while → unknown iterations
    - do-while → at least once
    - for-each → arrays/collections
    - break/continue → control flow inside loops
    ===========================================================
    */


