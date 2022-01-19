package com.ibik.library.app.dashboard;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Panel;
import javax.swing.JTextField;


public class Dashboard extends JFrame{

	public JFrame frameMain;
	private JTextField textNIK;
	private JTextField textFullname;
	private JTextField textPlacebirth;
	private JTextField textBirthdate;
	private JTextField textGender;
	private JTextField textAddress;
	private JTextField textEmail;
	private JTextField textPassword;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Dashboard() {
		initialize();
	}

	private void initialize() {
		setTitle("Dashboard");
		setResizable(false);
		setBounds(100, 100, 383, 493); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel labelTitle = new JLabel("Wellcome to this application");
		labelTitle.setBounds(10, 42, 347, 29);
		labelTitle.setFont(new Font("Tahoma", Font.BOLD, 16));
		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(labelTitle);		
		
		Panel panel = new Panel();
		panel.setBounds(10, 117, 347, 311);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel labelNIK = new JLabel("NIK");
		labelNIK.setBounds(10, 27, 46, 14);
		panel.add(labelNIK);
		
		textNIK = new JTextField();
		textNIK.setBounds(10, 52, 138, 20);
		panel.add(textNIK);
		textNIK.setColumns(10);
		
		JLabel labelFullname = new JLabel("Fullname");
		labelFullname.setBounds(193, 27, 56, 14);
		panel.add(labelFullname);
		
		textFullname = new JTextField();
		textFullname.setColumns(10);
		textFullname.setBounds(193, 52, 138, 20);
		panel.add(textFullname);
		
		JLabel labelPlacebirth = new JLabel("Placebirth");
		labelPlacebirth.setBounds(10, 89, 68, 14);
		panel.add(labelPlacebirth);
		
		textPlacebirth = new JTextField();
		textPlacebirth.setColumns(10);
		textPlacebirth.setBounds(10, 110, 96, 20);
		panel.add(textPlacebirth);
		
		JLabel labelBirthdate = new JLabel("Birthdate");
		labelBirthdate.setBounds(123, 89, 56, 14);
		panel.add(labelBirthdate);
		
		textBirthdate = new JTextField();
		textBirthdate.setColumns(10);
		textBirthdate.setBounds(122, 110, 96, 20);
		panel.add(textBirthdate);
		
		JLabel labelGender = new JLabel("Gender");
		labelGender.setBounds(235, 89, 56, 14);
		panel.add(labelGender);
		
		textGender = new JTextField();
		textGender.setColumns(10);
		textGender.setBounds(235, 110, 96, 20);
		panel.add(textGender);
		
		JLabel labelAddress = new JLabel("Address");
		labelAddress.setBounds(10, 149, 56, 14);
		panel.add(labelAddress);
		
		textAddress = new JTextField();
		textAddress.setColumns(10);
		textAddress.setBounds(10, 174, 321, 39);
		panel.add(textAddress);
		
		JLabel labelEmail = new JLabel("Email");
		labelEmail.setBounds(10, 235, 46, 14);
		panel.add(labelEmail);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(10, 260, 138, 20);
		panel.add(textEmail);
		
		JLabel labelPassword = new JLabel("Password");
		labelPassword.setBounds(193, 235, 68, 14);
		panel.add(labelPassword);
		
		textPassword = new JTextField();
		textPassword.setColumns(10);
		textPassword.setBounds(193, 260, 138, 20);
		panel.add(textPassword);
		
	}
}
