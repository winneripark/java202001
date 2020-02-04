package 조건문;

import java.util.Scanner;
import java.util.Random;

public class 아무거나2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Scanner라는 class는 이 파일에서 한번 복사하면 계속 반복해서 사용.
		System.out.print("당신의 선택은 ? ");		
		int choice = scan.nextInt();

		
		// 아무거나 내게 하는 class
		// 랜덤(Random)
		Random r = new Random();
		int data = r.nextInt(3); // -21억~21억 
		// 0부터 2까지를 발생시킴.
		System.out.println(data);
		
		
	}
}
