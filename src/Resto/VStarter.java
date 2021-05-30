package Resto;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class VStarter extends Frame{
	
	public VStarter()
	{
		
		
		Frame f=new Frame("Restaurant");
	    
		Label l = new Label("Select Your Favourite Dish");
		
		l.setBounds(75,75,500,30);
		Font myFont = new Font("Serif",Font.BOLD,20);
		l.setFont(myFont);
		f.add(l);
		
	    Button b1 = new Button("Veg 65");
	    Button b2 = new Button("Paneer 65");
	    Button b3 = new Button("Gobi Manchuria");
	    Button b4 = new Button("Back");
	    b1.setBounds(100,150,150,40);
	    b2.setBounds(100,200,150,40);
	    b3.setBounds(100,250,150,40);
	    b4.setBounds(10,30,60,30);

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true);
	    
	    
	    b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a)
			{
				f.dispose();
			}
		});
		
	    
	    b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
			
			}
		});
	    
	    
	    b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try {
					
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_name","root","akhil@123");
					
					Statement myStmt1 = myConn.createStatement();
					
					ResultSet myRs = myStmt1.executeQuery("select * from vstarter");
					
					
					while(true)
					{
						myRs.next();
						if(myRs.getString("item_name").equals(b1.getActionCommand()))
						{
							String q= "insert into bill values("+myRs.getString("item_no")+","+"'"+myRs.getString("item_name")+"'"+","+myRs.getString("price")+")";
							myStmt1.execute(q);
							break;
						}
					}	
					
					
					myConn.close();
					
					
					
				}
				catch(Exception exc)
				{
					exc.printStackTrace();
				}
			
			}
		});
	    
	    b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try {
					
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_name","root","akhil@123");
					
					Statement myStmt1 = myConn.createStatement();
					
					ResultSet myRs = myStmt1.executeQuery("select * from vstarter");
					
					
					while(true)
					{
						myRs.next();
						if(myRs.getString("item_name").equals(b2.getActionCommand()))
						{
							String q= "insert into bill values("+myRs.getString("item_no")+","+"'"+myRs.getString("item_name")+"'"+","+myRs.getString("price")+")";
							myStmt1.execute(q);
							break;
						}
					}	
					
					
					myConn.close();
					
					
					
				}
				catch(Exception exc)
				{
					exc.printStackTrace();
				}
			
			}
		});
	    
	    b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try {
					
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_name","root","akhil@123");
					
					Statement myStmt1 = myConn.createStatement();
					
					ResultSet myRs = myStmt1.executeQuery("select * from vstarter");
					
					
					while(true)
					{
						myRs.next();
						if(myRs.getString("item_name").equals(b3.getActionCommand()))
						{
							String q= "insert into bill values("+myRs.getString("item_no")+","+"'"+myRs.getString("item_name")+"'"+","+myRs.getString("price")+")";
							myStmt1.execute(q);
							break;
						}
					}	
					
					
					myConn.close();
					
				}
				catch(Exception exc)
				{
					exc.printStackTrace();
				}
			
			}
		});
	    
		
	}
	
	
	
	
	
	public static void main(String args[])
	{
		VStarter v=new VStarter();	
		
		
	}

}
