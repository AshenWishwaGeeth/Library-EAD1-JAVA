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



public class addmember extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addmember frame = new addmember();
					frame.setVisible(true);
					frame.setTitle("addmember");
					frame.setLayout(null);
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
			
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public addmember() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
   
		setContentPane(contentPane);
		
		 Color myColor = new Color(192, 192, 192);
		 contentPane.setBackground(myColor);
		 
		 JButton addmembtn1=new JButton("ADD");
			JButton addmemclear=new JButton("CLEAR");
			JButton addmemsearch=new JButton("SEARCH");
			
			 Font font1 = new Font("Arial", Font.BOLD, 24);
				Font font2 = new Font("Arial", Font.BOLD, 20);
				Font font3 = new Font("Times New Roman", Font.BOLD, 26);
				Font font4 = new Font("Times New Roman", Font.BOLD, 60);
				
				Color myColor1 = new Color(204,204,204);
				Color myColor2 = new Color(255,102,102);
				Color myColor3 = new Color(51,51,51);
				
			    LineBorder border = new LineBorder(Color.RED, 2);
			    contentPane.setBorder(border);
			    
			    JButton backbtn4=new JButton("Back To Home");
			
		
		   JTextField addmemnic=new JTextField();
		    JTextField addmemname=new JTextField();
		    JTextField addmemid=new JTextField();
		    JTextField addmemusername=new JTextField();
		    JTextField addmempass=new JTextField();
		    JTextField addmemtele=new JTextField();
		    JTextField addmememail=new JTextField();
		    
		    //addmemnic.setSize(230,28);
		    addmemnic.setBounds(290,112,230,28);
		    addmemnic.setBorder(border);
		    contentPane.add(addmemnic);
		    
		    //addmemname.setSize(230,28);
		 	addmemname.setBounds(290,162,230,28);
		    addmemname.setBorder(border);
		    contentPane.add(addmemname);
		    
		    //addmemid.setSize(230,28);
			addmemid.setBounds(290,212,230,28);
		    addmemid.setBorder(border);
		    contentPane.add(addmemid);
			
			//addmemusername.setSize(230,28);
			addmemusername.setBounds(290,262,230,28);
			addmemusername.setBorder(border);
			 contentPane.add(addmemusername);
		     
		    // addmempass.setSize(230,28);
		     addmempass.setBounds(290,312,230,28);
		     addmempass.setBorder(border);
		     contentPane.add(addmempass);
		     
		     //addmemtele.setSize(230,28);
		     addmemtele.setBounds(290,362,230,28);
		     addmemtele.setBorder(border);
		     contentPane.add( addmemtele);
		     
		     //addmememail.setSize(230,100);
		     addmememail.setBounds(290,412,230,28);
		     addmememail.setBorder(border);
		     contentPane.add(addmememail);
		     
		     
	;	      

			

			JLabel addmember=new JLabel("ADD MEMBER");
			JLabel addmembernic=new JLabel("Member Nic");
			JLabel addmembername=new JLabel("Member Name");
			JLabel addmemberid=new JLabel("Member ID");
			JLabel addmemberusname=new JLabel("Username");
			JLabel addmemberpass=new JLabel("Password");
			JLabel addmembertele=new JLabel("Telephone");
			JLabel addmemberemail=new JLabel("Email");
			
			
			
			//addmember.setSize(300,30); 
			addmember.setBounds(40,30,300,30);
			addmember.setFont(font3);
			 contentPane.add(addmember);
			
			//addmembernic.setSize(300,30); 
			addmembernic.setBounds(100,110,300,30);
			addmembernic.setFont(font2);
			 contentPane.add(addmembernic);
			
			//addmembername.setSize(300,30); 
			addmembername.setBounds(100,160,300,30);
			addmembername.setFont(font2);
			 contentPane.add(addmembername);
			
			//addmemberid.setSize(300,30); 
			addmemberid.setBounds(100,210,300,30);
			addmemberid.setFont(font2);
			 contentPane.add(addmemberid);
			
			 //addmemberusname.setSize(300,30); 
			 addmemberusname.setBounds(100,260,300,30);
			 addmemberusname.setFont(font2);
			 contentPane.add( addmemberusname);
			
			 //addmemberpass.setSize(300,30); 
			 addmemberpass.setBounds(100,310,300,30);
			 addmemberpass.setFont(font2);
			 contentPane.add( addmemberpass);
			
			//addmembertele.setSize(300,30); 
			addmembertele.setBounds(100,360,300,30);
			addmembertele.setFont(font2);
			 contentPane.add(addmembertele);
			
			 //addmemberemail.setSize(300,30); 
			 addmemberemail.setBounds(100,410,300,30);
			 addmemberemail.setFont(font2);
			 contentPane.add( addmemberemail);
			
		   // addmembtn1.setSize(180,35);
	        addmembtn1.setBounds(100,530,180,35);
	        addmembtn1.setBackground(myColor2);
	        addmembtn1.setForeground(Color.WHITE);
	        contentPane.add(addmembtn1);
	        
	       // addmemclear.setSize(180,35);
	        addmemclear.setBounds(335,530,180,35);
	        addmemclear.setBackground(myColor3);
	        addmemclear.setForeground(Color.WHITE);
	        contentPane.add(addmemclear);
	        
	        //addmemsearch.setSize(100,35);
	        addmemsearch.setBounds(560,112,100,35);
	        addmemsearch.setBackground(myColor2);
	        addmemsearch.setForeground(Color.WHITE);
	        contentPane.add(addmemsearch);
	        
	        //backbtn4.setSize(180,35);
	        backbtn4.setBounds(10,600,180,35);
	        backbtn4.setBackground(Color.BLUE);
	        backbtn4.setForeground(Color.WHITE);
	        contentPane.add(backbtn4);
	        
	    
			 
			 // backbtn4.setSize(180,35);
		        backbtn4.setBounds(10,600,180,35);
		        backbtn4.setBackground(Color.BLUE);
		        backbtn4.setForeground(Color.WHITE);
		        contentPane.add(backbtn4);
		        backbtn4.setBorder(border);
		        backbtn4.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						Home.main(new String[] {});
						dispose();
					}
				});
		      
		        addmembtn1.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		               
		                String nic = addmemnic.getText();
		                String memberName = addmemname.getText();
		                String memberID = addmemid.getText();
		                String username = addmemusername.getText();
		                String password = addmempass.getText();
		                String telephone = addmemtele.getText();
		                String email = addmememail.getText();

		               
		                if (!isValidTelephone(telephone)) {
		                    JOptionPane.showMessageDialog(null, "Invalid telephone number.");
		                    return; // Do not proceed with insertion
		                }

		               
		                
		                try {
		                  

	            			connection d = new connection();
	            			d.createConnection();
	            			Connection con = d.conn();

		                
		                    String sql = "INSERT INTO addmember(nic, member_name, member_id, username, password, telephone, email) VALUES (?, ?, ?, ?, ?, ?, ?)";

		                    
		                    PreparedStatement preparedStatement = con.prepareStatement(sql);
		                    preparedStatement.setString(1, nic);
		                    preparedStatement.setString(2, memberName);
		                    preparedStatement.setString(3, memberID);
		                    preparedStatement.setString(4, username);
		                    preparedStatement.setString(5, password);
		                    preparedStatement.setString(6, telephone);
		                    preparedStatement.setString(7, email);

		                   
		                    int rowsAffected = preparedStatement.executeUpdate();

		                    if (rowsAffected > 0) {
		                        
		                        JOptionPane.showMessageDialog(null, "Member added successfully.");
		                        
		                     
		                        addmemnic.setText("");
		                        addmemname.setText("");
		                        addmemid.setText("");
		                        addmemusername.setText("");
		                        addmempass.setText("");
		                        addmemtele.setText("");
		                        addmememail.setText("");
		                    } else {
		                       
		                        JOptionPane.showMessageDialog(null, "Error adding member.");
		                    }

		                 
		                    preparedStatement.close();
		                    con.close();
		                } catch (SQLException ex) {
		                    ex.printStackTrace();
		                    JOptionPane.showMessageDialog(null, "Database connection error.");
		                }
		            }

		           
		            private boolean isValidTelephone(String telephone) {
		                return telephone.matches("^\\d{10}$");
		            }
		        });
		        
		        
		        addmemclear.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                // Clear the text fields
		                addmemnic.setText("");
		                addmemname.setText("");
		                addmemid.setText("");
		                addmemusername.setText("");
		                addmempass.setText("");
		                addmemtele.setText("");
		                addmememail.setText("");
		            
		            }
		        });
		        
		        addmemsearch.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		               
		                String searchNic = addmemnic.getText().trim();

		              
		                try {
		                   
		                	connection d = new connection();
	            			d.createConnection();
	            			Connection con = d.conn();

		                    String sql = "SELECT * FROM addmember WHERE nic = ?";

		                   
		                    PreparedStatement preparedStatement = con.prepareStatement(sql);
		                    preparedStatement.setString(1, searchNic);

		                   
		                    ResultSet resultSet = preparedStatement.executeQuery();

		                    if (resultSet.next()) {
		                       
		                        addmemname.setText(resultSet.getString("member_name"));
		                        addmemid.setText(resultSet.getString("member_id"));
		                        addmemusername.setText(resultSet.getString("username"));
		                        addmempass.setText(resultSet.getString("password"));
		                        addmemtele.setText(resultSet.getString("telephone"));
		                        addmememail.setText(resultSet.getString("email"));
		                    } else {
		                       
		                        JOptionPane.showMessageDialog(null, "Member not found.");
		                    }

		                  
		                    preparedStatement.close();
		                    resultSet.close();
		                    con.close();
		                } catch (SQLException ex) {
		                    ex.printStackTrace();
		                    JOptionPane.showMessageDialog(null, "Database connection error.");
		                }
		            }
		        });

		        


	
	}

}
