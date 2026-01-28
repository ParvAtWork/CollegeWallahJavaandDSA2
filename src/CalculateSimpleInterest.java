import java.util.Scanner;
public class CalculateSimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal Value");
        float principalValue = sc.nextFloat();
        System.out.println("Enter the Rate Value");
        float rateValue = sc.nextFloat();
        System.out.println("Enter the Time");
        float timeGiven = sc.nextFloat();
        float simpleInterestCalculated = (principalValue * rateValue * timeGiven) / 100;
        System.out.println("The user Principal value " + principalValue);
        System.out.println("The user Rate Value " + rateValue);
        System.out.println("The user Time Value " + timeGiven);
        System.out.println("The Simple Interest Calculated is: " + simpleInterestCalculated);
        sc.close();

    }

}
