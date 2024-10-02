package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class IPL_Dao_Delete {
    // LOAD DRIVER CLASS
    String path = "com.mysql.cj.jdbc.Driver";

    // CREATE CONNECTION
    String url = "jdbc:mysql://localhost:3307/iplplayer";
    String uname = "root";
    String pwd = "root";

    // Unique data 
    int jerseyno = 210; 

    Connection conn = null;
    PreparedStatement pt = null;

    // Create query for delete
    String query = "DELETE FROM iplplayer.player WHERE jerseyno=?";

    public void deletePlayer() throws SQLException {
        try {
            // Load driver class
            Class.forName(path);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            // Create connection
            conn = DriverManager.getConnection(url, uname, pwd);

            // Prepare statement with the query
            pt = conn.prepareStatement(query);

            // Set the jersey number for the delete query
            pt.setInt(1, jerseyno);

            // Execute delete
            int count = pt.executeUpdate();
            if (count > 0) {
                System.out.println("Player deleted successfully!");
                System.out.println("Rows affected: " + count);
            } else {
                System.out.println("Player not found or not deleted!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }
}

