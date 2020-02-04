package 윈도우;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class 메뉴판 {
	//도너츠의 개수
	static int count = 10;

	public static void main(String[] args) {
		// 큰 프레임을 만들어야 함.
		// 프레임의 크기를 결정해야함.
		// 프레임을 보여지게 설정해야함.
		
		JFrame f = new JFrame();

		
		
		f.setSize(420, 222);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBackground(Color.MAGENTA);
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 50));
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		
		JButton btnNewButton = new JButton("-");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 50));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// JOptionPane.showMessageDialog(null,"도너츠 빼기");
				if (count != 0) {
					count--;
					System.out.println("도너츠의 개수는 " + count + "개");
					f.setTitle("도너츠의 개수: " + count + "개");
				} else {
					f.setTitle("더이상 뺄수 없음");
				}
			}
		});
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\tjoeun302-16\\Downloads\\도너츠.jpg"));
		f.getContentPane().add(lblNewLabel, BorderLayout.CENTER);
		f.setVisible(true);
		
	}

}
