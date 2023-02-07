package CodingTest;
import java.io.*;
public class BJ2438_별찍기 {

	public static void main(String[] args) throws IOException {
//	main함수 우측에 throws IOException을 통해 예외를 처리한다. 
//	(메소드 선언부에 throws를 명시하면, 해당 메소드 내에서 exception이 발생하는 경우 
//	 해당 메소드를 호출한 곳에서 예외가 발생한다.)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//내보내니까 System.out
		int n = Integer.parseInt(br.readLine()); //횟수 입력 받은 만큼 loop
		
		br.close(); //int n 에 저장되었으니 br꺼도 ㄱㅊ
		
		for (int i = 0; i < n; i++) {
			for(int j=0; j<=i; j++) {
				 System.out.print("*");
			}
			System.out.print("\n");	
			
			
		}
		bw.flush(); // 모든계산이 끝나고 한번에 출력 = (System.out.print) 
		bw.close();
	}
}