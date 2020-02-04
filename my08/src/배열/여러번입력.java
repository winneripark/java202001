package 배열;

import java.util.Scanner;

public class 여러번입력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int data; //쓰레기 값이 들어있는 상태
		int sum = 0;
		int data = 0; //변수에 처음 값 = 초기값 넣어주는것 => 초기화
		int[] data1 = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("성적을 입력 >> ");
			data1[i] = sc.nextInt();
			sum = sum + data1[i];
		}
		for (int i = 0; i < data1.length; i++) {
			System.out.println(data1[i]);			
		}
		System.out.println("총합은 " + sum + "점");
		System.out.println("평균은 " + sum/data1.length + "점");
		
	
		
	}
	
}
