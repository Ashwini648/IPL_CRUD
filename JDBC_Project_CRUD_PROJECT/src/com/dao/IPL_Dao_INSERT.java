package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.entity.Player;

public class IPL_Dao_INSERT{

	//LOAD DRIVER CLASS.......
	String path="com.mysql.cj.jdbc.Driver";
	
    //CFREATE CONNECTION
	String url="jdbc:mysql://localhost:3307/iplplayer";
	String uname="root";
	String pwd="root";
	
	Connection conn=null;
	PreparedStatement pt=null;
	
	//Create query for insert
	String query = "INSERT INTO iplplayer.player (jerseyno,name,runs,wickets,age,joindate, tname ) VALUES (?, ?, ?, ?, ?, ?, ? )";
	public void insertAllPlayers(){
		try {
			Class.forName(path);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conn=DriverManager.getConnection(url, uname, pwd);
			pt=conn.prepareStatement(query);
			pt.setInt(1, 210); 
            pt.setString(2, "Sachin Tendulkar"); 
            pt.setInt(3, 300); 
            pt.setInt(4, 15); 
            pt.setInt(5, 28); 
            pt.setInt(6, 1997); 
            pt.setString(7, "MI"); 
            pt.executeUpdate();
            System.out.println("Player inserted successfully!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}
