package JavaFundamentals;
import java.util.Scanner;
public class SumNaturalNum {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
            System.out.println("Sum from : ");
            int value1=reader.nextInt();
            System.out.println("Sum from "+value1+" to :");
            int value2=reader.nextInt();
            int sum=0;
            for(int i=value1;i<=value2;i++){
                sum=sum+i;
                sum+=i;
            }
            System.out.println("Sum of natural numbers from "+value1+" to "+value2+" is = "+sum);
    }
}
