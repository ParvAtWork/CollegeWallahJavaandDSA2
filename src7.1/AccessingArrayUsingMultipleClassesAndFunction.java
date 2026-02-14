class ArraysExample{
    static void Array(){
        int[] ages = new int[3];    // hum mara ko variable sa phele static likh na ki zarurat is liya nahi padhi because jab hum na method likha tha tabhi static bhi likh diya tha jiss sa sara class variable static ho gya.
        float[] weight = new float[3];
        String[] Name = {"Parv" , "Rahul" , "Raj"};

        ages[0] = 12;
        ages[1] = 13;
        ages[2] = 14;

        weight[0] = 50 ;
        weight[1] = 60 ;
        weight[2] = 70 ;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        System.out.println(weight[0]);
        System.out.println(weight[1]);
        System.out.println(weight[2]);

        System.out.println(Name[0]);
        System.out.println(Name[1]);
        System.out.println(Name[2]);
    }
}

public class AccessingArrayUsingMultipleClassesAndFunction {
    public static void main(String[] args){
        ArraysExample.Array();
    }
}

/* Note-: Yaha par humari method static hai, iski wajah se hume
   main class mein object banane ki zarurat nahi hai.
   Hum direct class ke naam ke saath method ko call kar sakte hain.
   Example:
   ArraysExample.Array();
   Is tarah static method ko bina object banaye access kiya ja sakta hai.
*/

