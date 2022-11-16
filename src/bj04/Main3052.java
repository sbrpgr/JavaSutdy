package bj04;

import java.util.Arrays;
import java.util.Scanner;

public class Main3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int c = 0;
		
		for (int i=0; i<10; i++) {
			num[i] = sc.nextInt() % 42;
		}
//		System.out.println(Arrays.toString(num));
		
		for (int i=0; i < num.length; i++) {
			boolean d =false;
			for (int j=i+1; j < num.length; j++) {
				if (num[i] == num[j]) {
					d =true;
					break;
				} 
			}
			if ( d == false ) {
				c++;
			}
			
		}
		
		System.out.println(c);
	}
}
