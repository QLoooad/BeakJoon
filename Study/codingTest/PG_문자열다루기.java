package codingTest;

public class PG_문자열다루기 {
	
	public boolean solution(String s) {
        boolean answer = true;
        return answer;
    }
	
	public static void main(String[] args) {

		String s = "1234";
		
		if(s.length() == 4 || s.length() == 6 ) {
			try{
			    int n = Integer.parseInt(s);
			    System.out.println("true");
			}catch (NumberFormatException e){ 
				//NumberFormatException 
				//문자열이 나타내는 숫자와 일치하지 않는 타입의 숫자로 변환시 발생 
				System.out.println("false");
			}
		}else System.out.println("false");
		
	}

}
