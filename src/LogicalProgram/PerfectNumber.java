package LogicalProgram;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        System.out.println("Enter a number : ");        // program to check the number is perfect number ot not
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Enter number = " +number);
        System.out.println("factor of a number is : ");
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0 ) {
                System.out.println("i : " + i);
                sum = sum + i;                          // store the value of in a variable
            }
        }
        if(sum == number) {
            System.out.println("\n" + "Sum of the factor of a number = " + number);
            System.out.println("\n" + "It's a perfect number");
        } else
            System.out.println("\n" +"It's not a perfect number");
    }
}