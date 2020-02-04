package 순차문;

import javax.swing.JOptionPane;

public class 순차문01_실습문제 {
	public static void main(String[] args) {
		//01. 입력 : 소속, 이름
		String data1 = JOptionPane.showInputDialog("당신의 소속은 어디인가요?");
		String data2 = JOptionPane.showInputDialog("당신의 이름은 무엇인가요?");
		//02. 처리
		String result1 = data2 + '은' + data1 + "소속입니다.";
		//03. 출력
		JOptionPane.showMessageDialog(null, result1);
	}
}
