package JavaFundamentals;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=reader.nextInt();
        if(number%2==0)
            System.out.println("Your number "+number+" is an Even number!");
        else
            System.out.println("Your number "+number+" is an Odd number!");    
    }   
}
