package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import model.connection;

public class book {
	public void addBook(String isbn, String name, String author,String cat,String pub, String qty, String des ) {
		try {
			connection d = new connection();
			d.createConnection();
			Connection con = d.conn();
			   String sql = "INSERT INTO addbook (isbn, name, author, category, publication, quantity, description) VALUES (?, ?, ?, ?, ?, ?, ?)";

               
               PreparedStatement preparedStatement = con.prepareStatement(sql);
               preparedStatement.setString(1, isbn);
               preparedStatement.setString(2, name);
               preparedStatement.setString(3, author);
               preparedStatement.setString(4, cat);
               preparedStatement.setString(5, pub);
               preparedStatement.setString(6, qty);
               preparedStatement.setString(7, des);

               int rowsAffected = preparedStatement.executeUpdate();

              
               if (rowsAffected > 0) {
                   JOptionPane.showMessageDialog(null, "Book added successfully.");
               } else {
                   JOptionPane.showMessageDialog(null, "Failed to add the book.");
               }

             
               preparedStatement.close();
               con.close();
           } catch (SQLException ex) {
               ex.printStackTrace();
               JOptionPane.showMessageDialog(null, "Database connection error.");
           }
       }
    
	
			
		
	
}

