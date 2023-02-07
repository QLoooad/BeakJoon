package CodingTest;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class BJ3052 {
    public static void main(String[] args) throws IOException {
 
        boolean[] arr = new boolean[42];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i = 0 ; i < 10 ; i++) {
            arr[Integer.parseInt(br.readLine()) % 42] = true;
        }
        //10개의 예가 주어질때 입력되는 수를 true로 변경
        //42개의 arr는 초기값이 false
        int count = 0;
        for(boolean i : arr) {  //향상된for문 (처음부터 끝까지 엄추지않고 돌림)x
            if(i){   			
                count++;
                
            }
            System.out.print(i+" ");
            System.out.println("");
        }
        System.out.println(count);
    }
}		
/*	16번줄 해석
 * 향상된 for문은 ***처음부터 끝까지*** 자동으로 실행
 * 12번줄의 선언으로 인해
 * 1~10까지 true 인 arr을 i로 복제 후 if에 10개의 true가 들어가면서 카운트 증가
 */	