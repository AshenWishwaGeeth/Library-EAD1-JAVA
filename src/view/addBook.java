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


import control.book;
import model.connection;

public class addBook extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addBook frame = new addBook();
					frame.setVisible(true);
					frame.setTitle("ADD BOOK");
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
	public addBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);


		setContentPane(contentPane);
		
		 JTextField isbn=new JTextField();
		    JTextField name=new JTextField();
		    JTextField author=new JTextField();
		    JTextField cate=new JTextField();
		    JTextField publi=new JTextField();
		    JTextField qty=new JTextField();
		    JTextField des=new JTextField();
		    
		    JButton addbookbtn=new JButton("ADD");
			JButton addclear=new JButton("CLEAR");
			JButton addsearch=new JButton("SEARCH");
			JButton adddelete=new JButton("DELETE");
			
			 LineBorder border = new LineBorder(Color.RED, 2);
			 contentPane.setBorder(border);
			 
			JButton backbtn=new JButton("Back To Home");
			
			
			 
			 Color myColor = new Color(192, 192, 192);
			 contentPane.setBackground(myColor);
			 
			
				Color myColor1 = new Color(204,204,204);
				Color myColor2 = new Color(255,102,102);
				Color myColor3 = new Color(51,51,51);
			 
			 Font font1 = new Font("Arial", Font.BOLD, 24);
				Font font2 = new Font("Arial", Font.BOLD, 20);
				Font font3 = new Font("Times New Roman", Font.BOLD, 26);
				Font font4 = new Font("Times New Roman", Font.BOLD, 60);
		    
		    isbn.setSize(230,28);
		 	isbn.setLocation(290,112);
		    isbn.setBorder(border);
		    contentPane.add(isbn);
		    
		    name.setSize(230,28);
		 	name.setLocation(290,162);
		    name.setBorder(border);
		    contentPane.add(name);
		    
		    author.setSize(230,28);
			author.setLocation(290,212);
		    author.setBorder(border);
		    contentPane.add(author);
			
			 cate.setSize(230,28);
		     cate.setLocation(290,262);
			 cate.setBorder(border);
			 contentPane.add(cate);
		     
		     publi.setSize(230,28);
		     publi.setLocation(290,312);
			 publi.setBorder(border);
			 contentPane.add(publi);
		     
		     qty.setSize(230,28);
		     qty.setLocation(290,362);
			 qty.setBorder(border);
			 contentPane.add(qty);
		     
		     des.setSize(230,100);
		     des.setLocation(290,412);
			 des.setBorder(border);
			 contentPane.add(des);
		     
		     
	;	      

			

			JLabel addbook=new JLabel("ADD BOOK");
			JLabel bookisbn=new JLabel("Book ISBN");
			JLabel bookname=new JLabel("Book Name");
			JLabel bookauthor=new JLabel("Book Author");
			JLabel bookcategory=new JLabel("Category");
			JLabel bookpublication=new JLabel("Publication");
			JLabel quantity=new JLabel("Quantity");
			JLabel description=new JLabel("Description");
			
			
			
			//addbook.setSize(300,30); 
			addbook.setBounds(40,30,300,30);
			addbook.setFont(font3);
			contentPane.add(addbook);
			
			//bookisbn.setSize(300,30); 
			bookisbn.setBounds(100,110,300,30);
			bookisbn.setFont(font2);
			contentPane.add(bookisbn);
			
			//bookname.setSize(300,30); 
			bookname.setBounds(100,160,300,30);
			bookname.setFont(font2);
			contentPane.add(bookname);
			
			//bookauthor.setSize(300,30); 
			bookauthor.setBounds(100,210,300,30);
			bookauthor.setFont(font2);
			contentPane.add(bookauthor);
			
			//bookcategory.setSize(300,30); 
			bookcategory.setBounds(100,260,300,30);
			bookcategory.setFont(font2);
			contentPane.add(bookcategory);
			
			//bookpublication.setSize(300,30); 
			bookpublication.setBounds(100,310,300,30);
			bookpublication.setFont(font2);
			contentPane.add(bookpublication);
			
			//quantity.setSize(300,30); 
			quantity.setBounds(100,360,300,30);
			quantity.setFont(font2);
			contentPane.add(quantity);
			
			//description.setSize(300,30); 
			description.setBounds(100,410,300,30);
			description.setFont(font2);
			contentPane.add(description);
			
		    //addbookbtn.setSize(180,35);
	        addbookbtn.setBounds(100,530,180,35);
	        addbookbtn.setBackground(myColor2);
	        addbookbtn.setForeground(Color.WHITE);
	        contentPane.add(addbookbtn);
	        
	        //addclear.setSize(180,35);
	        addclear.setBounds(335,530,180,35);
	        addclear.setBackground(myColor3);
	        addclear.setForeground(Color.WHITE);
	        contentPane.add(addclear);
	        
	        //addsearch.setSize(100,35);
	        addsearch.setBounds(560,112,100,35);
	        addsearch.setBackground(myColor2);
	        addsearch.setForeground(Color.WHITE);
	        contentPane.add(addsearch);
	        
	        adddelete.setBounds(560,162,100,35);
	        adddelete.setBackground(myColor2);
	        adddelete.setForeground(Color.WHITE);
	        contentPane.add(adddelete);
	        
	     // ...

	     // ...

	        adddelete.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String deleteISBN = isbn.getText();

	                // Show a confirmation dialog
	                int dialogResult = JOptionPane.showConfirmDialog(null,
	                    "Are you sure you want to delete the book with ISBN " + deleteISBN + "?",
	                    "Confirm Delete",
	                    JOptionPane.YES_NO_OPTION);

	                if (dialogResult == JOptionPane.YES_OPTION) {
	                    // User clicked "Yes," proceed with the deletion
	                    try {
	                        connection d = new connection();
	                        d.createConnection();
	                        Connection con = d.conn();

	                        // Create a SQL DELETE query to remove the book with the specified ISBN
	                        String deleteQuery = "DELETE FROM addbook WHERE isbn = ?";

	                        PreparedStatement preparedStatement = con.prepareStatement(deleteQuery);
	                        preparedStatement.setString(1, deleteISBN);

	                        // Execute the DELETE query
	                        int rowsAffected = preparedStatement.executeUpdate();

	                        if (rowsAffected > 0) {
	                            JOptionPane.showMessageDialog(null, "Book with ISBN " + deleteISBN + " deleted successfully.");

	                            // Clear the text fields after deletion
	                            isbn.setText("");
	                            name.setText("");
	                            author.setText("");
	                            cate.setText("");
	                            publi.setText("");
	                            qty.setText("");
	                            des.setText("");
	                        } else {
	                            JOptionPane.showMessageDialog(null, "Book with ISBN " + deleteISBN + " not found.");
	                        }

	                        preparedStatement.close();
	                        con.close();
	                    } catch (SQLException ex) {
	                        ex.printStackTrace();
	                        JOptionPane.showMessageDialog(null, "Database connection error.");
	                    }
	                }
	            }
	        });

	        // ...


	        // ...

	        
	        //backbtn.setSize(180,35);
	        backbtn.setBounds(10,600,180,35);
	        backbtn.setBackground(Color.BLUE);
	        backbtn.setForeground(Color.WHITE);
	        contentPane.add(backbtn);
	    
	        backbtn.setBorder(border);
	        backbtn.setBorder(border);
	        backbtn.addActionListener(new ActionListener() {
				
						@Override
						public void actionPerformed(ActionEvent e) {
							Home.main(new String[] {});
							dispose();
						}
					});
	        
	        addbookbtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					//int qty = Integer.parseInt(quantity.getText());
					
					book b = new book();
					b.addBook(isbn.getText(),name.getText(),author.getText(),cate.getText(),publi.getText(),qty.getText(),des.getText());
					
				}
			});
	        
	        addclear.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                // Clear the text fields
	                isbn.setText("");
	                name.setText("");
	                author.setText("");
	                cate.setText("");
	                publi.setText("");
	                qty.setText("");
	                des.setText("");
	            }
	        });
	        
	        
	        addsearch.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	               
	                String searchISBN = isbn.getText();

	               
	              

	                try {
	               
	                	
	            			connection d = new connection();
	            			d.createConnection();
	            			Connection con = d.conn();
	                 
	                    String sql = "SELECT * FROM addbook WHERE isbn = ?";

	                
	                    PreparedStatement preparedStatement = con.prepareStatement(sql);
	                    preparedStatement.setString(1, searchISBN);

	                
	                    ResultSet resultSet = preparedStatement.executeQuery();

	                    if (resultSet.next()) {
	                 
	                        name.setText(resultSet.getString("name"));
	                        author.setText(resultSet.getString("author"));
	                        cate.setText(resultSet.getString("category"));
	                        publi.setText(resultSet.getString("publication"));
	                        qty.setText(resultSet.getString("quantity"));
	                        des.setText(resultSet.getString("description"));
	                    } else {
	                       
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
