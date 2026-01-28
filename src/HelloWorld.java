import org.w3c.dom.ls.LSOutput;

class HelloWorld {                             //These all given bellow is the command line arguments in java.
    public static void main(String[] args){   //Here void is the return type in java which returns nothing or null in the function, where as main is the function in this code
        System.out.println("Hello World");   // Java program srif main function ko hi run kar tha raha tha hai or jo dusara function hota hai vo main function mein call hota raha tha hai.
    }                                        // Main function java ka entry point hota hai.
}                                            // public is the access modifiers(matalb public ka sath jo class di gayi hai vo har jagha visible hai or public function/method ko hum class ka bahar class ka andar pakage ka bahar pakage ka andar har jagha access kar sakh tha hai matalb hara jagha vo function/method use ho sakh tha hai jo public hai.)
                                            //  static it allows us to call these methods or variables without creating an object of the class. // void -> return type ha function ka
                                            // main -> It is the entry function of the java program from where the java access the code.
                                          // *very Imp*  String[] args -> Means String(collections of charracters are called strings.) ki na ek array[](multiple values) hai jo args hai iska use main method mein hota hai command line se program ko input dene ke liye hota hai.
                                          // java mein default accesing array ki 0 sa start hoti hai so first element ko bol tha hai 0th index then so on.
                                          //1️⃣ System kya hai?
                                          //👉 System Java ki predefined class hai (java.lang package me).
                                          //Iska use system-related cheezon ke liye hota hai jaise:
                                          //input/output
                                          //current time
                                          //memory info
                                          //environment variables
                                          // 2️⃣ out kya hai?
                                          //👉 out System class ka static object (in simple words it is the object of PrintStream type) hai.
                                          // Ye standard output device (screen / console/terminal) ko represent
                                          // 3 Println kya hai.
                                          //println ek method (function) hai jo:
                                          //println actually PrintStream class ka method hai.
                                          //screen par data print karta hai aur cursor ko next line par le jata hai.
//Functions -> A block of code That can be called anywhere in the program.

//Function template in java
//int AddTwoNumber(int x , int y){
//    return (x + y);
//}

//here int in stating is the return value type ,AddTwoNumber if the function named by you ,int x and int y are the function parameters and return returns the value in the java.
