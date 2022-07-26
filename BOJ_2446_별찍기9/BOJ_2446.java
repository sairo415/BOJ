package BOJ_2446_별찍기9;

import java.util.Scanner;

public class BOJ_2446 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
	
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j < 2 * N - 1 - i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for (int i = 1; i < N; i++) {
			
			for (int j = 0; j < N - 1 - i; j++) {
				System.out.print(" ");
			}
			
			for (int j = N - 1 - i; j < i + N; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		sc.close();
	}
}
