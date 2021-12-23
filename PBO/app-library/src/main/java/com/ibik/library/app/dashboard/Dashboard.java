package com.ibik.library.app.dashboard;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import java.awt.Panel;
import javax.swing.JTextField;


public class Dashboard extends JFrame{

	public JFrame frameMain;
	private JTextField textField;
	private JTextField txtAryaHirawansyah;
	private JTextField txtBogor;
	private JTextField textField_3;
	private JTextField txtM;
	private JTextField txtJalanCimanggu;
	private JTextField txtAryahirawansyahgmailcom;
	private JTextField textField_7;
	
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
		setTitle("Dashboard Page");
		setResizable(false);
		setBounds(100, 100, 500, 640); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel labelTitle = new JLabel("Wellcome to this application");
		labelTitle.setBounds(62, 33, 364, 29);
		labelTitle.setFont(new Font("Tahoma", Font.BOLD, 16));
		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(labelTitle);		
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Your profile", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(21, 82, 441, 405);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NIK");
		lblNewLabel.setBounds(24, 23, 28, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(22, 48, 177, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblFullname = new JLabel("Fullname");
		lblFullname.setBounds(218, 23, 66, 14);
		panel.add(lblFullname);
		
		txtAryaHirawansyah = new JTextField();
		txtAryaHirawansyah.setColumns(10);
		txtAryaHirawansyah.setBounds(215, 48, 194, 20);
		panel.add(txtAryaHirawansyah);
		
		JLabel lblPlacebirth = new JLabel("Placebirth");
		lblPlacebirth.setBounds(24, 97, 68, 14);
		panel.add(lblPlacebirth);
		
		txtBogor = new JTextField();
		txtBogor.setColumns(10);
		txtBogor.setBounds(19, 126, 130, 20);
		panel.add(txtBogor);
		
		JLabel lblBirthdate = new JLabel("Birthdate");
		lblBirthdate.setBounds(173, 98, 68, 14);
		panel.add(lblBirthdate);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(166, 127, 133, 20);
		panel.add(textField_3);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(316, 101, 68, 14);
		panel.add(lblGender);
		
		txtM = new JTextField();
		txtM.setColumns(10);
		txtM.setBounds(315, 127, 94, 20);
		panel.add(txtM);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(25, 168, 68, 14);
		panel.add(lblAddress);
		
		txtJalanCimanggu = new JTextField();
		txtJalanCimanggu.setColumns(10);
		txtJalanCimanggu.setBounds(23, 190, 387, 76);
		panel.add(txtJalanCimanggu);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(25, 292, 68, 14);
		panel.add(lblEmail);
		
		txtAryahirawansyahgmailcom = new JTextField();
		txtAryahirawansyahgmailcom.setColumns(10);
		txtAryahirawansyahgmailcom.setBounds(24, 322, 171, 20);
		panel.add(txtAryahirawansyahgmailcom);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(221, 294, 68, 14);
		panel.add(lblPassword);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(214, 321, 196, 20);
		panel.add(textField_7);
		
	}
}