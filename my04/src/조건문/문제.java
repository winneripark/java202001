package 조건문;

import java.util.Date;
import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Scanner라는 class는 이 파일에서 한번 복사하면 계속 반복해서 사용.

		System.out.print("커피값은 ? ");
		int price = scan.nextInt();

		System.out.print("인원수는 ? ");
		int count = scan.nextInt();
		
		System.out.println("현재 시각이 저녁 10시 이전이면 원래대로 다 내요");
		System.out.println("저녁 10시 이후이면 5000원을 D.C.해 주세요");
	
		Date date = new Date();
		int hour = date.getHours();
		if (hour < 22) {
			int result = price * count;
			System.out.println("지불할 커피값은" + result + "원 입니다." );
			//컨트롤+알트+화살표 아래 :  한줄복사
		} else {
			//알트 + 화살표 방향: 이동
			int result = price * count;
			result = result - 5000;
			System.out.println("지불할 커피값은" + result + "원 입니다." );
		}

	}

}
