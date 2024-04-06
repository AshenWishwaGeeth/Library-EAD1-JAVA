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
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import model.connection;

public class memberdashboard extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					memberdashboard frame = new memberdashboard();
					frame.setVisible(true);
					frame.setTitle("RETURN BOOK");
					frame.setLayout(null);
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
					frame.setBounds(100, 100, 1400, 700);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public memberdashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);

		setContentPane(contentPane);
		
	
		
		 JTextField risbn=new JTextField();
		 JTextField rname=new JTextField();
		 JTextField rmembid=new JTextField();
		 JTextField rreservedate=new JTextField();

	
		    
		Color myColor = new Color(192, 192, 192);
		contentPane.setBackground(myColor);
			 
		JButton backbtn8=new JButton("EXIT");
				
		 LineBorder border = new LineBorder(Color.RED, 2);
		 contentPane.setBorder(border);
		
	     JButton reservebookbtn=new JButton("RESERVE");
	     JButton reserveclear=new JButton("CLEAR");
		 JButton reservesearch=new JButton("SEARCH");
				
		 	Font font1 = new Font("Arial", Font.BOLD, 24);
			Font font2 = new Font("Arial", Font.BOLD, 20);
			Font font3 = new Font("Times New Roman", Font.BOLD, 26);
			Font font4 = new Font("Times New Roman", Font.BOLD, 60);
						
			Color myColor1 = new Color(204,204,204);
			Color myColor2 = new Color(255,102,102);
			Color myColor3 = new Color(51,51,51);
			 
			 
		    
		    //iisbn.setSize(230,28);
		 	risbn.setBounds(290,112,230,28);
		    risbn.setBorder(border);
		    contentPane.add(risbn);
		    
		    //iname.setSize(230,28);
		 	rname.setBounds(290,192,230,28);
		    rname.setBorder(border);
		    contentPane.add(rname);
		    
		    //imembid.setSize(230,28);
		    rmembid.setBounds(290,272,230,28);
		    rmembid.setBorder(border);
		    contentPane.add(rmembid);
			
			//iissudate.setSize(230,28);
			rreservedate.setBounds(290,352,230,28);
			rreservedate.setBorder(border);
			 contentPane.add(rreservedate);
		     
		  
		     
		
		     
		     
	;	      

			

			JLabel raddbook=new JLabel("RESERVE BOOK");
			JLabel rbookisbn=new JLabel("Book ISBN");
			JLabel rbookname=new JLabel("Book Name");
			JLabel rmemberid=new JLabel("Member ID");
			JLabel rrdate=new JLabel("Reserve Date");
	
	
			
			
			//iaddbook.setSize(300,30); 
			raddbook.setBounds(40,30,300,30);
			raddbook.setFont(font3);
			 contentPane.add(raddbook);
			
			//ibookisbn.setSize(300,30); 
			rbookisbn.setBounds(100,110,300,30);
			rbookisbn.setFont(font2);
			 contentPane.add(rbookisbn);
			
			//ibookname.setSize(300,30); 
			rbookname.setBounds(100,190,300,30);
			rbookname.setFont(font2);
			 contentPane.add(rbookname);
			
			//imemberid.setSize(300,30); 
			rmemberid.setBounds(100,270,300,30);
			rmemberid.setFont(font2);
			 contentPane.add(rmemberid);
			
			//iidate.setSize(300,30); 
			rrdate.setBounds(100,350,300,30);
			rrdate.setFont(font2);
			 contentPane.add(rrdate);
			
			//iddate.setSize(300,30); 
		
			
		    //issuebookbtn.setSize(180,35);
	        reservebookbtn.setBounds(100,530,180,35);
	        reservebookbtn.setBackground(myColor2);
	        reservebookbtn.setForeground(Color.WHITE);
	        contentPane.add(reservebookbtn);
	        
	        reservebookbtn.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                String isbn = risbn.getText();
	                String bookName = rname.getText();
	                String memberID = rmembid.getText();
	                String reserveDateStr = rreservedate.getText();

	                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	                Date reserveDate = null;
	                java.util.Date parsedDate;

	                try {
	                    parsedDate = dateFormat.parse(reserveDateStr);
	                    reserveDate = new Date(parsedDate.getTime());
	                } catch (ParseException ex) {
	                    ex.printStackTrace();
	                    JOptionPane.showMessageDialog(null, "Invalid date format. Use 'YYYY-MM-DD'.");
	                    return;
	                }

	                try {
	                    connection d = new connection();
	                    d.createConnection();
	                    Connection con = d.conn();

	                    String sql = "INSERT INTO reservebook (isbn, name, memberid, reservedate) VALUES (?, ?, ?, ?)";

	                    PreparedStatement preparedStatement = con.prepareStatement(sql);
	                    preparedStatement.setString(1, isbn);
	                    preparedStatement.setString(2, bookName);
	                    preparedStatement.setString(3, memberID);
	                    preparedStatement.setDate(4, reserveDate);

	                    int rowsAffected = preparedStatement.executeUpdate();

	                    if (rowsAffected > 0) {
	                        JOptionPane.showMessageDialog(null, "Book issuance recorded successfully.");

	                        risbn.setText("");
	                        rname.setText("");
	                        rmembid.setText("");
	                        rreservedate.setText("");
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
	

	        
	    
	        
	       // issueclear.setSize(180,35);
	        reserveclear.setBounds(335,530,180,35);
	        reserveclear.setBackground(myColor3);
	        reserveclear.setForeground(Color.WHITE);
	        contentPane.add(reserveclear);
	        
	        reserveclear.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                // Clear the text fields
	                risbn.setText("");
	                rname.setText("");
	                rmembid.setText("");
	                rreservedate.setText("");
	              
	            
	            }
	        });
	        
	       // issuesearch.setSize(100,35);
	        reservesearch.setBounds(560,112,100,35);
	        reservesearch.setBackground(myColor2);
	        reservesearch.setForeground(Color.WHITE);
	        contentPane.add(reservesearch);
	        
	        reservesearch.addActionListener(new ActionListener() {
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
	        

	       //backbtn1.setSize(180,35);
	        backbtn8.setBounds(10,600,180,35);
	        backbtn8.setBackground(Color.BLUE);
	        backbtn8.setForeground(Color.WHITE);
	        backbtn8.setBackground(Color.RED);
	        backbtn8.setForeground(Color.BLACK);
	        contentPane.add(backbtn8);
	    
	        backbtn8.setBorder(border);
	        backbtn8.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					login.main(new String[] {});
					dispose();
				}
			});
	        
	        
	        try {

    			connection d = new connection();
    			d.createConnection();
    			Connection con = d.conn();
	            Statement statement = con.createStatement();
	            ResultSet resultSet = statement.executeQuery("SELECT * FROM addbook"); 

	            // Create a table for jpl2
	            JTable table = new JTable(buildTableModel(resultSet));
	            JScrollPane scrollPane = new JScrollPane(table);
	            scrollPane.setBounds(750, 90, 600, 500);
	            contentPane.add(scrollPane);

	            resultSet.close();
	            statement.close();
	            con.close();
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	        }
	    }

	    
	    public static DefaultTableModel buildTableModel(ResultSet resultSet) throws SQLException {
	        java.sql.ResultSetMetaData metaData = resultSet.getMetaData();

	        // Create column names array
	        int columnCount = metaData.getColumnCount();
	        String[] columnNames = new String[columnCount];
	        for (int i = 1; i <= columnCount; i++) {
	            columnNames[i - 1] = metaData.getColumnName(i);
	        }

	        // Create data array
	        Object[][] data = new Object[30][columnCount];

	        int rowCount = 0;
	        while (resultSet.next() && rowCount < 30) { 
	            for (int i = 1; i <= columnCount; i++) {
	                data[rowCount][i - 1] = resultSet.getObject(i);
	            }
	            rowCount++;
	        }

	        return new DefaultTableModel(data, columnNames);
	    
	        
	        
	      
	        
	        
	        
	              
	            
	        
	        

	
	}

}
