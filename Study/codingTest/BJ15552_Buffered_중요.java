package codingTest;
import java.io.*;
public class BJ15552_Buffered_중요 {

	public static void main(String[] args) throws IOException {
//	main함수 우측에 throws IOException을 통해 예외를 처리한다. 
//	(메소드 선언부에 throws를 명시하면, 해당 메소드 내에서 exception이 발생하는 경우 
//	 해당 메소드를 호출한 곳에서 예외가 발생한다.)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//내보내니까 System.out
		int n = Integer.parseInt(br.readLine()); //횟수 입력 받은 만큼 loop
		
		for (int i = 0; i < n; i++) {
			String string = br.readLine();
			int a = Integer.parseInt(string.split(" ")[0]); 
/*  
			--------------------------split-----------------------------
			 string.split 다음에 " " << 는  공백을 기준으로 문자열을 분리(엔터)해라
			 ex1)  a b = a
			             b
			 string.split(" ")[0] 의 [0]은 분리한 "첫번째만()" 가져와라 
			------------------------------------------------------------
*/
			int b = Integer.parseInt(string.split(" ")[1]);
			bw.write(a+b+"\n"); //버퍼(메모리)에 입력 (sys.o.p 아님)
		}
		bw.flush(); // 모든계산이 끝나고 한번에 출력 = (System.out.print) 
		
	}
}