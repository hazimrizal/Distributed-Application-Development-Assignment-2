package GraphicalUI;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class creditCardServerUI extends JFrame {

	private JPanel contentPane;
	JTextArea textArea = new JTextArea();

	public creditCardServerUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Credit Card Validation Server");
		lblNewLabel.setBounds(153, 31, 156, 14);
		contentPane.add(lblNewLabel);
		
		
		textArea.setBounds(10, 56, 414, 194);
		contentPane.add(textArea);
	}
	
	public void addText(String received) {
		textArea.setEditable(true);
		textArea.setText(textArea.getText() + "\n>> " + received);
		textArea.setEditable(false);
		}
	
}