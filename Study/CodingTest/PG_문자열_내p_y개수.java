package CodingTest;

public class PG_문자열_내p_y개수 {
	static boolean solution(String s) {
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;
        String toLowerCase = s.toLowerCase();
        for (int i = 0; i < toLowerCase.length(); i++) {
        	if(toLowerCase.charAt(i) == 'p') pCount++;
        	if(toLowerCase.charAt(i) == 'y') yCount++;
        }
        if(pCount == yCount) {
        	answer = true;
        }else {
        	answer = false;
        }
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution("Pyy"));
	}
}
