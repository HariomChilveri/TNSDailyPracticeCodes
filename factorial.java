package Basics;

import java.math.BigInteger;
import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        BigInteger fact = BigInteger.ONE; // Start with 1

        for (int i = 2; i <= N; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        System.out.println("Factorial of " + N + " is = " + fact);
    }
}
