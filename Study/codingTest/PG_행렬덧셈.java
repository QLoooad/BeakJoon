package codingTest;

public class PG_행렬덧셈 {
	
	public int[][] solution(int[][] arr1, int[][] arr2) {
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[0].length; j++) {
				arr1[i][j] += arr2[i][j];
			}
		}
        return arr1;
    }

	public static void main(String[] args) {
		
		//int[][] arr = new int[rows][columns]; rows 가로 , columns 세로
		
		int[][] arr1 = { {0, 1, 2}, {3, 4, 5} }; // <<  arr1 [2][3]
		int[][] arr2 = { {0, 1, 2}, {3, 4, 5} };

		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[0].length; j++) {
				arr1[i][j] += arr2[i][j];
			}
		}
		System.out.println(arr1.length);
		System.out.println(arr1[0].length);
		
		
	}
}
