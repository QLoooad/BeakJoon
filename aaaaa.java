import java.util.Arrays;

public class aaaaa {
    public static int[] divisible(int[] array, int divisor) {
    	int[] answer = Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();
        if(answer.length == 0) answer = new int[] {-1};
        java.util.Arrays.sort(answer);
        return answer;
        }
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        int n = 1;
        int k = 0;
        while( k < 100 ) {
        	k = k+n;
        	n = n+1;
        }
        System.out.println(k);
    }
}