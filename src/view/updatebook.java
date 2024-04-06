package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import model.connection;


public class updatebook extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					updatebook frame = new updatebook();
					frame.setVisible(true);
					frame.setLayout(null);
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public updatebook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);

		setContentPane(contentPane);
		
		JButton updatebookbtn=new JButton("UPDATE");
		JButton updateclear=new JButton("CLEAR");
		JButton updatesearch=new JButton("SEARCH");
		
		JButton backbtn3=new JButton("Back To Home");
		
		 Color myColor = new Color(192, 192, 192);
		 contentPane.setBackground(myColor);
		 
		 Font font1 = new Font("Arial", Font.BOLD, 24);
			Font font2 = new Font("Arial", Font.BOLD, 20);
			Font font3 = new Font("Times New Roman", Font.BOLD, 26);
			Font font4 = new Font("Times New Roman", Font.BOLD, 60);
			
			Color myColor1 = new Color(204,204,204);
			Color myColor2 = new Color(255,102,102);
			Color myColor3 = new Color(51,51,51);
			
			 JTextField uisbn=new JTextField();
			    JTextField uname=new JTextField();
			    JTextField uauthor=new JTextField();
			    JTextField upubli=new JTextField();
			    JTextField udes=new JTextField();
			    
			    LineBorder border = new LineBorder(Color.RED, 2);
				 contentPane.setBorder(border);
		
			    
			
			    
			    //uisbn.setSize(230,28);
			 	uisbn.setBounds(290,112,230,28);
			    uisbn.setBorder(border);
			    contentPane.add(uisbn);
			    
			   // uname.setSize(230,28);
			 	uname.setBounds(290,192,230,28);
			    uname.setBorder(border);
			    contentPane.add(uname);
			    
			    //uauthor.setSize(230,28);
			    uauthor.setBounds(290,272,230,28);
			    uauthor.setBorder(border);
			    contentPane.add( uauthor);
				
				 //upubli.setSize(230,28);
			     upubli.setBounds(290,352,230,28);
				 upubli.setBorder(border);
				 contentPane.add(upubli);
			     
			     //udes.setSize(300,70);
			     udes.setBounds(290,432,230,28);
				 udes.setBorder(border);
				 contentPane.add(udes);
			     
			
			     
			     
		;	      

				

				JLabel uaddbook=new JLabel("UPDATE BOOK");
				JLabel ubookisbn=new JLabel("Book ISBN");
				JLabel ubookname=new JLabel("Book Name");
				JLabel upauthor=new JLabel("Book Author");
				JLabel uppubli=new JLabel("Publication");
		
				JLabel updes=new JLabel("Description");
				
				
				//uaddbook.setSize(300,30); 
				uaddbook.setBounds(40,30,300,30);
				uaddbook.setFont(font3);
				contentPane.add(uaddbook);
				
				//ubookisbn.setSize(300,30); 
				ubookisbn.setBounds(100,110,300,30);
				ubookisbn.setFont(font2);
				contentPane.add(ubookisbn);
				
				//ubookname.setSize(300,30); 
				ubookname.setBounds(100,190,300,30);
				ubookname.setFont(font2);
				contentPane.add(ubookname);
				
				//upauthor.setSize(300,30); 
				upauthor.setBounds(100,270,300,30);
				upauthor.setFont(font2);
				contentPane.add(upauthor);
				
				//uppubli.setSize(300,30); 
				uppubli.setBounds(100,350,300,30);
				uppubli.setFont(font2);
				contentPane.add(uppubli);
				
				//updes.setSize(300,70); 
				updes.setBounds(100,430,300,30);
				updes.setFont(font2);
				contentPane.add(updes);
				
			   // updatebookbtn.setSize(180,35);
		        updatebookbtn.setBounds(100,530,180,35);
		        updatebookbtn.setBackground(myColor2);
		        updatebookbtn.setForeground(Color.WHITE);
		        contentPane.add(updatebookbtn);
		        
		        
		        //updateclear.setSize(180,35);
		        updateclear.setBounds(335,530,180,35);
		        updateclear.setBackground(myColor3);
		        updateclear.setForeground(Color.WHITE);
		        contentPane.add(updateclear);
		        
		        //updatesearch.setSize(100,35);
		        updatesearch.setBounds(560,112,100,35);
		        updatesearch.setBackground(myColor2);
		        updatesearch.setForeground(Color.WHITE);
		        contentPane.add(updatesearch);
		        
		        //backbtn3.setSize(180,35);
		        backbtn3.setBounds(10,600,180,35);
		        backbtn3.setBackground(Color.BLUE);
		        backbtn3.setForeground(Color.WHITE);
		        contentPane.add(backbtn3);
		        
		  	    //backbtn3.setSize(180,35);
		        backbtn3.setBounds(10,600,180,35);
		        backbtn3.setBackground(Color.BLUE);
		        backbtn3.setForeground(Color.WHITE);
		        contentPane.add(backbtn3);
		        backbtn3.setBorder(border);
		        backbtn3.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						Home.main(new String[] {});
						dispose();
					}
				});
		        
		        updatebookbtn.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		               
		                String isbn = uisbn.getText();
		                String bookName = uname.getText();
		                String author = uauthor.getText();
		                String publication = upubli.getText();
		                String description = udes.getText();

		               

		                try {
		                    

	            			connection d = new connection();
	            			d.createConnection();
	            			Connection con = d.conn();

		                   
		                    String sql = "UPDATE addbook SET name = ?, author = ?, publication = ?, description = ? WHERE isbn = ?";

		                    // Create a PreparedStatement to safely execute the query
		                    PreparedStatement preparedStatement = con.prepareStatement(sql);
		                    preparedStatement.setString(1, bookName);
		                    preparedStatement.setString(2, author);
		                    preparedStatement.setString(3, publication);
		                    preparedStatement.setString(4, description);
		                    preparedStatement.setString(5, isbn);

		                    
		                    int rowsAffected = preparedStatement.executeUpdate();

		                    if (rowsAffected > 0) {
		                       
		                        JOptionPane.showMessageDialog(null, "Book information updated successfully.");
		                    } else {
		                      
		                        JOptionPane.showMessageDialog(null, "Error updating book information.");
		                    }

		                  
		                    preparedStatement.close();
		                    con.close();
		                } catch (SQLException ex) {
		                    ex.printStackTrace();
		                    JOptionPane.showMessageDialog(null, "Database connection error.");
		                }
		            }
		        });
		        
		        updateclear.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                // Clear the text fields
		                uisbn.setText("");
		                uname.setText("");
		                uauthor.setText("");
		                upubli.setText("");
		                udes.setText("");
		            
		            }
		        });
		        
		        updatesearch.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                
		                String searchISBN = uisbn.getText();

		               
		                try {
		                    

	            			connection d = new connection();
	            			d.createConnection();
	            			Connection con = d.conn();
		                    
		                    String sql = "SELECT name, author, publication, description FROM addbook WHERE isbn = ?";

		                   
		                    PreparedStatement preparedStatement = con.prepareStatement(sql);
		                    preparedStatement.setString(1, searchISBN);

		                  
		                    ResultSet resultSet = preparedStatement.executeQuery();

		                    if (resultSet.next()) {
		                        
		                        uname.setText(resultSet.getString("name"));
		                        uauthor.setText(resultSet.getString("author"));
		                        upubli.setText(resultSet.getString("publication"));
		                        udes.setText(resultSet.getString("description"));
		                    } else {
		                       
		                        uname.setText("");
		                        uauthor.setText("");
		                        upubli.setText("");
		                        udes.setText("");
		                        JOptionPane.showMessageDialog(null, "Book with ISBN " + searchISBN + " not found.");
		                    }

		                   
		                    resultSet.close();
		                    preparedStatement.close();
		                    con.close();
		                } catch (SQLException ex) {
		                    ex.printStackTrace();
		                    JOptionPane.showMessageDialog(null, "Database connection error.");
		                }
		            }
		        });

	}

}
