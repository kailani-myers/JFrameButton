package JFrameButton;
import javax.swing.*;

import java.awt.Color;
import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameButton {

	public static void main(String[] args) {
		Color mycuteColor = Color.decode("#fa0a9d");

		//this creates the frame for the button to be in
		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout());
		frame.setSize(100,100);
		
		//this creates the place the text is displayed
		//JLabel label = new JLabel();
		//label.setSize(50,50);
		//frame.add(label);
		
		//this creates the button to be clicked
		JButton button = new JButton("Click me!");
		button.setBackground(mycuteColor);
		frame.add(button);
		
		
		//this activates the button when the user clicks it
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//label.setText("Go Hatters!");
				JOptionPane.showMessageDialog(frame, "Go Hatters!");
			}
		});
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
