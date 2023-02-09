package codingTest;
import java.util.Scanner;
 
public class BJ2480 {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
        
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		
		
		in.close();
		
		if(A==B && B==C && A==C)
			System.out.println(10000+A*1000);
		else if (A==B)
			System.out.println(1000+A*100);
		else if (B==C)
			System.out.println(1000+B*100);
		else if (C==A)
			System.out.println(1000+C*100);
		else 
			System.out.println(Math.max(A, Math.max(B,C))*100);
	
	}
}