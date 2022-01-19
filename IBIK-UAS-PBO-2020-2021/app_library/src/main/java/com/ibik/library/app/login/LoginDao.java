package com.ibik.library.app.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ibik.library.app.connection.ConnectionDB;
import com.ibik.library.app.model.User;

public class LoginDao {
	
	private String sqlLogin = "select * from user where NIK= ? and password= ?";
	
	public User checkLogin(User users) throws Exception{
		if (users == null) {
			return null;
		}
		ConnectionDB conn = new ConnectionDB();
		Connection c = conn.connect();
		PreparedStatement pst = c.prepareStatement(sqlLogin);
		pst.setLong(1,users.getNIK());
		pst.setString(2,users.getPassword());
		ResultSet rs = pst.executeQuery();
		if(!rs.next()) {
			return null;
		}
		
		User l = new User();
		l.setID(rs.getInt("ID"));
		l.setNIK(rs.getLong("NIK"));
		l.setFullname(rs.getString("Fullname"));
		l.setPlaceBirth(rs.getString("PlaceBirth"));
		l.setBirthdate(rs.getString("Birthdate"));
		l.setGender(rs.getString("Gender"));
		l.setAddress(rs.getString("Address"));
		l.setEmail(rs.getString("Email"));
		l.setPassword(rs.getString("Password"));
		
		c.close();
		return l;
	}
	
}