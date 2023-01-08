import javax.swing.*;
import java.util.Scanner;

public class Q1 {
    static void IncDec5(int n) {
        {
            if (n == 0 || n == -1 || n == -2 || n == -3 || n == -4) {
                System.out.print(n + " ");
                return;
            }
            System.out.print(n + " ");
            IncDec5(n - 5);
        }
        if (n==n)
        {
            System.out.print(n + " ");
            return;
        }
        IncDec5(n+5);
        System.out.println(n +" ");
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any Number to prints Increase of 5 And Decrease of 5:-");
        int num= sc.nextInt();
        IncDec5(num);
    }
}
