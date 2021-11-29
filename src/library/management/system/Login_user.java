package library.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login_user extends JFrame implements ActionListener{

	private JPanel panel;
	private JTextField textField;
	private JPasswordField passwordField;
        private JButton button1,button2,button3;
        private JCheckBox checkBox1;


	public Login_user() {
            
	setBackground(new Color(169, 169, 169));	
        setBounds(610, 312, 615, 380);
		
        panel = new JPanel();
	panel.setBackground(Color.cyan);
	setContentPane(panel);
	panel.setLayout(null);

	JLabel l1 = new JLabel("Username : ");
	l1.setBounds(127, 89, 89, 26);
	panel.add(l1);

	JLabel l2 = new JLabel("Password : ");
	l2.setBounds(127, 126, 89, 26);
	panel.add(l2);
        
        
        
	textField = new JTextField();
	textField.setBounds(210, 93, 157, 20);
	panel.add(textField);
	
	passwordField = new JPasswordField();
	passwordField.setBounds(210, 128, 157, 20);
	panel.add(passwordField);

	JLabel l3 = new JLabel("");
	l3.setBounds(377, 79, 46, 34);
	panel.add(l3);

	JLabel l4 = new JLabel("");
	l4.setBounds(377, 124, 46, 34);
	panel.add(l3);

	button1 = new JButton("Login");
	button1.addActionListener(this);
                
	button1.setForeground(new Color(56, 136, 85));
	button1.setBackground(new Color(241, 240, 213));
	button1.setBounds(149, 181, 113, 39);
	panel.add(button1);
		
        button2 = new JButton("SignUp");
	button2.addActionListener(this);
	
	button2.setForeground(new Color(139, 69, 19));
	button2.setBackground(new Color(255, 235, 205));
	button2.setBounds(289, 181, 113, 39);
	panel.add(button2);

	button3 = new JButton("Forgot Password");
	button3.addActionListener(this);
	
        button3.setForeground(new Color(205, 92, 92));
	button3.setBackground(new Color(253, 245, 230));
	button3.setBounds(199, 231, 179, 39);
	panel.add(button3);
        checkBox1 = new JCheckBox("Admin",false);    
        checkBox1.setBounds(190,133, 75,75); 
        checkBox1.setOpaque(false);
//        cb1 = new JCheckBox("Admin");
//	cb1.addActionListener(this);
        panel.add(checkBox1);
        

//	JLabel l5 = new JLabel("Trouble in Login?");
//	l5.setFont(new Font("Tahoma", Font.PLAIN, 15));
//	l5.setForeground(new Color(255, 0, 0));
//	l5.setBounds(70, 240, 130, 20);
//	panel.add(l5);

		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(176, 224, 230));
		panel2.setBounds(24, 40, 434, 263);
		panel.add(panel2);
	}
        
        public void actionPerformed(ActionEvent s){
            int c;
                    if(checkBox1.isSelected())
                        c=1;
                    else
                        c=0;
                    //System.out.println(":O");
            if(s.getSource() == button1 && c==1){
                Boolean stat = false;
		try {
                    conn con = new conn();
                    String sql = "select * from account where username=? and password=? and admin=?";
                    //String ss="select * from account where admin=?";
                    
                    PreparedStatement st = con.c.prepareStatement(sql);
                    //PreparedStatement sst = con.c.prepareStatement(ss);
                    st.setString(1, textField.getText());
                    st.setString(2, passwordField.getText());
                    st.setInt(3, c ); 
                    //sst.setInt(1, c );
                    

                    ResultSet r= st.executeQuery();
                    //ResultSet rr= sst.executeQuery();
                    if (r.next()) {
                        this.setVisible(false);
                        new Loading().setVisible(true);
                    } else
			JOptionPane.showMessageDialog(null, "Invalid Login!");
                       
		} catch (Exception e2) {
                    e2.printStackTrace();
		}
            }
                else            
                if(s.getSource() == button1 && !(checkBox1.isSelected()))
                {
                    Boolean stat = false;
		try {
                    conn con = new conn();
                    String sql = "select * from account where username=? and password=? and admin=?";
                    //String ss="select * from account where admin=?";
                    
                    PreparedStatement st = con.c.prepareStatement(sql);
                    //PreparedStatement sst = con.c.prepareStatement(ss);
                    st.setString(1, textField.getText());
                    st.setString(2, passwordField.getText());                    
                    st.setInt(3, c );   
                    

                    ResultSet r= st.executeQuery();
                    //ResultSet rr= sst.executeQuery();
                    if (r.next() ) {
                        this.setVisible(false);
                        new studentHome().setVisible(true);
                    } else
			JOptionPane.showMessageDialog(null, "Invalid Login!");
                       
		} catch (Exception e2) {
                    e2.printStackTrace();
		}
                }
            if(s.getSource() == button2)
            {
                setVisible(false);
		Signup su = new Signup();
		su.setVisible(true);
            }   
            if(s.getSource() == button3)
            {
                setVisible(false);
		Forgot forgot = new Forgot();
		forgot.setVisible(true);
            }
        }
        public static void main(String[] args)
        {
                new Login_user().setVisible(true);
	}
        }
