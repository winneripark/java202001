package 예제;

import java.util.Scanner;

public class Tour {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Scanner라는 class는 이 파일에서 한번 복사하면 계속 반복해서 사용.
		System.out.println(" << 여행정보 >> ");

		System.out.print("- 여행지: ");
		String land = scan.next();
	
		System.out.print("- 경비: ");
		int money = scan.nextInt();
		
		System.out.print("- 할인율: ");
		double sale = scan.nextDouble();
		
		System.out.print("- 실제 경비: ");
		double result = money - money * sale;
		// 자바에서는 연산할 때 하나라도 실수가 들어 있으면
		// 무조건 결과가 실수!
		// 정수와 정수의 연산의 결과는 무조건 정수!
		System.out.println((int)result + "원");
		System.out.println("----------------");
		System.out.println("=> 12월 중순에 갔을 때 가격");
		
	}
}
