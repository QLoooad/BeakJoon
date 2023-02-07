

public class PG_없는숫자더하기 {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,6,7,8,0};
		int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        int result = 45-sum;
        System.out.println(result);

	}

}
