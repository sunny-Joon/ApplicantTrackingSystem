package ats;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;

public class rsignup{
	private JTextField txtRecruiterSignup;
	rsignup(){
		JFrame f=new JFrame("Signup");

		JLabel l1,l2,l3;
		l1=new JLabel("User Name");
		l1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l1.setBounds(100,178, 100,50);
		l2=new JLabel("New Password");
		l2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l2.setBounds(100,225,100,50);
		l3=new JLabel("Re-Type Password");
		l3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l3.setBounds(100,267,142,50);
		f.getContentPane().add(l1); f.getContentPane().add(l2); f.getContentPane().add(l3);



		JTextField t1,t2,t3;
		t1=new JTextField();
		t1.setBounds(251,190,149,30);
		t2=new JPasswordField();
		t2.setBounds(251,237,149,30);
		t3=new JPasswordField();
		t3.setBounds(252,279,148,30);
		f.getContentPane().add(t1); f.getContentPane().add(t2); f.getContentPane().add(t3);




		JButton b1=new JButton("Enter");
		b1.setBackground(new Color(184,223, 216));
		b1.setForeground(new Color(255, 255, 255));
		b1.setFont(new Font("Tahoma", Font.BOLD, 14));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		b1.addActionListener((ActionListener) new ActionListener()  {
			public void actionPerformed(ActionEvent f) {
				String sql = "INSERT INTO `rcredentials`(`username`, `password`) VALUES (?,?)";
				try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ats","root","");
					PreparedStatement pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, t1.getText());
					pstmt.setString(2, t2.getText());
					pstmt.executeUpdate();
					new rlogin();
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});

		b1.setBounds(100,345,100,50);
		f.getContentPane().add(b1);

		JButton b2=new JButton("Reset");
		b2.setBackground(new Color(184,223, 216));
		b2.setForeground(new Color(255, 255, 255));
		b2.setFont(new Font("Tahoma", Font.BOLD, 14));
		b2.setBounds(200,345,100,50);
		b2.addActionListener((ActionListener) new ActionListener()  {
			public void actionPerformed(ActionEvent e) {
				new rsignup();
			}
		});
		f.getContentPane().add(b2);
		JButton b3=new JButton("Back");
		b3.setBackground(new Color(184,223, 216));
		b3.setFont(new Font("Tahoma", Font.BOLD, 14));
		b3.setForeground(new Color(255, 255, 255));
		b3.setBounds(300,345,100,50);
		b3.addActionListener((ActionListener) new ActionListener()  {
			public void actionPerformed(ActionEvent e) {
				new rstart();
			}
		});
		f.getContentPane().add(b3);

		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		txtRecruiterSignup = new JTextField();
		txtRecruiterSignup.setHorizontalAlignment(SwingConstants.CENTER);
		txtRecruiterSignup.setBackground(new Color(184,223,216));
		txtRecruiterSignup.setText("RECRUITER SIGNUP");
		txtRecruiterSignup.setForeground(new Color(255, 255, 255));
		txtRecruiterSignup.setFont(new Font("Arial", Font.BOLD, 24));
		txtRecruiterSignup.setBounds(71, 52, 340, 50);
		f.getContentPane().add(txtRecruiterSignup);
		txtRecruiterSignup.setColumns(10);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nisht\\eclipse-workspace\\final\\Images\\logo.jpg"));
		lblNewLabel.setBounds(177, 123, 123, 44);
		f.getContentPane().add(lblNewLabel);
		JTextArea textArea = new JTextArea();
		textArea.setBounds(71, 52, 340, 357);
		f.getContentPane().add(textArea);
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new rsignup();
	}
}
