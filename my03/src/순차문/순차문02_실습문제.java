package 순차문;

import javax.swing.JOptionPane;

public class 순차문02_실습문제 {

	public static void main(String[] args) {
		String data1 = JOptionPane.showInputDialog("입력값1 : ");
		String data2 = JOptionPane.showInputDialog("입력값2 : ");		
		// 모든 외부 입력은 타입이 String!
		// String을 그대로 쓸지 솟자로 변환해서 쓸지는 프로그래머가 결정 !!!
		// String --> int
		int comp1 = Integer.parseInt(data1);
		int comp2 = Integer.parseInt(data2);
		
		// 처리
		int result = comp1 + comp2;		

		// 출력
		System.out.println(data1 + " + " + data2 + " = " + result + "입니다.");
		
	} // main end.
} // class end.
