package bj04;

import java.util.Scanner;

public class Main1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		double[] arr = new double[s];
		double m = arr[0];
		double sum = 0;
		
		for (int i=0; i< arr.length; i++) {
			arr[i] = sc.nextDouble();
			if(m<= arr[i]) {
				m = arr[i];
			}
		} for (int i=0; i< arr.length; i++) {
			arr[i] = arr[i]/m*100;
			sum += arr[i];
		}
		System.out.println(sum/s);
	}

}
