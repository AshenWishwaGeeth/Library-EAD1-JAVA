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

import model.connection;



public class returnbook extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					returnbook frame = new returnbook();
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
	public returnbook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);

		setContentPane(contentPane);
		
		
			JTextField risbn=new JTextField();
		    JTextField rname=new JTextField();
		    JTextField rid=new JTextField();
		    JTextField reidate=new JTextField();
		    JTextField reddate=new JTextField();
		    JTextField rerdate=new JTextField();
		    
			JButton backbtn2=new JButton("Back To Home");
	
			 Color myColor = new Color(192, 192, 192);
			 contentPane.setBackground(myColor);
			 
			 LineBorder border = new LineBorder(Color.RED, 2);
			 contentPane.setBorder(border);
			 
			 	Font font1 = new Font("Arial", Font.BOLD, 24);
				Font font2 = new Font("Arial", Font.BOLD, 20);
				Font font3 = new Font("Times New Roman", Font.BOLD, 26);
				Font font4 = new Font("Times New Roman", Font.BOLD, 60);
				
				Color myColor1 = new Color(204,204,204);
				Color myColor2 = new Color(255,102,102);
				Color myColor3 = new Color(51,51,51);
				
				JButton returnbookbtn=new JButton("RETURN");
				JButton returnclear=new JButton("CLEAR");
				JButton returnsearch=new JButton("SEARCH");
				
		    
		    //risbn.setSize(230,28);
		 	risbn.setBounds(290,142,230,28);
		    risbn.setBorder(border);
		    contentPane.add(risbn);
		    
		    //rname.setSize(230,28);
		 	rname.setBounds(290,202,230,28);
		    rname.setBorder(border);
		    contentPane.add(rname);
		    
		    //rid.setSize(230,28);
			rid.setBounds(290,262,230,28);
		    rid.setBorder(border);
		    contentPane.add(rid);
			
			 //reidate.setSize(230,28);
		     reidate.setBounds(290,322,230,28);
			 reidate.setBorder(border);
			 contentPane.add(reidate);
		     
		     //reddate.setSize(230,28);
		     reddate.setBounds(290,382,230,28);
			 reddate.setBorder(border);
			 contentPane.add(reddate);
		     
		     //rerdate.setSize(230,28);
		     rerdate.setBounds(290,442,230,28);
			 rerdate.setBorder(border);
			 contentPane.add(rerdate);
		     
		
		     
		     
	;	      

			

			JLabel raddbook=new JLabel("RETURN BOOK");
			JLabel rbookisbn=new JLabel("Book ISBN");
			JLabel rbookname=new JLabel("Book Name");
			JLabel rmemberid=new JLabel("Member ID");
			JLabel ridate=new JLabel("Issue Date");
	
			JLabel rddate=new JLabel("Due Date");
			JLabel rrdate=new JLabel("Return Date");
			
			//raddbook.setSize(300,30); 
			raddbook.setBounds(40,30,300,30);
			raddbook.setFont(font3);
			contentPane.add(raddbook);
			
			//rbookisbn.setSize(300,30); 
			rbookisbn.setBounds(100,138,300,30);
			rbookisbn.setFont(font2);
			contentPane.add(rbookisbn);
			
			//rbookname.setSize(300,30); 
			rbookname.setBounds(100,198,300,30);
			rbookname.setFont(font2);
			contentPane.add(rbookname);
			
			//rmemberid.setSize(300,30); 
			rmemberid.setBounds(100,258,300,30);
			rmemberid.setFont(font2);
			contentPane.add(rmemberid);
			
			//ridate.setSize(300,30); 
			ridate.setBounds(100,318,300,30);
			ridate.setFont(font2);
			contentPane.add(ridate);
			
			//rddate.setSize(300,30); 
			rddate.setBounds(100,378,300,30);
			rddate.setFont(font2);
			contentPane.add(rddate);
			
			//rrdate.setSize(300,30); 
			rrdate.setBounds(100,442,300,30);
			rrdate.setFont(font2);
			contentPane.add(rrdate);
			
		    //returnbookbtn.setSize(180,35);
		    returnbookbtn.setBounds(100,530,180,35);
		    returnbookbtn.setBackground(myColor2);
		    returnbookbtn.setForeground(Color.WHITE);
		    contentPane.add(returnbookbtn);
	        
	       // returnclear.setSize(180,35);
	        returnclear.setBounds(335,530,180,35);
	        returnclear.setBackground(myColor3);
	        returnclear.setForeground(Color.WHITE);
	        contentPane.add( returnclear);
	        
	       // returnsearch.setSize(100,35);
	        returnsearch.setBounds(560,137,100,35);
	        returnsearch.setBackground(myColor2);
	        returnsearch.setForeground(Color.WHITE);
	        contentPane.add(returnsearch);
	        
	    	
	        //backbtn2.setSize(180,35);
	        backbtn2.setBounds(10,600,100,35);
	        backbtn2.setBackground(Color.BLUE);
	        backbtn2.setForeground(Color.WHITE);
	        contentPane.add(backbtn2);
	        
	        backbtn2.setBorder(border);
	        backbtn2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Home.main(new String[] {});
					dispose();
				}
			});
	        
	        returnbookbtn.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                // Get the values from the text fields
	                String returnISBN = risbn.getText();
	                String memberID = rid.getText();
	                String issueDateStr = reidate.getText();
	                String dueDateStr = reddate.getText();
	                String returnDateStr = rerdate.getText();

	               
	                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	                Date issueDate = null;
	                Date dueDate = null;
	                Date returnDate = null;

	                try {
	                    issueDate = new java.sql.Date(dateFormat.parse(issueDateStr).getTime());
	                    dueDate = new java.sql.Date(dateFormat.parse(dueDateStr).getTime());
	                    returnDate = new java.sql.Date(dateFormat.parse(returnDateStr).getTime());
	                } catch (ParseException ex) {
	                    ex.printStackTrace();
	                    JOptionPane.showMessageDialog(null, "Invalid date format. Use 'YYYY-MM-DD'.");
	                    return;
	                }

	               
	              

	                try {
	                    

            			connection d = new connection();
            			d.createConnection();
            			Connection con = d.conn();

	                   
	                    String sql = "INSERT INTO returnbook (isbn, member_id, issue_date, due_date, return_date) VALUES (?, ?, ?, ?, ?)";

	                    
	                    PreparedStatement preparedStatement = con.prepareStatement(sql);
	                    preparedStatement.setString(1, returnISBN);
	                    preparedStatement.setString(2, memberID);
	                    preparedStatement.setDate(3, issueDate);
	                    preparedStatement.setDate(4, dueDate);
	                    preparedStatement.setDate(5, returnDate);

	                   
	                    int rowsAffected = preparedStatement.executeUpdate();

	                    if (rowsAffected > 0) {
	                       
	                        JOptionPane.showMessageDialog(null, "Return book data recorded successfully.");
	                    } else {
	                       
	                        JOptionPane.showMessageDialog(null, "Failed to record return book data.");
	                    }

	                   
	                    preparedStatement.close();
	                    con.close();
	                } catch (SQLException ex) {
	                    ex.printStackTrace();
	                    JOptionPane.showMessageDialog(null, "Database connection error.");
	                }
	            }
	        });
	        
	        returnclear.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                // Clear the text fields
	                risbn.setText("");
	                rname.setText("");
	                rid.setText("");
	                reidate.setText("");
	                reddate.setText("");
	                rerdate.setText("");
	              
	            }
	        });
	        
	        returnsearch.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                
	                String searchISBN = risbn.getText();

	                
	               

	                try {

            			connection d = new connection();
            			d.createConnection();
            			Connection con = d.conn();
	                   
	                    String sql = "SELECT name FROM addbook WHERE isbn = ?";

	                   
	                    PreparedStatement preparedStatement = con.prepareStatement(sql);
	                    preparedStatement.setString(1, searchISBN);

	                   
	                    ResultSet resultSet = preparedStatement.executeQuery();

	                    if (resultSet.next()) {
	                       
	                        rname.setText(resultSet.getString("name"));
	                    } else {
	                        
	                        rname.setText("");
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
