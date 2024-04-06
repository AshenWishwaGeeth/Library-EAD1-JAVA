package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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



public class issuebook extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					issuebook frame = new issuebook();
					frame.setVisible(true);
					frame.setTitle("IssueBook");
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
	public issuebook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		

		setContentPane(contentPane);
		
		 JTextField iisbn=new JTextField();
		    JTextField iname=new JTextField();
		    JTextField imembid=new JTextField();
		    JTextField iissudate=new JTextField();
		    JTextField iduedate=new JTextField();
	
		    
			 Color myColor = new Color(192, 192, 192);
			 contentPane.setBackground(myColor);
			 
				JButton backbtn1=new JButton("Back To Home");
				
				 LineBorder border = new LineBorder(Color.RED, 2);
				 contentPane.setBorder(border);
				 
				 JButton issuebookbtn=new JButton("ISSUE");
					JButton issueclear=new JButton("CLEAR");
					JButton issuesearch=new JButton("SEARCH");
					
					 Font font1 = new Font("Arial", Font.BOLD, 24);
						Font font2 = new Font("Arial", Font.BOLD, 20);
						Font font3 = new Font("Times New Roman", Font.BOLD, 26);
						Font font4 = new Font("Times New Roman", Font.BOLD, 60);
						
						Color myColor1 = new Color(204,204,204);
						Color myColor2 = new Color(255,102,102);
						Color myColor3 = new Color(51,51,51);
			 
			 
		    
		    //iisbn.setSize(230,28);
		 	iisbn.setBounds(290,112,230,28);
		    iisbn.setBorder(border);
		    contentPane.add(iisbn);
		    
		    //iname.setSize(230,28);
		 	iname.setBounds(290,192,230,28);
		    iname.setBorder(border);
		    contentPane.add(iname);
		    
		    //imembid.setSize(230,28);
		    imembid.setBounds(290,272,230,28);
		    imembid.setBorder(border);
		    contentPane.add(imembid);
			
			//iissudate.setSize(230,28);
			iissudate.setBounds(290,352,230,28);
			iissudate.setBorder(border);
			 contentPane.add(iissudate);
		     
		     //iduedate.setSize(230,28);
		     iduedate.setBounds(290,432,230,28);
		     iduedate.setBorder(border);
		     contentPane.add(iduedate);
		     
		
		     
		     
	;	      

			

			JLabel iaddbook=new JLabel("ISSUE BOOK");
			JLabel ibookisbn=new JLabel("Book ISBN");
			JLabel ibookname=new JLabel("Book Name");
			JLabel imemberid=new JLabel("Member ID");
			JLabel iidate=new JLabel("Issue Date");
	
			JLabel iddate=new JLabel("Due Date");
			
			
			//iaddbook.setSize(300,30); 
			iaddbook.setBounds(40,30,300,30);
			iaddbook.setFont(font3);
			 contentPane.add(iaddbook);
			
			//ibookisbn.setSize(300,30); 
			ibookisbn.setBounds(100,110,300,30);
			ibookisbn.setFont(font2);
			 contentPane.add(ibookisbn);
			
			//ibookname.setSize(300,30); 
			ibookname.setBounds(100,190,300,30);
			ibookname.setFont(font2);
			 contentPane.add(ibookname);
			
			//imemberid.setSize(300,30); 
			imemberid.setBounds(100,270,300,30);
			imemberid.setFont(font2);
			 contentPane.add(imemberid);
			
			//iidate.setSize(300,30); 
			iidate.setBounds(100,350,300,30);
			iidate.setFont(font2);
			 contentPane.add(iidate);
			
			//iddate.setSize(300,30); 
			iddate.setBounds(100,430,300,30);
			iddate.setFont(font2);
			 contentPane.add(iddate);
			
		    //issuebookbtn.setSize(180,35);
	        issuebookbtn.setBounds(100,530,180,35);
	        issuebookbtn.setBackground(myColor2);
	        issuebookbtn.setForeground(Color.WHITE);
	        contentPane.add(issuebookbtn);
	        
	       // issueclear.setSize(180,35);
	        issueclear.setBounds(335,530,180,35);
	        issueclear.setBackground(myColor3);
	        issueclear.setForeground(Color.WHITE);
	        contentPane.add(issueclear);
	        
	       // issuesearch.setSize(100,35);
	        issuesearch.setBounds(560,112,100,35);
	        issuesearch.setBackground(myColor2);
	        issuesearch.setForeground(Color.WHITE);
	        contentPane.add(issuesearch);
	        

	       //backbtn1.setSize(180,35);
	        backbtn1.setBounds(10,600,180,35);
	        backbtn1.setBackground(Color.BLUE);
	        backbtn1.setForeground(Color.WHITE);
	        contentPane.add(backbtn1);
	    
	        backbtn1.setBorder(border);
	        backbtn1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Home.main(new String[] {});
					dispose();
				}
			});
	        
	        
	        issuebookbtn.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            
	                String isbn = iisbn.getText();
	                String bookName = iname.getText();
	                String memberID = imembid.getText();
	                String issueDateStr = iissudate.getText(); 
	                String dueDateStr = iduedate.getText(); 
	                
	                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	                Date issueDate = null;
	                Date dueDate = null;

	                try {
	                    issueDate = new java.sql.Date(dateFormat.parse(issueDateStr).getTime());
	                    dueDate = new java.sql.Date(dateFormat.parse(dueDateStr).getTime());
	                } catch (ParseException ex) {
	                    ex.printStackTrace();
	                    JOptionPane.showMessageDialog(null, "Invalid date format. Use 'YYYY-MM-DD'.");
	                    return;
	                }

	                // Database connection parameters
	                
	                try {
	               
	                	connection d = new connection();
	        			d.createConnection();
	        			Connection con = d.conn();

	                   
	                    String sql = "INSERT INTO issuebook (isbn, book_name, member_id, issue_date, due_date) VALUES (?, ?, ?, ?, ?)";

	                    PreparedStatement preparedStatement = con.prepareStatement(sql);
	                    preparedStatement.setString(1, isbn);
	                    preparedStatement.setString(2, bookName);
	                    preparedStatement.setString(3, memberID);
	                    preparedStatement.setDate(4, issueDate); 
	                    preparedStatement.setDate(5, dueDate); 

	                
	                    int rowsAffected = preparedStatement.executeUpdate();

	                    if (rowsAffected > 0) {
	                       
	                        JOptionPane.showMessageDialog(null, "Book issuance recorded successfully.");

	                        // Clear the text fields
	                        iisbn.setText("");
	                        iname.setText("");
	                        imembid.setText("");
	                        iissudate.setText("");
	                        iduedate.setText("");
	                    } else {
	                      
	                        JOptionPane.showMessageDialog(null, "Error recording book issuance.");
	                    }

	                   
	                    preparedStatement.close();
	                    con.close();
	                } catch (SQLException ex) {
	                    ex.printStackTrace();
	                    JOptionPane.showMessageDialog(null, "Database connection error.");
	                }
	            }
	        });
	        
	        issueclear.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                // Clear the text fields
	                iisbn.setText("");
	                iname.setText("");
	                imembid.setText("");
	                iissudate.setText("");
	                iduedate.setText("");
	            
	            }
	        });
	        
	        issuesearch.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	         
	                String searchISBN = iisbn.getText();

	               

	                try {
	                   
	                	connection d = new connection();
	        			d.createConnection();
	        			Connection con = d.conn();
	                   
	                    String sql = "SELECT name FROM addbook WHERE isbn = ?";

	                   
	                    PreparedStatement preparedStatement = con.prepareStatement(sql);
	                    preparedStatement.setString(1, searchISBN);

	                  
	                    ResultSet resultSet = preparedStatement.executeQuery();

	                    if (resultSet.next()) {
	                      
	                        iname.setText(resultSet.getString("name"));
	                    } else {
	                        
	                        iname.setText("");
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
