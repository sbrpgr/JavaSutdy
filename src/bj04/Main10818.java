package bj04;

import java.util.Scanner;

public class Main10818 {
 
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	int[] arr = new int[n]; 
	
	
	for (int i = 0; i < arr.length; i++ ) {
		int nx = sc.nextInt();
		arr[i] = nx;
		}
	
	int max = arr[0];
	int min = arr[0];
	
	
	for (int j = 0; j < arr.length; j++ ) {
		if (arr[j] < min) {
			min = arr[j];
			}
		if (arr[j]> max) {
			max = arr[j];
			}
	}
	System.out.println(min +" "+max);
	}
	}