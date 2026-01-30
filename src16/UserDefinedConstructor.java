 class Operations{
    int a; //These both a and b are class variable so they can be used anywhere in the whole class.
    int b;

    Operations(int x , int y){
      a = x;  //assign parameter x to class variable a
      b = y;  // assign parameter y to class variable b
    }

    int add(){
        int ans = a + b;
        return ans;
    }

    int sub(){
        return a-b;
    }

    int mul(){
        return a * b;
    }
}

public class UserDefinedConstructor {
    public static void main(String[] args){
        Operations obj = new Operations(5,6);
        System.out.println(obj.add());
        System.out.println(obj.sub());
        System.out.println(obj.mul());

        Operations obj2 = new Operations(3 , 4);
        System.out.println(obj2.add());
        System.out.println(obj2.sub());
        System.out.println(obj2.mul());

    }
}
