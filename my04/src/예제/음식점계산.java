package 예제;

import java.util.Scanner;

public class 음식점계산 {

	public static void main(String[] args) {
		// int 총금액 = 446677;
		// int 인원 = 6;
		// double avg = (double)총금액 / 인원;
		// java에서는 "="기준으로 좌측의 계산값이 좌측 계산의 형식에 맞추어서 이미 계산이 된것을 우측으로 대입시켜 줌.
		// 즉 int(분자) / int(분모)의 결과 값이 실수가 나올것이 예상되면 분모, 분자중 하나 이상에 실수 형식으로 처리를 해주어야 함.
		// System.out.println("각자 내야할 돈 " + avg + "원");

		Scanner scan = new Scanner(System.in);
		// Scanner라는 class는 이 파일에서 한번 복사하면 계속 반복해서 사용.

		System.out.print("음식점 계산 총 금액 : ");
		int money = scan.nextInt();

		System.out.print("함께 먹은 사람 인원수 : ");
		int count = scan.nextInt();

		double result = (double) money / count;
		// type을 바꾸는 것을 casting(캐스팅)이라고 함.
		System.out.println("-----------------");
		System.out.println("각자 내야할 돈 " + result + "원");

	}
}
