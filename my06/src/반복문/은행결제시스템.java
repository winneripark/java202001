package 반복문;

import java.util.Scanner;

//은행 결제 시스템
//------------
//1)잔고확인 2)입금 3)출금 4)종료
//선택 >> 1
//당신의 잔고는 100000원

//선택 >> 2
//당신의 입금액은 >> 1000

//선택 >> 3
//당신의 출금액은 >> 1000

//선택 >> 4
//시스템을 종료합니다.

public class 은행결제시스템 {

	public static void main(String[] args) {

		System.out.println("은행 결제 시스템");
		System.out.println("------------");
		System.out.println("1)잔고확인 2)입금 3)출금 4)종료");

		Scanner scan = new Scanner(System.in);
		int money = 10000; // 통장 잔고

		while (true) { //무한루프
			// 조건식에는 반드시 비교연산자를 써준다.
			// 비교연산자의 결과는 항상 논리형(true/false)이다.
			System.out.print("선택>>");
			int choice = scan.nextInt();
			
			if (choice == 1) {
				System.out.println("당신의 잔고는" + money + "원");
			} else if (choice == 2){
				System.out.print("당신의 입금액은 >>");
				int deposit = scan.nextInt();
				money = money + deposit;
			} else if (choice == 3){
				System.out.print("당신의 출금액은 >>");
				int  withdraw = scan.nextInt();
				money = money - withdraw;
			} else if (choice == 4){
				System.out.println("시스템을 종료합니다.");
				break;
			}

	}

}
}
