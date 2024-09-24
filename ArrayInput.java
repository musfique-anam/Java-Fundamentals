package JavaFundamentals;
import java.util.Scanner;
public class ArrayInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the limit of the array:");
        int limit = scan.nextInt();
        int []array = new int[limit];
        System.out.println("Enter the values sequentially:");
        for(int i=0 ; i<limit ; i++)
            array[i] = scan.nextInt();
        System.out.println("Array elements are:");
        for(int i=0 ; i<limit ; i++)
            System.out.println(array[i]);
    }
}
