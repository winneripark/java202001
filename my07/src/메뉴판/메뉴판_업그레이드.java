package 메뉴판;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 메뉴판_업그레이드 {

	static int 짜장 = 0; //주문수 카운트
	static int 우동 = 0; //전체 금액 계산
	static int 짬뽕 = 0; //전체 금액 계산
	static int count = 0; //주문수 카운트
	static int sum = 0; //전체 금액 계산
	private static JTextField t2;
	private static JTextField t1;
	// 아래 public static void main(String[] args) { 안에서 해당 변수를 사용하려면 static을 앞에 붙여주어야 함.
	
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(0, 255, 0));
		f.setSize(583, 548);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("지불할 총금액");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 424, 220, 43);
		f.getContentPane().add(lblNewLabel);
		
		JLabel img = new JLabel("");
		img.setHorizontalAlignment(SwingConstants.CENTER);
		img.setIcon(new ImageIcon("D:\\학생방\\montue_il\\my07\\중국집.jpg"));
		img.setBounds(32, 150, 508, 251);
		f.getContentPane().add(img);
		
		JLabel jja = new JLabel("");
		JLabel wu = new JLabel("");
		JLabel jjam = new JLabel("");
		
		t2 = new JTextField();
		t2.setForeground(new Color(255, 0, 0));
		t2.setFont(new Font("굴림", Font.BOLD, 30));
		t2.setBounds(232, 424, 285, 43);
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		t1 = new JTextField();
		t1.setForeground(new Color(30, 144, 255));
		t1.setFont(new Font("굴림", Font.BOLD, 30));
		t1.setColumns(10);
		t1.setBounds(367, 26, 173, 43);
		f.getContentPane().add(t1);
		
		JButton btnNewButton = new JButton("짜장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//JLabel img = new JLabel("");
				//img.setHorizontalAlignment(SwingConstants.CENTER);
				//img.setIcon(new ImageIcon("D:\\학생방\\montue_il\\my07\\짜장.png"));
				//img.setBounds(32, 73, 508, 328);
				//f.getContentPane().add(img);

				짜장++;
				System.out.println("짜장주문갯수 : " + 짜장 );
				System.out.println("우동주문갯수 : " + 우동 );
				System.out.println("짬뽕주문갯수 : " + 짬뽕 );
				System.out.println("------------------");
			
				jja.setText(짜장 + "개");
			
				count++;
				t1.setText(count+"개");
				sum = count * 5000;
				t2.setText(sum + "원");

				//ImageIcon icon = new ImageIcon("D:\\학생방\\montue_il\\my07\\짜장.png");
				//img.setIcon(icon);
				img.setIcon(new ImageIcon("D:\\학생방\\montue_il\\my07\\짜장.png"));
			
			}
		});
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 25));
		btnNewButton.setBounds(19, 26, 97, 43);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("우동");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//JLabel img = new JLabel(""); --- 초기화
				//img.setHorizontalAlignment(SwingConstants.CENTER);
				//img.setIcon(new ImageIcon("D:\\학생방\\montue_il\\my07\\우동.jpg"));
				//img.setBounds(32, 73, 508, 328);
				//f.getContentPane().add(img);
				
				우동++;
				System.out.println("짜장주문갯수 : " + 짜장 );
				System.out.println("우동주문갯수 : " + 우동 );
				System.out.println("짬뽕주문갯수 : " + 짬뽕 );
				System.out.println("------------------");

				wu.setText(우동 + "개");
				
				count++;
				t1.setText(count+"개");
				sum = count * 5000;
				t2.setText(sum + "원");
				
				//ImageIcon icon = new ImageIcon("D:\\학생방\\montue_il\\my07\\우동.jpg");
				//img.setIcon(icon);
				img.setIcon(new ImageIcon("D:\\학생방\\montue_il\\my07\\우동.jpg"));

				
			}
		});
		btnNewButton_1.setBackground(new Color(175, 238, 238));
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_1.setBounds(135, 26, 97, 43);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("짬뽕");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//JLabel img = new JLabel("");
				//img.setHorizontalAlignment(SwingConstants.CENTER);
				//img.setIcon(new ImageIcon("D:\\학생방\\montue_il\\my07\\짬뽕.jpg"));
				//img.setBounds(32, 73, 508, 328);
				//f.getContentPane().add(img);

				
				짬뽕++;
				System.out.println("짜장주문갯수 : " + 짜장 );
				System.out.println("우동주문갯수 : " + 우동 );
				System.out.println("짬뽕주문갯수 : " + 짬뽕 );
				System.out.println("------------------");

				jjam.setText(짬뽕 + "개");
				
				count++;	//증감연산자
				t1.setText(count+"개");
				sum = count * 5000;
				t2.setText(sum + "원");
				
				//ImageIcon icon = new ImageIcon("D:\\학생방\\montue_il\\my07\\짬뽕.jpg");
				//img.setIcon(icon);
				img.setIcon(new ImageIcon("D:\\학생방\\montue_il\\my07\\짬뽕.jpg"));

				
			}
		});
		btnNewButton_2.setBackground(new Color(238, 130, 238));
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_2.setBounds(251, 26, 97, 43);
		f.getContentPane().add(btnNewButton_2);
		
		jja.setBounds(24, 79, 87, 29);
		f.getContentPane().add(jja);
		
		wu.setBounds(145, 79, 87, 29);
		f.getContentPane().add(wu);
		
		jjam.setBounds(261, 79, 87, 29);
		f.getContentPane().add(jjam);
		f.setVisible(true);

	}

}
