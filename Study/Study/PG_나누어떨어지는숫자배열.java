import java.util.Arrays;

public class PG_나누어떨어지는숫자배열 {
	public static int[] solution(int[] arr, int divisor) {
		
        int count = 0;
        
        for(int i=0; i < arr.length; i++) {
        	if(arr[i]%divisor == 0) count++;
        }
        
        if(count == 0){
            int[] arrRemainder = {-1};
            return arrRemainder;
        }
        
        int[] arrRemainder = new int[count];
        
        for(int i = 0,j = 0; i < arr.length; i++) {
        	if(arr[i] % divisor == 0) {
        		arrRemainder[j] = arr[i];
        		j++;
        	}
        }
        Arrays.sort(arrRemainder);
        return arrRemainder;
    }
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(solution(a, 3)));
	}//이렇게 하면 값이 arrRemainder 의 주소값이 나오지만 정답처리가 된다
	//왜 정답처리가 되는것인가
}
