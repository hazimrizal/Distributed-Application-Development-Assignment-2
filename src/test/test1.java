package test;
import java.awt.*;
import javax.swing.*;
 
public class test1 {
 
  public static void main(String[] arguments) {
 
    JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame f = new JFrame("JButton Example");
    f.setSize(400,200);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setLayout(new GridLayout(2,1));
 
 
    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new FlowLayout());
 
    ImageIcon icon = new ImageIcon("java.jpg");
    JButton b1 = new JButton("java",icon);
    b1.setVerticalTextPosition(JButton.TOP);
    b1.setHorizontalTextPosition(JButton.CENTER);
 
    //de-spacing
    b1.setBorderPainted(false);
    b1.setMargin(new Insets(0,0,0,0));
 
    buttonPanel.add(b1);
    f.add(buttonPanel);
 
    f.setVisible(true);
  }
}