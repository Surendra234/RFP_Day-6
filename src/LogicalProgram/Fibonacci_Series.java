package LogicalProgram;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {

        int n;
        int i = 0;
        int firstTerm = 0, secondTerm = 1;
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while(i <= n) {
            System.out.println("fibonacci series = " +firstTerm);
            int nextTerm = firstTerm + secondTerm;   // ( 0+1 = 1 )
            firstTerm = secondTerm;                  // ( 1 )
            secondTerm = nextTerm;                   // ( 1 )
            i++;
        }
    }
}