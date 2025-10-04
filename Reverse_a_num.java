package Basics;

import java.util.Scanner;

public class Reverse_a_num {

	public static void main(String[] args) {  
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int rev = 0;
		
		while(N > 0 ) { 
			int rem = N %10 ;
			rev = rev * 10 + rem ;
			N = N / 10 ;
		}
		System.out.println( rev );

	

	}

}
