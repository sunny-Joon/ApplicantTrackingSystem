package ats;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;
import java.awt.Font;
@SuppressWarnings("serial")
public class login{
	private JTextField heading;    
	login(){    
JFrame f=new JFrame("Login");  
f.getContentPane().setBackground(new Color(232,246,239));

JLabel l1,l2;  
l1=new JLabel("User Name");
l1.setFont(new Font("Arial", Font.PLAIN, 15));
l1.setBounds(100,221, 100,50);  
l2=new JLabel("Password");  
l2.setFont(new Font("Arial", Font.PLAIN, 15));
l2.setBounds(100,271,100,50); 
f.getContentPane().add(l1); f.getContentPane().add(l2);  



JTextField t1,t2;  
t1=new JTextField();  
t1.setBounds(235,230,136,35);  
t2=new JPasswordField();  
t2.setBounds(235,280,136,35);  
f.getContentPane().add(t1); f.getContentPane().add(t2);   


JButton b1=new JButton("ENTER"); 
b1.setBackground(new Color(184,223,216));
b1.setForeground(new Color(255, 255, 255));
b1.setFont(new Font("Tahoma", Font.BOLD, 13));
b1.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
});
b1.addActionListener((ActionListener) new ActionListener()  {
	public void actionPerformed(ActionEvent f) {
		
		 String sql = "select * from credentials where username=? and password=?";
		try{
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ats","root","");
	            
	            PreparedStatement pstmt = conn.prepareStatement(sql);
	            
	            pstmt.setString(1, t1.getText());
	            pstmt.setString(2, t2.getText());
	            
	             ResultSet rs =pstmt.executeQuery();
	            if(rs.next())
	            {
	                JOptionPane.showMessageDialog(null, "Welcome" + t1.getText() , "Successfull Login", JOptionPane.PLAIN_MESSAGE);
	                new candidate();  
	               
	            }
	            else{
	                JOptionPane.showMessageDialog(null, "Invalid UserName/Password", "UnSuccessfull Login", JOptionPane.ERROR_MESSAGE );
	            }
	            
          //      this.dispose();
	            
		 }catch(Exception e) {
			 JOptionPane.showMessageDialog(null, e);
		 }
	}
	});
b1.setBounds(100,346,85,35);    
f.getContentPane().add(b1);    
JButton b2=new JButton("RESET");    
b2.setBackground(new Color(184,223,216));
b2.setForeground(new Color(255, 255, 255));
b2.setFont(new Font("Arial", Font.BOLD, 13));
b2.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
});
b2.setBounds(194,347,82,35);    
b2.addActionListener((ActionListener) new ActionListener()  {
public void actionPerformed(ActionEvent e) {
	new login();
}
});
f.getContentPane().add(b2);    
JButton b3=new JButton("BACK");    
b3.setBackground(new Color(184,223,216));
b3.setForeground(new Color(255, 255, 255));
b3.setFont(new Font("Arial", Font.BOLD, 13));
b3.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
});
b3.setBounds(286,347,88,35);    
b3.addActionListener((ActionListener) new ActionListener()  {
public void actionPerformed(ActionEvent e) {
	new start();
}
});
f.getContentPane().add(b3);

f.setSize(500,500);    
f.getContentPane().setLayout(null);    
JLabel logo = new JLabel("");
logo.setIcon(new ImageIcon("C:\\Users\\nisht\\eclipse-workspace\\Final\\Images\\logo.jpg"));
logo.setBounds(176, 160, 128, 50);
f.getContentPane().add(logo);
heading = new JTextField();
heading.setText("STUDENT LOGIN");
heading.setHorizontalAlignment(SwingConstants.CENTER);
heading.setBackground(new Color(184,223,216));
heading.setForeground(new Color(255, 255, 255));
heading.setFont(new Font("Arial", Font.BOLD, 26));
heading.setBounds(83, 77, 302, 58);
f.getContentPane().add(heading);
heading.setColumns(10);
JTextArea container = new JTextArea();
container.setBounds(83, 77, 302, 342);
f.getContentPane().add(container);
f.setVisible(true);   
f.setLocationRelativeTo(null); 
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }         
public static void main(String[] args) {    
    new login();    
}    
}    
