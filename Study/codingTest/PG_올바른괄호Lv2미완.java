package codingTest;

public class PG_올바른괄호Lv2미완 {
	
	boolean solution(String s) {
		
        char[] charArr = s.toCharArray();
		boolean answer = true;
		
		for(int i = 0; i < charArr.length; i++) {
			if(charArr[0] == ')') {
				answer = false;
			}else if(charArr[charArr.length-1] == '('){
				answer = false;
			}
		}
        return answer;
    }

	public static void main(String[] args) {

		String s = "()())(()"; // "(())()"t  ")()("f  "(()("f
		char[] charArr = s.toCharArray();
		boolean answer = true;
		
		for(int i = 0; i < charArr.length; i++) {
			if(charArr[0] == ')') {
				answer = false;
				break;
			}else if(charArr[charArr.length-1] == '('){
				answer = false;
				break;
			}
			for(int j = 0; j < charArr.length; j++) {
				if(charArr[i] == '(') {
					if(charArr[j] == ')') {
						charArr[j] = 't';
						break;
					}
				}
			}
		}
		
		System.out.println(charArr);
		
	}

}
