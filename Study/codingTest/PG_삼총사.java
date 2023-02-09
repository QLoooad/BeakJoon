package codingTest;

public class PG_삼총사 {
	class Solution {
	    public int solution(int[] number) {
	        int answer = 0;
	        int arrNum = number.length;
	        for(int i = 0; i < arrNum; i++) {
	        	for(int j = i + 1; j < arrNum; j++){
	        		for(int k = j + 1; k < arrNum; k++) {
	        			if(number[i] + number[j] + number[k] == 0) {
	        				answer++;
	        			}
	        		}
	        	}
	        }
	        return answer;
	    }
	}
}
