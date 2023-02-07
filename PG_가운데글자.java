package test;

public class PG_가운데글자 {
	
	public String solution(String s) {
        String answer = "";
        return answer;
    }
	
	public static void main(String[] args) {

		String s = "abcde";
		int sLength = s.length();
		int sMid = s.length()/2;
		
		String result;
		
		if(sLength%2 == 1) {
			result = s.charAt(sMid)+"";
		}else {
			String sum1 = s.charAt(sMid-1)+"";
			String sum2 = s.charAt(sMid)+"";
			result = sum1+sum2;
		}
		System.out.println(result);
	}

}
