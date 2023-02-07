package test;

public class PG_음양더하기 {
	public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 123456789;
        return answer;
    }
	public static void main(String[] args) {
		int[] absolutes = { 1,2,3 };
		boolean[] signs = {false,false,true};
		
		int sum = 0;
		
		for(int i = 0; i < absolutes.length; i++) {
			if(signs[i] == true) {
				sum += absolutes[i];
			}else if(signs[i] == false) {
				sum -= absolutes[i];
			}
		}
		System.out.println(sum);
	}

}
