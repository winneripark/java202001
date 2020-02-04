package 조건문;

import java.util.Date;

public class 요일처리2 {

	public static void main(String[] args) {
		Date date = new Date();
		int day = date.getDay();
		
		//switch문은 간단하지만 수동으로 break해주어야 함
		
		switch(day) {//조건에 실수가 올수 없음.(int, String, char 만 올수 있음)
		case 0:
			System.out.println("일요일");
			break;
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			break;
		case 4:
			System.out.println("목요일");
			break;
		case 5:
			System.out.println("금요일");
			break;
		case 6:
			System.out.println("토요일");
			break;
		case 7:
			System.out.println("일요일");
			break;
		default:
			break;
		}
		
	}// main end
}// class end
