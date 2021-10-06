package ats;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
class candidate{
	public JTextField txtCandidateSection;
	candidate(){
		JFrame f=new JFrame("Candidate");
		f.getContentPane().setBackground(new Color(232, 246, 239));

		JButton b1=new JButton("View Job Tittle");
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		b1.setBackground(new Color(255, 255, 255));
		b1.setFont(new Font("Arial", Font.PLAIN, 17));
		b1.addActionListener((ActionListener) new ActionListener()  {
			public void actionPerformed(ActionEvent e) {
				new viewjobtitle();
			}
		});
		b1.setBounds(160,238,172,40);
		f.getContentPane().add(b1);

		JButton b2=new JButton("Create Resume");
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		b2.setBackground(new Color(255, 255, 255));
		b2.setFont(new Font("Arial", Font.PLAIN, 17));
		b2.addActionListener((ActionListener) new ActionListener()  {
			public void actionPerformed(ActionEvent e) {
				new resume();
			}
		});
		b2.setBounds(160,306,172,40);
		f.getContentPane().add(b2);


		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		txtCandidateSection = new JTextField();
		txtCandidateSection.setForeground(new Color(255, 255, 255));
		txtCandidateSection.setBackground(new Color(184,223,216));
		txtCandidateSection.setHorizontalAlignment(SwingConstants.CENTER);
		txtCandidateSection.setText("CANDIDATE SECTION");
		txtCandidateSection.setFont(new Font("Arial", Font.BOLD, 18));
		txtCandidateSection.setBounds(109, 77, 276, 40);
		f.getContentPane().add(txtCandidateSection);
		txtCandidateSection.setColumns(10);
		JLabel IMAGE = new JLabel("");
		IMAGE.setIcon(new ImageIcon("C:\\Users\\nisht\\eclipse-workspace\\Final\\Images\\logo.jpg"));
		IMAGE.setBounds(182, 148, 128, 54);
		f.getContentPane().add(IMAGE);
		JTextArea container = new JTextArea();
		container.setBounds(109, 77, 276, 315);
		f.getContentPane().add(container);
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new candidate();
	}
}
