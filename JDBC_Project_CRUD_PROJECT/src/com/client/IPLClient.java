package com.client;

import java.sql.SQLException;
import java.util.List;

import com.controller.IPLController;
import com.dao.IPL_Dao_Delete;
import com.dao.IPL_Dao_INSERT;
import com.dao.IPL_Dao_Update;
import com.entity.Player;

public class IPLClient {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		IPLController controller=	new IPLController();

		List<Player> allPlayers=controller.getAllPlayers();
		System.out.println("Get all players form database:");
		for (Player player : allPlayers) {
			System.out.println(player); 
		}     
		System.out.println("...............................................................");
		List<Player> CSKPlayers=controller.getCSKPlayers();
		System.out.println("Get all CSK players from data base:");
		for (Player player : CSKPlayers) {
			System.out.println(player); 
		}     

		System.out.println("...............................................................");
		List<Player> BattersPlayers=controller.getBatters();
		System.out.println("Get all getBatters players from data base:");
		for (Player player : BattersPlayers) {
			System.out.println(player); 
		}   
		System.out.println("...............................................................");
		List<Player> BowlersPlayers=controller.getBowlers();
		System.out.println("Get all getBowlers players from data base:");
		for (Player player : BowlersPlayers) {
			System.out.println(player); 
		}   
		System.out.println("...............................................................");
		List<Player> AllRoundersPlayers=controller.getAllRounders();
		System.out.println("Get all getAllRounders players from data base:");
		for (Player player : AllRoundersPlayers) {
			System.out.println(player); 
		}   
		
		System.out.println("...............................................................");
		List<Player> Playerage=controller.getPlayerage();
		System.out.println("Get all getAllRounders players from data base:");
		for (Player player : Playerage) {
			System.out.println(player); 
		}   
		
		System.out.println("...............................................................");
		List<Player> Playerjoinyear=controller.getPlayerjoinyear();
		System.out.println("Get all players join in 2020 players from data base:");
		for (Player player : Playerjoinyear) {
			System.out.println(player); 
		} 
		System.out.println("...............................................................");
		IPL_Dao_INSERT insert = new IPL_Dao_INSERT();
		 insert.insertAllPlayers();
		
		System.out.println("...............................................................");
		IPL_Dao_Update update = new IPL_Dao_Update();
		update.updatePlayerRuns();
		
		System.out.println("...............................................................");
		IPL_Dao_Delete delete = new IPL_Dao_Delete ();
		delete.deletePlayer();
		
		
	}

}
