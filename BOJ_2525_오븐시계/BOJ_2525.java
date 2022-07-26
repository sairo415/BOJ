package BOJ_2525_오븐시계;

import java.util.Scanner;

public class BOJ_2525 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(); // 시
		int m = sc.nextInt(); // 분
		int c = sc.nextInt(); // 걸리는 시간
		
		int ch = c / 60;
		int cm = c % 60;
		
		int nh = (h + ch + (m + cm) / 60) % 24;
		int nm = (m + cm) % 60;
		
		System.out.println(nh + " " + nm);
		sc.close();
	}

}
