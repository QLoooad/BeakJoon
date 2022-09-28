import java.util.Scanner;

public class BJ1110 {

	public static void main(String[] args) {
		
		System.out.println("0~99중의 아무런 수 입력 : ");
		//26
		Scanner setN = new Scanner(System.in);
		int mainN = setN.nextInt();
		
		int copyN = mainN;
		int count = 0;
		
		while(true) {
			
			mainN = ((mainN%10)*10+((mainN/10)+(mainN%10)%10));
			
			count++;
			
			if(copyN==mainN) {
				break;
			}
		}
		System.out.println(count);
	}

}
