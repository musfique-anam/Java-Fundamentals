import java.util.Scanner;
public class ArrayMax {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n=scan.nextInt();
        int array[]=new int[n];
        System.out.println("Enter the elements : ");
        for(int i=0;i<array.length;i++)
            array[i]=scan.nextInt();
        System.out.println("Largest element is = "+MaxArray(array)); 
    }
    public static  int MaxArray(int array[]){
        int max=array[0];
        for(int i=1;i<array.length;i++){
            if (max<array[i])
                max=array[i];
        }
        return max;
    }  
}
