package Resto;
import java.awt.*;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Bill extends Frame{
	
	
	public Bill()
	{
		
		Frame f=new Frame("Restaurant");
	    
		Label l = new Label("Your Ordered Food Items");
		l.setBounds(65,75,500,30);
		Font myFont = new Font("Serif",Font.BOLD,20);
		l.setFont(myFont);
		f.add(l);
		
	    
	    Button b4 = new Button("Back");
	    
	    b4.setBounds(10,30,60,30);

		
		f.add(b4);
		f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true);
	    
	    TextArea area=new TextArea();  
        area.setBounds(40,130, 300,200);  
        area.setEditable(false);
        f.add(area);  
        
        Button ab= new Button("Reset");
        ab.setBounds(75,30,70,30);
        f.add(ab);
        
        Label lp=new Label("Total");
        lp.setBounds(200,346,50,18);
        Font my = new Font("Serif",Font.BOLD,16);
        lp.setFont(my);
        f.add(lp);
        
        TextArea t = new TextArea();
        t.setBounds(250,340,50,40);
        t.setEditable(false);
        f.add(t);
        
        
        try
		{
		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_name","root","akhil@123");
		
		Statement myStmt = myConn.createStatement();
		
		ResultSet myRs = myStmt.executeQuery("select * from bill");
		
		
				
		while(myRs.next())
		{
			area.appendText(myRs.getString("item_name")+" - "+myRs.getString("price")+" Rs"+"\n");
			
		}
		
		
		}
		catch(Exception exc)
		{
			exc.printStackTrace();
		}
	    
        
        try
		{
		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_name","root","akhil@123");
		
		Statement myStmt = myConn.createStatement();
		
		ResultSet myR = myStmt.executeQuery("select sum(price) from bill");
		
		myR.next();
		String w=myR.getString(1);
		System.out.println(w);
		t.setText(w);
		
		
		}
		catch(Exception exc)
		{
			exc.printStackTrace();
		}
	    
		
	    
	    b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a)
			{
				f.dispose();
			}
		});
	    
	    
	    
	    ab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try {
					
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_name","root","akhil@123");
					
					Statement myStmt1 = myConn.createStatement();
				    
				    myStmt1.execute("delete from bill");
				    
					myConn.close();
					 
					area.setText("");
					t.setText("");
					
					
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
		Bill v=new Bill();
		
		
	}

}
