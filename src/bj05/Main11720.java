package bj05;

import java.util.Scanner;

public class Main11720 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b  = sc.next();
		int sum = 0;
		
		for(int i = 0; i < a; i++ ) {
			sum += b.charAt(i)-48;
		}
		System.out.println(sum);
	}

}
