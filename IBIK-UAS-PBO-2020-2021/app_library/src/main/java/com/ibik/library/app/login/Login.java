package com.ibik.library.app.login;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

import com.ibik.library.app.connection.ConnectionDB;
import com.ibik.library.app.dashboard.Dashboard;
import com.ibik.library.app.model.User;

import javax.swing.border.TitledBorder;

public class Login extends JFrame {
	
	private JFrame mainFrame;
	private JTextField user;
	private JPasswordField pass;
	private JButton btnSignIn;
	
	public static void main(String[] args) {
		
		ConnectionDB conn = new ConnectionDB();
		
		try {
			conn.connect();
			initialize();
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		
	}
	
	public MyResult ValidationForm(String username, String password) {
		MyResult m = new MyResult();
		
		if (username.isEmpty() || password.isEmpty()) {
			
			m.setResponce(false);
			m.setLabel("Fill both username and password fields");
			
		} else if (username.length() > 10){
			
			m.setResponce(false);
			m.setLabel("Keyword must not exceed 10 characters");
			
		} else if (password.length() > 6){
			
			m.setResponce(false);
			m.setLabel("Keyword must not exceed 6 characters");
			
		} else if (username.matches("[a-z]*") || password.matches("[a-z]*")){
			
			m.setResponce(false);
			m.setLabel("This entry can only contain numbers");
			
		} else {
			
			Long NIK = Long.parseLong(username);
			User users = new User();
			users.setNIK(NIK);
			users.setPassword(password);
			
			LoginDao loginDao = new LoginDao();
			
			try {
				
				User l = loginDao.checkLogin(users);
				System.out.println("NIK "+l.getNIK());
				System.out.println("Fullname "+l.getFullname());
				m.setResponce(true);
				m.setLabel("Welcome to the application");
				
			} catch (Exception e){
				
				e.printStackTrace();
				m.setResponce(false);
				m.setLabel("You have entered an invalid username or password");
				
			}
				
		}
		return m;
	}
	
	private static void initialize() {
	// TODO Auto-generated method stub
		
		final Login mainFrame = new Login();
		mainFrame.getContentPane().setForeground(SystemColor.textHighlight);
		mainFrame.setTitle("Login");
		mainFrame.setBounds(100, 100, 292, 494);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setLayout(null);
		
		JLabel labelIcon = new JLabel("");
		labelIcon.setIcon(new ImageIcon("C:\\Users\\raiha\\Documents\\Kumpulan Tugas Raihan Dwi Pratama\\kumpulan tugas pa febri\\Java\\pbo-java\\app_library\\src\\main\\java\\com\\ibik\\library\\images\\logo-ibik-web.png"));
		labelIcon.setBounds(80, 11, 109, 150);
		mainFrame.getContentPane().add(labelIcon);
		
		JLabel labelTitle = new JLabel("Sistem Informasi Perpustakaan");
		labelTitle.setForeground(Color.BLACK);
		labelTitle.setFont(new Font("Tahoma", Font.BOLD, 16));
		labelTitle.setBounds(10, 163, 256, 31);
		mainFrame.getContentPane().add(labelTitle);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Login to your account", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 227, 256, 159);
		mainFrame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel labelUsername = new JLabel("Username");
		labelUsername.setBounds(10, 35, 70, 14);
		panel.add(labelUsername);
		
		final JTextField user = new JTextField();
		user.setBounds(90, 32, 138, 20);
		panel.add(user);
		user.setColumns(10);
		
		JLabel labelPassword = new JLabel("Password");
		labelPassword.setBounds(10, 74, 70, 14);
		panel.add(labelPassword);
		
		final JPasswordField pass = new JPasswordField();
		pass.setBounds(90, 71, 138, 20);
		panel.add(pass);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(139, 114, 89, 23);
		mainFrame.setVisible(true);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String username = user.getText();
				String password = String.valueOf(pass.getPassword());
				MyResult result = new Login().ValidationForm(username,password);
				if (result.getResponce()) {
					
					mainFrame.setVisible(false);
					new Dashboard().setVisible(true);
					
				} else {
					JOptionPane.showMessageDialog(null, result.getLabel(), "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
			
			
		});
		panel.add(btnLogin);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//mainFrame.dispatchEvent();
				mainFrame.dispose();
			}
		}
			);
		btnCancel.setBounds(36, 114, 89, 23);
		panel.add(btnCancel);
		
		JLabel labelCopyright = new JLabel("(c) 2021");
		labelCopyright.setBounds(10, 430, 46, 14);
		mainFrame.getContentPane().add(labelCopyright);		
			
	}
}