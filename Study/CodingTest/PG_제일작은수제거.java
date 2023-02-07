package CodingTest;

import java.util.ArrayList;
import java.util.Arrays;

public class PG_제일작은수제거 {

	public static int[] solution(int[] arr) {

		int[] arr2 = arr.clone();

		Arrays.sort(arr);
		int min = arr[0];

		ArrayList<Integer> intArr = new ArrayList<Integer>();
		for (int ExArr : arr2) {
			intArr.add(ExArr);
		}
		if (arr.length > 1) {
			intArr.remove(Integer.valueOf(min));
		} else {
			intArr.set(0, -1);
		}

		int[] result = new int[intArr.size()];

		for (int i = 0; i < intArr.size(); i++) {
			result[i] = intArr.get(i);
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 3, 1, 4, 2 };
		int[] arr2 = arr.clone();

		Arrays.sort(arr);
		int min = arr[0];

		ArrayList<Integer> intArr = new ArrayList<Integer>();
		for (int ExArr : arr2) {
			intArr.add(ExArr);
		}
		if (arr.length > 1) {
			intArr.remove(Integer.valueOf(min));
		} else {
			intArr.set(0, -1);
		}

		int[] result = new int[intArr.size()];

		for (int i = 0; i < intArr.size(); i++) {
			result[i] = intArr.get(i);
		}

	}

}
