package BOJ_2446_별찍기9;

import java.util.Scanner;

public class BOJ_2446_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[2 * N - 1][2 * N - 1];
		
		for (int r = 0; r < N; r++) {
			for (int c = r; c < 2 * N - 1 - r ; c++) {
				arr[r][c] = 1;
			}
		}
		
		int i = 0;
		for (int r = N; r < 2 * N - 1; r++) {
			for (int c = r - 2 * ++i ; c <= r  ; c++) {
				arr[r][c] = 1;
			}
		}
	
		for (int r = 0; r < 2 * N - 1; r++) {
			for (int c = 0; c < 2 * N - 1; c++) {
				if (arr[r][c] == 1) {
					System.out.print("*");
				} else {
					System.out.print("@");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
