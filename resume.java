package ats;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Font;
import java.awt.Color;



class resume implements ActionListener
{
	JTextField t1,t2,t3,t4,t5,t7,t8,t9,t10,t11,t12,t14,t15,t16,t,s,t17,t18,t19,t21,t22,t23,t24,t25,t26;

	JButton b1,b2,b3,b13,b14,b15;

	JRadioButton b4,b5,b6,b7,b8,b9,b10,b11,b12,b16,b17,b18;

	String d1="nill",d2="nill",d3="nill",d4="nill",d5="nill",d6="nill",d7="nill",d8="nill",d9="nill",gender;

	static double a=0,b=0,result=0,c=0,d=0,g=0,h=0,i=0,j=0,k=0;
	static int operator=0;
	int l;
	String rank;

	resume(){
		JFrame f=new JFrame("Resume");
		f.setBackground(new Color(232,246,239));

		JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26;
		t=new JTextField();
		t.setBounds(550, 750, 280, 30);
		s=new JTextField();
		s.setBounds(550, 700, 280, 30);
		l1=new JLabel("Name");
		l1.setBounds(52, 114, 56, 30);
		l1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l2=new JLabel("Father Name");
		l2.setBounds(932, 102, 92, 30);
		l2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l3=new JLabel("D.O.B");
		l3.setBounds(560, 114, 79, 30);
		l3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l4=new JLabel("Ph.no");
		l4.setBounds(932, 143, 79, 30);
		l4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l5=new JLabel("E-mail Id");
		l5.setBounds(52, 154, 79, 30);
		l5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l6=new JLabel("Gender");
		l6.setBounds(560, 143, 63, 30);
		l6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l7=new JLabel("Year of Passing 10th");
		l7.setBounds(52, 195, 125, 30);
		l7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l8=new JLabel("10th Marks");
		l8.setBounds(52, 243, 82, 30);
		l8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l9=new JLabel("Year of passing 12th");
		l9.setBounds(52, 284, 138, 30);
		l9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l10=new JLabel("12th Marks");
		l10.setBounds(52, 325, 92, 30);
		l10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l11=new JLabel("Graduation Course");
		l11.setBounds(560, 195, 126, 30);
		l11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l12=new JLabel("Year of passing");
		l12.setBounds(550, 284, 117, 30);
		l12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l13=new JLabel("GRADUATION MARKS");
		l13.setBounds(619, 243, 132, 30);
		l13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l14=new JLabel("First.yr.");
		l14.setBounds(560, 325, 56, 30);
		l14.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l15=new JLabel("Second.yr.");
		l15.setBounds(560, 366, 70, 30);
		l15.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l16=new JLabel("Third.yr.");
		l16.setBounds(560, 407, 69, 30);
		l16.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l17=new JLabel("Total %");
		l17.setBounds(560, 447, 50, 30);
		l17.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l18=new JLabel("Post Graduation Course");
		l18.setBounds(932, 195, 160, 30);
		l18.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l19=new JLabel("Year of passing");
		l19.setBounds(932, 447, 150, 30);
		l19.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l20=new JLabel("POST GRADUCATION MARKS");
		l20.setBounds(976, 243, 188, 30);
		l20.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l21=new JLabel("First.yr.");
		l21.setBounds(932, 284, 117, 30);
		l21.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l22=new JLabel("Second.yr.");
		l22.setBounds(932, 325, 79, 30);
		l22.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l23=new JLabel("Third.yr.");
		l23.setBounds(932, 366, 71, 30);
		l23.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l24=new JLabel("Total %");
		l24.setBounds(932, 407, 50, 30);
		l24.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l25=new JLabel("Experience in Years");
		l25.setBounds(52, 366, 125, 30);
		l25.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l26=new JLabel("Company Name");
		l26.setBounds(52, 407, 127, 30);
		l26.setFont(new Font("Tahoma", Font.PLAIN, 14));
		f.getContentPane().setLayout(null);
		f.getContentPane().add(t);f.getContentPane().add(s);
		f.getContentPane().add(l1); f.getContentPane().add(l2); f.getContentPane().add(l3);
		f.getContentPane().add(l4); f.getContentPane().add(l5); f.getContentPane().add(l6);
		f.getContentPane().add(l7); f.getContentPane().add(l8); f.getContentPane().add(l9);
		f.getContentPane().add(l10); f.getContentPane().add(l11); f.getContentPane().add(l12);
		f.getContentPane().add(l13); f.getContentPane().add(l14); f.getContentPane().add(l15);
		f.getContentPane().add(l16);f.getContentPane().add(l17);f.getContentPane().add(l18);
		f.getContentPane().add(l19);f.getContentPane().add(l20);f.getContentPane().add(l21);
		f.getContentPane().add(l22);f.getContentPane().add(l23);f.getContentPane().add(l24);
		f.getContentPane().add(l25);f.getContentPane().add(l26);



		t1=new JTextField();
		t1.setBounds(200, 114, 160, 30);
		t2=new JTextField();
		t2.setBounds(1098, 100, 150, 30);
		t3=new JTextField();
		t3.setBounds(692, 116, 138, 30);
		t4=new JTextField();
		t4.setBounds(1098, 143, 146, 30);
		t5=new JTextField();
		t5.setBounds(200, 155, 160, 30);
		t7=new JTextField();
		t7.setBounds(200, 197, 160, 30);
		t8=new JTextField();
		t8.setBounds(200, 245, 138, 30);
		t9=new JTextField();
		t9.setBounds(200, 286, 150, 30);
		t10=new JTextField();
		t10.setBounds(200, 327, 160, 30);
		t11=new JTextField();
		t11.setBounds(692, 197, 138, 30);
		t12=new JTextField();
		t12.setBounds(693, 286, 100, 30);
		t14=new JTextField();
		t14.setBounds(692, 325, 100, 30);
		t15=new JTextField();
		t15.setBounds(692, 368, 100, 30);
		t16=new JTextField();
		t16.setBounds(692, 409, 100, 30);
		t17=new JTextField();
		t17.setBounds(692, 449, 100, 30);
		t18=new JTextField();
		t18.setBounds(1102, 197, 146, 30);
		t19=new JTextField();
		t19.setBounds(1098, 449, 100, 30);
		t21=new JTextField();
		t21.setBounds(1098, 286, 100, 30);
		t22=new JTextField();
		t22.setBounds(1098, 325, 100, 30);
		t23=new JTextField();
		t23.setBounds(1098, 368, 100, 30);
		t24=new JTextField();
		t24.setBounds(1098, 409, 100, 30);
		t25=new JTextField();
		t25.setBounds(200, 368, 200, 30);
		t26=new JTextField();
		t26.setBounds(200, 409, 200, 30);

		f.getContentPane().add(t1); f.getContentPane().add(t2); f.getContentPane().add(t3);
		f.getContentPane().add(t4); f.getContentPane().add(t5);
		f.getContentPane().add(t7); f.getContentPane().add(t8); f.getContentPane().add(t9);
		f.getContentPane().add(t10); f.getContentPane().add(t11); f.getContentPane().add(t12);
		f.getContentPane().add(t14);f.getContentPane().add(t15); f.getContentPane().add(t16);f.getContentPane().add(t17);
		f.getContentPane().add(t18);f.getContentPane().add(t19);f.getContentPane().add(t21);
		f.getContentPane().add(t22);f.getContentPane().add(t23);f.getContentPane().add(t24);f.getContentPane().add(t25); f.getContentPane().add(t26);


		b1=new JButton("Enter");
		b1.setBounds(924, 540, 100, 50);
		b1.setBackground(new Color(184,223,216));
		b1.setForeground(new Color(255, 255, 255));
		b1.setFont(new Font("Tahoma", Font.BOLD, 14));

		b2=new JButton("Reset");
		b2.setBounds(1082, 540, 100, 50);
		b2.setBackground(new Color(184,223,216));
		b2.setForeground(new Color(255, 255, 255));
		b2.setFont(new Font("Tahoma", Font.BOLD, 14));
		b2.addActionListener((ActionListener) new ActionListener()  {
			public void actionPerformed(ActionEvent e) {
				new resume();
			}
		});
		f.getContentPane().add(b2);
		b3=new JButton("Back");
		b3.setBackground(new Color(184,223,216));
		b3.setForeground(new Color(255, 255, 255));
		b3.setFont(new Font("Tahoma", Font.BOLD, 14));
		b3.setBounds(1012, 612, 100, 50);
		b3.addActionListener((ActionListener) new ActionListener()  {
			public void actionPerformed(ActionEvent e) {
				new candidate();
			}
		});

		b4=new JRadioButton("");
		b4.setBounds(50, 540, 170, 30);
		b5=new JRadioButton("");
		b5.setBounds(220, 540, 170, 30);
		b6=new JRadioButton("");
		b6.setBounds(420, 540, 170, 30);
		b7=new JRadioButton("");
		b7.setBounds(620, 540, 170, 30);
		b8=new JRadioButton("");
		b8.setBounds(820, 540, 170, 30);
		b9=new JRadioButton("");
		b9.setBounds(50, 600, 200, 30);
		b10=new JRadioButton("");
		b10.setBounds(250, 600, 200, 30);
		b11=new JRadioButton("");
		b11.setBounds(450, 600, 200, 30);
		b12=new JRadioButton("");
		b12.setBounds(650, 600, 200, 30);

		b16=new JRadioButton("Male");
		b16.setBounds(629, 143, 63, 30);
		b16.setFont(new Font("Tahoma", Font.PLAIN, 14));
		b17=new JRadioButton("Female");
		b17.setBounds(705, 143, 70, 30);
		b17.setFont(new Font("Tahoma", Font.PLAIN, 14));
		b18=new JRadioButton("Others");
		b18.setBounds(777, 143, 79, 30);
		b18.setFont(new Font("Tahoma", Font.PLAIN, 14));

		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		f.getContentPane().add(b4);
		f.getContentPane().add(b5);
		f.getContentPane().add(b6);
		f.getContentPane().add(b7);
		f.getContentPane().add(b8);
		f.getContentPane().add(b9);
		f.getContentPane().add(b10);
		f.getContentPane().add(b11);
		f.getContentPane().add(b12);
		f.getContentPane().add(b16);
		f.getContentPane().add(b17);
		f.getContentPane().add(b18);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);

		b16.addActionListener(this);
		b17.addActionListener(this);
		b18.addActionListener(this);

		b14=new JButton("SKILLS");
		b14.setBounds(55, 483, 135, 30);
		f.getContentPane().add(b14);
		JLabel lblNewLabel = new JLabel("RESUME BUILDER");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(888, 11, 359, 39);
		f.getContentPane().add(lblNewLabel);
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon("C:\\Users\\nisht\\eclipse-workspace\\final\\Images\\logo.jpg"));
		logo.setBounds(6, 7, 125, 58);
		f.getContentPane().add(logo);
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(184,223,216));
		textArea.setBounds(0, 0, 1284, 69);
		f.getContentPane().add(textArea);
		b14.addActionListener((ActionListener) new ActionListener()  {
			public void actionPerformed(ActionEvent f) {
				String sql = "SELECT * FROM `jobdescription` WHERE 1";
				try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ats","root","");

					PreparedStatement pstmt = conn.prepareStatement(sql);
					ResultSet rs =pstmt.executeQuery();
					rs.next();
					{
						b4.setText(rs.getString(1));
						b5.setText(rs.getString(2));
						b6.setText(rs.getString(3));

						d1=rs.getString(1);
						d2=rs.getString(2);
						d3=rs.getString(3);

					}

					rs.next();
					{
						b7.setText(rs.getString(1));
						b8.setText(rs.getString(2));
						b9.setText(rs.getString(3));

						d4=rs.getString(1);
						d5=rs.getString(2);
						d6=rs.getString(3);
					}
					rs.next();
					{
						b10.setText(rs.getString(1));
						b11.setText(rs.getString(2));
						b12.setText(rs.getString(3));

						d7=rs.getString(1);
						d8=rs.getString(2);
						d9=rs.getString(3);
					}

				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});

		f.setSize(1300,1000);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b16)
		{
			gender="Male";
		}

		if(e.getSource()==b17)
		{
			gender="Female";
		}

		if(e.getSource()==b18){
			gender="Others";
		}


		if(e.getSource()==b4)
		{
			t.setText("5");
			s.setText(s.getText().concat(d1+" "));
			a=Double.parseDouble(t.getText());
			result=result+a;
			t.setText(""+result);
		}

		if(e.getSource()==b5)
		{
			t.setText("5");
			s.setText(s.getText().concat(d2+" "));
			b=Double.parseDouble(t.getText());
			result=result+b;
			t.setText(""+result);
		}

		if(e.getSource()==b6)
		{
			t.setText("5");
			s.setText(s.getText().concat(d3+" "));
			c=Double.parseDouble(t.getText());
			result=result+c;
			t.setText(""+result);
		}

		if(e.getSource()==b7)
		{
			t.setText("4");
			s.setText(s.getText().concat(d4+" "));
			d=Double.parseDouble(t.getText());
			result=result+d;
			t.setText(""+result);
		}

		if(e.getSource()==b8)
		{

			t.setText("4");
			s.setText(s.getText().concat(d5+" "));
			g=Double.parseDouble(t.getText());
			result=result+g;
			t.setText(""+result);
		}

		if(e.getSource()==b9)
		{
			t.setText("4");
			s.setText(s.getText().concat(d6+" "));
			h=Double.parseDouble(t.getText());
			result=result+h;
			t.setText(""+result);
		}

		if(e.getSource()==b10)
		{
			t.setText("3");
			s.setText(s.getText().concat(d7+" "));
			i=Double.parseDouble(t.getText());
			result=result+i;
			t.setText(""+result);
		}

		if(e.getSource()==b11)
		{
			t.setText("3");
			s.setText(s.getText().concat(d8+" "));
			j=Double.parseDouble(t.getText());
			result=result+j;
			t.setText(""+result);
		}
		if(e.getSource()==b12)
		{
			t.setText("3");
			s.setText(s.getText().concat(d9+" "));
			k=Double.parseDouble(t.getText());
			result=result+k;
			t.setText(""+result);
		}

		if(e.getSource()==b2)
			t.setText("");

		if(e.getSource()==b3)
		{
			String s=t.getText();
			t.setText("");

			for(int i=0;i<s.length()-1;i++)
				t.setText(t.getText()+s.charAt(i));
		}

		if(e.getSource()==b1)
		{
			int a1,a2,a3,a4,a5,a6=0,a7=0,a8=0,a9=0;

			int a=Integer.parseInt(t8.getText());
			if(a>75)
			{a1=3;}
			else
			{	a1=2;}

			int b=Integer.parseInt(t10.getText());
			if(b>75)
			{a2=5;}
			else
			{	a2=3;}

			int c=Integer.parseInt(t14.getText());
			if(c>70)
			{a3=4;}
			else
			{	a3=3;}

			int d=Integer.parseInt(t15.getText());
			if(d>70)
			{a4=4;}
			else
			{	a4=3;}

			int f=Integer.parseInt(t16.getText());
			if(f>70)
			{a5=4;}
			else
			{	a5=3;}

			int g=Integer.parseInt(t21.getText());
			if(g>70)
			{a6=4;}
			else
			{	a6=3;}

			int h=Integer.parseInt(t22.getText());
			if(h>70)
			{a7=4;}
			else
			{	a7=3;}

			int i=Integer.parseInt(t23.getText());
			if(i>70)
			{a8=4;}
			else
			{	a8=3;}

			int j=Integer.parseInt(t25.getText());
			if(j!=0)
			{a9=j*10;}
			else
			{	a9=0;}


			if(a>75 && b>75)
			{	a1=a1+2;}

			if(c>70 && d>70 && f>70)
			{	a3=a3+4;}

			else if(c>70 && d>70)
			{	a3=a3+2;}

			else if(d>70 && f>70)
			{	a4=a4+3;}

			if(g>70 && h>70 && i>70)
			{	a6=a3+4;}

			else if(g>70 && h>70)
			{	a6=a6+2;}

			else if(h>70 && i>70)
			{	a7=a7+3;}

			l=a1+a2+a3+a4+a5+a6+a7+a8+a9;
			result=result+l;

/*
b1.addActionListener((ActionListener) new ActionListener()  {
	public void actionPerformed(ActionEvent f) {
	*/
			String sql = "INSERT INTO `resume`(`name`, `fathername`, `dob`, `phoneno`, `email id`,"
					+ " `gender`, `10thyear`, `10thmarks`, `12thyear`, `12thmarks`, `Graduationcourse`, `graduationyear`,"
					+ " `graduationmarks`, `pgcourse`, `pgyear`, `pgmarks`, `experience`, `companyname`, `skills`,"
					+ " `ranking`)VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			try{
				Class.forName("com.mysql.jdbc.Driver");

				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ats","root","");

				PreparedStatement pstmt = conn.prepareStatement(sql);

				pstmt.setString(1, t1.getText());
				pstmt.setString(2, t2.getText());
				pstmt.setString(3, t3.getText());
				pstmt.setString(4, t4.getText());
				pstmt.setString(5, t5.getText());
				pstmt.setString(6, gender);
				pstmt.setString(7, t7.getText());
				pstmt.setString(8, t8.getText());
				pstmt.setString(9, t9.getText());
				pstmt.setString(10, t10.getText());
				pstmt.setString(11, t11.getText());
				pstmt.setString(12, t12.getText());
				pstmt.setString(13, t17.getText());
				pstmt.setString(14, t18.getText());
				pstmt.setString(15, t19.getText());
				pstmt.setString(16, t24.getText());
				pstmt.setString(17, t25.getText());
				pstmt.setString(18, t26.getText());
				pstmt.setString(19, s.getText());
				pstmt.setDouble(20, result);

				pstmt.executeUpdate();

				new candidate();

			}
			catch(Exception r)
			{
				JOptionPane.showMessageDialog(null, r);
			}}
	}

	public static void main(String[] args) {
		new resume();
	}
}