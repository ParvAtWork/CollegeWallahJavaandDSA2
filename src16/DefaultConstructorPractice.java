//Note-:Constructor or class ka naam hamesha same hogha.

    public class DefaultConstructorPractice {
    int a; //these variable are declared in class level Scoping
    int b;

    DefaultConstructorPractice(){
        System.out.println("Default Constructor is called");
    }
    public static void main(String[] args){
        DefaultConstructorPractice obj = new DefaultConstructorPractice();
    }
}
