package codingTest;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
        Scanner Multi = new Scanner(System.in);
        
        int A = Multi.nextInt();
		int B = Multi.nextInt();
        
		Multi.close();
		
		if(A>B) System.out.println(">");
		else if(A<B) System.out.println("<");
		else System.out.println("==");
		
		
	}
}