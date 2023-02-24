package codingTest;

import java.util.Arrays;

public class PG_키패드누르기 {
	
	public String solution(int[] numbers, String hand) {
        String answer = "";
        return answer;
    }

	public static void main(String[] args) {
		
		int[][] intArray= {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		
		String lPosi = "*";
        String rPosi = "#";
        
        StringBuffer str = new StringBuffer("");
		/*
		for(int i = 0; i<numbers.length;i++) {
			switch(numbers[i]) {
			case 1: case 4: case 7: str.append("L"); break;
	        case 3: case 6: case 9: str.append("R"); break;
	        default : 
	        	if() {
	        		
	        	}
			}
		}
		*/
        int arrRow = -1;
        int arrCol = -1;
        
        for (int i = 0 ; i < intArray.length; i++) // row, col 해당 번호 인덱스
            for(int j = 0 ; j < intArray[i].length ; j++){// 거리 구하기용
                 if ( intArray[i][j] == numbers[i]){
                	 arrRow = i;
                	 arrCol = j;
                      break;
                 }
            }
        //손 위치
        int[] handPosiR = {3,2};
        int[] handPosiL = {3,0};
        
        System.out.println(arrRow);
        System.out.println(arrCol);
        
	}
	public String whichHandMove(int[] handPosiL, int[] handPosiR, int[] numbers) { //
        String answer = "";
        
        int[][] intArray= {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        
        int arrRow = -1;
        int arrCol = -1;
        
        for (int i = 0 ; i < intArray.length; i++) // row, col 해당 번호 인덱스
            for(int j = 0 ; j < intArray[i].length ; j++){// 거리 구하기용
                 if ( intArray[i][j] == numbers[i]){
                	 arrRow = i;
                	 arrCol = j;
                      break;
                 }
            }
        return answer;
    }
	
	
	
	public String CheckPosition(int[] numbers, String hand) {
        String answer = "";
        return answer;
    }

}
