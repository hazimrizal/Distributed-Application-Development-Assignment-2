package GraphicalUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;

public class clientui extends JFrame {

	private JPanel contentPane;
	JTextPane textPane = new JTextPane();
	
	public clientui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel welcome = new JLabel("CLIENT CONN");
		welcome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		welcome.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(welcome, BorderLayout.NORTH);
		
		contentPane.add(textPane, BorderLayout.CENTER);
	}
	
	public void addText(String received) {
		textPane.setEditable(true);
		textPane.setText(">> " + received + "\n");
		textPane.setEditable(false);
		
	}

}
