import java.util.Arrays;

public class TraversingArrayUsingEachForLoopOrEnhancedForLoop {
    public static void main(String[] args){
        int[] age = {1,2,3,4,5};
        for(int newage : age){
            //the part " " (a string with a space) is simply adding a space after each number when it’s printed.
            System.out.print(newage + " ");
        }
    }

}
// === Arrays.toString() in Enhanced For Loop ===
// Hum Arrays.toString() ko enhanced for loop ke andar use nahi kar sakte
// kyunki Arrays.toString() ek pura array expect karta hai.
// Lekin for-each loop ke andar jo variable (newage) milta hai,
// wo ek single element hota hai (int value), array nahi hota.
