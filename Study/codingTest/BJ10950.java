package codingTest;
import java.util.Scanner;
 
public class BJ10950 {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
        
		int a = in.nextInt();
		
		
		
		for(int i = 0; i < a; i++ ) {
			int A = in.nextInt();
			int B = in.nextInt();
			System.out.println(A+B);
		}
		
		in.close();
	}	
	
}