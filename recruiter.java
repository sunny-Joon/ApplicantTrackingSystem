package ats;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;  
public class recruiter extends JFrame {    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField HEADING;
	recruiter (){    
JFrame f=new JFrame("JobProvider");  
f.getContentPane().setBackground(new Color(232,246,239));
JButton b1=new JButton("Job Tittle");
		b1.setBackground(new Color(184,223,216));
		b1.setForeground(new Color(255, 255, 255));
		b1.setFont(new Font("Tahoma", Font.BOLD, 14));
b1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	}
});
b1.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
});
b1.setBounds(159,146,169,44);    
f.getContentPane().add(b1);
b1.addActionListener((ActionListener) new ActionListener()  {
	public void actionPerformed(ActionEvent e) {
		new jobtitle();
		dispose();
	}
	});

JButton b2=new JButton("Job Description");
		b2.setBackground(new Color(184,223,216));
		b2.setForeground(new Color(255, 255, 255));
		b2.setFont(new Font("Tahoma", Font.BOLD, 14));
b2.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
});

b2.setBounds(159,201,169,44);    
f.getContentPane().add(b2);    
b2.addActionListener((ActionListener) new ActionListener()  {
	public void actionPerformed(ActionEvent e) {
		new jobdescription();
		dispose();
	}
	});

JButton b3=new JButton("View Result");    
b3.setFont(new Font("Tahoma", Font.PLAIN, 14));
b3.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
});
b3.setBounds(159,256,169,44);
		b3.setBackground(new Color(184,223,216));
		b3.setForeground(new Color(255, 255, 255));
		b3.setFont(new Font("Tahoma", Font.BOLD, 14));
f.getContentPane().add(b3);    
b3.addActionListener((ActionListener) new ActionListener()  {
	public void actionPerformed(ActionEvent e) {
		new viewjobresults();
		dispose();
	}
	});

f.setSize(500,420);    
f.getContentPane().setLayout(null);    
JLabel logo = new JLabel("New label");
logo.setIcon(new ImageIcon("C:\\Users\\nisht\\eclipse-workspace\\Final\\Images\\logo.jpg"));
logo.setBounds(10, 11, 129, 59);
f.getContentPane().add(logo);
HEADING = new JTextField();
HEADING.setBackground(new Color(184,223,216));
HEADING.setForeground(new Color(255, 255, 255));
HEADING.setHorizontalAlignment(SwingConstants.CENTER);
HEADING.setText("RECRUITER OPTIONS");
HEADING.setFont(new Font("Arial", Font.BOLD, 22));
HEADING.setBounds(199, 11, 262, 50);
f.getContentPane().add(HEADING);
HEADING.setColumns(10);
JTextArea textArea = new JTextArea();
textArea.setBackground(new Color(184,223,216));
textArea.setBounds(0, 0, 484, 70);
f.getContentPane().add(textArea);
f.setVisible(true);   
f.setLocationRelativeTo(null); 
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }         
public static void main(String[] args) {    
    new recruiter ();    
}    
}    
