package chap13;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AWTEx2 extends Frame{

	Button redBt, blueBt;
	
	public AWTEx2() {
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
		
		addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				
				
			}
		});//X 버튼처리
		
	}
	
	public static void main(String[] args) {
		AWTEx2 awt = new AWTEx2();
		awt.setSize(300, 300);
		awt.setVisible(true);
		

	}

}
