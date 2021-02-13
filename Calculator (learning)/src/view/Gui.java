package view;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gui extends JFrame {
	
	
	private static final long serialVersionUID = 1L;

	//constructor
	public Gui() {
		
		this.setSize(300, 200);
		this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		this.setTitle("Calculator");

		JTextField textfield = new JTextField();
		textfield.setSize(300, 20);
		textfield.setText("Testing");
		JButton button1 = new JButton("1");
		button1.setSize(50, 50);
		
		JButton button2 = new JButton("2");
		button1.setSize(50, 50);
		
		JButton button3 = new JButton("3");
		button1.setSize(50, 50);
		
		JButton button4 = new JButton("4");
		button1.setSize(50, 50);
		
		JButton button5 = new JButton("5");
		button1.setSize(50, 50);
		
		JButton button6 = new JButton("6");
		button1.setSize(50, 50);
		
		JButton button7 = new JButton("7");
		button1.setSize(50, 50);
		
		JButton button8 = new JButton("8");
		button1.setSize(50, 50);
		
		JButton button9 = new JButton("9");
		button1.setSize(50, 50);
		
		JButton button0 = new JButton("0");
		button1.setSize(50, 50);
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		panel.add(textfield);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button0);
		
		
		this.add(panel);
		this.setVisible(true);
		this.setResizable(false);
		//this.pack();
	}
	
	
	
     
}
