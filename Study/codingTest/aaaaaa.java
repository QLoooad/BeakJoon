package codingTest;

class aaaaaa {
	public static long solution(long n) {
		long answer = 0;
        long sqrt = (long)Math.sqrt(n);//제곱근
        System.out.println("sqrt : "+sqrt);
        System.out.println(sqrt % 1.0);
        if(sqrt *sqrt == n) { //
        	long nextSqrt = sqrt+1;
        	answer = nextSqrt*nextSqrt;
        }else {
        	answer = -1;
        }
        return answer;
    }
    public static void main(String[] args){
    	System.out.println(solution(3));
    }
}