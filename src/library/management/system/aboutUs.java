package library.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class aboutUs extends JFrame{

	private JPanel contentPane;

        public static void main(String[] args) {
            new aboutUs().setVisible(true);			
	}
    
        public aboutUs() {
            
            super("About Us");
            setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ram\\Desktop\\rohit.jpg"));
            setBackground(new Color(173, 216, 230));
            setBounds(500, 250, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);
//
//            JLabel l1 = new JLabel("New label");
//            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/logo.png"));
//            Image i2 = i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
//            ImageIcon i3 = new ImageIcon(i2);
//            l1 = new JLabel(i3);
//            l1.setBounds(500, 40, 100, 100);
//            contentPane.add(l1);
//

            JLabel l1 = new JLabel("Library");
            l1.setForeground(new Color(0, 250, 154));
            l1.setFont(new Font("Tahoma", Font.BOLD , 38));
            l1.setBounds(160, 40, 150, 55);
            contentPane.add(l1);

            JLabel l2 = new JLabel("Mangement System");
            l2.setForeground(new Color(127, 255, 0));
            l2.setFont(new Font("Tahoma", Font.BOLD, 38));
            l2.setBounds(70, 90, 405, 40);
            contentPane.add(l2);
            contentPane.setBackground(Color.BLACK);
	}
        

}

