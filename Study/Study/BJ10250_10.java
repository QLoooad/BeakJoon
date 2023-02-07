import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ10250_10 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int H = Integer.parseInt(st.nextToken()); //층수
			int W = Integer.parseInt(st.nextToken()); //방 개수 (안씀)
			int N = Integer.parseInt(st.nextToken()); //N번째 손님
			
			int x = (N/H) + 1;	//호수
            int y = N%H;		//층수
            if(N%H==0) { //층수와 손님 딱 떨어질때  즉 늘 맨 윗층일때
                x = N/H;
                y = H;
            }
            System.out.println(y*100+x);
			}
		}
	}