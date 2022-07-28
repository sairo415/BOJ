package BOJ_2309_일곱난쟁이;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_2309_일곱난쟁이 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> height = new ArrayList<>();
		int sum = 0;

		for (int i = 0; i < 9; i++) {
			int h = sc.nextInt();
			height.add(h);
			sum += h;
		}

		int ri = 0;
		int rj = 0;
		
		for (int i = 0; i < height.size(); i++) {
			for (int j = 0; j < height.size(); j++) {
				if (i == j) {
					continue;
				} else if (sum - height.get(i) - height.get(j) == 100) {
					ri = height.get(i);
					rj = height.get(j);
					break;
				}
			}
		}
		
		for (int i = height.size() - 1; i >= 0; i--) {
			if(height.get(i) == ri) {
				height.remove(i);
			}
		}
		
		for (int i = 0; i < height.size(); i++) {
			if(height.get(i) == rj) {
				height.remove(i);
			}
		}
		
		height.sort(null);
		for (int i = 0; i < height.size(); i++) {
			System.out.println(height.get(i));
		}
		
		sc.close();
	}
}
