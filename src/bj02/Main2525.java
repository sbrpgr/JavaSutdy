package bj02;

import java.util.Scanner;


public class Main2525 {
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
		
		int H = in.nextInt(); 
		int M = in.nextInt();
		int C = in.nextInt();
		in.close();
		if (M+C < 60) {
			M = M+C;	
			System.out.println(H + " " + M);
		} else {
			M = H* 60 + M + C;
			H = M /60;
			M = M % 60;
			if (H>23) {
				H= H-24;
			}
			System.out.println(H + " " + M);
		}
	}
}