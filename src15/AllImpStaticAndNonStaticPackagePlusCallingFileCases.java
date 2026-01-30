/*
===========================================================
        📘 NOTES: STATIC vs NON-STATIC (Package + Calling File)
===========================================================

CASE 1: Package file → STATIC method
        Calling file → STATIC method
-----------------------------------------------------------
- Dono static hain → object ki zarurat nahi.
- Direct class ke naam se call hoga.

Example:
    // Message.java
    package Parv.Message;
    public class Message {
        public static void showMessage(String name) {
            System.out.println("Hello " + name);
        }
    }

    // CallingFile.java
    import Parv.Message.Message;
    public class CallingFile {
        public static void main(String[] args) {
            Message.showMessage("Parv Maheshwari"); // ✅ direct call
        }
    }

-----------------------------------------------------------

CASE 2: Package file → STATIC method
        Calling file → NON-STATIC method
-----------------------------------------------------------
- Package method static hai → class ke naam se call hoga.
- Calling file non-static hai → uske method ko chalane ke liye object banana hoga.

Example:
    // Message.java
    package Parv.Message;
    public class Message {
        public static void showMessage(String name) {
            System.out.println("Hello " + name);
        }
    }

    // CallingFile.java
    import Parv.Message.Message;
    public class CallingFile {
        public void callMessage() {
            Message.showMessage("Parv Maheshwari"); // ✅ static call
        }
    }

    // Test.java
    public class Test {
        public static void main(String[] args) {
            CallingFile obj = new CallingFile(); // ✅ object of CallingFile
            obj.callMessage();                   // ✅ non-static call
        }
    }

-----------------------------------------------------------

CASE 3: Package file → NON-STATIC method
        Calling file → STATIC method
-----------------------------------------------------------
- Package method non-static hai → us class ka object banana hoga.
- Calling file static hai (main method) → object create karke call karna hoga.

Example:
    // Message.java
    package Parv.Message;
    public class Message {
        public void showMessage(String name) {
            System.out.println("Hello " + name);
        }
    }

    // CallingFile.java
    import Parv.Message.Message;
    public class CallingFile {
        public static void main(String[] args) {
            Message obj = new Message();          // ✅ object of Message
            obj.showMessage("Parv Maheshwari");   // ✅ non-static call
        }
    }

-----------------------------------------------------------

CASE 4: Package file → NON-STATIC method
        Calling file → NON-STATIC method
-----------------------------------------------------------
- Dono non-static hain → dono ke liye object banana hoga.
- Calling file ka object → uske method ko call karne ke liye.
- Package class ka object → uske method ko call karne ke liye.

Example:
    // Message.java
    package Parv.Message;
    public class Message {
        public void showMessage(String name) {
            System.out.println("Hello " + name);
        }
    }

    // CallingFile.java
    import Parv.Message.Message;
    public class CallingFile {
        public void callMessage() {
            Message obj = new Message();          // ✅ object of Message
            obj.showMessage("Parv Maheshwari");   // ✅ non-static call
        }
    }

    // Test.java
    public class Test {
        public static void main(String[] args) {
            CallingFile obj = new CallingFile(); // ✅ object of CallingFile
            obj.callMessage();                   // ✅ non-static call
        }
    }

-----------------------------------------------------------
SUMMARY RULES:
- STATIC method → ClassName.methodName(...); (object ki zarurat nahi)
- NON-STATIC method → Object.methodName(...); (object banana zaruri)
- Agar calling side non-static hai → us class ka bhi object banana hoga.
- Agar called method non-static hai → us class ka bhi object banana hoga.

===========================================================
END OF NOTES
===========================================================
*/

