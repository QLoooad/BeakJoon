import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class BJ1152 {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		System.out.print(st.countTokens());
	}
}
/*split 은 공백도 문자로 취급
//StringTokenizer는 진짜 문자만 문자로 취급
String str = "apple,banana,,kiwi";
<결과>
======= stringTokenizerTest() =======
0번째  : apple
1번째  : banana
2번째  : kiwi
======= splitTest() =======
0번째  : apple
1번째  : banana
2번째  :
3번째  : kiwi */