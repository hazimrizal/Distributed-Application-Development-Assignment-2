package GraphicalUI;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.SwingConstants;

public class kitchenUI extends JFrame {

	private JPanel contentPane;
	JTextArea txtTake = new JTextArea();
	JTextArea txtDine = new JTextArea();
	JLabel lblrunning = new JLabel("");
	/**
	 * Create the frame.
	 */
	public kitchenUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("KITCHEN");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(145, 11, 175, 14);
		contentPane.add(lblNewLabel);
		
		txtTake.setBounds(10, 84, 187, 166);
		contentPane.add(txtTake);
		
		txtDine.setBounds(239, 84, 187, 166);
		contentPane.add(txtDine);
		
		JLabel lblTake = new JLabel("TAKE AWAY");
		lblTake.setHorizontalAlignment(SwingConstants.CENTER);
		lblTake.setBounds(35, 61, 134, 13);
		contentPane.add(lblTake);
		
		JLabel lblDine = new JLabel("DINE IN");
		lblDine.setHorizontalAlignment(SwingConstants.CENTER);
		lblDine.setBounds(272, 61, 124, 13);
		contentPane.add(lblDine);
		
		
		lblrunning.setHorizontalAlignment(SwingConstants.CENTER);
		lblrunning.setBounds(134, 35, 187, 13);
		contentPane.add(lblrunning);
	}
	
	public void addTextTake(String received) {
		txtTake.setEditable(true);
		txtTake.setText(txtTake.getText() + "\n>> " + received);
		txtTake.setEditable(false);
	}
	
	public void addTextlbl(String running) {
		lblrunning.setText(running);
	}
	
	public void addTextDine(String received) {
		txtDine.setEditable(true);
		txtDine.setText(txtDine.getText() + "\n>> " + received);
		txtDine.setEditable(false);
	}
}