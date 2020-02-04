package 배열;

import java.util.Random;

public class lotto {
	public static void main(String[] args) {
		//로또 번호 6숫자 만들기
		
		int[] lotto1 = new int[1000];
		
		//아무거나 발생하게 부품(class)가 필요
		Random r = new Random();
		//int data = r.nextInt(46); //0 ~ 45
		//System.out.println(data);
		
		for (int i = 0; i < lotto1.length; i++) {
			lotto1[i] = r.nextInt(1000); 
		}

		for (int i = 0; i < lotto1.length; i++) {
			System.out.println(lotto1[i] + " "); 
		}

	
	}
}
