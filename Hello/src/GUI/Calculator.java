package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldAnswer;
	private JLabel Title;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		textFieldNum1.setBounds(12, 39, 200, 48);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(220, 39, 200, 48);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1, num2, answer;
				
			 	try {
			 		
			 		num1 = Integer.parseInt(textFieldNum1.getText());
			 		num2 = Integer.parseInt(textFieldNum2.getText());
			 		
			 		answer = num1 + num2;
			 		
			 		textFieldAnswer.setText(Integer.toString(answer));
					
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null,"Please Enter A Valid Number");
				} 
				 
			}
		});
		btnNewButton.setBounds(12, 152, 200, 35);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Minus");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int num1, num2, answer;
				
			 	try {
			 		
			 		num1 = Integer.parseInt(textFieldNum1.getText());
			 		num2 = Integer.parseInt(textFieldNum2.getText());
			 		
			 		answer = num1 - num2;
			 		
			 		textFieldAnswer.setText(Integer.toString(answer));
					
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null,"Please Enter A Valid Number");
				}
				 
			}
		});
		btnNewButton_1.setBounds(220, 152, 200, 35);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Answer");
		lblNewLabel.setBounds(191, 191, 56, 16);
		frame.getContentPane().add(lblNewLabel);
		
		textFieldAnswer = new JTextField();
		textFieldAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldAnswer.setBounds(163, 220, 116, 22);
		frame.getContentPane().add(textFieldAnswer);
		textFieldAnswer.setColumns(10);
		
		Title = new JLabel("Calculator");
		Title.setHorizontalAlignment(SwingConstants.CENTER);
		Title.setBounds(178, 13, 84, 16);
		frame.getContentPane().add(Title);
	}
}
