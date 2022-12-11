package bj06;

import java.util.Arrays;
import java.util.Scanner;

public class Main2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int ns = 0; ns < n; ns++) {
			
		
		int r = sc.nextInt();
		String s = sc.next();
		String[] sa;
		sa = s.split("");
		
		for (int i = 0; i < s.length(); i++) {
			for(int j=0; j <r; j++) {
				System.out.print(sa[i]);
			}
		}
		System.out.println();
		}
		
	}

}
