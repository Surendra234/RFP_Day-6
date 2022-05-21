package LogicalProgram;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println("Enter a number : ");       // program to check the number is prime or not
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int var = 0;

        for(int i =2; i < num; i++) {
            if(num % i == 0)
                var = var + 1;
        }
        if(var > 0)
            System.out.println(num +" not prime");
        else
            System.out.println(num +" is prime");
    }
}