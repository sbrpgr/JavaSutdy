package bj04;

import java.util.Scanner;


public class Main89580 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] chr = str.toCharArray();
		
		int s = 0;
		int c = 0;
		for (int i = 0; i < chr.length; i++) {
			
			if (chr[i] == 'O') {
				c ++;
				s += c;
			} else {
				c=0;}
			
			}
		System.out.println(s);	
		}
	}

