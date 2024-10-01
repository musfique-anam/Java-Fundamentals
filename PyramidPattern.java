package Javafundamentals;
import java.util.Scanner;
public class PyramidPattern {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter the number of rows you want to watch : ");
        int rows=reader.nextInt();
        for(int i = 1;i<=rows-i;++j){
            System.out.print(" ");
        }
        for(int k=1;k<= i;++k){
            System.out.print(" * ");
        }
        System.out.println();
    }
}
