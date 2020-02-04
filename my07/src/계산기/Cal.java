package 계산기;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cal {
	private static JTextField n1;
	private static JTextField n2;
	private static JTextField result;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("D:\\학생방\\montue_il\\my07\\계산기.png"));
		lblNewLabel.setBounds(153, 30, 140, 76);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자1");
		lblNewLabel_1.setBackground(new Color(199, 21, 133));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 40));
		lblNewLabel_1.setBounds(29, 161, 122, 67);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel label = new JLabel("숫자2");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("굴림", Font.BOLD, 40));
		label.setBackground(new Color(199, 21, 133));
		label.setBounds(29, 238, 122, 67);
		f.getContentPane().add(label);
		
		n1 = new JTextField();
		n1.setFont(new Font("굴림", Font.BOLD, 40));
		n1.setBounds(163, 168, 223, 53);
		f.getContentPane().add(n1);
		n1.setColumns(10);
		
		n2 = new JTextField();
		n2.setFont(new Font("굴림", Font.BOLD, 40));
		n2.setColumns(10);
		n2.setBounds(163, 245, 223, 53);
		f.getContentPane().add(n2);
		
		JButton add = new JButton("더하기");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n11 = n1.getText();
				String n22 = n2.getText();
				
				int n111 = Integer.parseInt(n11);
				int n222 = Integer.parseInt(n22);
				
				int n = n111 + n222;
				// result.setText(n); 일 경우에는 오류가 발생함.
				// result.setText("" + n); 일 경우에는 정상.
				String s = String.valueOf(n);
				result.setText(s);


			}
		});
		add.setFont(new Font("굴림", Font.BOLD, 20));
		add.setBounds(19, 330, 97, 43);
		f.getContentPane().add(add);
		
		JButton minus = new JButton("빼기");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String n11 = n1.getText();
				String n22 = n2.getText();
				
				int n111 = Integer.parseInt(n11);
				int n222 = Integer.parseInt(n22);
				
				int n = n111 - n222;
				
				result.setText("" + n);
				
			}
		});
		minus.setFont(new Font("굴림", Font.BOLD, 20));
		minus.setBounds(135, 330, 97, 43);
		f.getContentPane().add(minus);
		
		JButton button_1 = new JButton("곱하기");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String n11 = n1.getText();
				String n22 = n2.getText();
				
				int n111 = Integer.parseInt(n11);
				int n222 = Integer.parseInt(n22);
				
				int n = n111 * n222;
				
				result.setText("" + n);
				
				
			}
		});
		button_1.setFont(new Font("굴림", Font.BOLD, 20));
		button_1.setBounds(251, 330, 97, 43);
		f.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("나누기");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String n11 = n1.getText();
				String n22 = n2.getText();
				
				double n111 = Integer.parseInt(n11);
				double n222 = Integer.parseInt(n22);
				
				double n = n111 / n222;
				
				result.setText("" + n);

				
			}
		});
		button_2.setFont(new Font("굴림", Font.BOLD, 20));
		button_2.setBounds(367, 330, 97, 43);
		f.getContentPane().add(button_2);
		
		JLabel label_1 = new JLabel("결과화면");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("굴림", Font.BOLD, 40));
		label_1.setBackground(new Color(199, 21, 133));
		label_1.setBounds(29, 383, 168, 53);
		f.getContentPane().add(label_1);
		
		result = new JTextField();
		result.setBounds(227, 383, 237, 53);
		f.getContentPane().add(result);
		result.setColumns(10);

		f.setVisible(true);		
		
	}

}
