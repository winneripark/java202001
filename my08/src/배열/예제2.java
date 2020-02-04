package 배열;

//JAVA, SPRING, JSP를 입력받아 배열에 넣어보세요
//출력은 **JAVA보다는 SPRING**

import java.util.Scanner;

public class 예제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] data1 = new String[3];
		for (int i = 0; i < data1.length; i++) {
			System.out.print("과목 입력 : ");
			data1[i] = sc.next();
		}
		System.out.println("**" + data1[0] + "보다는 " + data1[1] + "**");
	}

}
