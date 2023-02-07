
public class PG_하샤드수 { // 하샤드수 = ex) 112 = 1+1+2=4 if(112%4==0)
	public static boolean solution(int x) {
        boolean answer = false;
        String xNum = Integer.toString(x);
        System.out.println(xNum);
        int numDigit = xNum.length(); //수의 자릿수
        System.out.println(numDigit);
        int xPlus = 0;
        for(int i = 0; i<numDigit; i++){
        	xPlus += xNum.charAt(i)-'0';
        }
        if(x % xPlus == 0) answer = true;
        System.out.println(xPlus);
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(13));
	}
}
