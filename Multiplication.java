import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int value1,value2,product;
        System.out.println("Enter two values:");
        value1=scan.nextInt();
        value2=scan.nextInt();
        product=value1*value2;
        System.out.println("The product of "+value1+" & "+value2+" is = "+product);
    }
}
