package codingTest;

import java.util.Arrays;
import java.util.Comparator;

public class PG_최소직사각형 {
	
	public int solution(int[][] sizes) {

		for(int i = 0; i < sizes.length; i++) {
			Arrays.sort(sizes[i]);
		}
		
		int rMax = 0;
		int lMax = 0;
		
		for (int i = 0; i < sizes.length; i++) {
			if (sizes[i][0] > lMax) {
				lMax = sizes[i][0];
			}
			for (int j = 0; j < sizes[0].length; j++) {
				if (sizes[i][j] > rMax) {
					rMax = sizes[i][j];
				}
			}
		}
		int result = rMax * lMax;
		
		return result;
    }

	public static void main(String[] args) {

		int[][] sizes = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
		
		for(int i = 0; i < sizes.length; i++) {
			Arrays.sort(sizes[i]);
		}
		
		int rMax = 0;
		int lMax = 0;
		
		for (int i = 0; i < sizes.length; i++) {
			if (sizes[i][0] > lMax) {
				lMax = sizes[i][0];
			}
			for (int j = 0; j < sizes[0].length; j++) {
				if (sizes[i][j] > rMax) {
					rMax = sizes[i][j];
				}
			}
		}
		int result = rMax * lMax;
		System.out.println(result);
		//*****************************************************************
		//가져온거 
		int length = 0, height = 0;
        for (int[] card : sizes) {
            length = Math.max(length, Math.max(card[0], card[1]));
            height = Math.max(height, Math.min(card[0], card[1]));
        }
        int answer = length * height;
        System.out.println(answer);
      //*****************************************************************
	}

}
