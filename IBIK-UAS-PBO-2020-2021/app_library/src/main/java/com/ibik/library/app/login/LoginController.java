package com.ibik.library.app.login;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import java.awt.BorderLayout;
import javax.swing.JTextField;

public class LoginController {

	private JFrame frame;
	private JTextField textUsername;
	private JTextField textField;
	private JTextField textReset;
	private JTextField textLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginController window = new LoginController();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginController() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Login");
		frame.setBounds(100, 100, 323, 502);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel labelLogo = new JLabel("logo");
		labelLogo.setBackground(Color.WHITE);
		labelLogo.setIcon(new ImageIcon("C:\\Users\\raiha\\Documents\\Kumpulan Tugas Raihan Dwi Pratama\\kumpulan tugas pa febri\\Java\\pbo-java\\app_library\\src\\main\\java\\com\\ibik\\library\\images\\logo-ibik-web.png"));
		labelLogo.setBounds(94, 16, 110, 120);
		frame.getContentPane().add(labelLogo);
		
		JLabel labelTitle1 = new JLabel("Sistem Informasi Perpustakaan");
		labelTitle1.setBounds(10, 147, 287, 31);
		labelTitle1.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle1.setForeground(Color.BLACK);
		labelTitle1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelTitle1.setBackground(Color.YELLOW);
		frame.getContentPane().add(labelTitle1);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(null, "Login to you account", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 202, 287, 182);
		frame.getContentPane().add(panel);
		
		JLabel labelUsername = new JLabel("Username");
		labelUsername.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelUsername.setBounds(21, 32, 72, 14);
		panel.add(labelUsername);
		
		textUsername = new JTextField();
		textUsername.setBounds(124, 29, 142, 20);
		panel.add(textUsername);
		textUsername.setColumns(10);
		
		JLabel labelPassword = new JLabel("Password");
		labelPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelPassword.setBounds(21, 73, 72, 14);
		panel.add(labelPassword);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(123, 71, 142, 20);
		panel.add(textField);
		
		textReset = new JTextField();
		textReset.setHorizontalAlignment(SwingConstants.CENTER);
		textReset.setBackground(Color.LIGHT_GRAY);
		textReset.setText("Reset");
		textReset.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textReset.setColumns(10);
		textReset.setBounds(21, 120, 112, 31);
		panel.add(textReset);
		
		textLogin = new JTextField();
		textLogin.setText("Login");
		textLogin.setHorizontalAlignment(SwingConstants.CENTER);
		textLogin.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textLogin.setColumns(10);
		textLogin.setBackground(Color.LIGHT_GRAY);
		textLogin.setBounds(153, 121, 112, 31);
		panel.add(textLogin);
		
		JLabel labelCopyright = new JLabel("(c) 2021-PBO");
		labelCopyright.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelCopyright.setBounds(10, 408, 101, 14);
		frame.getContentPane().add(labelCopyright);
	}
}
