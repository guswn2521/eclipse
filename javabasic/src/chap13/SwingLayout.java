package chap13;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingLayout extends JFrame{

	JButton button1 = new JButton("Button 1");
	JButton button2 = new JButton("Button 2");
	JButton button3 = new JButton("Button 3");
	JButton button4 = new JButton("Button 4");
	JButton button5 = new JButton("Button 5");
	
	Panel panel1 = new Panel();
	Panel panel2 = new Panel();
	
	
	
	//가로배치
	void flowLayout(){
		panel1.setLayout(new FlowLayout());
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		panel1.add(button4);
		panel1.add(button5);
		
	}
	
	//가로x세로 격자배치
	void gridLayout() {
		panel1.setLayout(new GridLayout(2,2));
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		panel1.add(button4);
		
	}
	
	//가운데 컴포턴트 중심 네방향에 컴포넌트 배치
	void borderLayout() {
		panel1.setLayout(new BorderLayout());
		panel1.add(button1, BorderLayout.NORTH);
		panel1.add(button2, BorderLayout.WEST);
		panel1.add(button3, BorderLayout.EAST);
		panel1.add(button4, BorderLayout.SOUTH);
		panel1.add(button5, BorderLayout.CENTER);
	}
	
	void cardLayout() {
		final CardLayout card = new CardLayout();
		setLayout(card);
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		add("panel1",panel1);
		add("panel2",panel2);
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(getContentPane(), "panel2");
			}
		});
		button5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(getContentPane(), "panel1");
				
			}
		});
		
	}
	
	public SwingLayout() {
		super("Layout Showcase");
		getContentPane().add(panel1);
		//flowLayout();
		//gridLayout();
		//borderLayout();
		cardLayout();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingLayout app = new SwingLayout();
		

	}

}
