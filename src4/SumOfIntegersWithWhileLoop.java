import java.util.Scanner;
public class SumOfIntegersWithWhileLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num_1 = sc.nextInt(); //20
        int sum = 0;
        while(num_1 != -1){
            sum += num_1;  // sum = sum + num_1;
             num_1 = sc.nextInt(); // 20 20 -1 here -1 is the condition to stop taking input from the user.

        }
        System.out.println("The sum is " + sum);
        sc.close();
    }

}
//If mein while loop ka andar sum num_1 ki position swap kar du tho kya hogha.
//while(num_1 != -1){
//sum += num_1;        // pehle current number ko sum mein add karte ho
//num_1 = sc.nextInt(); // phir user se agla number input lete ho
//}
//Example Input: 5 10 -1
//Start: num_1 = 5, sum = 0
//
//Loop 1: sum = 0 + 5 = 5, phir input → 10
//
//Loop 2: sum = 5 + 10 = 15, phir input → -1
//
//Loop exit → Output: The sum is 15
//👉 Matlab: pehle add hota hai, phir agla number liya jaata hai.

//while(num_1 != -1){
//num_1 = sc.nextInt(); // pehle agla number input lo
//sum += num_1;         // phir us number ko sum mein add karo
//}
//Example Input: 5 10 -1
//Start: num_1 = 5, sum = 0
//
//Loop 1: pehle input lo → 10, phir sum = 0 + 10 = 10
//
//Loop 2: input lo → -1, phir sum = 10 + (-1) = 9
//
//Loop exit → Output: The sum is 9
//👉 Matlab: tumhara pehla number (5) add hi nahi hua, aur -1 bhi sum mein add ho gaya.

