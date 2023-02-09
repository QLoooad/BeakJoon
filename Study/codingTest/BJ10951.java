package codingTest;
import java.util.Scanner;
 
public class BJ10951 {
	public static void main(String args[]){
		
		Scanner in=new Scanner(System.in);
			
		while(in.hasNextInt()){ // 입력이 int이면 true 아니면 false
		
			int a=in.nextInt();
			int b=in.nextInt();
			System.out.println(a+b);
		
		}	
		in.close();
	}
}