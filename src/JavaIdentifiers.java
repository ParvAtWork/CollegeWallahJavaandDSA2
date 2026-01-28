//Java Identifiers Naming rules and examples too.
//dentifiers in Java wo unique names hote hain jo tum variables, methods, classes, interfaces, aur packages ko dene ke liye use karte ho. Ye compiler ko batate hain ki kis element ko refer karna hai. Keywords (jaise int, class) identifiers ke naam ke liye use nahi kiye ja sakte.

// Example showing different identifiers in Java
    public class JavaIdentifiers  {        // "StudentDetails" is a class identifier

    int studentAge = 20;             // "studentAge" is a variable identifier
    String studentName = "Parv";     // "studentName" is another variable identifier

    public void printInfo() {        // "printInfo" is a method identifier
        System.out.println(studentName + " is " + studentAge + " years old.");
    }

    public static void main(String[] args) {   // "main" is a method identifier
        JavaIdentifiers obj = new JavaIdentifiers (); // "obj" is an object identifier
        obj.printInfo();                        // calling method using identifier
    }
}


//📋 Rules for Naming Identifiers
//Allowed characters: A–Z, a–z, 0–9, _ (underscore), $ (dollar sign).
//Cannot start with digit: e.g., 123name ❌ invalid.
//No special characters: e.g., name@ ❌ invalid.
//Case-sensitive: myVar aur myvar alag identifiers hain.
//Cannot use keywords: e.g., int, class, boolean ❌ invalid.
//Recommended: Descriptive names for readability (e.g., studentAge instead of sa)

//Examples
//int student_age = 20;   // ✅ valid (underscore allowed)
//int $salary = 5000;     // ✅ valid (dollar allowed)
//int stu@dent = 30;      // ❌ invalid (special char @ not allowed)
//int my-age = 25;        // ❌ invalid (hyphen not allowed)
