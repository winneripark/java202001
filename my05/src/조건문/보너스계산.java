package 조건문;

import java.util.Scanner;

public class 보너스계산 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Scanner라는 class는 이 파일에서 한번 복사하면 계속 반복해서 사용.

		System.out.print("당신의 직급은 ?");
		String position = scan.next();

		switch(position) {
		case "사원":
			System.out.println(position + "의 보너스는 1000만원 입니다.");
			break;
		case "대리":
			System.out.println(position + "의 보너스는 1500만원 입니다.");
			break;
		case "과장":
			System.out.println(position + "의 보너스는 2000만원 입니다.");
			break;
		case "차장":
			System.out.println(position + "의 보너스는 2500만원 입니다.");
			break;
		case "부장":
			System.out.println(position + "의 보너스는 3000만원 입니다.");
			break;
		case "이사":
			System.out.println(position + "의 보너스는 4000만원 입니다.");
			break;
		case "사장":
			System.out.println(position + "의 보너스는 5000만원 입니다.");
			break;
		case "회장":
			System.out.println(position + "의 보너스는 6000만원 입니다.");
			break;
		default:
			System.out.println("입력한 직급은 없는 직급입니다.");
			break;
		}
	}
}
