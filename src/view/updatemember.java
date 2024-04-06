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



public class updatemember extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					updatemember frame = new updatemember();
					frame.setVisible(true);
					frame.setLayout(null);
					frame.setTitle("UPDATE MEMBER");
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
	public updatemember() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);

		setContentPane(contentPane);
		
		 Color myColor = new Color(192, 192, 192);
		 contentPane.setBackground(myColor);
		 
		 JButton updatemembtn1=new JButton("UPDATE");
			JButton updatememclear=new JButton("CLEAR");
			JButton updatememsearch=new JButton("SEARCH");
			
			 Font font1 = new Font("Arial", Font.BOLD, 24);
				Font font2 = new Font("Arial", Font.BOLD, 20);
				Font font3 = new Font("Times New Roman", Font.BOLD, 26);
				Font font4 = new Font("Times New Roman", Font.BOLD, 60);
				
				Color myColor1 = new Color(204,204,204);
				Color myColor2 = new Color(255,102,102);
				Color myColor3 = new Color(51,51,51);
				
			    LineBorder border = new LineBorder(Color.RED, 2);
			    contentPane.setBorder(border);
			    
			    JButton backbtn5=new JButton("Back To Home");
			    
			    JTextField umemnic=new JTextField();
			    JTextField umemname=new JTextField();
			    JTextField umemid=new JTextField();
			    JTextField umemtele=new JTextField();
			    JTextField umememail=new JTextField();
		
			    
			   
			    
			    //umemnic.setSize(230,28);
			    umemnic.setBounds(290,112,230,28);
			    umemnic.setBorder(border);
			    contentPane.add( umemnic);
			    
			    //umemname.setSize(230,28);
			    umemname.setBounds(290,192,230,28);
			    umemname.setBorder(border);
			    contentPane.add(umemname);
			    
			   // umemid.setSize(230,28);
			    umemid.setBounds(290,272,230,28);
			    umemid.setBorder(border);
			    contentPane.add( umemid);
				
				//umememail.setSize(230,28);
				umememail.setBounds(290,352,230,28);
				umememail.setBorder(border);
				 contentPane.add(umememail);
			     
			    // umemtele.setSize(230,28);
			     umemtele.setBounds(290,432,230,28);
			     umemtele.setBorder(border);
			     contentPane.add(umemtele);
			     
			
			     
			     
		;	      

				

				JLabel upmem=new JLabel("UPDATE MEMBER");
				JLabel upmemnic=new JLabel("NIC");
				JLabel upmemname=new JLabel("Member Name");
				JLabel upmemberid=new JLabel("Member ID");
				JLabel upmemtele=new JLabel("Telephone");
		
				JLabel upmememail=new JLabel("Email");
				
				
				//upmem.setSize(300,30); 
				upmem.setBounds(40,30,300,30);
				upmem.setFont(font3);
				 contentPane.add(upmem);
				
				//upmemnic.setSize(300,30); 
				upmemnic.setBounds(100,110,300,30);
				upmemnic.setFont(font2);
				 contentPane.add(upmemnic);
				
				upmemname.setSize(300,30); 
				upmemname.setLocation(100,190);
				upmemname.setFont(font2);
				 contentPane.add(upmemname);
				
				//upmemberid.setSize(300,30); 
				upmemberid.setBounds(100,270,300,30);
				upmemberid.setFont(font2);
				 contentPane.add(upmemberid);
				
				//upmemtele.setSize(300,30); 
				upmemtele.setBounds(100,350,300,30);
				upmemtele.setFont(font2);
				 contentPane.add(upmemtele);
				
				//upmememail.setSize(300,30); 
				upmememail.setBounds(100,430,300,30);
				upmememail.setFont(font2);
				 contentPane.add(upmememail);
				
			   //updatemembtn1.setSize(180,35);
			    updatemembtn1.setBounds(100,530,180,35);
			    updatemembtn1.setBackground(myColor2);
			    updatemembtn1.setForeground(Color.WHITE);
			    contentPane.add(updatemembtn1);
		        
		       //updatememclear.setSize(180,35);
		        updatememclear.setBounds(335,530,180,35);
		        updatememclear.setBackground(myColor3);
		        updatememclear.setForeground(Color.WHITE);
		        contentPane.add(updatememclear);
		        
		       //updatememsearch.setSize(100,35);
		        updatememsearch.setBounds(560,112,100,35);
		        updatememsearch.setBackground(myColor2);
		        updatememsearch.setForeground(Color.WHITE);
		        contentPane.add(updatememsearch);
		        
		       // backbtn5.setSize(180,35);
		        backbtn5.setBounds(10,600,180,35);
		        backbtn5.setBackground(Color.BLUE);
		        backbtn5.setForeground(Color.WHITE);
		        contentPane.add(backbtn5);
		        backbtn5.setBorder(border);
		        backbtn5.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						Home.main(new String[] {});
						dispose();
					}
				});
		        
		        
		        updatemembtn1.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		               
		                String updatedName = umemname.getText().trim();
		                String updatedId = umemid.getText().trim();
		                String updatedTele = umemtele.getText().trim();
		                String updatedEmail = umememail.getText().trim();
		                String searchNic = umemnic.getText().trim(); 

		               
		                try {
		                   

	            			connection d = new connection();
	            			d.createConnection();
	            			Connection con = d.conn();
		                    
		                    String sql = "UPDATE addmember SET member_name = ?, member_id = ?, telephone = ?, email = ? WHERE nic = ?";

		                  
		                    PreparedStatement preparedStatement = con.prepareStatement(sql);
		                    preparedStatement.setString(1, updatedName);
		                    preparedStatement.setString(2, updatedId);
		                    preparedStatement.setString(3, updatedTele);
		                    preparedStatement.setString(4, updatedEmail);
		                    preparedStatement.setString(5, searchNic); 

		                  
		                    int rowsUpdated = preparedStatement.executeUpdate();

		                    if (rowsUpdated > 0) {
		                       
		                        JOptionPane.showMessageDialog(null, "Member information updated successfully.");
		                    } else {
		                       
		                        JOptionPane.showMessageDialog(null, "Failed to update member information.");
		                    }

		                   
		                    preparedStatement.close();
		                    con.close();
		                } catch (SQLException ex) {
		                    ex.printStackTrace();
		                    JOptionPane.showMessageDialog(null, "Database connection error.");
		                }
		            }
		        });
		        
		        
		        updatememclear.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                // Clear the text fields
		                umemnic.setText("");
		                umemname.setText("");
		                umemid.setText("");
		                umemtele.setText("");
		                umememail.setText("");
		            
		            
		            }               
		        });
		        
		        
		        updatememsearch.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		              
		                String searchNic = umemnic.getText().trim();

		               
		                
		                try {

	            			connection d = new connection();
	            			d.createConnection();
	            			Connection con = d.conn();
		                   
		                    String sql = "SELECT * FROM addmember WHERE nic = ?";

		                    
		                    PreparedStatement preparedStatement = con.prepareStatement(sql);
		                    preparedStatement.setString(1, searchNic);

		                   
		                    ResultSet resultSet = preparedStatement.executeQuery();

		                    if (resultSet.next()) {
		                     
		                        umemname.setText(resultSet.getString("member_name"));
		                        umemid.setText(resultSet.getString("member_id"));
		                        umemtele.setText(resultSet.getString("telephone"));
		                        umememail.setText(resultSet.getString("email"));
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
