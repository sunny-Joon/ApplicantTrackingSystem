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
public class jobtitle{
	private JTextField heading;    
	jobtitle(){    
JFrame f=new JFrame("Job Tittle");  
f.getContentPane().setBackground(new Color(232,246,238));

JLabel l1,l2,l3;  
l1=new JLabel("Job Title");
l1.setFont(new Font("Arial", Font.PLAIN, 15));
l1.setBounds(100,137, 100,50);  
l2=new JLabel("Preferred Courses");  
l2.setFont(new Font("Arial", Font.PLAIN, 15));
l2.setBounds(100,198,200,50); 
l3=new JLabel("Salary upto");  
l3.setFont(new Font("Arial", Font.PLAIN, 15));
l3.setBounds(100,259,100,50); 
f.getContentPane().add(l1); f.getContentPane().add(l2);f.getContentPane().add(l3);  

JTextField t1,t2,t3;  
t1=new JTextField();  
t1.setBounds(238,143,135,41);  
t2=new JTextField();  
t2.setBounds(238,204,135,41);  
t3=new JTextField();  
t3.setBounds(238,265,135,41);  
f.getContentPane().add(t1); f.getContentPane().add(t2);f.getContentPane().add(t3);    


JButton b1=new JButton("ENTER"); 
b1.setFont(new Font("Tahoma", Font.BOLD, 11));
b1.setForeground(new Color(255, 255, 255));
b1.setBackground(new Color(184,223,216));
b1.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
});
b1.addActionListener((ActionListener) new ActionListener()  {
	public void actionPerformed(ActionEvent f) {
		
		String clear="DELETE FROM `jobtittle` WHERE 1";
		 String sql = "INSERT INTO `jobtittle`(`postname`, `courses`, `salary`) VALUES (?,?,?)";
		try{
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ats","root","");
	            
	            PreparedStatement pstmt = conn.prepareStatement(clear);
	            PreparedStatement stmt = conn.prepareStatement(sql);
	            
	            stmt.setString(1, t1.getText());
	            stmt.setString(2, t2.getText());
	            stmt.setString(3, t3.getText());
	            
	             
	            pstmt.executeUpdate();
	            stmt.executeUpdate(); 
	            
	             new recruiter();
		 }catch(Exception e) {
			 JOptionPane.showMessageDialog(null, e);
		 }
	}
	});
b1.setBounds(100,356,77,41);    
f.getContentPane().add(b1); 

JButton b2=new JButton("RESET");    
b2.setBackground(new Color(184,223,216));
b2.setFont(new Font("Tahoma", Font.BOLD, 11));
b2.setForeground(new Color(255, 255, 255));
b2.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
});
b2.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
});
b2.setBounds(202,356,77,41);    
b2.addActionListener((ActionListener) new ActionListener()  {
public void actionPerformed(ActionEvent e) {
	new jobtitle();
}
});
f.getContentPane().add(b2);    
JButton b3=new JButton("BACK");    
b3.setBackground(new Color(184,223,216));
b3.setFont(new Font("Tahoma", Font.BOLD, 11));
b3.setForeground(new Color(255, 255, 255));
b3.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
});
b3.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
});
b3.setBounds(300,356,77,41);    
b3.addActionListener((ActionListener) new ActionListener()  {
public void actionPerformed(ActionEvent e) {
	new recruiter();
}
});
f.getContentPane().add(b3);

f.setSize(500,500);    
f.getContentPane().setLayout(null);    
heading = new JTextField();
heading.setForeground(new Color(255, 255, 255));
heading.setBackground(new Color(184,223,216));
heading.setFont(new Font("Arial", Font.BOLD, 23));
heading.setText("JOB TITLE");
heading.setHorizontalAlignment(SwingConstants.CENTER);
heading.setBounds(238, 11, 200, 50);
f.getContentPane().add(heading);
heading.setColumns(10);
JLabel lblNewLabel = new JLabel("");
lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nisht\\eclipse-workspace\\Final\\Images\\logo.jpg"));
lblNewLabel.setBounds(10, 11, 128, 50);
f.getContentPane().add(lblNewLabel);
JTextArea headingcontainer = new JTextArea();
headingcontainer.setBackground(new Color(184,223,216));
headingcontainer.setBounds(0, 0, 484, 73);
f.getContentPane().add(headingcontainer);
JTextArea container = new JTextArea();
container.setBounds(85, 120, 316, 298);
f.getContentPane().add(container);
f.setVisible(true);   
f.setLocationRelativeTo(null); 
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }         
public static void main(String[] args) {    
    new jobtitle();    
}    
}    
