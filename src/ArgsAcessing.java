public class ArgsAcessing {
    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println(args[1]);
    }
}
//In Terminal in which I have written the command java ArgsAcessing Parv Maheshwari where the args[0] command from the code will access the Maheshwari word from the terminal and then print it.
//Usage of all  print statements when they are used and why they are used.
//1️⃣ print()
//Use: Text ko print karta hai same line me (cursor next line me nahi jata).
//System.out.print("Hello");
//System.out.print("World");
//Its output is ->HelloWorld
//2️⃣ println()
//Use: Text ko print karta hai aur next line me chala jata hai.
//System.out.println("Hello");
//System.out.println("World");
//Its output is ->Hello   ln na world ko next line mein swift kar diya or yahi upar print nahi kar paya.
//                World
//3️⃣ printf()
//Use: Formatted output ke liye use hota hai (number of decimals, spacing, variables insert karna).
//int age = 20;
//System.out.printf("My age is %d", age);
//Its output is->My age is 20
