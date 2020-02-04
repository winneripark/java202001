package 입출력기능;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Me {
	private static JTextField name;
	private static JTextField age;
	private static JTextField shoe;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(0, 206, 209));
		
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("나이");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 40));
		lblNewLabel.setBounds(37, 200, 100, 68);
		f.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("신발");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("굴림", Font.BOLD, 40));
		label.setBounds(37, 313, 100, 68);
		f.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("이름");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("굴림", Font.BOLD, 40));
		label_1.setBounds(37, 90, 100, 68);
		f.getContentPane().add(label_1);
		
		name = new JTextField();
		name.setBackground(new Color(238, 232, 170));
		name.setFont(new Font("굴림", Font.BOLD, 40));
		name.setBounds(149, 101, 146, 47);
		f.getContentPane().add(name);
		name.setColumns(10);
		
		age = new JTextField();
		age.setFont(new Font("굴림", Font.BOLD, 40));
		age.setColumns(10);
		age.setBackground(new Color(238, 232, 170));
		age.setBounds(149, 211, 146, 47);
		f.getContentPane().add(age);
		
		shoe = new JTextField();
		shoe.setFont(new Font("굴림", Font.BOLD, 40));
		shoe.setColumns(10);
		shoe.setBackground(new Color(238, 232, 170));
		shoe.setBounds(149, 324, 146, 47);
		f.getContentPane().add(shoe);
		
		JButton btnNewButton = new JButton("출력");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String n = name.getText();
				if (n.equals("") || n.equals(null)) {
					name.setText("다시입력");
				} else {
					System.out.println("이름 : " + n + "님");					
				}
			}
		});
		btnNewButton.setBackground(new Color(199, 21, 133));
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 40));
		btnNewButton.setBounds(313, 101, 137, 47);
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("출력");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = age.getText();
				// 내년 나이를 구해서, 나이 출력 아래 넣어보세요
				int a2 = Integer.parseInt(a);
				int nextYear = a2 + 1;
				System.out.println("나이 : " + a  + "세");
				System.out.println("내년나이 : " + nextYear + "세");
			}
		});
		button.setBackground(new Color(199, 21, 133));
		button.setFont(new Font("굴림", Font.BOLD, 40));
		button.setBounds(313, 211, 137, 47);
		f.getContentPane().add(button);
		
		JButton button_1 = new JButton("출력");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = shoe.getText();
				System.out.println("신발사이즈 : " + s + "mm");
			}
		});
		button_1.setBackground(new Color(199, 21, 133));
		button_1.setFont(new Font("굴림", Font.BOLD, 40));
		button_1.setBounds(313, 324, 137, 47);
		f.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("모두출력");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = name.getText();
				String a = age.getText();
				String s = shoe.getText();
				System.out.println("이름 : " + n + "님");
				System.out.println("나이 : " + a + "세");
				System.out.println("신발사이즈 : " + s + "mm");
			}
		});
		button_2.setBackground(new Color(255, 0, 0));
		button_2.setFont(new Font("굴림", Font.BOLD, 40));
		button_2.setBounds(149, 393, 206, 47);
		f.getContentPane().add(button_2);
		
		JLabel lblNewLabel_1 = new JLabel("연습");
		lblNewLabel_1.setBackground(new Color(255, 0, 255));
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 40));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(128, 10, 220, 70);
		f.getContentPane().add(lblNewLabel_1);
		//.연산자 => 접근연산자(~에)
		
		f.setVisible(true);
		
	}
}
