package Basics;

import java.util.Scanner;

public class prime_num {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println(" check the number is prime or not = ");
		int N = scn.nextInt();
		if ( N == 1 || N ==0 ) {
			System.out.println("composite ");
			
		}
		else if(N % 2 == 1 ) {
			System.out.println("prime ");
		}
		else {
			System.out.println(" Not Prime ");
		}
		

	}

}
