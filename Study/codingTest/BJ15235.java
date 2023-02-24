package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ15235 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int pepleNum = Integer.parseInt(br.readLine());
		String wantPizza = br.readLine();
		int[] pizza = new int[pepleNum];
		
		StringTokenizer st = new StringTokenizer(wantPizza," ");
		
		for(int i = 0; i < pepleNum; i++) {
			pizza[i] = Integer.parseInt(st.nextToken());
		}
		for(int a : pizza) {
			
		}
		
	}

}
