package BOJ_1157_단어공부;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BOJ_1157_단어공부 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.next().toUpperCase();
		char[] arr = str.toCharArray();
		Map<String, Integer> cntMap = new HashMap<String, Integer>();
//		Map<Integer, String> cntArr = new HashMap<>();
//		List<String> sList = new ArrayList<String>();

//		for (char c : arr) {
//			System.out.println(c);
//		}

		int max = 0;

		for (int i = 0; i < arr.length; i++) {
			String s = arr[i] + "";
//			System.out.println(s);
			if (cntMap.get(s) != null) {
				cntMap.put(s, cntMap.get(s) + 1);
//				System.out.println(cnt);
//				System.out.println(s + cnt);
				System.out.println(cntMap);
			} else {
				cntMap.put(s, 1);
				System.out.println(cntMap);
			}
//			System.out.println(s);
//			max = Math.max(max, cnt);
		}

//		List<Integer> n = (ArrayList<Integer>) cntMap.values();
//		int[] nArr = new int[cntMap.values().size()];
//		System.out.println(cntMap.values().toArray());
		
		for (int i = 0; i < cntMap.size(); i++) {
			max = Math.max(max, (int) cntMap.values().toArray()[i]);
		}
		
		System.out.println(cntMap.values());
//		System.out.println(cntArr.get(max));
		System.out.println(max);
		
		
		System.out.println(cntMap);
		
//		if (cntMap.get(cntMap.containsValue(max)) > 1) {
//			System.out.println("?");
//		} else {
//			System.out.println(cntMap.get(cntMap.containsValue(max)));
//		}
		
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
