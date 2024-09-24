package JavaFundamentals;
import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int value1,value2,sum;
        System.out.println("Enter two values for addition:");
        value1=input.nextInt();
        value2=input.nextInt();
        sum=value1+value2;
        System.out.println("The Sum of "+value1+" & "+value2+" is = "+sum);
    }
}
