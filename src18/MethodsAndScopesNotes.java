// IntelliJ-Friendly Notes File
// Topic: Methods and Scope in Java (Hinglish Explanation)
// Author: Parv's Study Notes
// Purpose: Well-elaborated Hinglish explanation with dry runs + quick revision rules



    /*
     * ==============================
     * 1. METHODS IN JAVA
     * ==============================
     * Definition (Hinglish):
     *   - Method ek block of code hota hai jo ek specific task perform karta hai.
     *   - Code ko reusable aur readable banata hai.
     *
     * Syntax:
     *   returnType methodName(parameters) {
     *       // body of method
     *       return value; // agar returnType void nahi hai
     *   }
     *
     * Types of Methods:
     *   - Predefined (built-in): jaise Math.max(), System.out.println()
     *   - User-defined: jo programmer khud banata hai
     *
     * Example:
     *   public int add(int a, int b) {
     *       return a + b;
     *   }
     *
     * Dry Run (Hinglish):
     *   int result = add(5, 7);
     *   Step 1: a=5, b=7
     *   Step 2: return 12
     *   Step 3: result = 12
     */

    /*
     * ==============================
     * 2. METHOD SCOPE
     * ==============================
     * Scope ka matlab hai: variable/method ki visibility aur lifetime.
     *
     * Types of Scope:
     *   a) Local Scope:
     *      - Variable jo method/block ke andar declare hota hai.
     *      - Sirf us block ke andar accessible hota hai.
     *      Example:
     *          void demo() {
     *              int x = 10; // local variable
     *              System.out.println(x);
     *          }
     *
     *   b) Instance Scope:
     *      - Variable jo class ke andar declare hota hai, methods ke bahar.
     *      - Har object ka apna copy hota hai.
     *      Example:
     *          class Student {
     *              int rollNo; // instance variable
     *          }
     *
     *   c) Class/Static Scope:
     *      - 'static' keyword ke saath declare hota hai.
     *      - Sabhi objects ke liye ek hi copy hoti hai.
     *      Example:
     *          static int count = 0;
     *
     *   d) Block Scope:
     *      - Variable jo { } braces ke andar declare hota hai.
     *      - Sirf block ke execute hone tak exist karta hai.
     */

    /*
     * ==============================
     * 3. DRY RUN EXAMPLE (Scope)
     * ==============================
     * Example:
     *   class Test {
     *       int instanceVar = 5;
     *       static int staticVar = 10;
     *
     *       void show() {
     *           int localVar = 20;
     *           System.out.println(localVar); // accessible
     *           System.out.println(instanceVar); // accessible
     *           System.out.println(staticVar); // accessible
     *       }
     *   }
     *
     * Dry Run:
     *   Test obj = new Test();
     *   obj.show();
     *   Output:
     *     localVar = 20
     *     instanceVar = 5
     *     staticVar = 10
     */

    /*
     * ==============================
     * QUICK REVISION RULES
     * ==============================
     * 1. Method = block of code for task.
     * 2. Local scope = sirf method/block ke andar.
     * 3. Instance scope = har object ka apna variable.
     * 4. Static scope = sab objects ke liye ek hi copy.
     * 5. Block scope = sirf braces ke andar valid.
     * 6. Dry run karna hamesha clarity deta hai.
     */


