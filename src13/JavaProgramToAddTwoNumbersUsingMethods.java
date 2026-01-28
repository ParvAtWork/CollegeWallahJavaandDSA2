import java.util.Scanner;
public class JavaProgramToAddTwoNumbersUsingMethods {
    public static void main(String[] args){
        Sum obj1 = new Sum(); //Sum class object    Maine yaha main method ke andar Sum class ka object banaya hai (Sum obj1 = new Sum();) kyunki Java mein instance methods ko call karne ke liye object ki zaroorat hoti hai.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your value for a");
        int valA = sc.nextInt();
        System.out.println("Enter your value for b");
        int valB = sc.nextInt();
        int ans = obj1.add(valA,valB);
        System.out.println("Sum of the input numbers are: " + ans);


    }
}

class Sum{
    public int add(int a , int b){  //accessmodifier(public) returntype(int) functionName(add)(Parameters)
        int ans = a + b;  //ya instance method hai because iss mein static non access modifier nahi hai tho isko call karna ka liya iski ki class ka object banana hogha main method mein.
        return ans;

    }

}

/*Note-:Maine yaha main method ke andar Sum class ka object banaya hai (Sum obj1 = new Sum();) kyunki Java mein instance methods ko call karne ke liye object ki zaroorat hoti hai.
Yaha add(int a, int b) ek instance method hai (non-static).

Instance methods ko directly class ke naam se call nahi kar sakte.

Unhe call karne ke liye object banana padta hai.
*/
