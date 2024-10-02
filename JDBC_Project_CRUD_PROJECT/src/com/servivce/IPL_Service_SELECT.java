package com.servivce;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.IPLDao_SELECT;
import com.entity.Player;

public class IPL_Service_SELECT {

	IPLDao_SELECT dao = null;


	//Get all players form IPLplayers
	public List<Player> getAllPlayers() throws ClassNotFoundException, SQLException {
		System.out.println("We are in IPLService -> getAllPlayers");
		dao = new IPLDao_SELECT();
		List<Player> allPlayers = dao.getAllPLayers();
		System.out.println("All Players Data:");
		for (Player player : allPlayers) {
			System.out.println("Jersey No: " + player.getJerseyno());
			System.out.println("Name: " + player.getName());
			System.out.println("Runs: " + player.getRuns());
			System.out.println("Wickets: " + player.getWickets());
			System.out.println("Age: " + player.getAge());
			System.out.println("Join Date: " + player.getJoindate());
			System.out.println("Team Name: " + player.getTname());
			System.out.println("-----------------------------"); 
		}
		return allPlayers;
	}

	//Get all CSK players form IPLplayers
	public List<Player> getCSKPlayers() throws ClassNotFoundException, SQLException {
		dao = new IPLDao_SELECT();
		List<Player> allPlayers = dao.getAllPLayers(); 
		List<Player> cskPlayers = new ArrayList<>();

		for (Player p : allPlayers) {
			if (p.getTname().equals("CSK")) {
				cskPlayers.add(p);
			}
		}
		return cskPlayers; 
	}

	//Get all Batters players form IPLplayers
	public List<Player> getBatters() throws ClassNotFoundException, SQLException {
		dao = new IPLDao_SELECT();
		List<Player> allPlayers = dao.getAllPLayers(); 
		List<Player> batters = new ArrayList<>();
		for (Player p : allPlayers) {
			if (p.getRuns() > 800) {
				batters.add(p);
			}
		}
		return batters;
	}

	//Get all  Bowlers players form IPLplayers
	public List<Player> getBowlers() throws ClassNotFoundException, SQLException {
		dao = new IPLDao_SELECT();
		List<Player> allPlayers = dao.getAllPLayers(); 
		List<Player> bowlers = new ArrayList<>();
		for (Player p :allPlayers) {
			if (p.getWickets() > 10) {
				bowlers.add(p);
			}
		}
		return bowlers;
	}

	//Get all Rounders  players form IPLplayers
	public List<Player> getAllRounders() throws ClassNotFoundException, SQLException {
		dao = new IPLDao_SELECT();
		List<Player> allPlayers = dao.getAllPLayers(); 
		List<Player> allRounders = new ArrayList<>();
		for (Player p : allPlayers) {
			if (p.getRuns() > 400 && p.getWickets() > 40) {
				allRounders.add(p);
			}
		}
		return allRounders;
	}
	//Get all  players which age is ready to play
	public List<Player> getPlayerage() throws ClassNotFoundException, SQLException {
		dao = new IPLDao_SELECT();
		List<Player> allPlayers = dao.getAllPLayers(); 
		List<Player> Playerage = new ArrayList<>();
		for (Player p : allPlayers) {
			if (p.getAge()>=40 || p.getAge()<=18) {
				Playerage.add(p);
			}
		}
		return Playerage;
	}

	//Get all   players which are join in 2020 above
	public List<Player> getPlayerjoinyear() throws ClassNotFoundException, SQLException {
		dao = new IPLDao_SELECT();
		List<Player> allPlayers = dao.getAllPLayers(); 
		List<Player> Playerjoinyear = new ArrayList<>();
		for (Player p : allPlayers) {
			if (p.getJoindate()==2020) {
				Playerjoinyear.add(p);
			}
		}
		return Playerjoinyear;
	}
}
