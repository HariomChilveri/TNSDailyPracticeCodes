package Basics;

import java.util.Scanner;

public class print_N_nums {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println(" give the number N = "); 
		int N = scn.nextInt();
		
		for( int i=1; i<=N; i++ ) {
			System.out.println(i);
		}
	}

}
