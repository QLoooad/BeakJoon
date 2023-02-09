package codingTest;
import java.util.Scanner;

public class BJ2753 {
	public static void main(String[] args) {
		
        Scanner Multi = new Scanner(System.in);
        
        int Year = Multi.nextInt();
//		int B = Multi.nextInt();
        
		Multi.close();
		
		if(Year%4==0) {
			if(Year%400==0) System.out.println("1");
			else if(Year%100==0) System.out.println("0");
			else System.out.println("1");
		}
		else System.out.println("0");
	}
	
}
//4로만 나누어떨어지거나 4,100,400으로 모두 나누어떨어지면 윤년
//4,100 으로만 나누어 떨어지면 평년