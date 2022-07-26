package BOJ_1152_단어의개수;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_1152 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str);
		int sum = 0;
		while (st.hasMoreTokens()) {
			String s = st.nextToken();
			++sum;
		}
		System.out.println(sum);
		sc.close();
	}

}
