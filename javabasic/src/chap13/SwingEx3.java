package chap13;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEx3 extends JFrame {
	int index = 0;
	String[] msgs = {"첫번째 문장","두번째 문장","세번째 문장"};
	JButton button1 = new JButton("<<");
	JButton button2 = new JButton(">>");
	JButton button3 = new JButton(msgs[0]);
	
	
	
	public SwingEx3() {
		BorderLayout layout = new BorderLayout();
		setLayout(layout);
		add(button1, BorderLayout.WEST);
		add(button2, BorderLayout.EAST);
		add(button3, BorderLayout.CENTER);
		
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				index --;
				changeText();
//				if(index <0) {
//					index = 2;
//				}
//				button3.setText(msgs[index]);
			}
		});
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				index ++;
				changeText();
//				if(index >2) {
//					index = 0;
//				}
//				button3.setText(msgs[index]);
			}
		});
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,100);
		setVisible(true);
	}
	
	void changeText() {
		if(index >2) {
			index = 0;
		}else if(index <0) index = 2;
		button3.setText(msgs[index]);
	}

	public static void main(String[] args) {
		SwingEx3 app = new SwingEx3();
		
	}

	

}
