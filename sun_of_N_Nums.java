package Basics;

import java.util.Scanner;

public class sun_of_N_Nums {

	public static void main(String[] args) { 
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int sum=0;
		for( int i =1; i<=N ;i++ ) {
			sum=sum+i;
		}
		System.out.println("Sum of N nums is = " + sum);
	}

}
