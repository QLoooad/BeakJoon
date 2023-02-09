package codingTest;
import java.util.Arrays;

public class PG_서울김서방찾기 {
	public static String solution(String[] seoul) {
        String answer = "김서방은 "+Arrays.asList(seoul).indexOf("Kim")+"에 있다";
        return answer;
    }
	public static void main(String[] args) {
		String[] arr = { "Jane", "Kim" };
		System.out.println("김서방은 "+Arrays.asList(arr).indexOf("Kim")+"에 있다");
	}
}
