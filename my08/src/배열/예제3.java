package 배열;

//5개의 

import java.util.Scanner;

public class 예제3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] data1 = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("숫자 입력 >> ");
			data1[i] = sc.nextInt();
		}
		for (int x : data1) {
			System.out.println( x + "점");			
		}

	}

}




