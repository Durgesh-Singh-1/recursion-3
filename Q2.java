import java.util.Scanner;

public class Q2 {
    static int summation( int n,int m)
    {
        if (m==1)
        {
            return n*(n+1)/2;
        }
        int sum = summation(n,m-1);
        return sum*(sum+ 1)/2;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter first  number ");
        int n= sc.nextInt();
        System.out.println("Enter 2nd Number :- ");
        int m= sc.nextInt();
        System.out.println(summation(n,m));
    }
}
