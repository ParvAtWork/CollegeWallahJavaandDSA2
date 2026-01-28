//public class JavaVariableUsing {
//    public static void main(String[] args) {
//        int money = 3000;  //Jab tum int money = 3000; likhte ho, tum variable declare + initialize kar rahe ho.
//        System.out.println(money);
//        money = 5000; //int ek data type declaration hai. Jab tum pehli baar likhte ho int money, compiler ko pata chal jata hai ki money ek integer variable hai.Agar tum dobara likhoge int money = 5000; same scope ke andar, to compiler bolega "Variable money is already defined in method main" → error aayega.
//        System.out.println(money);
//
//    }
//}


//Second method
class JavaVariableUsing{
    public static void main(String[] args){
        int money = 3000;
        money = 5000;
        System.out.println(money);

    }


}

//Structure of java variable is like this
//DataType name java_variable_name = value;
