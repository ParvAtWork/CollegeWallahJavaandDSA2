class ArraysExample{
    static void Array(){
        int[] ages = new int[3];
        float[] weight = new float[3];
        String[] Name = {"Parv" , "Rahul" , "Raj"};

        ages[0] = 12;
        ages[1] = 13;
        ages[2] = 14;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        System.out.println(Name[0]);
        System.out.println(Name[1]);
        System.out.println(Name[2]);
    }
}

public class AccessingArrayUsingMultipleClassesAndFunction {
    public static void main(String[] args){
        AccessingArrayUsingMultipleClassesAndFunction FirstAccessing = new AccessingArrayUsingMultipleClassesAndFunction();
        ArraysExample.Array();
    }
}
