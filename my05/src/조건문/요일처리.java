package 조건문;

import java.util.Date;

public class 요일처리 {

	public static void main(String[] args) {
		Date date = new Date();
		int day = date.getDay();
		
		//지금 단계에서는 if~else if~else
		//복잡한 if~else문을 정리해서 만드는 법
		
		if (day == 1) {
			System.out.println("월요일");
		}else if (day == 2) {
			System.out.println("화요일");
		}else if (day == 3) {
			System.out.println("수요일");
		}else if (day == 4) {
			System.out.println("목요일");
		}else if (day == 5) {
			System.out.println("금요일");
		}else if (day == 6) {
			System.out.println("토요일");
		}else if (day == 7) {
			System.out.println("일요일");
		}
	}// main end
}// class end
