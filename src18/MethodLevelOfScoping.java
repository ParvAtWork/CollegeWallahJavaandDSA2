// IntelliJ-Friendly Notes File
// Topic: Method Level Scoping in Java (Hinglish Explanation)
// Author: Parv's Study Notes
// Purpose: Well-elaborated Hinglish explanation with dry runs + quick revision rules



    /*
     * ==============================
     * 1. INTRODUCTION
     * ==============================
     * Method level scoping ka matlab hai:
     *   - Jo variables ek method ke andar declare hote hain,
     *   - Unki visibility aur lifetime sirf us method tak limited hoti hai.
     *   - Method ke khatam hote hi wo variables destroy ho jaate hain.
     */

    /*
     * ==============================
     * 2. LOCAL VARIABLES IN METHOD
     * ==============================
     * - Method ke andar declare kiye gaye variables ko local variables kehte hain.
     * - Sirf us method ke andar accessible hote hain.
     * - Method ke bahar unhe access karne ki koshish karoge toh error aayega.
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
     */

    /*
     * ==============================
     * 3. PARAMETERS AS METHOD SCOPE
     * ==============================
     * - Method ke parameters bhi local scope mein aate hain.
     * - Sirf us method ke andar accessible hote hain.
     *
     * Example:
     *   int add(int a, int b) {
     *       return a + b;
     *   }
     *
     * Dry Run:
     *   add(5, 7) → a=5, b=7
     *   return 12
     */

    /*
     * ==============================
     * 4. METHOD SCOPE VS CLASS SCOPE
     * ==============================
     * - Agar ek variable class level pe declare hai (instance/static),
     *   toh method ke andar usse access kar sakte ho.
     * - Lekin method ke andar declare kiya variable class ke bahar accessible nahi hota.
     *
     * Example:
     *   class Test {
     *       int instanceVar = 5;
     *
     *       void show() {
     *           int localVar = 10;
     *           System.out.println(instanceVar); // accessible
     *           System.out.println(localVar);   // accessible
     *       }
     *
     *       void another() {
     *           System.out.println(instanceVar); // accessible
     *           // System.out.println(localVar); ❌ Error
     *       }
     *   }
     */

    /*
     * ==============================
     * 5. EDGE CASES
     * ==============================
     * - Variable Shadowing:
     *   Agar method ke andar ek local variable ka naam class variable ke naam jaisa ho,
     *   toh local variable shadow karta hai.
     *
     * Example:
     *   class Test {
     *       int x = 5;
     *       void show() {
     *           int x = 10; // shadows instance variable
     *           System.out.println(x); // prints 10
     *       }
     *   }
     *
     * - Lifetime:
     *   Method ke andar declare kiye gaye variables sirf method ke execution tak exist karte hain.
     */

    /*
     * ==============================
     * QUICK REVISION RULES
     * ==============================
     * 1. Method ke andar declare kiye gaye variables = local scope.
     * 2. Parameters bhi method scope mein aate hain.
     * 3. Local variables sirf us method ke andar accessible hote hain.
     * 4. Class level variables method ke andar accessible hote hain.
     * 5. Local variables method ke bahar accessible nahi hote.
     * 6. Shadowing: local variable class variable ko hide kar deta hai.
     * 7. Lifetime: method ke khatam hote hi local variables destroy ho jaate hain.
     */


import java.util.Scanner;
class Algebraa{
    static int Add(int a , int b){  //Yaha hum na parameters pass kar rakha hai abb hum inko calling ka time par bhi likha gha as a arguments.

        return a + b;

    }

}

public class MethodLevelOfScoping {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for a ");
        int a = sc.nextInt();
        System.out.println("Enter the value for b ");
        int b = sc.nextInt();

        int sum = Algebraa.Add(a,b); //Ya ha hum returntype variablename = className.classFunctionName(Parameters passed in it) likha gha jab humara new made class static ho gha and hum ko jab uss ko call kar na ho gha.
        System.out.println("The sum of the given digits are: " + sum );


    }

}
