class Student{
    int studentRollNo;
    String studentName;
}
public class MakingTwoClassesInAFile {
    public static void main(String[] args){
         Student Obj1 = new Student();
         Obj1.studentRollNo = 1;
         Obj1.studentName = "Prabhu";
         System.out.println(Obj1.studentRollNo);
         System.out.println(Obj1.studentName);

         Student Obj2 = new Student();
         Obj2.studentRollNo = 2;
         Obj2.studentName="Thakur";
         System.out.println(Obj2.studentRollNo);
         System.out.println(Obj2.studentName);
    }

}
