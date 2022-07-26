package BOJ_1264_모음의개수;

import java.util.Scanner;

public class BOJ_1264 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aeiou = "aeiouAEIOU";
		
		
		while(true) {
			int sum = 0;
			String input = sc.nextLine();
			if (input.equals("#")) {
				break;
			}
			for (int i = 0; i < input.length(); i++) {
				for (int j = 0; j < aeiou.length(); j++) {
					if (input.charAt(i) == aeiou.charAt(j)) {
						sum++;
					}
				}
			}
			System.out.println(sum);
		}
		sc.close();
	}

}
