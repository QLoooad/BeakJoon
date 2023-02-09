package codingTest;

import java.util.ArrayList;

public class PG_같은숫자싫어 {
	
	public int[] solution(int []arr) {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		int value = -1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != value) {
				arrayList.add(arr[i]);
				value = arr[i];
			}
		}
		int[] array = new int[arrayList.size()];
		int size=0;
		for(int temp : arrayList){
		  array[size++] = temp;
		}
        return array;
    }

	public static void main(String[] args) {

		int[] arr1 = {4,4,4,3,3};
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		int value = -1;
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] != value) {
				arrayList.add(arr1[i]);
				value = arr1[i];
			}
		}
		int[] array = new int[arrayList.size()];
		int size=0;
		for(int temp : arrayList){
		  array[size++] = temp;
		}
	}

}
