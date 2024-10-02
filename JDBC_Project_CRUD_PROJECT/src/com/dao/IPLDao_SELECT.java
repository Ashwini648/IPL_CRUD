package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.entity.Player;

public class IPLDao_SELECT {

	String path="com.mysql.cj.jdbc.Driver";//step1

	String url="jdbc:mysql://localhost:3307/iplplayer";//step2
	String uname="root";
	String pwd="root";

	Connection conn=null;//step3
	Statement st=null;
	ResultSet rs=null;
	ResultSet rs1=null;

	//	int var =200;
	//	String query="SELECT * FROM iplplayer.player where runs>'"+var+"'";//IT is called query in dynamic way

	String query="SELECT * FROM iplplayer.player";//step4

	List<Player> allPlayerslist=null;

	//Method Start GetALLPlayers              //step1                 //step2
	public List<Player> getAllPLayers() throws ClassNotFoundException, SQLException {
//		System.out.println("We are inIPLDao-> getAllPlayers");
//		System.out.println("............................................");
		//Step1
		Class.forName(path);
//		System.out.println("Driver Class Found Successfully");

		//Step2
		conn=DriverManager.getConnection(url,uname,pwd);
//		System.out.println("Connection is Found Successfully");

		//Step3
		st=conn.createStatement();
//		System.out.println("CreateStatement is Found Successfully");

		//step4
		rs=st.executeQuery(query);
//		System.out.println("ResultSet is Found Successfully");

//		
		System.out.println("........................................................................");


		// Initialize the list outside the loop (before the while loop)
		allPlayerslist = new ArrayList<Player>(); 

		//write while loop to get data 
		System.out.println("All IPL TEAM DATA GET FROM THE DATA BASE ");
		while(rs.next()) {
			int jerseyno = rs.getInt("jerseyno");
			String name = rs.getString("name");
			int runs = rs.getInt("runs");
			int wickets = rs.getInt("wickets");
			int age = rs.getInt("age");
			int joindate = rs.getInt("joindate");  // If joindate is a year or integer
			String tname = rs.getString("tname");
			Player player=new Player(jerseyno,name,runs,wickets,age,joindate, tname);
			allPlayerslist.add(player);
			//		    allPlayerslist.add (new Player(rs.getInt("jerseyno"),name,runs,wickets,age,joindate, tname));
			//          System.out.printf(jerseyno + " " + name + " " + runs + " " + wickets + " " + age + " " + joindate + " " + tname);
			//		    System.out.printf("jerseyno: %2d ,  name: %2s,  runs: %2d, wickets: %2d, age: %2d, joindate: %2d,tname: %2s,\n", jerseyno, name, runs, wickets, age, joindate, tname);
		}


		//Extreme Level Coder Do write that Type Of of code
		//All things give the data 
		//Experience Coder write that type of code in advanced java
		//Every steps write in only one life it is called as standard practice in java for JDBC.
		//all three line of code write in single line
		//rs1=DriverManager.getConnection(url,uname,pwd).createStatement().executeQuery(query).next();
		return allPlayerslist;//return object on all player list 

	}



}
