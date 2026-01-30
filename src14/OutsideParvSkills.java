//if non static method is given the below code is the correct way to call the non-static method.
import Parv.skills.App;
/* public class OutsideParvSkills {
    public static void main(String[] args) {
        App obj = new App();
        App.show();

    }
}*/
//If the method is static in package then in the code we will change the obj.show() for Method calling to App.show(); the code is written below

public class OutsideParvSkills{
    public static void main(String[] args){
        App obj = new App();
        App.show();
    }

}


/*
===========================================================
        📘 NOTES: NON-STATIC METHODS IN JAVA
===========================================================

1. Method Non-Static Hai
   - Tumhari show() method non-static hai.

2. Non-static methods object ke sath belong karti hain,
   class ke sath directly nahi.

3. Matlab: Jab tak tum object create nahi karte,
   JVM ke paas koi "instance" nahi hota jisme woh method run kar sake.

👉 Isliye tumhe likhna pada:
       App obj = new App();
       obj.show();

-----------------------------------------------------------
QUICK RULE:
   - Non-static method → Object ke sath tied hota hai.
   - Call karne ke liye pehle object banana padta hai.
   - Fir object.methodName() se call karte ho.
===========================================================
END OF NOTES
===========================================================
*/
