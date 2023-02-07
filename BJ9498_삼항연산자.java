import java.util.Scanner;

public class BJ9498_삼항연산자 {
	public static void main(String[] args) {
		
        Scanner Multi = new Scanner(System.in);
        
        int A = Multi.nextInt();
//		int B = Multi.nextInt();
        
		Multi.close();
		
		if(A>=90) System.out.println("A");
		else if(A>=80) System.out.println("B");
		else if(A>=70) System.out.println("C");
		else if(A>=60) System.out.println("D");
		else System.out.println("F");
		
//		삼항연산자
//		System.out.print((A>=90)?"A": (A>=80)? "B": (A>=70)? "C": (A>=60)? "D": "F");
//		(A>=90조건)? 참 값:거짓 값; 
	}
	
}