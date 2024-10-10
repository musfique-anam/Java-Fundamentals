import java.util.Scanner;
public class ArrayOddEven {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the total number of elements:");
        int n=scan.nextInt();
        int array[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<array.length;i++)
            array[i]=scan.nextInt();
        countOddEven(array);
    }
    public static void countOddEven(int array[]){
        int countOdd=0;
        int countEven=0;
        for(int i=0;i<array.length;i++)
            if(array[i] % 2== 0)
                ++countEven;
            else
                ++countOdd;
        System.out.println("Count of total odd numbers are :"+countOdd);
        System.out.println("Count of total even numbers are :"+countEven);
    }    
}
