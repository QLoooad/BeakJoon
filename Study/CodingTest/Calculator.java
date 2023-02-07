package CodingTest;
import java.util.Scanner;
/* 사칙연산
사용자가 1+1 을 입력하면 알아서 구분 후 계산하기 
글자 수 체크 > char (아스키코드)
숫자 구별
연산자 구별
char 스트링 나오면 연산자 구별(+/*-)
연산자 앞 모두 한숫자로 더하고 [1][2][3] 일이삼 >> 123백이십삼
사칙연산 순서 (* / + -)
1+2/3*4-5
*의 앞뒤 먼저 
*/

public class Calculator {
	
	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
		String i = input.next();
		
		int intValue1 = Integer.parseInt(i);
		
		System.out.println(i);
		
		char an = '0';
		char bn = '1';

		
		
		int a = 10;
		int b = 0;
		System.out.println(an+bn);
	}

}
