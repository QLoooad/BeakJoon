package codingTest;

import java.util.Arrays;

public class PG_안전지대 {
	 public int solution(int[][] board) {
			
			int[][] expansionBoard = new int[board.length+2][board.length+2];
			int DangerCount = 0;
			int safeCount = 0;
			
			
			for (int i = 0; i < board.length; i++) {
	            for(int j = 0; j < board.length; j++) {
	            	if(board[i][j] == 1) {// 보드 확장 & 위험지역 카운트
	            		expansionBoard[i+1][j+1] = 1;
	            		DangerCount++;
	            	}
	            }
			}
			
			int[][] DangerBoard = new int[DangerCount][2];
			
			int n = 0;
			for (int i = 0; i < expansionBoard.length; i++) {//위험지역 메모
	            for(int j = 0; j < expansionBoard.length; j++) {
	            	if(expansionBoard[i][j] == 1) {
	            		DangerBoard[n][0] = i;
	            		DangerBoard[n][1] = j;
	            		n++;
	            	}
	            }
			}
			
			for (int i = 0; i < DangerCount; i++) {
				int leftMine = DangerBoard[i][0];
				int rightMine = DangerBoard[i][1];
				for(int j = 0; j < expansionBoard.length; j++) {
					expansionBoard[leftMine-1][rightMine-1] = 1;
	        		expansionBoard[leftMine-1][rightMine] = 1;
	        		expansionBoard[leftMine-1][rightMine+1] = 1;
	        		
	        		expansionBoard[leftMine][rightMine-1] = 1;
	        		expansionBoard[leftMine][rightMine+1] = 1;
	        		
	        		expansionBoard[leftMine+1][rightMine-1] = 1;
	        		expansionBoard[leftMine+1][rightMine] = 1;
	        		expansionBoard[leftMine+1][rightMine+1] = 1;
				}
			}
			
			for (int i = 1; i < expansionBoard.length-1; i++) {
	            for(int j = 1; j < expansionBoard.length-1; j++) {
	            	if(expansionBoard[i][j] == 0) {// 안전 지역 카운트
	            		safeCount++;
	            	}
	            }
			}
	        return safeCount;
	    }

	public static void main(String[] args) {
		int[][] board = {{1, 1, 1, 1, 1}, 
						 {1, 0, 0, 0, 0}, // 1.1 | 1.2 | 1.3
						 {1, 0, 0, 0, 0}, // 2.1 | 2.2 | 2.3
						 {1, 0, 0, 0, 0}, // 3.1 | 3.2 | 3.3
						 {1, 0, 0, 0, 0}};
		
		int[][] expansionBoard = new int[board.length+2][board.length+2];
		int DangerCount = 0;
		int safeCount = 0;
		
		
		for (int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
            	if(board[i][j] == 1) {// 보드 확장 & 위험지역 카운트
            		expansionBoard[i+1][j+1] = 1;
            		DangerCount++;
            	}
            }
		}
		
		int[][] DangerBoard = new int[DangerCount][2];
		
		int n = 0;
		for (int i = 0; i < expansionBoard.length; i++) {//위험지역 메모
            for(int j = 0; j < expansionBoard.length; j++) {
            	if(expansionBoard[i][j] == 1) {
            		DangerBoard[n][0] = i;
            		DangerBoard[n][1] = j;
            		n++;
            	}
            }
		}
		
		for (int i = 0; i < DangerCount; i++) {
			int leftMine = DangerBoard[i][0];
			int rightMine = DangerBoard[i][1];
			for(int j = 0; j < expansionBoard.length; j++) {
				expansionBoard[leftMine-1][rightMine-1] = 1;
        		expansionBoard[leftMine-1][rightMine] = 1;
        		expansionBoard[leftMine-1][rightMine+1] = 1;
        		
        		expansionBoard[leftMine][rightMine-1] = 1;
        		expansionBoard[leftMine][rightMine+1] = 1;
        		
        		expansionBoard[leftMine+1][rightMine-1] = 1;
        		expansionBoard[leftMine+1][rightMine] = 1;
        		expansionBoard[leftMine+1][rightMine+1] = 1;
			}
		}
		
		for (int i = 1; i < expansionBoard.length-1; i++) {
            for(int j = 1; j < expansionBoard.length-1; j++) {
            	if(expansionBoard[i][j] == 0) {// 안전 지역 카운트
            		safeCount++;
            	}
            }
		}
		
		
//		-------------------------------------------------	
		
//		
//		
//		
		System.out.println(safeCount);
		System.out.println(DangerCount);
		for (int i = 0; i < board.length; i++) {// 그냥 출력
            System.out.println(Arrays.toString(board[i]));
		}
		
		System.out.println("\n---------------------------------------\n");
		for (int i = 0; i < expansionBoard.length; i++) {// 확장 출력
            System.out.println(Arrays.toString(expansionBoard[i]));
		}
		
		System.out.println("\n---------------------------------------\n");
		for (int i = 0; i < DangerBoard.length; i++) {// 위험지역 메모 출력
            System.out.println(Arrays.toString(DangerBoard[i]));
		}
		
		System.out.println("안전지역 : " + safeCount);
		System.out.println("위험지역 : " + DangerCount);
		
	}

}
