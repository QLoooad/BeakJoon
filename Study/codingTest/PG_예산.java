package codingTest;

import java.util.Arrays;

public class PG_예산 {
	
	public int solution(int[] d, int budget) {
		
		Arrays.sort(d);
        int count = 0;
        
        for(int i = 0; i < d.length; i++) {
			if(budget - d[i] > 0) {
				budget = budget-d[i];
				count++;
			}else {
				break;
			}
		}
        return count;
    }

	public static void main(String[] args) {

		int[] d = {2,2,3,3};
		Arrays.sort(d);
		int budget = 10;
		int count = 0;
		
		for(int i = 0; i < d.length; i++) {
			if(budget - d[i] >= 0) {
				budget = budget-d[i];
				count++;
			}else {
				break;
			}
		}
		System.out.println(count);
	}

}
