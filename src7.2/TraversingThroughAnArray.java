// =======================================
// Topic: Traversing through an Array
// Language: Hinglish Notes
// =======================================

//Note -: Traversal = ek array ke har element ko ek‑ek karke access karna.
public class TraversingThroughAnArray {
    public static void main(String[] args) {
        /*
         * Traversing ka matlab:
         * Ek array ke har element ko sequentially access karna.
         * Hum traversal karte hain jab hume:
         *  - Array ke elements print karne hote hain
         *  - Unhe process/modify karna hota hai
         *  - Searching/Sorting karni hoti hai
         *
         * Array traversal ke liye 3 common approaches hote hain:
         * 1. for loop
         * 2. while loop
         * 3. for-each loop (enhanced for loop)
         */

        // ---------------------------------------
        // Example 1: Traversal using for loop
        // ---------------------------------------
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Traversal using for loop:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + " → Value: " + arr[i]);
        }

        /*
         * Dry Run (for loop):
         * i=0 → arr[0] = 10
         * i=1 → arr[1] = 20
         * i=2 → arr[2] = 30
         * i=3 → arr[3] = 40
         * i=4 → arr[4] = 50
         */

        // ---------------------------------------
        // Example 2: Traversal using while loop
        // ---------------------------------------
        System.out.println("\nTraversal using while loop:");
        int i = 0;
        while (i < arr.length) {
            System.out.println("Index " + i + " → Value: " + arr[i]);
            i++;
        }

        /*
         * Dry Run (while loop):
         * i=0 → arr[0] = 10
         * i=1 → arr[1] = 20
         * i=2 → arr[2] = 30
         * i=3 → arr[3] = 40
         * i=4 → arr[4] = 50
         */

        // ---------------------------------------
        // Example 3: Traversal using for-each loop(This looping is also called Enhanced looping)
        // ---------------------------------------
        System.out.println("\nTraversal using for-each loop:");
        //Yaha pa jo humara pass arr array hai uska haar ek element ko value mein daal raha hai or value ko print kara raha hai.
        for (int element : arr) {
            System.out.println("Value: " + element);
        }

        /*
         * Dry Run (for-each loop):
         * element = 10
         * element = 20
         * element = 30
         * element = 40
         * element = 50
         *
         * Note: for-each loop directly element values deta hai,
         * index access nahi hota.
         */

        // ---------------------------------------
        // Summary Rules (Hinglish):
        // ---------------------------------------
        /*
         * 1. Traversal ka matlab hai array ke har element ko access karna.
         * 2. for loop → jab index ke saath kaam karna ho (best for position-based tasks).
         * 3. while loop → jab condition-based traversal karna ho.
         * 4. for-each loop → jab sirf values chahiye ho, index ki zarurat na ho.
         * 5. arr.length → hamesha array ke size ko represent karta hai,
         *    isse out-of-bounds error avoid hota hai.
         */
    }
}

