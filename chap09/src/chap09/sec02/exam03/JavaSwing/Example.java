package chap09.sec02.exam03.JavaSwing;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton; 

public class Example {
	public static void main(String[]args) {
		JFrame frame = new JFrame(); 
		frame.setTitle("My first Window");
		frame.setLayout(new FlowLayout());
		
		JButton btn = new JButton("Button 1");
		JButton btn2 = new JButton("Button 2");
		
		frame.add(btn);
		frame.add(btn2); 
		frame.setSize(400, 300);
		frame.setVisible(true); 
		
		btn.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				System.out.println("Calling");
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Sending msg");
			}
		});
		
	}
}
