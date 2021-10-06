package ats;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

class jobdescription
{
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,
			t15,t16,t,s;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13;
	static double a=0,b=0,result=0,c=0,d=0,g=0,h=0,i=0,j=0,k=0;
	static int operator=0;
	private JLabel logo;
	private JTextField HEADING;
	private JTextArea headingcontainer;

	jobdescription(){
		JFrame f=new JFrame("jobdescription");
		f.getContentPane().setForeground(new Color(255, 255, 255));
		f.getContentPane().setBackground(new Color(232, 246, 239));

		JLabel l1,l2,l3,l4;
		t=new JTextField();
		s=new JTextField();
		l1=new JLabel("Enter the skills you need");
		l1.setFont(new Font("Arial", Font.PLAIN, 16));
		l2=new JLabel("Most Important");
		l2.setFont(new Font("Arial", Font.PLAIN, 14));
		l3=new JLabel("Important");
		l3.setFont(new Font("Arial", Font.PLAIN, 14));
		l4=new JLabel("Niceone");
		l4.setFont(new Font("Arial", Font.PLAIN, 14));

		l1.setBounds(50,87, 200,50);
		l2.setBounds(50,150,200,50);
		l3.setBounds(50,200,200,50);
		l4.setBounds(50,250,200,50);
		f.getContentPane().add(t);f.getContentPane().add(s);
		f.getContentPane().add(l1); f.getContentPane().add(l2); f.getContentPane().add(l3);
		f.getContentPane().add(l4);
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		t4=new JTextField();
		t5=new JTextField();
		t6=new JTextField();
		t7=new JTextField();
		t8=new JTextField();
		t9=new JTextField();
		t1.setBounds(200,150,200,50);
		t2.setBounds(450,150,200,50);
		t3.setBounds(700,150,200,50);
		t4.setBounds(200,200,200,50);
		t5.setBounds(450,200,200,50);
		t6.setBounds(700,200,200,50);
		t7.setBounds(200,250,200,50);
		t8.setBounds(450,250,200,50);
		t9.setBounds(700,250,200,50);

		f.getContentPane().add(t1); f.getContentPane().add(t2); f.getContentPane().add(t3);
		f.getContentPane().add(t4); f.getContentPane().add(t5); f.getContentPane().add(t6);
		f.getContentPane().add(t7); f.getContentPane().add(t8); f.getContentPane().add(t9);

		b1=new JButton("Enter");
		b1.setBackground(new Color(184,223,216));
		b1.setForeground(new Color(255, 255, 255));
		b1.setFont(new Font("Tahoma", Font.BOLD, 14));
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		b1.setBounds(358,350,100,50);
		f.getContentPane().add(b1);

		JButton b2=new JButton("Reset");
		b2.setBackground(new Color(184,223,216));
		b2.setForeground(new Color(255, 255, 255));
		b2.setFont(new Font("Tahoma", Font.BOLD, 14));
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		b2.setBounds(489,350,100,50);
		b2.addActionListener((ActionListener) new ActionListener()  {
			public void actionPerformed(ActionEvent e) {
				new jobdescription();
			}
		});
		f.getContentPane().add(b2);
		JButton b3=new JButton("Back");
		b3.setBackground(new Color(184,223,216));
		b3.setForeground(new Color(255, 255, 255));
		b3.setFont(new Font("Tahoma", Font.BOLD, 14));
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		b3.setBounds(617,350,100,50);
		b3.addActionListener((ActionListener) new ActionListener()  {
			public void actionPerformed(ActionEvent e) {
				new recruiter();
			}
		});
		f.getContentPane().add(b3);

		f.setSize(1000,500);
		f.getContentPane().setLayout(null);
		logo = new JLabel("New label");
		logo.setForeground(new Color(255, 255, 255));
		logo.setIcon(new ImageIcon("C:\\Users\\nisht\\eclipse-workspace\\Final\\Images\\logo.jpg"));
		logo.setBounds(10, 11, 125, 44);
		f.getContentPane().add(logo);
		HEADING = new JTextField();
		HEADING.setHorizontalAlignment(SwingConstants.CENTER);
		HEADING.setForeground(new Color(255, 255, 255));
		HEADING.setBackground(new Color(184, 223, 216));
		HEADING.setFont(new Font("Arial", Font.BOLD, 25));
		HEADING.setText("JOB DESCRIPTION");
		HEADING.setBounds(682, 11, 252, 44);
		f.getContentPane().add(HEADING);
		HEADING.setColumns(10);
		headingcontainer = new JTextArea();
		headingcontainer.setBackground(new Color(184, 223, 216));
		headingcontainer.setBounds(0, 0, 984, 65);
		f.getContentPane().add(headingcontainer);
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		b1.addActionListener((ActionListener) new ActionListener()  {
			public void actionPerformed(ActionEvent f) {
				String sql = "DELETE FROM `jobdescription`";
				String sql1 = "INSERT INTO `jobdescription`(`most important`, `important`, `niceone`) VALUES (?,?,?)";
				String sql2 = "INSERT INTO `jobdescription`(`most important`, `important`, `niceone`) VALUES (?,?,?)";
				String sql3 = "INSERT INTO `jobdescription`(`most important`, `important`, `niceone`) VALUES (?,?,?)";

				try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ats","root","");

					PreparedStatement pstm = conn.prepareStatement(sql);
					PreparedStatement pstmt = conn.prepareStatement(sql1);
					PreparedStatement st = conn.prepareStatement(sql2);
					PreparedStatement pst = conn.prepareStatement(sql3);

					pstmt.setString(1, t1.getText());
					pstmt.setString(2, t2.getText());
					pstmt.setString(3, t3.getText());
					st.setString(1, t4.getText());
					st.setString(2, t5.getText());
					st.setString(3, t6.getText());
					pst.setString(1, t7.getText());
					pst.setString(2, t8.getText());
					pst.setString(3, t9.getText());

					pstm.executeUpdate();
					pstmt.executeUpdate();
					st.executeUpdate();
					pst.executeUpdate();

					new recruiter();

				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}}
		});
	}
	public static void main(String[] args) {
		new jobdescription();
	}
}
