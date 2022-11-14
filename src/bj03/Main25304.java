package bj03;

import java.util.Scanner;

public class Main25304 {
	public static void main(String args[]) {
 
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt(); // 총 금액
		int count = sc.nextInt(); // 종류의 수
		
		for(int i = 0; i< count; i++){
            int price = sc.nextInt();
            int num = sc.nextInt();

            total = total - (price * num);
        } if (total == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		
	}
 
}