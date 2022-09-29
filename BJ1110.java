import java.util.Scanner;
public class BJ1110 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int count = 0;
		int B = A;
		
		while(true) {
			A = ((A%10)*10+(A/10+A%10)%10);
			count++;
			if(A==B) {
				break;
			}
		}
		System.out.println(count);
	}
}
/*
 *	26  2+6=8
 *	68	6+8=14
 *	84	8+4=12
 *	42	4+2=6
 *	26	2+6=8
 */