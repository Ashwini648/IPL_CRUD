package com.controller;

import java.sql.SQLException;
import java.util.List;

import com.entity.Player;
import com.servivce.IPL_Service_SELECT;

public class IPLController {

	IPL_Service_SELECT service=null;
	
	//Get all players form IPLplayers
	public List<Player> getAllPlayers() throws ClassNotFoundException, SQLException{
		System.out.println("We are inIPLController -> getAllPlayers");
		service = new IPL_Service_SELECT();
		List<Player> allPlayers=service.getAllPlayers();
		return allPlayers;
		
	}
	
	//Get all CSK players form IPLplayers
	public List<Player> getCSKPlayers() throws ClassNotFoundException, SQLException {
		service = new IPL_Service_SELECT();
		List<Player> allPlayers=service.getCSKPlayers();
		return allPlayers;
	}

	//Get all Batters players form IPLplayers
	public List<Player> getBatters() throws ClassNotFoundException, SQLException {
		service = new IPL_Service_SELECT();
		List<Player> allPlayers=service.getBatters();
		return allPlayers;
	}

	public List<Player> getBowlers() throws ClassNotFoundException, SQLException {
		service = new IPL_Service_SELECT();
		List<Player> allPlayers=service.getBowlers();
		return allPlayers;
	}

	public List<Player> getAllRounders() throws ClassNotFoundException, SQLException {
		service = new IPL_Service_SELECT();
		List<Player> allPlayers=service.getAllRounders();
		return allPlayers;
	}

	public List<Player> getPlayerage() throws ClassNotFoundException, SQLException {
		service =new IPL_Service_SELECT();
		List<Player> allPlayers=service.getPlayerage() ;
		return allPlayers;
	}

	public List<Player> getPlayerjoinyear() throws ClassNotFoundException, SQLException {
		service =new IPL_Service_SELECT();
		List<Player> allPlayers=service.getPlayerjoinyear() ;
		return allPlayers;
	}
	
	
}
