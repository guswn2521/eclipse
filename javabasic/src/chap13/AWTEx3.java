package chap13;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AWTEx3 extends Frame{

	Button redBt, blueBt;
	
	public AWTEx3() {
		super("::AWTEx2::");
		setLayout(new FlowLayout());
		redBt = new Button("RED");
		blueBt = new Button("BLUE");
		add(redBt);
		add(blueBt);
		
		redBt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.RED);
				
			}
		});
		
		blueBt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.BLUE);
				
			}
		});
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});//X 버튼처리
		
	}
	
	public static void main(String[] args) {
		AWTEx3 awt = new AWTEx3();
		awt.setSize(300, 300);
		awt.setVisible(true);
		

	}

}
