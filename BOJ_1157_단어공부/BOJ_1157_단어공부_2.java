package BOJ_1157_단어공부;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BOJ_1157_단어공부_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.next().toUpperCase();
		char[] arr = str.toCharArray();
		Map<String, Integer> cntMap = new HashMap<String, Integer>();

		int max = 0;

		for (int i = 0; i < arr.length; i++) {
			String s = arr[i] + "";
			if (cntMap.get(s) != null) {
				cntMap.put(s, cntMap.get(s) + 1);
			} else {
				cntMap.put(s, 1);
			}
		}

		for (int i = 0; i < cntMap.size(); i++) {
			max = Math.max(max, (int) cntMap.values().toArray()[i]);
		}

		List<String> keyList = new ArrayList<>();
		String answer = "";
		
		for (String s : cntMap.keySet()) {
			if (cntMap.get(s) == max) {
				keyList.add(s);
				if (keyList.size() > 1) {
					answer = "?";
				} else {
					answer = s;
				}
			}
		}

		System.out.println(answer);

		sc.close();
	}

}