class exampleNewTry{
    void arrayNew(){
        int[] Age = new int[3];
        float[] Height = new float[3];
        String[] Name = {"Parv" , "Raghav" , "Rahul"};

        Age[0] = 15;
        Age[1] = 19;
        Age[2] = 20;

        Height[0] = 5.2f;
        Height[1] = 5.6f;
        Height[2] = 6.2f;

        System.out.println(Age[0]);
        System.out.println(Age[1]);
        System.out.println(Age[2]);

        System.out.println(Height[0] + "Inch");
        System.out.println(Height[1] + "Inch");
        System.out.println(Height[2] + "Inch");

        System.out.println(Name[0]);
        System.out.println(Name[1]);
        System.out.println(Name[2]);

    }

}

public class AccessingArrayUsingMultipleClassesAndFunctionWithoutUsingStaticMethod {
    public static void main(String[] args){
        exampleNewTry obj = new exampleNewTry();
        obj.arrayNew();

    }
}

/*Note-: Yaha par hum mari class static nahi hai tho iski vajha sa hum na main class mein object banaya hai
   exampleNewTry obj = new exampleNewTry();
   phir jab hum na object bana liya tab hum dusari class ka method ko call kar sakh tha hai jesa hum na neecha kiya hai.
   obj,arrayNew();
 */
