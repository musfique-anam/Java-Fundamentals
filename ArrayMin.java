import java.util.Scanner;
public class ArrayMin {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size=reader.nextInt();
        int []array=new int[size];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<array.length;i++)
            array[i]=reader.nextInt();
        System.out.println("The smallest number is = "+MinArray(array));
    }
    public static int MinArray(int array[]){
        int min=array[0];
        for(int i=1;i<array.length;i++){
            if(min<array[i])
                min=array[i];
        }
        return min;
    }   
}
