package BOJ_5554_심부름가는길;

import java.util.Scanner;

public class BOJ_5554 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for (int i = 0; i < 4; i++) {
			sum += sc.nextInt();
		}
		
		int x = sum / 60;
		int y = sum % 60;
		
		System.out.println(x);
		System.out.println(y);
		
		sc.close();
	}

}
