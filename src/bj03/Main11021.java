package bj03;

import java.util.Scanner;

public class Main11021 {
	public static void main(String args[]) {
 
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		
		for (int i= 1; i<= q; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Case #"+ i +":" +" " +(a+b));
		}
		
		
	}
 
}