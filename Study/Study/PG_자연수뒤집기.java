
public class PG_자연수뒤집기 {
	class Solution {
	    public int[] solution(long n) {
	    	String strNum = Long.toString(n);
	        System.out.println("strNum : "+strNum);
	        int num = strNum.length();
	        int[] answer = new int[num];
	        System.out.println("strNum.length() : "+num);
	        for (int i = 0, j = num-1; i < num; i++,j--) {
	        	answer[i] = strNum.charAt(j)-'0';
	        }
	        System.out.println("answer[0] : "+answer[0]);
	        System.out.println("answer[1] : "+answer[1]);
	        System.out.println("answer[2] : "+answer[2]);
	        System.out.println("answer[3] : "+answer[3]);
	        System.out.println("answer[4] : "+answer[4]);
	        return answer;
	    }
	}
}
