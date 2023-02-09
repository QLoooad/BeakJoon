package codingTest;
import java.util.Scanner;

public class BJ11720 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ea = sc.nextInt();
		String A = sc.next();
		sc.close();
		int sum = 0;
		for(int i = 0; i < ea; i++) {
			sum += A.charAt(i)-'0'; 
			//-'0' 의 이유 : 아스키코드로 바꾸었으니 1=49 가 되므로 아스키의 0(48)을 빼준다
		}
		System.out.println(sum);
	}

}
