package CodingTest;

public class PG_배열_원소의_길이 {
	public int[] solution(String[] strlist) {
    	int num = strlist.length;
    	int[] answer = new int[num];
        for(int i = 0; i < num; i++) {
        	int strNum = strlist[i].length();
        	answer[i] = strNum;
        }
        return answer;
    }
}
