package codingTest;
import java.util.Scanner;

public class BJ25304 {
	public static void main(String[] args) {
		
		Scanner A = new Scanner(System.in);
		
		int total = A.nextInt();
		int count = A.nextInt();
		
		for(int i = 0; i< count; i++){
			int price = A.nextInt();
	        int ea = A.nextInt();
	            
	        total = total - ( price * ea );
	        }
		  
		  if(total == 0) System.out.println("Yes");
		  else System.out.println("No");
	}
	
}
//스캐너 하나에 한 값이 저장되는게 아닌 8,9,12,13 번줄처럼 설정하면 하나의 스캐너에 여러개 저장가능
//8번줄 토탈. for문안에서 값 바꾸면 8번 바뀜______________________
//틀린 이유 : yes, no 대문자로 안적음