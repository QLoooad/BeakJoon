package codingTest;
import java.util.Scanner;
 
public class BJ1978 { //n의 제곱근을 구하면 그 수 만큼 나눠서 소수 판별
 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //수의 개수
        int cnt = 0; //소수 카운트
        
        for(int i=0; i<n; i++) { //n만큼 반복
            int k = sc.nextInt();
            boolean isPrime = true;
            
            if(k == 1)
                continue; //1은 소수가 아니므로 넘어간다.
            for(int j=2; j<=Math.sqrt(k); j++) { //Math.sqrt() 함수는 제곱근을 구하는 함수이다.
                if(k % j == 0) {
                    isPrime = false;    //k를 j로 나눠서 나눠떨어지면 소수가 아니다.
                }
            }
            if(isPrime) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
