package 순차문;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class 그래픽 {

	public static void main(String[] args) {
		// 그래픽 부품(class) 사용해서 화면을 띄워봅시다!
		JFrame f = new JFrame();
		f.setSize(800, 800);
		
		JButton b = new JButton();
		b.setFont(new Font("굴림", Font.BOLD, 20));
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		b.setForeground(Color.YELLOW);
		
		b.setText("나를 눌러요..!!!!!꾹꾹!!!!");
		
		f.getContentPane().add(b); //프레임에 b라는 버튼을 올려줘
		
		f.setVisible(true); // 위에서 선언한것 모두 보여줘.. 따라서 맨 아래에 있어야 함.
	}

}
