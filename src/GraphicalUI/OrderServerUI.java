package GraphicalUI;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class OrderServerUI extends JFrame {
	
		private JPanel contentPane;
		private JTextArea textArea = new JTextArea();
		
		public OrderServerUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(this.contentPane);
			contentPane.setLayout(null);
			
			textArea.setBounds(34, 58, 359, 192);
			contentPane.add(textArea);
			
			JLabel lblNewLabel = new JLabel("Order Server");
			lblNewLabel.setBounds(181, 11, 89, 14);
			contentPane.add(lblNewLabel);
		}
		
		public void addText(String received) {
			textArea.setEditable(true);
			textArea.setText(textArea.getText() + "\n>> " + received);
			textArea.setEditable(false);
			}
		
		}