package JavaFundamentals;
import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size=scan.nextInt();
        int array[]=new int[size];
        System.out.println("Entr the elements of the Array : ");
        for (int i=0;i<array.length;i++)
            array[i]=scan.nextInt();
        int sum=0;
        for(int i=0;i<array.length;i++)
            sum +=array[i];
        System.out.println("Sum of the elements are : "+sum);
    }   
}
