package ats;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;

public class rlogin{
	private JTextField txtRecruiterLogin;
	rlogin(){
		JFrame f=new JFrame("Login");

		JLabel l1,l2;
		l1=new JLabel("User Name");
		l1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l1.setBounds(100,216, 100,50);
		l2=new JLabel("Password");
		l2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l2.setBounds(100,263,100,50);
		f.getContentPane().add(l1); f.getContentPane().add(l2);



		JTextField t1,t2;
		t1=new JTextField();
		t1.setBounds(200,227,191,32);
		t2=new JPasswordField();
		t2.setBounds(200,274,191,32);
		f.getContentPane().add(t1); f.getContentPane().add(t2);


		JButton b1=new JButton("Enter");
		b1.setBackground(new Color(184,223,216));
		b1.setForeground(Color.WHITE);
		b1.setFont(new Font("Tahoma", Font.BOLD, 14));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		b1.addActionListener((ActionListener) new ActionListener()  {
			public void actionPerformed(ActionEvent f) {
				String sql = "select * from rcredentials where username=? and password=?";
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
						new recruiter();
					}
					else{
						JOptionPane.showMessageDialog(null, "Invalid UserName/Password", "UnSuccessfull Login", JOptionPane.ERROR_MESSAGE );
					}

					//     this.dispose();
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		b1.setBounds(100,324,100,50);
		f.getContentPane().add(b1);
		JButton b2=new JButton("Reset");
		b2.setBackground(new Color(184,223,216));
		b2.setFont(new Font("Tahoma", Font.BOLD, 14));
		b2.setForeground(Color.WHITE);
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
		b2.setBounds(200,324,100,50);
		b2.addActionListener((ActionListener) new ActionListener()  {
			public void actionPerformed(ActionEvent e) {
				new rlogin();
			}
		});
		f.getContentPane().add(b2);
		JButton b3=new JButton("Back");
		b3.setBackground(new Color(184,223,216));
		b3.setForeground(Color.WHITE);
		b3.setFont(new Font("Tahoma", Font.BOLD, 14));
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
		b3.setBounds(299,324,92,50);
		b3.addActionListener((ActionListener) new ActionListener()  {
			public void actionPerformed(ActionEvent e) {
				new rstart();
			}
		});
		f.getContentPane().add(b3);


		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		txtRecruiterLogin = new JTextField();
		txtRecruiterLogin.setForeground(new Color(255, 255, 255));
		txtRecruiterLogin.setText("RECRUITER LOGIN");
		txtRecruiterLogin.setFont(new Font("Arial", Font.BOLD, 24));
		txtRecruiterLogin.setHorizontalAlignment(SwingConstants.CENTER);
		txtRecruiterLogin.setBackground(new Color(184,223,216));
		txtRecruiterLogin.setBounds(69, 59, 354, 50);
		f.getContentPane().add(txtRecruiterLogin);
		txtRecruiterLogin.setColumns(10);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nisht\\eclipse-workspace\\final\\Images\\logo.jpg"));
		lblNewLabel.setBounds(182, 135, 156, 59);
		f.getContentPane().add(lblNewLabel);
		JTextArea textArea = new JTextArea();
		textArea.setBounds(69, 59, 269, 8);
		f.getContentPane().add(textArea);
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(69, 59, 354, 349);
		f.getContentPane().add(textArea_1);
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new rlogin();
	}
}
