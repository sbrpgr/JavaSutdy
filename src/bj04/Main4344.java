package bj04;


import java.util.Arrays;
import java.util.Scanner;

public class Main4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr;
		int ts = sc.nextInt(); // 테스트 반복 횟수
		
		for(int i = 0; i < ts; i++) {		
			
			int s =sc.nextInt(); //학생 수
			arr = new int[s];
			double sum = 0;
			
			for(int j = 0 ; j < s ; j++) {
				int val = sc.nextInt();	// 성적 입력 
				arr[j] = val;
				sum+= val;
				
			}
			double avr = sum/s;
			double ct = 0;
			
			for(int j = 0 ; j < s ; j++) {
				if(arr[j] > avr) {
					ct++;
				}
			
			}
		
			System.out.printf("%.3f%%\n",(ct/s)*100);
		
		
		}
		
		
	}
}
