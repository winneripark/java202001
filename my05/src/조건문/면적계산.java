package 조건문;

import java.util.Scanner;

public class 면적계산 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Scanner라는 class는 이 파일에서 한번 복사하면 계속 반복해서 사용.

		System.out.println("사각형의 면적을 구하는 프로그램");
		System.out.println("----------------");
		System.out.print("가로가 ? ");
		int l = scan.nextInt();
		System.out.print("세로가 ? ");
		int h = scan.nextInt();
		int cal = l * h;
		System.out.println("면적(가로 * 세로)은 " + cal + "입니다.");		
		
		if (cal >= 50) {
			System.out.println("면적이 50이상이면, 너무 넓군요");
		} else {
			System.out.println("그것이 아니면 너무 좁군요");
		}
	}
}
