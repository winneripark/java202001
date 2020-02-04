package 조건문;

import java.util.Scanner;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 아무거나 {

	public static void main(String[] args) {
		// 아무거나 내게 하는 class
		// 랜덤(Random)
		Random r = new Random();
		int computer = r.nextInt(3); // -21억~21억 
		// 0부터 2까지를 발생시킴.
		
		switch (computer) {
		case 0:
			System.out.println("computer는 가위");
			break;
		case 1:
			System.out.println("computer는 바위");
			break;
		case 2:
			System.out.println("computer는 보");
			break;
		}

		
		JFrame f = new JFrame();
		f.setSize(800, 800);
		
		JButton btnNewButton = new JButton("가위");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				JOptionPane.showMessageDialog(null,"가위를 내셨군요"); 해당부분 오류 찾을것
			}
		});
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("바위");
		f.getContentPane().add(btnNewButton_1, BorderLayout.CENTER);
		
		JButton btnNewButton_2 = new JButton("보");
		f.getContentPane().add(btnNewButton_2, BorderLayout.EAST);
		
		System.out.println("computer : " + computer);
		// 0이면, computer는 가위를 냄.
		// 1이면, computer는 바위를 냄.
		// 2이면, computer는 보를 냄.
		
		
		
		
		
	}
}
