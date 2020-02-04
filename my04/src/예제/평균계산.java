package 예제;

public class 평균계산 {

	public static void main(String[] args) {
		int 수학 = 88;
		int 영어 = 99;
		int 국어 = 55;
		int total = 수학 + 영어 + 국어;
		System.out.println("전체 과목의 합계는 " + total + "점");
		int 과목수 = 3;
		double avg = (double)total / 과목수;
		// java에서는 "="기준으로 좌측의 계산값이 좌측 계산의 형식에 맞추어서 이미 계산이 된것을 우측으로 대입시켜 줌.
		// 즉 int(분자) / int(분모)의 결과 값이 실수가 나올것이 예상되면 분모, 분자중 하나 이상에 실수 형식으로 처리를 해주어야 함. 
		System.out.println("전체 과목의 평균은 " + avg + "점");
	}

}
