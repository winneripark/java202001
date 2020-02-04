package 조건문;

import java.util.Scanner;

public class 음식주문 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Scanner라는 class는 이 파일에서 한번 복사하면 계속 반복해서 사용.

		System.out.println("저기요 !!");
		System.out.println("----------------");
		System.out.println("메뉴를 고르세요.");
		System.out.println("1)짜장면, 2)짬뽕, 3)우동");
		System.out.println("----------------");
		System.out.print("당신의 선택은 ? ");		
		int choice = scan.nextInt();
		
		if (choice == 1) {
			System.out.println("당신은 짜장면을 주문하셨습니다.");
		} else if(choice == 2){
			System.out.println("당신은 짬뽕을 주문하셨습니다.");
		} else if(choice == 3){
			System.out.println("당신은 우동을 주문하셨습니다.");
		} else	{
			System.out.println("해당 메뉴는 없는 메뉴입니다.");
			System.out.println("위 3가지 메뉴중 하나를 선택하기 바랍니다.");
		}
	}
}
