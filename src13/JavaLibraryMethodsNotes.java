/*
===========================================================
        📘 JAVA LIBRARY METHODS – INTELLIJ NOTES
===========================================================

1. INTRODUCTION
   - Library methods wo hote hain jo Java ke standard libraries
     (java.lang, java.util, java.io, etc.) mein pehle se defined hote hain.
   - Inhe directly use kiya ja sakta hai bina khud likhe.
   - Benefits:
       * Time saving
       * Reliable (tested by Java developers)
       * Easy to use

-----------------------------------------------------------
2. COMMONLY USED LIBRARY METHODS

   A) java.lang.Math (Mathematical Operations)
      - Math.sqrt(16) → 4.0
      - Math.pow(2, 3) → 8.0
      - Math.max(10, 20) → 20
      - Math.min(10, 20) → 10
      - Math.abs(-5) → 5
      - Math.random() → 0.0 to 1.0 (random double)

   B) java.lang.String (String Operations)
      - str.length() → returns length of string
      - str.charAt(2) → character at index 2
      - str.toUpperCase() → converts to uppercase
      - str.toLowerCase() → converts to lowercase
      - str.trim() → removes leading/trailing spaces
      - str.equals("text") → compares content
      - str.contains("sub") → checks substring presence
      - str.substring(2, 5) → returns part of string

   C) java.util.Arrays (Array Utilities)
      - Arrays.sort(arr) → sorts array
      - Arrays.toString(arr) → converts array to string
      - Arrays.binarySearch(arr, key) → searches element
      - Arrays.equals(arr1, arr2) → compares arrays

   D) java.util.Collections (Collection Utilities)
      - Collections.sort(list) → sorts list
      - Collections.reverse(list) → reverses list
      - Collections.max(list) → largest element
      - Collections.min(list) → smallest element
      - Collections.shuffle(list) → random order

   E) java.util.Scanner (Input Handling)
      - Scanner sc = new Scanner(System.in);
      - sc.nextInt() → reads integer
      - sc.nextLine() → reads string line
      - sc.nextDouble() → reads double

   F) java.time (Date & Time API)
      - LocalDate.now() → current date
      - LocalTime.now() → current time
      - LocalDateTime.now() → current date & time
      - LocalDate.of(2026, 1, 29) → specific date
      - Period.between(date1, date2) → difference between dates

   G) java.io (File Handling)
      - File f = new File("test.txt");
      - f.exists() → checks if file exists
      - f.createNewFile() → creates new file
      - f.delete() → deletes file

-----------------------------------------------------------
3. HOW TO USE IN INTELLIJ
   - IntelliJ IDEA mein auto-import feature hota hai:
       * Type method/class name → press Alt+Enter → import suggestion aayega.
   - Example:
       int result = Math.max(10, 20);
       System.out.println(result); // prints 20

-----------------------------------------------------------
4. BEST PRACTICES
   - Library methods ko prefer karo instead of reinventing code.
   - Documentation check karo: (Ctrl+Q in IntelliJ for quick doc).
   - Static imports use kar sakte ho for cleaner code:
       import static java.lang.Math.*;
       System.out.println(sqrt(25)); // directly use

===========================================================
END OF NOTES
===========================================================
*/

