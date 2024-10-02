package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class IPL_Dao_Update {
    // LOAD DRIVER CLASS
    String path = "com.mysql.cj.jdbc.Driver";

    // CREATE CONNECTION
    String url = "jdbc:mysql://localhost:3307/iplplayer";
    String uname = "root";
    String pwd = "root";

    // Unique data
    int jerseyno = 210; 
    int runs = 3000;    

    Connection conn = null;
    PreparedStatement pt = null;

    // Create query for update
    String query = "UPDATE iplplayer.player SET runs=? WHERE jerseyno=?";

    public void updatePlayerRuns() throws SQLException {
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

            // Set values for the query parameters
            pt.setInt(1, runs);
            pt.setInt(2, jerseyno);

            // Execute update
            int count = pt.executeUpdate();
            if (count > 0) {
                System.out.println("Player updated successfully!");
                System.out.println("Rows affected: " + count);
            } else {
                System.out.println("Player not updated successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close connection
            if (conn != null) {
                conn.close();
            }
        }
    }
}
