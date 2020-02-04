package 조건문;

import java.util.Date;

public class TimeCheck {

	public static void main(String[] args) {
		// 실행할 때 현재 시각을 구해서
		// 얼마나 집에 갈 시간이 남았는지 체크
		Date date = new Date();
		int hour = date.getHours();
		if (hour < 21) {
			System.out.println("집에 갈 시간이 많이 남았어요");
			//컨트롤+알트+화살표 아래 :  한줄복사
		} else {
			//알트 + 화살표 방향: 이동
			System.out.println("집에 갈 시간이 되었어요");
		}
	}

}
