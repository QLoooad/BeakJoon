package codingTest;
import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {

		System.out.println("첫번째 수 입력");
		Scanner Fint = new Scanner(System.in);
		int a = Fint.nextInt();
		
		System.out.println("사칙연산자 입력");
		Scanner Arith = new Scanner(System.in);
		String z = Arith.next();
		
		System.out.println("두번째 수 입력");
		Scanner Sint = new Scanner(System.in);
		int b = Sint.nextInt();
		
		System.out.print("답 : ");
		
		if(z.equals("+")) {
			System.out.println(a+b);
		}else if(z.equals("-")) {
			System.out.println(a-b);
		}else if(z.equals("*")) {
			System.out.println(a*b);
		}else
			System.out.println(a/b);
	}

}
