package model;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class connection  {
	Connection connection;
	
	public void createConnection() {
		String jdbcUrl = "jdbc:mysql://localhost:3306/library";
	    String dbUsername = "root";
	    String dbPassword = "";

	    try {
	        
	        connection = DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);
	    } catch (SQLException ex) {
	        ex.printStackTrace();
	        JOptionPane.showMessageDialog(null, "Database connection error.");
	    }
	}
	
	public Connection conn() {
		return connection;
    

	}

}
