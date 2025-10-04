package Basics;

import java.util.Scanner;
public class GDC_LCM {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N1 = scn.nextInt();
		
		int N2 = scn.nextInt();
		int gcd = 1 ;
		int min = Math.min(N1 , N2);
		for( int i=1 ,j = 1 ; i<=N1 && j <=N2; i++,j++ ) {  
			
			if(N1%i == 0 || N2%j ==0) { 
				gcd = i;
			}
		}
		System.out.println(gcd );
	}

}
