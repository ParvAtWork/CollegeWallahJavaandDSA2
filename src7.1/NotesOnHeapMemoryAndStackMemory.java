/*
     * Topic: Stack Memory vs Heap Memory (Hinglish Explanation)
     * ---------------------------------------------------------
     *  Imp Note-: Stack memory mein jo cheeza store hoti hai vo hai Primitive DataType,Reference variable,Function and Heap memory mein jo cheeza store hoti hai vo hai Object.
     * 1. Stack Memory:
     *    - Yaha pe JVM local variables store karta hai.
     *    - Example: int x = 10;  -> x stack mein store hoga.
     *    - Har method call ke liye ek naya "stack frame" banta hai.
     *    - Jab method khatam hota hai, uska stack frame delete ho jaata hai.
     *    - Fast hoti hai kyunki sequential allocation hoti hai (LIFO order).
     *    - Agar bahut zyada recursion ho jaaye to "StackOverflowError" aata hai.
     *
     * 2. Heap Memory:
     *    - Yaha pe JVM actual objects aur arrays store karta hai.
     *    - Example: Student s = new Student(); -> object Heap mein store hoga.
     *    - Heap memory global hoti hai, sab threads use kar sakte hain.
     *    - Objects tab tak Heap mein rehte hain jab tak Garbage Collector unhe free na kare.
     *    - Thodi slow hoti hai kyunki dynamic allocation hoti hai.
     *    - Agar Heap full ho jaaye to "OutOfMemoryError" aata hai.
     *
     * 3. Key Differences (Comparison Table):
     *    ------------------------------------------------------------
     *    | Feature            | Stack Memory           | Heap Memory   |
     *    ------------------------------------------------------------
     *    | Stores             | Local variables        | Objects/arrays|
     *    | Allocation         | Static (method scope)  | Dynamic (runtime)|
     *    | Lifetime           | Method ke end tak      | Until GC frees |
     *    | Speed              | Fast                   | Slower         |
     *    | Error              | StackOverflowError     | OutOfMemoryError|
     *    ------------------------------------------------------------
     *
     * 4. Dry Run Example:
     *    void test() {
     *        int a = 5;              // 'a' stack mein
     *        int[] arr = new int[3]; // 'arr' reference stack mein, actual array Heap mein
     *    }
     *
     *    - Jab test() call hota hai:
     *        Stack: [a=5, arr(reference)]
     *        Heap: [array of size 3]
     *    - Jab test() khatam hota hai:
     *        Stack frame delete ho jaata hai.
     *        Heap object tab tak rehta hai jab tak GC usse free na kare.
     *
     * 5. Summary Rule:
     *    - Primitive/local variables -> Stack
     *    - Objects/arrays -> Heap
     *    - Stack fast hai but limited, Heap bada hai but slow.
     */
    public static void main(String[] args) {
        // Example run
        int x = 10; // Stack
        String name = "Parv"; // String literal pool (Heap)
        int[] nums = new int[5]; // nums reference stack mein, array Heap mein
        System.out.println("Stack vs Heap demo done!");
    }

